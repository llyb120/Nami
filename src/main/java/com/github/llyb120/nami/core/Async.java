package com.github.llyb120.nami.core;

import com.github.llyb120.nami.func.VoidFunction;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {
    private static ExecutorService globalExecutor = Executors.newCachedThreadPool();

    public static Future execute(Callable r){
        return globalExecutor.submit(r);
    }
    public static Future execute(Runnable r){
        return globalExecutor.submit(r);
    }

    public static void exitWhenError(VoidFunction task){
        new Thread(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }).start();
    }


}
