package com.beeasy.easyshop.ctrl;

import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.filter.auth;
import com.beeasy.easyshop.model.RaMember;
import com.beeasy.easyshop.model.RaSeller;
import com.github.llyb120.nami.core.Cookie;
import com.github.llyb120.nami.core.Obj;
import com.github.llyb120.nami.core.R;

import java.io.Serializable;
import java.util.function.Function;
import static com.github.llyb120.nami.core.DBService.sqlManager;

import static com.beeasy.easyshop.util.U.*;

public class user {
    public interface Property<T, R> extends Function<T, R>, Serializable {
    }

//    public R login(
//        JSONObject query,
//        Cookie cookie
//    ) {
//        return Flow.of(query)
//            .as(RaMember.class)
//            .on(RaMember::getMember_name, notempty, "用户名不能为空")
//            .on(RaMember::getMember_passwd, notempty, "密码不能为空")
//            .set(md5)
//            .find()
//            .on(notnull, "用户名密码错误")
//            .assign(m -> {
//                return sqlManager.lambdaQuery(RaSeller.class)
//                    .andEq(RaSeller::getMember_id, m.getMember_id())
//                    .single();
//            })
//            .as(RaSeller.class)
//            .on(RaSeller::getSeller_id, notnull, "该用户不是商家")
//            .flip()
//            .ok(obj -> {
//                String str = String.format("%s|%s|%s|%s|%d", obj.getString("member_id") , obj.getString("seller_id"), obj.getString("store_id"), obj.getString("seller_name"), System.currentTimeMillis() + 24 * 3600000);
//                var token = auth.createToken(str);
//                cookie.set("token", token);
//                return o(
//                    "token", token,
//                    "info", str
//                );
//            });
//    }


}
