package com.github.llyb120.nami.compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockMap extends HashMap<String, byte[]> {
    private ReentrantLock lock = new ReentrantLock();
    private Map<String,Condition> conditionMap = new WeakHashMap<>();

    private Condition getCondition(String key){
        Condition condition = conditionMap.get(key);
        if (condition == null) {
            condition = lock.newCondition();
            conditionMap.put(key, condition);
        }
        return condition;
    }


    @Override
    public byte[] get(Object key) {
        byte[] item = null;
//        System.out.println("will get lock:" + Thread.currentThread().getName());
        lock.lock();
        System.out.println("got lock:" + Thread.currentThread().getName());
        try{
//            Condition condition = getCondition((String) key);
//            while((item = super.get(key)) == null){
//                condition.await();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
        } finally {
            System.out.println("will release lock:" + Thread.currentThread().getName());
            lock.unlock();
        }
        return item;
    }

    @Override
    public byte[] put(String key, byte[] value) {
        lock.lock();
        byte[] ret = super.put(key, value);
        try{
            Condition condition = getCondition(key);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
        return ret;
    }
}
