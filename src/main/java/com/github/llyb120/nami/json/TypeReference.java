package com.github.llyb120.nami.json;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TypeReference<T> {
    static ConcurrentMap<Type, Type> classTypeCache = new ConcurrentHashMap(16, 0.75F, 1);
    protected final Type type;
    public static final Type LIST_STRING = (new TypeReference<List<String>>() {
    }).getType();

    protected TypeReference() {
        Type superClass = this.getClass().getGenericSuperclass();
        Type type = ((ParameterizedType)superClass).getActualTypeArguments()[0];
        Type cachedType = (Type)classTypeCache.get(type);
        if (cachedType == null) {
            classTypeCache.putIfAbsent(type, type);
            cachedType = (Type)classTypeCache.get(type);
        }

        this.type = cachedType;
    }

//    protected TypeReference(Type... actualTypeArguments) {
//        Class<?> thisClass = this.getClass();
//        Type superClass = thisClass.getGenericSuperclass();
//        ParameterizedType argType = (ParameterizedType)((ParameterizedType)superClass).getActualTypeArguments()[0];
//        Type rawType = argType.getRawType();
//        Type[] argTypes = argType.getActualTypeArguments();
//        int actualIndex = 0;
//
//        for(int i = 0; i < argTypes.length; ++i) {
//            if (argTypes[i] instanceof TypeVariable && actualIndex < actualTypeArguments.length) {
//                argTypes[i] = actualTypeArguments[actualIndex++];
//            }
//
//            if (argTypes[i] instanceof GenericArrayType) {
//                argTypes[i] = TypeUtils.checkPrimitiveArray((GenericArrayType)argTypes[i]);
//            }
//        }
//
//        Type key = new ParameterizedTypeImpl(argTypes, thisClass, rawType);
//        Type cachedType = (Type)classTypeCache.get(key);
//        if (cachedType == null) {
//            classTypeCache.putIfAbsent(key, key);
//            cachedType = (Type)classTypeCache.get(key);
//        }
//
//        this.type = cachedType;
//    }

    public Type getType() {
        return this.type;
    }
}
