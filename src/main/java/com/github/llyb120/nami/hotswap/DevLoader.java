package com.github.llyb120.nami.hotswap;

import com.github.llyb120.nami.core.Compiler;

import static com.github.llyb120.nami.core.Config.config;

public class DevLoader extends AbstractLoader {

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> bs = loadFuncClass(name);
        if (bs != null) {
            return bs;
        }
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
