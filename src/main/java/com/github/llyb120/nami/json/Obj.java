package com.github.llyb120.nami.json;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import org.bson.Document;

import java.util.*;

public class Obj extends Json implements Map<String,Object> {

//    private boolean parallel = false;
//    private ThreadLocal<Map<String,Object>> local;
    private Map<String,Object> map;

//    public static interface KVIterator<U>{
//        void call(String k, U v) throws Exception;
//    }

    public Obj(){
        map = new LinkedHashMap<>();
    }

    public Obj(Map map){
        this();
        putAll(map);
    }

//    public Obj(boolean p){
//        parallel = p;
//        if(p){
//            local = new ThreadLocal(){
//                @Override
//                protected Object initialValue() {
//                    return new LinkedHashMap<>();
//                }
//            };
//        } else {
//            map = new LinkedHashMap<>();
//        }
//    }

    public Map<String,Object> map(){
        return map;
    }

    public void map(Map map){
        this.map = map;
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

    public Date date(String key, String format){
        try {
            return DateUtil.parse(s(key), format).toJdkDate();
        } catch (Exception e){
        }
        return null;
    }

    public Obj o(String key){
        return Json.cast(get(key), Obj.class);
    }

    public Obj oo(String key){
        Obj ret = o(key);
        if (ret == null) {
            ret = o();
            put(key, ret);
        }
        return ret;
    }

    public Arr a(String key){
        return cast(get(key), Arr.class);
    }

    public Arr aa(String key){
        Arr ret = a(key);
        if (ret == null) {
            ret = a();
            put(key, ret);
        }
        return ret;
    }

    public Obj v(String key, Validate validate, String msg, Object ...args){
        Object obj = get(key);
        switch (validate){
            case NotNull:
                if (obj == null) {
                    Validate.error(msg, args);
                }
                break;

            case NotEmpty:
                obj = s(key, "");
                if(StrUtil.isEmptyIfStr(obj)){
                    Validate.error(msg, args);
                }
                break;

            case NotBlank:
                obj = s(key, "");
                if(StrUtil.isBlankIfStr(obj)){
                    Validate.error(msg, args);
                }
                break;
        }

        return this;
    }



   @Override
    public Document toBson() {
        return (Document) super.toBson();
    }

    public static Obj fromBson(Object object) {
        return (Obj) Json.fromBson(object);
    }



    //    public Document toBsonDoc(){
//        Document docuemnt = new Document();
//        for (Entry<String, Object> entry : entrySet()) {
//            if(entry.getValue() instanceof Obj) {
//                docuemnt.put(entry.getKey(), ((Obj) entry.getValue()).toBsonDoc());
//            } else if(entry.getValue() instanceof Arr){
//                docuemnt.put(entry.getKey(), ((Arr) entry.getValue()).toBsonArray());
//            } else {
//                docuemnt.put(entry.getKey(), entry.getValue());
//            }
//        }
//        return docuemnt;
//    }

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
