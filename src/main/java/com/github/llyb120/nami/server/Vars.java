package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.Json;
import com.github.llyb120.nami.core.Obj;

import java.util.*;

public class Vars implements Map{


    public static Vars $get = new Vars();
    public static Vars $post = new Vars();
    public static Vars $request = new Vars();

    private ThreadLocal<LinkedHashMap> local = new ThreadLocal<>(){
        @Override
        protected LinkedHashMap initialValue() {
            return new LinkedHashMap();
        }
    };

    public LinkedHashMap copy(){
        var map = new LinkedHashMap();
        map.putAll(local.get());
        return map;
    }

    /************************/

    public String s(String key){
        var value = get(key);
        if(value == null){
            return null;
        }
        if(value instanceof String){
            return (String) value;
        }
        return value.toString();
    }

    public String s(String key, String defaultValue){
        var value = s(key);
        if(StrUtil.isEmpty(value)){
            return defaultValue;
        }
        return value;
    }

    public Integer i(String key){
        var value = get(key);
        if (value == null) {
            return null;
        }
        if(value instanceof Integer){
            return (Integer) value;
        }
        var str = s(key);
        try{
            return Integer.parseInt(str);
        }
        catch (Exception e){
            return null;
        }
    }

    public Double doub(String key){
        return null;
    }

    public Float f(){
        return null;
    }

    public Obj o(String key){
        var value = get(key);
        if(value == null){
            return null;
        }
        if(value instanceof Obj){
            return (Obj) value;
        }
        if(value instanceof Map){
            return new Obj((Map<String, Object>) value);
        }
        return (Obj) Json.toNamiJson(value);
    }

    public Arr a(String key){
        var value = get(key);
        if(value == null){
            return null;
        }
        if(value instanceof Arr){
            return (Arr) value;
        }
        if(value instanceof List){
            return new Arr((List<Object>) value);
        }
        return (Arr) Json.toNamiJson(value);
    }


    /************************/

    @Override
    public int size() {
        return local.get().size();
    }

    @Override
    public boolean isEmpty() {
        return local.get().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return local.get().containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return local.get().containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return local.get().get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        return local.get().put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return local.get().remove(key);
    }

    @Override
    public void putAll(Map m) {
        local.get().putAll(m);
    }

    @Override
    public void clear() {
        local.get().clear();
    }

    @Override
    public Set keySet() {
        return local.get().keySet();
    }

    @Override
    public Collection values() {
        return local.get().values();
    }

    @Override
    public Set<Entry> entrySet() {
        return local.get().entrySet();
    }
}
