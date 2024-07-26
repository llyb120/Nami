package com.github.llyb120.nami.bean;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OnVersion {
    String name() default "default";
    String version() default "1.0";
}
