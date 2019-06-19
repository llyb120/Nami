package com.github.llyb120.nami.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {
    private static ExecutorService executor = Executors.newFixedThreadPool(8);

    public static Future submit(Task task){
        return executor.submit(() -> {
            try {
                task.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public interface Task{
        void call() throws Exception;
    }
}
