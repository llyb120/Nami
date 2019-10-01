package com.github.llyb120.nami.hotswap;

import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.server.Controller;

public class HotLoader extends ClassLoader {

    public Class<?> loadClz(String name, boolean isScript) throws ClassNotFoundException {
        byte[] code = Compiler.getByteCode(name, false);
        if (code != null) {
            Class<?> clz = defineClass(name, code, 0, code.length);
            if(Controller.class.isAssignableFrom(clz)){
                //分析所有的method

            }
            return clz;
        } else {
            return AppClassLoader.defaultClassLoader.loadClass(name);
        }

    }


    public static Class load(String name, boolean isScript) throws ClassNotFoundException {
        return new HotLoader().loadClz(name, false);
    }
}
