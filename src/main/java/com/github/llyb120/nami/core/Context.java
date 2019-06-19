package com.github.llyb120.nami.core;

import com.alibaba.fastjson.JSON;

public class Context {

    public Obj query = new Obj();
    public JSON body;
    public Obj params = new Obj();
    public Cookie cookie = new Cookie();
    public Obj headers = new Obj();

    public static ThreadLocal<Context> holder = new ThreadLocal<>(){
        @Override
        protected Context initialValue() {
            return new Context();
        }
    };

    public void reset(){
        query.clear();
        params.clear();
        cookie.reset();
        headers.clear();
        body = null;
    }

    public Object getParamValue(String name, Class type) {
        try {
            return params.getObject(name, type);
        } catch (Exception e) {
            return null;
        }
    }
}
