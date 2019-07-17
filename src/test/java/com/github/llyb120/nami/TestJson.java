package com.github.llyb120.nami;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.IoUtil;
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
        boolean b = StrUtil.isBlank(" \n");
        StringBuilder sb = new StringBuilder();
        String str = RandomUtil.randomString(1024);
        long stime = System.currentTimeMillis();
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
        Obj a = (Obj) Json.parse(IoUtil.readBytes(new ClassPathResource("test/test.json").getStream()));
        a.put("fuck",22);
        FFF f2 = new FFF(1234);
        a.put("f2", f2);
        a.put("date", new Date());
//        f2.setFuck(123);
        String str = Json.stringify(a);
        Obj f4 = Json.parse(str);
        Object f22 =  f4.get("f2");
        FFF f3 = Convert.convert(FFF.class, f22);
        int b = 1;
    }


    @Test
    public void test_99_simple(){
        Arr obj = Json.parse("[1,2,3]");
        Object a = obj.to(int[].class);
        Arr c = Json.toArr(a);
        int b = 2;
    }
}
