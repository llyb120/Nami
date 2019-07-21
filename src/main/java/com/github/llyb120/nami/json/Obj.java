package com.github.llyb120.nami.json;

import cn.hutool.core.util.StrUtil;

import java.util.*;

public class Obj extends Json implements Map<String,Object> {

    private boolean parallel = false;
    private ThreadLocal<Map<String,Object>> local;
    private Map<String,Object> map;

//    public static interface KVIterator<U>{
//        void call(String k, U v) throws Exception;
//    }

    public Obj(){
        this(false);
    }

    public Obj(Map map){
        this(false);
        map(map);
    }

    public Obj(boolean p){
        parallel = p;
        if(p){
            local = new ThreadLocal(){
                @Override
                protected Object initialValue() {
                    return new LinkedHashMap<>();
                }
            };
        } else {
            map = new LinkedHashMap<>();
        }
    }

    public Map<String,Object> map(){
        if(parallel){
            return local.get();
        } else {
            return map;
        }
    }

    public void map(Map map){
        if(parallel){
            local.set(map);
        }
        else {
            this.map = map;
        }
    }

    @Override
    public int size() {
        return map().size();
    }

    @Override
    public boolean isEmpty() {
        return map().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map().containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map().containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return map().get(key);
    }

    @Override
    public Object put(String key, Object value) {
        return map().put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return map().remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ?> m) {
        map().putAll(m);
    }

    @Override
    public void clear() {
        map().clear();
    }

    @Override
    public Set<String> keySet() {
        return map().keySet();
    }

    @Override
    public Collection<Object> values() {
        return map().values();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return map().entrySet();
    }


    public Obj flex(Object ...objects){
        Obj nobj = o();
        boolean flexed = false;
        for (int i = 0; i < objects.length; i++) {
            Object obj = objects[i];
            boolean readNext = false;
            if(obj instanceof FlexAction){
                for (Map.Entry<String, Object> entry : this.entrySet()) {
                    if(((FlexAction) obj).canFlex(entry.getKey(), entry.getValue())){
                        Object fval = ((FlexAction) obj).call(entry.getKey(), entry.getValue());
                        if(fval instanceof Map.Entry){
                            nobj.put((String) ((Map.Entry) fval).getKey(),  ((Map.Entry) fval).getValue());
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
            map(nobj);
        }
        return this;
    }


    public <T> T get(Object key, Class<T> clz){
        if(key instanceof String){
            return cast(get((String)key), clz);
        } else {
            return cast(get((int)key), clz);
        }
    }

    public String s(Object key){
        return get(key, String.class);
    }

    public String s(Object key, String defaultValue){
        String str = s(key);
        if(StrUtil.isEmpty(str)){
            return defaultValue;
        }
        return str;
    }

    public Integer i(Object k, int defaultValue){
        Integer val = i(k);
        if (val == null) {
            val = defaultValue;
        }
        return val;
    }

    public Integer i(Object k){
        return get(k, Integer.class);
    }

    public boolean b(Object k){
        Object val = get(k);
        if (val == null) {
            return false;
        }
        return Json.cast(val, Boolean.class);
    }

    public Long l(Object k){
        Object val = get(k);
        if (val == null) {
            return null;
        }
        return Json.cast(val, Long.class);
    }

    public Long l(Object k, long defaultValue){
        Long val = l(k);
        if (val == null) {
            return defaultValue;
        }
        return val;
    }

//    public void forEach(KVIterator<Object> iterator){
//        for (Map.Entry<String, Object> e : entrySet()) {
//            try {
//                iterator.call(e.getKey(), e.getValue());
//            } catch (Exception ex) {
//                throw new RuntimeException();
//            }
//        }
//    }

}
