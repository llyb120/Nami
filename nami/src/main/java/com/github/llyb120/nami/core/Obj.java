package com.github.llyb120.nami.core;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.sql.Struct;
import java.util.Map;
import java.util.function.Function;

import static com.github.llyb120.nami.core.Json.*;

public class Obj<U> extends JSONObject {
    private Class clz = null;

    public Obj() {
    }

    public Obj(Map<String, Object> map) {
        super(map);
    }

    public Obj(boolean ordered) {
        super(ordered);
    }

    public Obj(int initialCapacity) {
        super(initialCapacity);
    }

    public Obj(int initialCapacity, boolean ordered) {
        super(initialCapacity, ordered);
    }


    @Override
    public <T> T toJavaObject(Class<T> clazz) {
        if (getClass().isAssignableFrom(clazz)) {
            return (T) this;
        }
        return super.toJavaObject(clazz);
    }

    public Arr getArr(String key) {
        return new Arr(super.getJSONArray(key));
    }

    public Obj getObj(String key){
        return new Obj(super.getJSONObject(key));
    }

    public String getStr(String key, String dft){
        var str = getString(key);
        if(StrUtil.isEmpty(str)){
            return dft;
        }
        return str;
    }

    public String getStr(String key){
        return getString(key);
    }

    /***********************************************/


    /***********************************************/

    public <U> Obj<U> as(Class<U> clz) {
        this.clz = clz;
        return (Obj<U>)this;
    }


    public synchronized Obj<U> hold(Json.Property<U, ?>... funs) {
        var obj = o();
        for (Json.Property<U, ?> fun : funs) {
            String name = Json.getFunctionKey(fun);
            obj.put(name, get(name));
        }
        clear();
        putAll(obj);
        return this;
    }

    public Obj<U> on(Json.ValidateType validateType, String errorMessage, Json.Property<U, ?>... funs) {
        return this;
    }

    public Obj<U> find() {
        return this;
    }

    public Obj<U> set(Json.Property<U, ?> fun, Json.ValueType value) {
        return this;
    }

    public Obj<U> assign(Function<U, ?> function) {
        U obj = (U) toJavaObject(clz);
        Object object = function.apply((U) obj);
        Obj object1 = (Obj) JSON.toJSON(object);
        if (object1 != null) {
            putAll(object1);
        }
        return this;
    }

    public U cast() {
        return (U) toJavaObject(clz);
    }


}
