package com.github.llyb120.nami.hotswap;

public class ProductLoader extends AbstractLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> bs = loadFuncClass(name);
        if (bs != null) {
            return bs;
        }
        return defaultClassLoader.loadClass(name);
    }

}
