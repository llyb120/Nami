package com.beeasy.easyshop;

import com.beeasy.easyshop.filter.auth;
import com.beeasy.web.core.DBService;
import com.beeasy.web.core.Nami;
import com.beeasy.web.core.Param;
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

        Nami.start();
    }

}
