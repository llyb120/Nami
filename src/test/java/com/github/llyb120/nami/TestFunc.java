package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.json.Obj;
import org.junit.Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static com.github.llyb120.nami.func.Function.eval;
import static com.github.llyb120.nami.json.Json.o;


public class TestFunc {

    @Test
    public void test() throws Exception {
        Nami.dev();
        int a = eval("return 1");
        int b = eval("return 1");

        eval("System.out.println(123321)");
        System.out.println(a);
    }

    public Object call(){
        if(true){
            return 1;
        }
        return null;
    }

    @Test
    public void t2(){
        Object a = t3();
        int d = 2;
    }

    public Object t3(){
        Obj obj = o();
        try{
            return obj;
        } catch (
           Exception e
        ){

        } finally {
        }
        return null;
    }


    @Test
    public void t4() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock();
            System.out.println("fuck1");
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("fuck2");

            lock.unlock();
        }).start();
        new Thread(() -> {
            lock.lock();
            System.out.println("fuck3");
            condition.signalAll();
            System.out.println("fuck4");
            lock.unlock();
        }).start();


        Thread.sleep(10000);
    }

}
