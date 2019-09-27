package com.github.llyb120.nami.core;

import com.github.llyb120.nami.func.NoReturnFunction;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Async {
    private static ExecutorService globalExecutor = Executors.newFixedThreadPool(1024);

    public static void execute(Runnable r){
        globalExecutor.execute(r);
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


}
