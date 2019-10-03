package com.github.llyb120.nami.compiler.data;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MethodData extends BeanData{
    public Parameter[] parameters;
    public Method method;

    public MethodData(Class clz) {
        super(clz);
    }
}
