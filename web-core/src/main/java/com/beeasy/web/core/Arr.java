package com.beeasy.web.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Arr extends JSONArray {

    public Arr() {
    }

    public Arr(List<Object> list) {
        super(list);
    }

    public Arr(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public <T> T toJavaObject(Class<T> clazz) {
        if(getClass().isAssignableFrom(clazz)){
            return (T) this;
        }
        return super.toJavaObject(clazz);
    }

//    @Override
//    public Iterator<Object> iterator() {
//        return super.iterator();
//    }
}
