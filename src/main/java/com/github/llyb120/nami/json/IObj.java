package com.github.llyb120.nami.json;

import cn.hutool.core.util.StrUtil;

import java.util.*;

import static com.github.llyb120.nami.json.Json.cast;

public interface IObj<X extends IArr, Y extends IObj> extends Map<String,Object> {


    default Map innerMap(){
        Map item = (Map) JsonPool.MapPool.get(this);
        if (item == null) {
            item = new LinkedHashMap();
            JsonPool.MapPool.put(this, item);
        }
        return item;
    }

    /*********** map **********/

    @Override
    default int size() {
        return innerMap().size();
    }

    @Override
    default boolean isEmpty() {
        return innerMap().isEmpty();
    }

    @Override
    default boolean containsKey(Object key) {
        return innerMap().containsKey(key);
    }

    @Override
    default boolean containsValue(Object value) {
        return innerMap().containsValue(value);
    }

    @Override
    default Object get(Object key) {
        return innerMap().get(key);
    }

    default <T> T get(String key, Class<T> clz){
        return cast(get(key), clz);
    }

    default Object put(String key, Object value) {
        return innerMap().put(key, value);
    }

    @Override
    default Object remove(Object key) {
        return  innerMap().remove(key);
    }

    @Override
    default void putAll(Map m) {
        innerMap().putAll(m);
    }


    @Override
    default void clear() {
        innerMap().clear();
    }

    @Override
    default Set<String> keySet() {
        return innerMap().keySet();
    }

    @Override
    default Collection<Object> values() {
        return innerMap().values();
    }

    @Override
    default Set<Entry<String, Object>> entrySet() {
        return innerMap().entrySet();
    }


    /************* kv ************/
    default String s(String key){
        return get(key, String.class);
    }

    default String s(String key, String defaultValue){
        String str = s(key);
        if(StrUtil.isEmpty(str)){
            return defaultValue;
        }
        return str;
    }

    default Integer i(String k, int defaultValue){
        Integer val = i(k);
        if (val == null) {
            val = defaultValue;
        }
        return val;
    }

    default Integer i(String k){
        return get(k, Integer.class);
    }

    default boolean b(String k){
        Object val = get(k);
        if (val == null) {
            return false;
        }
        return Json.cast(val, Boolean.class);
    }

    default IArr<Y> oa(String k){
        return a(k);
    }

    default X a(String k){
        Object val = get(k);
        if (val == null) {
            return null;
        }
        if(val instanceof IArr){
            return (X) val;
        }
        //todo: 数组的添加
//        if(val instanceof Iterable){
//            return new Arr((Iterable) val);
//        }
        return null;
    }



    default String toJsonString() {
        return Json.stringify(this);
    }


    default <T> T to(Class<T> clz){
        return Json.cast(this, clz);
    }


    default Y flex(Object ...objects){
        Y nobj = (Y) Json.newInstance(getClass());
        boolean flexed = false;
        for (int i = 0; i < objects.length; i++) {
            Object obj = objects[i];
            boolean readNext = false;
            if(obj instanceof FlexAction){
                for (Entry<String, ?> entry : this.entrySet()) {
                    if(((FlexAction) obj).canFlex(entry.getKey(), entry.getValue())){
                        Object fval = ((FlexAction) obj).call(entry.getKey(), entry.getValue());
                        if(fval instanceof Map.Entry){
                            nobj.put((String) ((Entry) fval).getKey(), ((Entry) fval).getValue());
                        } else {
                            nobj.put(entry.getKey(), fval) ;
                        }
                    }
                }
                flexed = true;
                continue;
            }
        }
        if(flexed){
            clear();
            putAll(nobj);
        }
        return (Y) this;
    }


    default Y o(String k){
        Object val = get(k);
        if (val == null) {
            return null;
        }
        if(val instanceof IObj){
            return (Y) val;
        }
        if(val instanceof Map){
            IObj ins = Json.newInstance(getClass());
            ins.putAll((Map) val);
            return (Y) ins;
        }
        return null;
    }

}
