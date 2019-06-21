package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;

import java.io.InputStream;

import static com.github.llyb120.nami.core.Config.config;

public class MyClassLoadader extends ClassLoader {

    private static ClassLoader defaultClassLoader = MyClassLoadader.class.getClassLoader();

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        boolean hotswap = false;
            for (String s : Config.config.hotswap) {
                if(name.startsWith(s)) {
                    hotswap = true;
                    break;
                }
            }

        if(!hotswap){
            return defaultClassLoader.loadClass(name);
        }

        //旧式的懒编译处罚
        if(null != config.compile.compiler && !config.compile.parallel){
            try {
                byte[] b = Compiler.compile(name);
                return defineClass(null, b, 0, b.length);
            } catch (Exception e) {
                e.printStackTrace();
                return super.findClass(name);
            }
        }

        //新式的多线程编译
        if(config.compile.parallel){
            //读取已经编译的
            Compiler.waitForAllCompiled();
            try {
                var b = Compiler.readClass(name);
                return defineClass(null, b, 0, b.length);
            } catch (Exception e) {
                e.printStackTrace();
                return super.findClass(name);
            }
        }

        ClassPathResource resource = new ClassPathResource(name.replaceAll("\\.", "/") + ".class");
        try (
            InputStream is = resource.getStream();
            ){
            byte[] b = IoUtil.readBytes(is);
            return defineClass(null, b, 0, b.length);
        } catch (Exception e) {
            return super.findClass(name);
        }
    }



}
