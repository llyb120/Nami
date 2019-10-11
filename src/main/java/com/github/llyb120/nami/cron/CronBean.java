package com.github.llyb120.nami.cron;

import com.github.llyb120.nami.bean.Bean;

public abstract class CronBean extends Bean {

    @Override
    public void onCreate() throws Exception {
        super.onCreate();
    }

    @Override
    public void onDestroy() throws Exception {
        super.onDestroy();
    }

    public abstract void run();
    public abstract String cronExpression();
}
