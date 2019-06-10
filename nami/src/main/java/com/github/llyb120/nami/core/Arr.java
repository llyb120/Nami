package com.github.llyb120.nami.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class Arr extends JSONArray  {

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

    public List<Obj> toObjList(){
        var list = new ArrayList<Obj>();
        for (Object o : this) {
            if(o instanceof Obj){
                list.add((Obj)o);
            } else if(o instanceof JSONObject){
                list.add(new Obj((JSONObject)o));
            } else {

            }
        }
        return list;
    }

    public List<Arr> toArrList(){
        var list = new ArrayList<Arr>();
        for (Object o : this) {
            list.add((Arr)o);
        }
        return list;
    }

    public String[] toStrArr(){
        return this.toArray(String[]::new);
    }

    public List<String> toStrList(){
        var list = new ArrayList<String>();
        for (Object o : this) {
            list.add((String) o);
        }
        return list;
    }

    public boolean isNotEmpty(){
        return !isEmpty();
    }


//    @Override
//    public Iterator<Object> iterator() {
//        return super.iterator();
//    }
}
