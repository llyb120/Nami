package com.github.llyb120.nami.hotswap;

import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.server.Controller;
import static com.github.llyb120.nami.core.Config.config;

public class HotLoader extends ClassLoader {
    public static ClassLoader defaultClassLoader = ClassLoader.getSystemClassLoader();//AppClassLoader.class.getClassLoader();

    private String clzName = null;

    public HotLoader(String clzName){
        this.clzName = clzName;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
//        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if(config.isHotSwap(name)){
            byte[] code = Compiler.getByteCode(name, false);
            if (code != null) {
                Class<?> clz = defineClass(name, code, 0, code.length);
//            if(Controller.class.isAssignableFrom(clz)){
//                //分析所有的method
//
//            }
                return clz;
            }
        }
//        if(name.startsWith("java.")){
//            return AppClassLoader.defaultClassLoader.loadClass(name);
//        }
        return defaultClassLoader.loadClass(name);
    }

    public static Class load(String name, boolean isScript) throws ClassNotFoundException {
        return new HotLoader(name).loadClass(name);//, false);
    }
}
