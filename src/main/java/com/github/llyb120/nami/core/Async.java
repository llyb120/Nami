package com.github.llyb120.nami.core;

import com.github.llyb120.nami.func.NoReturnFunction;
import com.github.llyb120.nami.func.ReturnableFunction;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {
    private static ExecutorService executor = Executors.newFixedThreadPool(8);
    private static ExecutorService cacheExecutor = Executors.newCachedThreadPool();

    public static Future submit(NoReturnFunction task){
        return executor.submit(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static Future submit(ReturnableFunction function) {
        return executor.submit(() -> function.call());
    }

    public static Future submitCache(NoReturnFunction task){
        return cacheExecutor.submit(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static Future execute(NoReturnFunction task){
        return cacheExecutor.submit(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void exitWhenError(NoReturnFunction task){
        new Thread(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }).start();
    }

//    public interface Task{
//        void call() throws Exception;
//    }

}
