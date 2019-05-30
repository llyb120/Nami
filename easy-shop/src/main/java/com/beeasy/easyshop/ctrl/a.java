package com.beeasy.easyshop.ctrl;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.easyshop.model.RaMember;
import com.beeasy.easyshop.model.RaStore;
import com.beeasy.web.core.Cookie;
import com.beeasy.web.core.MultipartFile;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.core.engine.PageQuery;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.beeasy.web.core.DBService.sqlManager;
public class a {

    public static class d{
        public int c;
    }

    public String test(
        d query,
        int c,
        int[] d
    ) {
        var e = 100;
        var f = 10320220;
        var a = 102221230;
        System.out.println("dfdffdddddddddljk;j133");
        var ccc = 200222;
        var eee = 2034303243;
        System.out.println(e);
        var gggj = a + e;
        List<JSONObject> list = sqlManager.execute(new SQLReady("select count(1) from ra_member "), JSONObject.class);
        return a + "source word " + new b().word;
    }

    public String upload(
        JSON body,
//        JSONArray params,
        MultipartFile file
    ){
        try {
            file.transferTo(new File("d:/cubi.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String cookieAdd(
        Cookie cookie,
        String d
    ){
        new ArrayList<>().stream().map(i -> i).forEachOrdered(i -> {

        });
        if(StrUtil.isEmpty(d)){
            d = "ccc";
        }
        cookie.set("cubi","123l");
        return d + "我没有变 你变你妈呢";
    }

    public String cookieDelete(
        Cookie cookie,
        RaStore mystore
    ){
        cookie.delete("cubi");
        return "";
    }

    public String testSuper(PageQuery<RaMember> pageQuery){
        return null;
    }
}




