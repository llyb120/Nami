package com.github.llyb120.test;

import cn.hutool.core.util.ClassUtil;
import com.github.llyb120.nami.core.MultipartFile;

import java.util.Set;



public class b {

    //sdfdd
    public int test() throws InterruptedException {
//        System.out.println(Thread.currentThread().getName() + "-" + a + "-" + $a);
//        Thread.sleep(2000);
        return 1;
    }

    public String t2(){
        long time = System.currentTimeMillis();
        Set<Class<?>> list = ClassUtil.scanPackage("com");
        System.out.println(System.currentTimeMillis() - time);
        return "1";
    }

    public MultipartFile t3(){
        return new MultipartFile("1.js", "classpath:1.js");
    }

    public String t4(){
        return "133";
    }
}
