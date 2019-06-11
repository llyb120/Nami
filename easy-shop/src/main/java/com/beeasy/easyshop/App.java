package com.beeasy.easyshop;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.CharsetUtil;
import com.beeasy.easyshop.filter.auth;
import com.github.llyb120.nami.core.*;
import org.beetl.sql.core.NameConversion;
import org.beetl.sql.core.engine.PageQuery;

public class App {

    public static void main(String[] args) {

        Param.AddRule((ctx,param) -> PageQuery.class.isAssignableFrom(param.getType()) || Iterable.class.isAssignableFrom(param.getType()),  (ctx, param, action) -> {
            if(param.getName().startsWith("ms")){
                ctx.query.put("store_id", auth.getStoreId(ctx));
            }
            return action.around(ctx, param, null);
        });

        Macro.loadMacro("login");
        Nami.start();
    }

}
