package com.github.llyb120.nami.test;

import com.github.llyb120.nami.cron.ICron;

import java.util.Date;

public class testcron implements ICron {

    @Override
    public void run() throws Exception {
        System.out.println(new Date().getTime());
    }
}
