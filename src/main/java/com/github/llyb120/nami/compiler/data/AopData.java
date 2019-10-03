package com.github.llyb120.nami.compiler.data;

import com.github.llyb120.nami.server.Aop;

public class AopData extends BeanData{
    private Aop instance;

    public AopData(Class clz) throws InstantiationException {
        super(clz);
        instance = (Aop) super.newInstance();
    }

    @Override
    public Aop newInstance() {
        return instance;
    }
}
