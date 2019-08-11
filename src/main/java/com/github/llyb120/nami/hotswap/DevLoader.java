package com.github.llyb120.nami.hotswap;

import cn.hutool.core.util.ModifierUtil;
import cn.hutool.core.util.RandomUtil;
import com.github.llyb120.nami.core.Compiler;
import com.github.llyb120.nami.server.Response;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static com.github.llyb120.nami.core.Config.config;

public class DevLoader extends AbstractLoader {

    private static ClassLoader defaultClassLoader = DevLoader.class.getClassLoader();


    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        boolean hotswap = config.hotswap
                .stream()
                .anyMatch(e -> name.startsWith(e));

        if(!hotswap){
            return defaultClassLoader.loadClass(name);
        }

        //读取已经编译的
        Compiler.waitForAllCompiled();
        try {
            byte[] b = Compiler.readClass(name);
            return defineClass(null, b, 0, b.length);
        } catch (Exception e) {
            e.printStackTrace();
            return super.findClass(name);
        }

    }



}
