package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Config;
import org.junit.Test;

import java.io.IOException;

public class TestConf {

    @Test
    public void test() throws IOException {
        var stime = System.currentTimeMillis();
        var cfg = new Config("nami.conf");
        System.out.println(System.currentTimeMillis() - stime);
        var e = 1;
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
