package com.beeasy.web.core;

public class RestException extends RuntimeException{

    public String msg = null;

    public RestException(String msg){
        super();
        this.msg = msg;
    }
}
