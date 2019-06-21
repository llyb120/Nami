package com.github.llyb120.nami.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.TypeUtils;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Function;

public class Json {

    public static Obj parseObject(String str){
        return JSON.parseObject(str, Obj.class);
    }


    public static JSON parse(String str){
        var obj = JSON.parse(str);
        if(obj instanceof JSONObject){
            return new Obj((JSONObject)obj);
        } else {
            return new Arr((JSONArray)obj);
        }
    }

    public static JSON parse(byte[] bs){
        var obj = JSON.parse(bs);
        if(obj instanceof JSONObject){
            return new Obj((JSONObject)obj);
        } else {
            return new Arr((JSONArray)obj);
        }
    }

    public static Object toNamiJson(Object object){
        return toNamiJson(object, SerializeConfig.globalInstance);
    }

    public static Object toNamiJson(Object javaObject, SerializeConfig config){
        if (javaObject == null) {
            return null;
        }

        if (javaObject instanceof JSON) {
            return javaObject;
        }

        if (javaObject instanceof Map) {
            Map<Object, Object> map = (Map<Object, Object>) javaObject;

            int size = map.size();

            Map innerMap;
            if (map instanceof LinkedHashMap) {
                innerMap = new LinkedHashMap(size);
            } else if (map instanceof TreeMap) {
                innerMap = new TreeMap();
            } else {
                innerMap = new HashMap(size);
            }

            Obj json = new Obj(innerMap);

            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                Object key = entry.getKey();
                String jsonKey = TypeUtils.castToString(key);
                Object jsonValue = toNamiJson(entry.getValue());
                json.put(jsonKey, jsonValue);
            }

            return json;
        }

        if (javaObject instanceof Collection) {
            Collection<Object> collection = (Collection<Object>) javaObject;

            JSONArray array = new JSONArray(collection.size());

            for (Object item : collection) {
                Object jsonValue = toNamiJson(item);
                array.add(jsonValue);
            }

            return array;
        }

        if (javaObject instanceof JSONSerializable) {
            String json = JSON.toJSONString(javaObject);
            return JSON.parse(json);
        }

        Class<?> clazz = javaObject.getClass();

        if (clazz.isEnum()) {
            return ((Enum<?>) javaObject).name();
        }

        if (clazz.isArray()) {
            int len = Array.getLength(javaObject);

            JSONArray array = new JSONArray(len);

            for (int i = 0; i < len; ++i) {
                Object item = Array.get(javaObject, i);
                Object jsonValue = toNamiJson(item);
                array.add(jsonValue);
            }

            return array;
        }

        if (ParserConfig.isPrimitive2(clazz)) {
            return javaObject;
        }

        ObjectSerializer serializer = config.getObjectWriter(clazz);
        if (serializer instanceof JavaBeanSerializer) {
            JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) serializer;

            Obj json = new Obj();
            try {
                Map<String, Object> values = javaBeanSerializer.getFieldValuesMap(javaObject);
                for (Map.Entry<String, Object> entry : values.entrySet()) {
                    json.put(entry.getKey(), toNamiJson(entry.getValue()));
                }
            } catch (Exception e) {
                throw new JSONException("toNamiJson error", e);
            }
            return json;
        }

        String text = JSON.toJSONString(javaObject);
        return JSON.parse(text);
    }



    public enum ValidateType{
        notnull,
        notempty,
        notblank;
    }

    public enum ValueType{
        md5;
    }



    public static interface Property<T, R> extends Function<T, R>, Serializable {
    }

    public static String getFunctionKey(Function function){
        String name = getFunctionName(function);
        if(name.length() > 1){
            return name.substring(0,1).toLowerCase() + name.substring(1);
        }
        return name;
    }

    public static String getFunctionName(Function function) {
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

    public static Obj o(Object ...objects) {
        Obj object = new Obj();
        for(short i = 0; i < objects.length; i+=2){
            object.put((String) objects[i], objects[i + 1]);
        }
        return object;
    }

    public static Arr a(Object ...objects){
        Arr array = new Arr();
        for (Object object : objects) {
            array.add(object);
        }
        return array;
    }


    public static Arr tree(Collection<JSONObject> list, String parentKey, String childKey) {
        var map = new JSONObject();
        for (JSONObject object : list) {
            var key = object.getString(childKey);
            if (key == null) {
                continue;
            }
            map.put(key, object);
//            object.put("children", a());
        }
        var ret = a();
        for (JSONObject object : list) {
            var par = map.getJSONObject(object.getString(parentKey));
            if (par == null) {
                ret.add(object);
                continue;
            }
            var child = par.getJSONArray("children");
            if (child == null) {
                child = a();
                par.put("children", child);
            }
            child.add(object);
        }
        return ret;
    }

}
