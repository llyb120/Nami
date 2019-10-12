package com.github.llyb120.test;

import com.github.llyb120.nami.bean.Bean;

import static com.github.llyb120.nami.log.Log.debug;

public class InitBean extends Bean {

    public static int d = 1;

    @Override
    public void onCreate() throws Exception {
        debug("on created");
        d = 2;
    }

    @Override
    public void onDestroy() throws Exception {
        System.out.println("222on dedffsfffdsafffffftroy ");
        d = 3;
    }
}
