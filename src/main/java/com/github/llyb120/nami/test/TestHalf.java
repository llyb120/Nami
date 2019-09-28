package com.github.llyb120.nami.test;

import com.github.llyb120.nami.func.Expression;
import com.github.llyb120.nami.server.HalfAop;
import com.github.llyb120.nami.server.Request;
import com.github.llyb120.nami.server.Response;

public class TestHalf implements HalfAop {
    @Override
    public Object around(Request request, Response response, Expression expression) throws Exception {
        try{
            System.out.println("half before");
            return expression.call();
        } finally {
            System.out.println("half after");
        }
    }
}
