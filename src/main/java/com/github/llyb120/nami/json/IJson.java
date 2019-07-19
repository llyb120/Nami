package com.github.llyb120.nami.json;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.logging.impl.WeakHashtable;
import org.omg.PortableServer.POA;

import java.util.*;
import java.util.function.BiConsumer;

import static com.github.llyb120.nami.json.Json.cast;

public interface IJson<T> extends Iterable<T>{

    class Holder {
        public List<Object> list;
        public Map<String,Object> map;
    }

    interface KVIterator<U>{
        void call(String k, U v) throws Exception;
    }

    Map<Object,Holder> Pool = new WeakHashtable();

    default Holder holder(){
        Holder holder = Pool.get(this);
        if (holder == null) {
            holder = new Holder() ;
            Pool.put(this, holder);
        }
        return holder;
    }

    default IJson<T> holder(Holder holder){
        Pool.put(this, holder);
        return this;
    }

    default List<Object> list(){
        Holder holder = holder();
        if(holder.list != null){
            return holder.list;
        }
        else if(holder.map == null){
            holder.list = new ArrayList<>();
            return holder.list;
        }
        return null;
    }

    default Map<String, Object> map(){
        Holder holder = holder();
        if(holder.map == null){
            holder.map = new LinkedHashMap<>();
        }
        return holder.map;
    }

    default boolean isList(){
        return holder().list != null;
    }

    default boolean isMap(){
        return holder().map != null;
    }

    default boolean add(Object arg0){
        return list().add(arg0);
    }

    default void add(int arg0, Object arg1){
        list().add(arg0, arg1);
    }

    default boolean addAll(Collection arg0){
        return list().addAll(arg0);
    }

    default boolean addAll(int arg0, Collection arg1){
        return list().addAll(arg0, arg1);
    }

    default void clear(){
        Holder holder = holder();
        if (holder.list != null) {
            holder.list.clear();
        }
        if(holder.map != null){
            holder.map.clear();
        }
    }

    default boolean contains(Object arg0){
        return list().contains(arg0);
    }
    default boolean containsAll(Collection arg0){
        return list().containsAll(arg0);
    }
    default Object get(Object object){
        if(object instanceof String){
            return map().get(object);
        } else {
            return list().get((int)object);
        }
    }

    default int indexOf(Object arg0){
        return list().indexOf(arg0);
    }

    default boolean isEmpty(){
        Holder holder = holder();
        if (holder.list != null) {
            return holder.list.isEmpty();
        }
        if(holder.map != null){
            return holder.map.isEmpty();
        }
        return true;
    }

    default Iterator<T> iterator(){
        return (Iterator<T>) list().iterator();
    }
    default int lastIndexOf(Object arg0){
        return list().lastIndexOf(arg0);
    }
    default ListIterator listIterator(){
        return list().listIterator();
    }
    default ListIterator listIterator(int arg0){
        return list().listIterator(arg0);
    }

    default Object remove(String key){
        return map().remove(key);
    }

    default Object remove(int arg0){
        return list().remove(arg0);
    }

    default Object remove(Object object){
        Holder holder = holder();
        if (holder.list != null) {
            return holder.list.remove(object);
        }
        if (holder.map != null){
            return holder.map.remove(object);
        }
        return null;
    }

    default boolean removeAll(Collection arg0){
        return list().removeAll(arg0);
    }
    default boolean retainAll(Collection arg0){
        return list().retainAll(arg0);
    }

    default Object set(int arg0, Object arg1){
        return list().set(arg0, arg1);
    }

    default Object set(String key, Object value){
        return map().put(key, value);
    }

    default int size(){
        Holder holder = holder();
        if (holder.list != null) {
            return holder.list.size();
        }
        if (holder.map != null) {
            return holder.map.size();
        }
        return 0;
    }

    default List subList(int arg0, int arg1){
        return list().subList(arg0, arg1);
    }

    default Object[] toArray(){
        return list().toArray();
    }
    default Object[] toArray(Object[] arg0){
        return list().toArray(arg0);
    }
    default boolean containsKey(Object arg0){
        return map().containsKey(arg0);
    }
    default boolean containsValue(Object arg0){
        return map().containsValue(arg0);
    }

    default Set<Map.Entry<String,Object>> entrySet(){
        return map().entrySet();
    }
    default Object get(String arg0){
        return map().get(arg0);
    }
    default Set<String> keySet(){
        return map().keySet();
    }

    default Object put(String arg0, Object arg1){
        return map().put(arg0, arg1);
    }
    default void putAll(Map arg0){
        map().putAll(arg0);
    }
    default Collection values(){
        return map().values();
    }
    default void forEach(KVIterator<Object> iterator){
        for (Map.Entry<String, Object> e : entrySet()) {
            try {
                iterator.call(e.getKey(), e.getValue());
            } catch (Exception ex) {
                throw new RuntimeException();
            }
        }
    }


    /** json **/
    default <T> T get(Object key, Class<T> clz){
        if(key instanceof String){
            return cast(get((String)key), clz);
        } else {
            return cast(get((int)key), clz);
        }
    }

    default String s(Object key){
        return get(key, String.class);
    }

    default String s(Object key, String defaultValue){
        String str = s(key);
        if(StrUtil.isEmpty(str)){
            return defaultValue;
        }
        return str;
    }

    default Integer i(Object k, int defaultValue){
        Integer val = i(k);
        if (val == null) {
            val = defaultValue;
        }
        return val;
    }

    default Integer i(Object k){
        return get(k, Integer.class);
    }

    default boolean b(Object k){
        Object val = get(k);
        if (val == null) {
            return false;
        }
        return Json.cast(val, Boolean.class);
    }

    default IJson j(Object key){
        Object val = get(key);
        if (val == null) {
            return null;
        }
        if(val instanceof Json){
            return (Json) val;
        }
        if(val.getClass().isArray()){
            val = Arrays.asList(val);
        }
        if(val instanceof Map){
            IJson ins = Json.newInstance(getClass());
            map().putAll((Map<? extends String, ?>) val);
            return ins;
        } else if (val instanceof Collection){
            IJson ins = Json.newInstance(getClass());
            list().addAll((Collection<?>) val);
            return ins;
        }
        return null;
    }

    default IJson flex(Object ...objects){
        IJson nobj = Json.newInstance(getClass());
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
            holder().map = nobj.map();
        }
        return this;
    }

    default <T> T to(Class<T> clz){
        return Json.cast(this, clz);
    }



}
