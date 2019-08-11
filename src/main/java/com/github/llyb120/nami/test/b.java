package com.github.llyb120.nami.test;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.ReflectUtil;

import java.util.Set;

import static com.github.llyb120.nami.test.Var1.*;


public class b {

    public int test() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "-" + a + "-" + $a);
        Thread.sleep(2000);
        return 1;
    }

    public String t2(){
        long time = System.currentTimeMillis();
        Set<Class<?>> list = ClassUtil.scanPackage("com");
        System.out.println(System.currentTimeMillis() - time);
        return "1";
    }
}
