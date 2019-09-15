package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Config;
import org.junit.Test;

import java.io.IOException;

public class TestConf {

    @Test
    public void test() throws IOException {
        long stime = System.currentTimeMillis();
        Config cfg = new Config("nami.conf");
        System.out.println(System.currentTimeMillis() - stime);


        for (Config.Server server : cfg.servers) {
            server.root.match("/test/a/b".split("/"));
        }
        long e = 1;
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
