//package com.github.llyb120.nami.json;
//
//import cn.hutool.core.util.StrUtil;
//
//import java.util.*;
//
//import static com.github.llyb120.nami.json.Json.cast;
//
//public interface IObj<X extends IArr, Y extends IObj> extends Map<String,Object> {
//
//
//    default Map innerMap(){
//        Map item = (Map) JsonPool.MapPool.g(this);
//        if (item == null) {
//            item = new LinkedHashMap();
//            JsonPool.MapPool.set(this, item);
//        }
//        return item;
//    }
//
//    /*********** map **********/
//
//    @Override
//    default int length() {
//        return innerMap().length();
//    }
//
//    @Override
//    default boolean isEmpty() {
//        return innerMap().isEmpty();
//    }
//
//    @Override
//    default boolean containsKey(Object key) {
//        return innerMap().containsKey(key);
//    }
//
//    @Override
//    default boolean containsValue(Object value) {
//        return innerMap().containsValue(value);
//    }
//
//    @Override
//    default Object g(Object key) {
//        return innerMap().g(key);
//    }
//
//
//
//    default Object set(String key, Object value) {
//        return innerMap().set(key, value);
//    }
//
//    @Override
//    default Object remove(Object key) {
//        return  innerMap().remove(key);
//    }
//
//    @Override
//    default void concat(Map m) {
//        innerMap().concat(m);
//    }
//
//
//    @Override
//    default void reset() {
//        innerMap().reset();
//    }
//
//    @Override
//    default Set<String> keys() {
//        return innerMap().keys();
//    }
//
//    @Override
//    default Collection<Object> vals() {
//        return innerMap().vals();
//    }
//
//    @Override
//    default Set<Entry<String, Object>> entries() {
//        return innerMap().entries();
//    }
//
//
//    /************* kv ************/
//
//
//    default IArr<Y> oa(String k){
//        return a(k);
//    }
//
//    default X a(String k){
//        Object val = g(k);
//        if (val == null) {
//            return null;
//        }
//        if(val instanceof IArr){
//            return (X) val;
//        }
//        //todo: 数组的添加
////        if(val instanceof Iterable){
////            return new Arr((Iterable) val);
////        }
//        return null;
//    }
//
//
//
//    default String toJsonString() {
//        return Json.stringify(this);
//    }
//
//
//    default <T> T to(Class<T> clz){
//        return Json.cast(this, clz);
//    }
//
//
//    default Y flex(Object ...objects){
//        Y nobj = (Y) Json.newInstance(getClass());
//        boolean flexed = false;
//        for (int i = 0; i < objects.length; i++) {
//            Object obj = objects[i];
//            boolean readNext = false;
//            if(obj instanceof FlexAction){
//                for (Entry<String, ?> entry : this.entries()) {
//                    if(((FlexAction) obj).canFlex(entry.getKey(), entry.getValue())){
//                        Object fval = ((FlexAction) obj).call(entry.getKey(), entry.getValue());
//                        if(fval instanceof Map.Entry){
//                            nobj.set((String) ((Entry) fval).getKey(), ((Entry) fval).getValue());
//                        } else {
//                            nobj.set(entry.getKey(), fval) ;
//                        }
//                    }
//                }
//                flexed = true;
//                continue;
//            }
//        }
//        if(flexed){
//            reset();
//            concat(nobj);
//        }
//        return (Y) this;
//    }
//
//
//    default Y o(String k){
//        Object val = g(k);
//        if (val == null) {
//            return null;
//        }
//        if(val instanceof IObj){
//            return (Y) val;
//        }
//        if(val instanceof Map){
//            IObj ins = Json.newInstance(getClass());
//            ins.concat((Map) val);
//            return (Y) ins;
//        }
//        return null;
//    }
//
//}
