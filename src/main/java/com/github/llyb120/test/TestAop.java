package com.github.llyb120.test;

import com.github.llyb120.nami.func.Expression;
import com.github.llyb120.nami.server.Aop;
import com.github.llyb120.nami.server.Request;
import com.github.llyb120.nami.server.Response;

public class TestAop implements Aop {

//    public Object around(Request request, Response response, boolean half, Expression expression) {
//        System.out.println("aop: " + Thread.currentThread().getName());
//        try {
//            return expression.call();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }



    @Override
    public Object around(Request request, Response response, Expression expression) throws Exception {
//        System.out.println("full before aop");
        Object obj = expression.call();
//        System.out.println("full after aop");
        return obj;
    }
}
