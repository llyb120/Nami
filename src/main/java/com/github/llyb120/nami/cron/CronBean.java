package com.github.llyb120.nami.cron;

public abstract class CronBean {

//    @Override
//    public void onCreate() throws Exception {
//        super.onCreate();
//    }
//
//    @Override
//    public void onDestroy() throws Exception {
//        super.onDestroy();
//    }

    public abstract void run();
    public abstract String expression();
}
