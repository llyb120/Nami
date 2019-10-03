package com.github.llyb120.nami.compiler.data;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class BeanData {
    private static Unsafe unsafe;// = Unsafe.getUnsafe();
    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe _unsafe = (Unsafe) field.get(null);
            unsafe = _unsafe;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected Class clz;
    public BeanData(Class clz){
        this.clz = clz;
    }

    public Object newInstance() throws InstantiationException {
        return unsafe.allocateInstance(clz);
    }
}
