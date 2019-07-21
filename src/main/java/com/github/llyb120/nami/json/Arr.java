package com.github.llyb120.nami.json;

import com.github.llyb120.nami.json.Json;

import java.util.*;

public class Arr extends Json implements List<Object> {

    private ArrayList list;

    public Arr(){
        this(false);
    }

    public Arr(boolean p){
        if(p){

        } else {
            list = new ArrayList();
        }
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
    public Object remove(int index) {
        return list().remove(index);
    }

    @Override
    public ListIterator<Object> listIterator() {
        return list().listIterator();
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return list().listIterator(index);
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return list().subList(fromIndex, toIndex);
    }

    @Override
    public int size() {
        return list().size();
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
    public boolean remove(Object o) {
        return list().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list().containsAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
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
    public Object get(int index) {
        return null;
    }


}
