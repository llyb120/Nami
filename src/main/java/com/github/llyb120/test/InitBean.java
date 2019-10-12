package com.github.llyb120.test;

import com.github.llyb120.nami.bean.Bean;

public class InitBean extends Bean {

    public static int d = 1;

    @Override
    public void onCreate() throws Exception {
        System.out.println("on created");
        d = 2;
    }

    @Override
    public void onDestroy() throws Exception {
        System.out.println("on destroy ");
        d = 3;
    }
}
