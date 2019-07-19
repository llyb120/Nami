package com.github.llyb120.nami.json;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.CharUtil;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;

import static com.github.llyb120.nami.core.DBService.fSql;

public class Json <T> implements IJson<T>{

    private boolean parallel = false;
    private ThreadLocal<Holder> local;
    private Holder holder;

    public Json(){
        this(false);
    }

    public Json(T[] arr){
        this(false);
        holder.list.addAll(Arrays.asList(arr));
    }

    public Json(boolean parallel){
        this.parallel = parallel;
        if(parallel){
            local = new ThreadLocal<Holder>(){
                @Override
                protected Holder initialValue() {
                    return new Holder();
                }
            };
        } else {
            holder = new Holder();
        }
    }

    @Override
    public Holder holder() {
        if(parallel){
            return local.get();
        } else {
            return holder;
        }
    }

    @Override
    public Json<T> holder(Holder holder) {
        if(parallel){
            local.set(holder);
        } else {
            this.holder = holder;
        }
        return this;
    }

    @Override
    public String toString() {
        return stringify(this);
    }

    public Json<T> to(String tableName){
        fSql.insert(tableName, this);
        return null;
    }

    //    public enum ValidateType {
//        notnull,
//        notempty,
//        notblank;
//    }
//
//    public enum ValueType {
//        md5;
//    }
//
//
//    public static interface Property<T, R> extends Function<T, R>, Serializable {
//    }
//
//    public static String getFunctionKey(Function function) {
//        String name = getFunctionName(function);
//        if (name.length() > 1) {
//            return name.substring(0, 1).toLowerCase() + name.substring(1);
//        }
//        return name;
//    }
//
//    public static String getFunctionName(Function function) {
//        try {
//            Method declaredMethod = function.getClass().getDeclaredMethod("writeReplace");
//            declaredMethod.setAccessible(Boolean.TRUE);
//            SerializedLambda serializedLambda = (SerializedLambda) declaredMethod.invoke(function);
//            String method = serializedLambda.getImplMethodName();
//            String attr = null;
//            if (method.startsWith("get")) {
//                attr = method.substring(3);
//            } else {
//                attr = method.substring(2);
//            }
//            return attr;
//
//        } catch (ReflectiveOperationException var6) {
//            throw new RuntimeException(var6);
//        }
//    }

    public static Json o(Object... objects) {
        Json json = new Json();
        json.map();
        for (short i = 0; i < objects.length; i += 2) {
            json.put((String) objects[i], objects[i + 1]);
        }
        return json;
    }

    public static Json a(Object... objects) {
        Json json = new Json();
        json.list();
        for (Object object : objects) {
            json.add(object);
        }
        return json;
    }


    public static Json tree(Collection<Json> list, String parentKey, String childKey) {
        Json map = o();
        for (Json json : list) {
            String key = json.s(childKey);
            if (key == null) {
                continue;
            }
            map.put(key, json);
//            object.put("children", a());
        }
        Json ret = a();
        for (Json json : list) {
            Json par = map.o(json.s(parentKey));
            if (par == null) {
                ret.add(json);
                continue;
            }
            Json child = par.a("children");
            if (child == null) {
                child = a();
                par.put("children", child);
            }
            child.add(json);
        }
        return ret;
    }


    public static String stringify(Object obj) {
        return new JsonEncoder().stringify(obj);
    }

    public static <T> T parse(String str) {
//        var s = new com.alibaba.fastjson.TypeReference<List<List>>(){};
//        var t = new TypeReference<List<List>>(){};
        return (T) new JsonParser(str).parse();
    }

    public static <T> T parse(byte[] bs) {
        return parse(new String(bs));
    }

    public static <T> Json<T> toJson(Object source){
        return cast(source, Json.class);
    }

//    public static Obj toObj(Object object){
//       return cast(object, Obj.class);
//    }

//    public static Arr toArr(Object object){
//        return cast(object, Arr.class);
//    }

//    public static <T> T parse(String str, Class<T> clz){
//    }


//    public static <T> T parse(String str){
//        Arr arr = Json.parse("fuck");
//    }


    /******************************************************/


    static <T> T newInstance(Class<T> clz) {
        ConstructorAccess<T> ca = ConstructorAccess.get(clz);
        return ca.newInstance();
    }

    static <T> T cast(Object source, Class<T> clz) {
        if (source == null) {
            return null;
        }
        Class<?> type = source.getClass();
        //基本类型
        if (clz == String.class) {
            if (source instanceof String) {
                return (T) source;
            } else {
                return (T) String.valueOf(source);
            }
        }
        if (clz == Boolean.class) {
            if (source instanceof Boolean) {
                return (T) source;
            } else {
                //尝试本身转换
                try {
                    return (T) new Boolean(String.valueOf(source));
                } catch (Exception e) {
                }
                //尝试使用数字
                try {
                    BigDecimal decimal = new BigDecimal(String.valueOf(source));
                    return (T) new Boolean(decimal.intValue() != 0);
                } catch (Exception e) {
                }
                //啥都没有，那就false吧
                return (T) new Boolean(false);
            }
        }
        if (clz == Integer.class || clz == int.class) {
            if (source instanceof Integer) {
                return (T) source;
            } else {
                return (T) (Integer) Integer.parseInt(String.valueOf(source));
            }
        }
        //可以返回自身
        if (clz.isAssignableFrom(source.getClass())) {
            return (T) source;
        }
        //目标为List
        if (List.class.isAssignableFrom(clz)) {
            if (List.class == clz) {
                clz = (Class<T>) ArrayList.class;
            }
            List list = (List) Json.newInstance(clz);
            if(type.isArray()){
                for (int i = 0; i < Array.getLength(source); i++) {
                    list.add(Array.get(source, i));
                }
            } else {
                ((List) list).addAll((Collection) source);
            }
            return (T) list;
        }
        //目标为set类型
        if (Set.class.isAssignableFrom(clz)) {
            if (Set.class == clz) {
                clz = (Class<T>) HashSet.class;
            }
            Set list = (Set) Json.newInstance(clz);
            if(type.isArray()){
                for (int i = 0; i < Array.getLength(source); i++) {
                    list.add(Array.get(source, i));
                }
            } else {
                list.addAll((Collection) source);
            }
            return (T) list;
        }
        if(clz.isArray()){
            Class<?> arrType = clz.getComponentType();
            Collection collection = (Collection) source;
            Object narr = Array.newInstance(arrType, (collection.size()));
            int i = 0;
            for (Object o : collection) {
                Array.set(narr, i, Json.cast(o, arrType));
                i++;
            }
            return (T) narr;
        }
        //目标为map类型
        if (Map.class.isAssignableFrom(clz)) {
            if (Map.class == clz) {
                clz = (Class<T>) HashMap.class;
            }
            Map map = (Map) Json.newInstance(clz);
            if (source instanceof Map) {
                ((Map) map).putAll((Map) source);
            } else {
                map.putAll(BeanUtil.beanToMap(source));
            }
            return (T) map;
        }
        //把目标当bean转换
        //todo: 使用reflectasm
        T ret = (T) BeanUtil.toBean(source, clz);
        if (ret == null) {
            throw new RuntimeException();
        }
        return ret;
    }
}
