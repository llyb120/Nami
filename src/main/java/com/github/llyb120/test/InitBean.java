package com.github.llyb120.test;

import static com.github.llyb120.nami.log.Log.debug;

public class InitBean {

    public static int d = 1;

    public void onCreate() throws Exception {
        debug("on created");
        d = 2;
    }

    public void onDestroy() throws Exception {
        System.out.println("222on dedffsfffdsafffffftroy ");
        d = 3;
    }
}
