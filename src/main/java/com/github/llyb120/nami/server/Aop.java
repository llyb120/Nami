package com.github.llyb120.nami.server;

import com.github.llyb120.nami.func.Expression;

public interface Aop {

    Object around(Request request, Response response, boolean half, Expression expression);
}
