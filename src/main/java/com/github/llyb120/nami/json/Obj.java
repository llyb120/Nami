package com.github.llyb120.nami.json;

import cn.hutool.core.util.StrUtil;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static com.github.llyb120.nami.core.DBService.fSql;
import static com.github.llyb120.nami.json.Json.cast;

public class Obj implements Map<String, Object>{
    protected Class clz = null;
    protected LinkedHashMap<String,Object> map;
    private boolean parallel = false;
    private ThreadLocal local;

    public Obj() {
        this(false);
    }

    public Obj(boolean parallel){
        this.parallel = parallel;
        if(parallel){
            local = new ThreadLocal<Map>(){
                @Override
                protected Map initialValue() {
                    return new LinkedHashMap();
                }
            };
        } else {
            map = new LinkedHashMap<>();
        }
    }

    public Obj(Map<String, Object> map) {
        this(false);
        putAll(map);
    }


    public Map getInnerMap(){
        if(parallel){
            return (Map) local.get();
        } else {
            return map;
        }
    }
//
//    public Obj(boolean ordered) {
//        super(ordered);
//    }
//
//    public Obj(int initialCapacity) {
//        super(initialCapacity);
//    }
//
//    public Obj(int initialCapacity, boolean ordered) {
//        super(initialCapacity, ordered);
//    }
//
//
//    @Override
//    public <T> T toJavaObject(Class<T> clazz) {
//        if (getClass().isAssignableFrom(clazz)) {
//            return (T) this;
//        }
//        return super.toJavaObject(clazz);
//    }

    @Override
    public int size() {
        return getInnerMap().size();
    }

    @Override
    public boolean isEmpty() {
        return getInnerMap().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return getInnerMap().containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return getInnerMap().containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return getInnerMap().get(key);
    }

    public <T> T get(String key, Class<T> clz){
        return cast(get(key), clz);
    }

    @Override
    public Object put(String key, Object value) {
        return getInnerMap().put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return getInnerMap().remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ?> m) {
        getInnerMap().putAll(m);
    }


    @Override
    public void clear() {
        getInnerMap().clear();
    }

    @Override
    public Set<String> keySet() {
        return getInnerMap().keySet();
    }

    @Override
    public Collection<Object> values() {
        return getInnerMap().values();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return getInnerMap().entrySet();
    }


    public static interface ObjValueIterator {
        void call(Obj t);
    }

//    public void forEachObj(ObjValueIterator iterator){
//        for (String s : this.keySet()) {
//            var val = getObj(s);
//            iterator.call(val);
//        }
//    }

//    public Arr getArr(String key) {
//        return new Arr(super.getJSONArray(key));
//    }
//
//    public Obj getObj(String key){
//        return new Obj(super.getJSONObject(key));
//    }

//    @Deprecated
//    public String getStr(String key, String dft){
//        var str = getStr(key);
//        if(StrUtil.isEmpty(str)){
//            return dft;
//        }
//        return str;
//    }
//
//    @Deprecated
//    public String getStr(String key){
//        var obj = get(key);
//        if (obj == null) {
//            return null;
//        }
//        if(obj instanceof String){
//            return (String) obj;
//        }
//        return String.valueOf(obj);
//    }

    public String s(String key){
        return get(key, String.class);
    }

    public String s(String key, String defaultValue){
        String str = s(key);
        if(StrUtil.isEmpty(str)){
            return defaultValue;
        }
        return str;
    }

    public Integer i(String k, int defaultValue){
        Integer val = i(k);
        if (val == null) {
            val = defaultValue;
        }
        return val;
    }

    public Integer i(String k){
        return get(k, Integer.class);
    }

    public boolean b(String k){
        Object val = get(k);
        if (val == null) {
            return false;
        }
        return Json.cast(val, Boolean.class);
    }

    public Arr<Obj> oa(String k){
        return a(k);
    }

    public Obj o(String k){
        Object val = get(k);
        if (val == null) {
            return null;
        }
        if(val instanceof Obj){
            return (Obj) val;
        }
        if(val instanceof Map){
            return new Obj((Map<String, Object>) val);
        }
        return null;
    }

    public Arr a(String k){
        Object val = get(k);
        if (val == null) {
            return null;
        }
        if(val instanceof Arr){
            return (Arr) val;
        }
        //todo: 数组的添加
//        if(val instanceof Iterable){
//            return new Arr((Iterable) val);
//        }
        return null;
    }

//    public Object getByPath(String path){
//        try{
//            String[] ps = path.split("\\.");
//            Object obj = this;
//            for (String p : ps) {
//                if(obj instanceof JSONArray){
//                    obj = ((JSONArray) obj).get(Integer.parseInt(p));
//                } else if(obj instanceof JSONObject){
//                    obj = ((JSONObject) obj).get(p);
//                }
//            }
//            if(obj instanceof Map){
//                return new Obj((Map<String, Object>) obj);
//            } else if(obj instanceof List){
//                return new Arr((List<Object>) obj);
//            } else {
//                return obj;
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public boolean isNotEmpty(){
        return !isEmpty();
    }



//    public Obj set(String key, Object value){
//         put(key, value);
//         return this;
//    }

    public Obj to(String tableName){
        Arr arr = fSql.insert(tableName, this);
        return null;
    }

    public <T> T to(Class<T> clz){
        return Json.cast(this, clz);
    }


    public Obj flex(Object ...objects){
        Obj nobj = Json.o();
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
        return this;
    }

    @Override
    public String toString() {
        return Json.stringify(this);
    }


    //    public <U> Obj<U> as(Class<U> clz) {
//        this.clz = clz;
//        return (Obj<U>)this;
//    }
//
//
//    public synchronized Obj<T> hold(Json.Property<T, ?>... funs) {
//        var obj = o();
//        for (Json.Property<T, ?> fun : funs) {
//            String name = Json.getFunctionKey(fun);
//            obj.put(name, get(name));
//        }
//        clear();
//        putAll(obj);
//        return this;
//    }
//
//    public Obj<T> on(Json.ValidateType validateType, String errorMessage, Json.Property<T, ?>... funs) {
//        return this;
//    }
//
//    public Obj<T> find() {
//        return this;
//    }
//
//    public Obj<T> set(Json.Property<T, ?> fun, Json.ValueType value) {
//        return this;
//    }

//    public Obj<T> assign(Function<T, ?> function) {
//        T obj = (T) toJavaObject(clz);
//        Object object = function.apply((T) obj);
//        Obj object1 = (Obj) JSON.toJSON(object);
//        if (object1 != null) {
//            putAll(object1);
//        }
//        return this;
//    }
//
//    public T cast() {
//        return (T) toJavaObject(clz);
//    }

}
