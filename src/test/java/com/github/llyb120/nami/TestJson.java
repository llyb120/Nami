package com.github.llyb120.nami;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

public class TestJson {

    @Test
    public void test(){
        var b = StrUtil.isBlank(" \n");
        var sb = new StringBuilder();
        var str = RandomUtil.randomString(1024);
        var stime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100; j++) {

            }
            str.substring(500, 600);
        }
        System.out.println(System.currentTimeMillis() - stime);
        stime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            sb.setLength(0);
            for (int j = 0; j < 100; j++) {
                sb.append(str.charAt(500 + j));
            }
            sb.toString();
        }
        System.out.println(System.currentTimeMillis() - stime);
    }


    public static class FFF{
        public int a = 1;
        public double b = 2;
        private int fuck = 0;

        public FFF(int fuck){
            this.fuck = fuck;
        }
        public int getFuck(){
            return 1;
        }

        public void getFuck2(){
            return;
        }

//        public void setFuck(int val){
//            fuck = val;
//        }
    }
    @Test
    public void test_01_decode() throws IOException {
        var a = (Obj)Json.parse(new ClassPathResource("test/test.json").getStream().readAllBytes());
        a.put("fuck",22);
        var f2 = new FFF(1234);
        a.put("f2", f2);
        a.put("date", new Date());
//        f2.setFuck(123);
        var str = Json.stringify(a);
        Obj f4 = Json.parse(str);
        Object f22 =  f4.get("f2");
        var f3 = Convert.convert(FFF.class, f22);
        var b = 1;
    }


    @Test
    public void test_99_simple(){
        Arr obj = Json.parse("[1,2,3]");
        var a = obj.to(int[].class);
        var c = Json.toArr(a);
        var b = 2;
    }
}
