package com.github.llyb120.nami.json;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.func.Arg1Function;
import org.bson.conversions.Bson;

import java.util.*;
import java.util.stream.Collectors;

public class Arr<T extends Object> extends Json implements List<T> {

    private List list;
    boolean spread = false;

    public Arr(){
        list = Collections.synchronizedList(new ArrayList<>());
    }

    public List list(){
        return list;
    }

    @Override
    public Object set(int index, Object element) {
        return list().set(index, element);
    }

    @Override
    public void add(int index, Object element) {
        list().add(index, element);
    }

    @Override
    public T remove(int index) {
        return (T) list().remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list().indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list().lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return list().listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return list().listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return list().subList(fromIndex, toIndex);
    }

    @Override
    public int size() {
        return list().size();
    }

    @Override
    public boolean isEmpty() {
        return list().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list().contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list().iterator();
    }

    @Override
    public Object[] toArray() {
        return list().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) list().toArray(a);
    }

    @Override
    public boolean add(Object o) {
        return list().add(o);
    }


    @Override
    public boolean remove(Object o) {
        return list().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list().addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return list().addAll(c);
    }


    @Override
    public boolean removeAll(Collection<?> c) {
        return list().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list().retainAll(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index ) {
        return (T) list().get(index);
    }

    @Override
    public List<? extends Bson> toBson() {
        return (List<? extends Bson>) super.toBson();
    }

    public static Arr fromBson(Object object) {
        return (Arr) Json.fromBson(object);
    }

    public String join(){
        return join(",");
    }
    public String join(String ch){
        return join(ch, "");
    }
    public String join(String ch,String wrap){
        return this.stream()
                .filter(e -> e != null)
                .map(e -> String.valueOf(e))
                .map(e -> StrUtil.wrap(e, wrap))
                .collect(Collectors.joining(ch));
    }


    public List<Obj> oa(){
        return (List)this;
    }

    public Arr<T> add(Object ...objects){
        for (Object object : objects) {
           add(object);
        }
        return this;
    }

    public <U extends T> Arr group(Arg1Function<U> function){
        Map<Object, Arr> cache = new LinkedHashMap<>();
        for (T t : this) {
            try {
                Object key = function.call((U)t);
                Arr arr = cache.get(key);
                if (arr == null) {
                    cache.put(key, arr = a());
                }
                arr.add(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return aaa(cache.values());
    }

    public Arr<T> spread(){
        spread = true;
        return this;
    }


    public Object or(Object obj){
        if(isEmpty()){
            return obj;
        }
        return this;
    }


//    public List<? extends Bson> toBsonArray(){
//        List list = new ArrayList();
//        for (Object o : this) {
//            if(o instanceof Obj){
//                list.add(((Obj) o).toBson());
//            } else if(o instanceof Arr){
//                list.add(((Arr) o).toBsonArray());
//            } else {
//                list.add(o);
//            }
//        }
//        return list;
//    }

}
