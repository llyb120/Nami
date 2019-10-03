package com.github.llyb120.nami.compiler.data;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ControllerData extends BeanData{
    public Map<String, MethodData> methods = new ConcurrentHashMap<>();

    public ControllerData(Class clz) {
        super(clz);
    }


}
