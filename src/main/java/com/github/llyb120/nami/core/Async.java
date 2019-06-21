package com.github.llyb120.nami.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {
    private static ExecutorService executor = Executors.newFixedThreadPool(8);
    private static ExecutorService cacheExecutor = Executors.newCachedThreadPool();

    public static Future submit(Task task){
        return executor.submit(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static Future submitCache(Task task){
        return cacheExecutor.submit(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void execute(Task task){
        new Thread(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void exitWhenError(Task task){
        new Thread(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }).start();
    }

    public interface Task{
        void call() throws Exception;
    }
}
