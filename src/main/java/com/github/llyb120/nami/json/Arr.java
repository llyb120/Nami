//package com.github.llyb120.nami.json;
//
//import java.util.*;
//
//public class Arr<T> implements List<T>, IArr<T> {
//
//    protected LinkedList list = new LinkedList();
//
//    public Arr(){}
//    public Arr(Collection<T> collection) {
//        list.addAll(collection);
//    }
//    public Arr(T[] arr){
//        list.addAll(Arrays.asList(arr));
//    }
//
//    protected List getInnerList(){
//        return list;
//    }
//
////    @Override
////    public <T> T toJavaObject(Class<T> clazz) {
////        if(getClass().isAssignableFrom(clazz)){
////            return (T) this;
////        }
////        return super.toJavaObject(clazz);
////    }
//
//    public Obj[] oa(){
//        return this.toArray(new Obj[this.size()]);
//    }
//
////    public List<Obj>toObjList toObjList(){
////        var list = new ArrayList<Obj>();
////        for (Object o : this) {
////            if(o instanceof Obj){
////                list.add((Obj)o);
////            } else if(o instanceof Map){
////                list.add(new Obj((Map)o));
////            } else {
////
////            }
////        }
////        return list;
////    }
//
//    public <T> T to(Class<T> clz){
//        return Json.cast(this, clz);
////        if(List.class.isAssignableFrom(clz)){
////            if(clz == List.class) clz = (Class<T>) ArrayList.class;
////            var arr = Json.newInstance(clz);
////            var it = this.iterator();
////            while(it.hasNext()){
////                var item = it.next();
////                arr.add(Json.cast(item, clz));
////            }
////            return arr;
////        } else {
////
////        }
////        for (int i = 0; i < this.size(); i++) {
////
////        }
////        for (T t : this) {
////
////        }
////        return Json.cast(this, clz);
////        if(List.class == clz){
////            clz = (Class<T>) getClass();
////        }
////        if(getClass().isAssignableFrom(clz)){
////            return (List<T>) this;
////        }
////        if(List.class.isAssignableFrom(clz)){
////            var ca = ConstructorAccess.get(clz);
////            var ins = ca.newInstance();
////            ((List)ins).addAll(this);
////            return (List<T>) ins;
////        }
//        //不处理set
//
////        if(Set.class == clz){
////            clz = (Class<T>) LinkedHashSet.class;
////        }
////        if(Set.class.isAssignableFrom(clz)){
////            var ca = ConstructorAccess.get(clz);
////            var ins = ca.newInstance();
////            ((Set)ins).addAll(this);
////            return ins;
////        }
////        if(BeanUtil.isBean(clz)){
////            Class<T> finalClz = clz;
////            return this.stream()
////                    .map(e -> BeanUtil.toBean(e, finalClz))
////                    .collect(Collectors.toList());
////        }
////        return null;
//    }
//
//    public List<Arr> toArrList(){
//        List list = new ArrayList<Arr>();
//        for (Object o : this) {
//            list.add((Arr)o);
//        }
//        return list;
//    }
//
//    public String[] toStrArr(){
//        return this.toArray(new String[this.size()]);
//    }
//
//    public List<String> toStrList(){
//        List list = new ArrayList<String>();
//        for (Object o : this) {
//            list.add((String) o);
//        }
//        return list;
//    }
//
//    public boolean isNotEmpty(){
//        return !isEmpty();
//    }
//
//    @Override
//    public int size() {
//        return getInnerList().size();
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return getInnerList().isEmpty();
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return getInnerList().contains(o);
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return getInnerList().iterator();
//    }
//
//    @Override
//    public Object[] toArray() {
//        return getInnerList().toArray();
//    }
//
//    @Override
//    public <T1> T1[] toArray(T1[] a) {
//        return (T1[]) getInnerList().toArray(a);
//    }
//
//    @Override
//    public boolean add(T t) {
//        return getInnerList().add(t);
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return getInnerList().remove(o);
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return getInnerList().containsAll(c);
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends T> c) {
//        return getInnerList().addAll(c);
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends T> c) {
//        return getInnerList().addAll(c);
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return getInnerList().removeAll(c);
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return getInnerList().retainAll(c);
//    }
//
//    @Override
//    public void clear() {
//        getInnerList().clear();
//    }
//
//    @Override
//    public T get(int index) {
//        return (T) getInnerList().get(index);
//    }
//
//    @Override
//    public T set(int index, T element) {
//        return (T) getInnerList().set(index, element);
//    }
//
//    @Override
//    public void add(int index, T element) {
//        getInnerList().add(index, element);
//    }
//
//    @Override
//    public T remove(int index) {
//        return (T) getInnerList().remove(index);
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        return getInnerList().indexOf(o);
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return getInnerList().lastIndexOf(o);
//    }
//
//    @Override
//    public ListIterator<T> listIterator() {
//        return getInnerList().listIterator();
//    }
//
//    @Override
//    public ListIterator<T> listIterator(int index) {
//        return getInnerList().listIterator(index);
//    }
//
//    @Override
//    public List<T> subList(int fromIndex, int toIndex) {
//        return getInnerList().subList(fromIndex, toIndex);
//    }
//
//
//    @Override
//    public String toString() {
//        return Json.stringify(this);
//    }
//}
