package com.beeasy.web.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Context {

    public JSONObject query = new JSONObject();
    public JSON body;
    public JSONObject params = new JSONObject();
    public Cookie cookie = new Cookie();
    public JSONObject headers = new JSONObject();

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
