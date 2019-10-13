package com.github.llyb120.nami.bean;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Server {
    String[] packages() default {""};
    int port() default 8088;
}
