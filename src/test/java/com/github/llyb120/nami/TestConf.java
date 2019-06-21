package com.github.llyb120.nami;

import cn.hutool.http.HttpUtil;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Nami;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.github.llyb120.nami.core.Json.o;

public class TestConf {

    @Test
    public void test() throws IOException {
        var stime = System.currentTimeMillis();
        var cfg = new Config("nami.conf");
        System.out.println(System.currentTimeMillis() - stime);
        var e = 1;
    }


    @Test
    public void testreq(){
        Nami.test();

        var resp = HttpUtil.post("http://127.0.0.1:8084/sqltool/sqltool/test", o("fuck", "oh no"));
        System.out.println(resp);
        System.out.println("end");

    }
}
