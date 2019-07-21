//package com.github.llyb120.nami.json;
//
//import cn.hutool.core.util.StrUtil;
//
//import java.util.Collection;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Set;
//
//import static com.github.llyb120.nami.core.DBService.fSql;
//import static com.github.llyb120.nami.json.Json.cast;
//
//public class Obj2 implements IObj<Arr, Obj2>{
//    protected Class clz = null;
//    protected LinkedHashMap<String,Object> map;
//    private boolean parallel = false;
//    private ThreadLocal local;
//
//    public Obj2() {
//        this(false);
//    }
//
//    public Obj2(boolean parallel){
//        this.parallel = parallel;
//        if(parallel){
//            local = new ThreadLocal<Map>(){
//                @Override
//                protected Map initialValue() {
//                    return new LinkedHashMap();
//                }
//            };
//        } else {
//            map = new LinkedHashMap<>();
//        }
//    }
//
//    public Obj2(Map<String, Object> map) {
//        this(false);
//        concat(map);
//    }
//
//
//    public Map innerMap(){
//        if(parallel){
//            return (Map) local.g();
//        } else {
//            return map;
//        }
//    }
////
////    public Obj2(boolean ordered) {
////        super(ordered);
////    }
////
////    public Obj2(int initialCapacity) {
////        super(initialCapacity);
////    }
////
////    public Obj2(int initialCapacity, boolean ordered) {
////        super(initialCapacity, ordered);
////    }
////
////
////    @Override
////    public <T> T toJavaObject(Class<T> clazz) {
////        if (getClass().isAssignableFrom(clazz)) {
////            return (T) this;
////        }
////        return super.toJavaObject(clazz);
////    }
//
//
////
////    public static interface ObjValueIterator {
////        void call(Obj2 t);
////    }
//
////    public void forEachObj(ObjValueIterator iterator){
////        for (String s : this.keys()) {
////            var val = getObj(s);
////            iterator.call(val);
////        }
////    }
//
////    public Arr getArr(String key) {
////        return new Arr(super.getJSONArray(key));
////    }
////
////    public Obj2 getObj(String key){
////        return new Obj2(super.getJSONObject(key));
////    }
//
////    @Deprecated
////    public String getStr(String key, String dft){
////        var str = getStr(key);
////        if(StrUtil.isEmpty(str)){
////            return dft;
////        }
////        return str;
////    }
////
////    @Deprecated
////    public String getStr(String key){
////        var obj = g(key);
////        if (obj == null) {
////            return null;
////        }
////        if(obj instanceof String){
////            return (String) obj;
////        }
////        return String.valueOf(obj);
////    }
//
//
//
//
//
//
//
////    public Obj2 o(String k){
////        Object val = g(k);
////        if (val == null) {
////            return null;
////        }
////        if(val instanceof Obj2){
////            return (Obj2) val;
////        }
////        if(val instanceof Map){
////            return new Obj2((Map<String, Object>) val);
////        }
////        return null;
////    }
//
////    public Arr a(String k){
////        Object val = g(k);
////        if (val == null) {
////            return null;
////        }
////        if(val instanceof Arr){
////            return (Arr) val;
////        }
////        //todo: 数组的添加
//////        if(val instanceof Iterable){
//////            return new Arr((Iterable) val);
//////        }
////        return null;
////    }
//
////    public Object getByPath(String path){
////        try{
////            String[] ps = path.split("\\.");
////            Object obj = this;
////            for (String p : ps) {
////                if(obj instanceof JSONArray){
////                    obj = ((JSONArray) obj).g(Integer.parseInt(p));
////                } else if(obj instanceof JSONObject){
////                    obj = ((JSONObject) obj).g(p);
////                }
////            }
////            if(obj instanceof Map){
////                return new Obj2((Map<String, Object>) obj);
////            } else if(obj instanceof List){
////                return new Arr((List<Object>) obj);
////            } else {
////                return obj;
////            }
////        }
////        catch (Exception e){
////            e.printStackTrace();
////        }
////        return null;
////    }
//
//
//    public Obj2 to(String tableName){
//        Arr arr = fSql.insert(tableName, this);
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        return toJsonString();
//    }
//
//
//    //    public <U> Obj2<U> as(Class<U> clz) {
////        this.clz = clz;
////        return (Obj2<U>)this;
////    }
////
////
////    public synchronized Obj2<T> hold(Json.Property<T, ?>... funs) {
////        var obj = o();
////        for (Json.Property<T, ?> fun : funs) {
////            String name = Json.getFunctionKey(fun);
////            obj.set(name, g(name));
////        }
////        reset();
////        concat(obj);
////        return this;
////    }
////
////    public Obj2<T> on(Json.ValidateType validateType, String errorMessage, Json.Property<T, ?>... funs) {
////        return this;
////    }
////
////    public Obj2<T> find() {
////        return this;
////    }
////
////    public Obj2<T> set(Json.Property<T, ?> fun, Json.ValueType value) {
////        return this;
////    }
//
////    public Obj2<T> assign(Function<T, ?> function) {
////        T obj = (T) toJavaObject(clz);
////        Object object = function.apply((T) obj);
////        Obj2 object1 = (Obj2) JSON.toJSON(object);
////        if (object1 != null) {
////            concat(object1);
////        }
////        return this;
////    }
////
////    public T cast() {
////        return (T) toJavaObject(clz);
////    }
//
//}
