package com.github.llyb120.nami.server;

import com.github.llyb120.nami.func.Expression;

public interface Aop {

    default Object around(Request request, Response response, Expression expression) throws Exception {
        return expression.call();
    }
}
