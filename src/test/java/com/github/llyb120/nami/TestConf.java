package com.github.llyb120.nami;

import cn.hutool.core.io.FileUtil;
import cn.hutool.script.ScriptUtil;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.json.Obj;
import org.beetl.sql.core.SQLReady;
import org.junit.Test;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static com.github.llyb120.nami.ext.beetlsql.BeetlSql.sqlManager;

public class TestConf {

    @Test
    public void test() throws IOException {
        long stime = System.currentTimeMillis();
        Config cfg = new Config("nami.conf");
        System.out.println(System.currentTimeMillis() - stime);


//        long stiem = System.currentTimeMillis();
//        List<String> tokens = new LinkedList<>(FileUtil.readUtf8Lines(new File("nami.conf")));
//        System.out.println(System.currentTimeMillis() - stiem);
        for (Config.Server server : cfg.servers) {
//            server.root.match("/test/a/b".split("/"));
        }
        long e = 1;
    }

    @Test
    public void t2(){
        Nami.dev();
        sqlManager.setDefaultBeanProcessors(sqlManager.getDefaultBeanProcessors());
        Context cx = Context.enter();
        Scriptable scope = cx.initStandardObjects();

        NativeObject ddd = (NativeObject) cx.evaluateString(scope, "(()=>{ var a = com.github.llyb120.nami.ext.beetlsql.BeetlSql.sqlManager.execute(new org.beetl.sql.core.SQLReady(\"select count(1) from t_user\"), com.github.llyb120.nami.json.Obj); return {f:a }})()", "<cmd>", 1, null);
//        System.out.println("f");
//        String str = (String) ddd.unwrap();
        int a = 2;
    }


//    @Test
//    public void testreq(){
//        Nami.dev();
//
//        var resp = HttpUtil.post("http://127.0.0.1:8084/sqltool/sqltool/test", o("fuck", "oh no"));
//        System.out.println(resp);
//        System.out.println("end");
//
//    }
}
