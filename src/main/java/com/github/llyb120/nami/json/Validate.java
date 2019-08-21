package com.github.llyb120.nami.json;

public enum Validate {
    NotNull,
    NotEmpty,
    NotBlank
    ;

    public static class Exception extends RuntimeException{
        public String message = "";

        public Exception(String message){
            super();
            this.message = message;
        }
    }

    public static void error(String msg, Object ...args){
        throw new Exception(String.format(msg, args));
    }
}
