package com.github.llyb120.nami.func;

public interface Function {

    Object call() throws Exception;

    public static Object func(Function function) {
        try{
            return function.call();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
