package com.github.llyb120.nami.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AopInvoke {
    public Class clz;
    public Method method;
    public Object instance;
    public Object[] args;
    private Runnable runnable;

    public AopInvoke(Class clz, Method method, Object instance, Object[] args) {
        this.clz = clz;
        this.method = method;
        this.instance = instance;
        this.args = args;
    }

    public Object call() throws Exception {
        return method.invoke(instance, args);
    }


}
