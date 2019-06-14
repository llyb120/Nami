package com.github.llyb120.nami.core.boost;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface SqlBoost {
    Class[] model() default {};
    String[] appendField() default "";
    String[] appendWhere() default "";


//    public static Links[] objs = new Object[1];

}
