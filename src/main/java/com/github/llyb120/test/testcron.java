package com.github.llyb120.test;


import java.util.Date;

public class testcron {

    public void run() throws Exception {
        System.out.println(new Date().getTime());
    }


    public Object a(String a1, int a2){
        return null;
    }

    public Object test(String methodName, Object ...args){
        switch (methodName){
            case "a":
                return a((String)args[0], (Integer) args[1]);
            case "ba":
                return a((String)args[0], (Integer) args[1]);
            case "aaa":
                return a((String)args[0], (Integer) args[1]);

            default:
                return null;
        }
    }
}
