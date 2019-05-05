package com.beeasy.web.core;

import cn.hutool.core.lang.func.Func;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import org.beetl.sql.core.kit.StringKit;
import org.beetl.sql.core.query.LambdaQuery;
import org.beetl.sql.core.query.Query;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.sql.Struct;
import java.util.*;
import java.util.function.Function;
import static com.beeasy.web.core.DBService.sqlManager;

public class Flow<T,U> {
    private JSONObject data;
//    private LinkedList<Holder> stack = new LinkedList();
    private Class clz;
    private String lastKey = null;
    private LinkedList<OnItem> onBuf = new LinkedList<>();

    private Flow(JSONObject data){
        this.data = data;
//        stack.addLast(new Holder(data, data));
        this.data = data;
    }

    private Flow(Class<T> clz, JSONObject data){
        this.data = data;
        this.clz = clz;
    }
//    private Flow(Object data, Class clz){
//        this.data = data;
//        JSONObject object = (JSONObject) JSON.toJSON(data);
//        this.data = object.toJavaObject(clz);
//        this.clz = clz;
//    }

    public static Flow<?,?> of(JSONObject object){
        return new Flow<>(object);
    }


    public static <T> Flow<T,?> of(Class<T> clz, JSONObject object){
        return new Flow(clz, object);
    }
//    public static <R> Flow<R> of(Object object, Class<R> clz){
//        return new Flow<R>(object, clz);
//    }

    public <T> Flow<T,?> as (Class<T> clz){
        this.clz = clz;
        return (Flow<T, ?>) this;
    }

    public Flow<JSONObject,?> flip(){
        return as(JSONObject.class);
    }

    public Flow<T,U> append(Function<T,?> function){
        //这里必须强转
        T obj = (T) data.toJavaObject(clz);
        Object object = function.apply((T) obj);
        JSONObject object1 = (JSONObject) JSON.toJSON(object);
        if (object1 != null) {
            data.putAll(object1);
        }
        return this;
    }

    public <X> Flow<T,X> on(Property<T,X> function, ValidateType validateType, String errorMessage){
        String name = getFunctionKey(function);
        return (Flow<T, X>) on(name, validateType, errorMessage);
    }

    public Flow<T,U> on(String field, ValidateType validateType, String errorMessage){
        lastKey = field;
        Object value = data.get(field);
        assertSingle(value ,validateType, errorMessage);
        return this;
    }

    public Flow<T,U> on(ValidateType validateType, String errorMessage){
        assertSingle(data, validateType, errorMessage);
        return this;
    }

    private void assertSingle(Object value, ValidateType validateType, String error){
        switch (validateType){
            case notnull:
                ass(value != null, error);
                break;

            case notblank:
                break;

            case notempty:
                ass(StrUtil.isNotEmpty((CharSequence) value), error);
                break;
        }
    }

    public Flow<T,U> set(ValueType type){
        Object value = data.get(lastKey);
        switch (type){
            case md5:
                value = SecureUtil.md5((String) value);
                break;
        }
        data.put(lastKey, value);
        return this;
    }

    public Flow<T,U> set(Function<U,U> function){
        Object value = function.apply((U) data.get(lastKey));
        data.put(lastKey, value);
        return this;
    }

    public T get(){
        return (T) data;
    }


    public T flow(){
        return null;
    }

    public Flow<T,U> flowFrom(){
        Query query = sqlManager.query(clz);
        if(data instanceof JSONObject){
            data.forEach((k,v) -> {
                query.andEq(StrUtil.toUnderlineCase(k), v);
            });
        }
        List<JSONObject> list = query.select(JSONObject.class);
//        List<U> list = (List<U>) (query.select());
//        this.clz = clz;
        JSONObject data = null;
        if(list.size() > 0){
            data = (list.get(0));
        } else {
            data = null;
        }
        this.data = data;
        return this;
    }

    public <X> Flow<X,?> flowFrom(Class<X> clz){
        as(clz);
        return (Flow<X, ?>) flowFrom();
    }




    public R ok(Function<? super T,?> function){
        return R.ok(function.apply((T)data.toJavaObject(clz)));
    }

    public Flow fail(){
        return this;
    }



    public enum ValueType{
        md5;
    }

    public enum ValidateType{
        notnull,
        notempty,
        notblank;
    }


    private void ass(boolean b, String msg){
        if(!b){
            throw new RestException(msg);
        }
    }

    private static class Holder<T>{
        public JSONObject now;
        public T proxy;

        public Holder(JSONObject now, T proxy) {
            this.now = now;
            this.proxy = proxy;
        }
    }

    private static class SetItem {
        public ValueType valueType;
        public Function function;

        public SetItem(ValueType valueType, Function function) {
            this.valueType = valueType;
            this.function = function;
        }
    }

    private static class OnItem <T,U>{
        public String field;
        public Function<T,U> function;
        public ValidateType validateType;
        public String error;
        public List<SetItem> sets;

        public OnItem(String field, Function<T,U> function, ValidateType validateType, String error) {
            this.field = field;
            this.function = function;
            this.validateType = validateType;
            this.error = error;
        }

        public void addSet(Function function){
            if (sets == null) {
                sets = new ArrayList<>();
            }
            sets.add(new SetItem(null, function));
        }
    }

    @FunctionalInterface
    public interface Func<T,R>{
        R call();
    }

    public String getFunctionKey(Function function){
        String name = getFunctionName(function);
        if(name.length() > 1){
            return name.substring(0,1).toLowerCase() + name.substring(1);
        }
        return name;
    }

    public String getFunctionName(Function function) {
        try {
            Method declaredMethod = function.getClass().getDeclaredMethod("writeReplace");
            declaredMethod.setAccessible(Boolean.TRUE);
            SerializedLambda serializedLambda = (SerializedLambda) declaredMethod.invoke(function);
            String method = serializedLambda.getImplMethodName();
            String attr = null;
            if (method.startsWith("get")) {
                attr = method.substring(3);
            } else {
                attr = method.substring(2);
            }
            return attr;

        } catch (ReflectiveOperationException var6) {
            throw new RuntimeException(var6);
        }
    }

    public interface Property<T, R> extends Function<T, R>, Serializable {
    }
}
