package com.github.llyb120.nami;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.core.Route;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;
import static org.junit.Assert.*;

public class TestCtrl {

    @BeforeClass
    public static void before() throws InterruptedException {
        Route.routes.add(new Route("/test/:c/:a -> com.github.llyb120.nami.test"));
        Nami.test();
        Thread.sleep(100);
    }

    @Test
    public void getWithNoArg(){
        var res = HttpUtil.get("http://127.0.0.1:" + config.port + "/test/a/getWithNoArg");
        assertEquals(res, "ok");
    }


    @Test
    public void getWithArgs(){
        var res = HttpUtil.get("http://127.0.0.1:" + config.port + "/test/a/getWithArgs", o("a",1));
        assertEquals(res, "1");
    }

    @Test
    public void getQuery(){
        var query = o("a", "1", "b", "2");
        var res = HttpUtil.get("http://127.0.0.1:" + config.port + "/test/a/getQuery", query);
        assertEquals(JSON.parse(res).toString(), query.toJSONString());
    }

    @Test
    public void postUrlEncoded(){
        var query = o("a", "1", "b", "2");
        var res = HttpUtil.post("http://127.0.0.1:" + config.port + "/test/a/postUrlEncoded", query);
        assertEquals(JSON.parse(res).toString(), query.toJSONString());

        res = HttpUtil.post("http://127.0.0.1:" + config.port + "/test/a/postUrlEncoded2", query);
        assertEquals(res, "1");
    }

    @Test
    public void postJson(){
        var arr = a("1","2","3");
        var res = HttpUtil.createPost("http://127.0.0.1:" + config.port + "/test/a/postJsonArray")
                .body(arr.toJSONString())
                .header("Content-Type", "application/json")
                .execute()
                .body();
        assertEquals(JSON.parse(res).toString(), arr.toJSONString());

        var obj = o("a","2", "b", a("1","2"));
        res = HttpUtil.createPost("http://127.0.0.1:" + config.port + "/test/a/postJsonObject")
                .body(obj.toJSONString())
                .header("Content-Type", "application/json")
                .execute()
                .body();
        assertEquals(JSON.parse(res).toString(), obj.toJSONString());
    }
}
