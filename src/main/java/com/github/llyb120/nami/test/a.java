package com.github.llyb120.nami.test;

import cn.hutool.core.util.ObjectUtil;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.Obj;

public class a {

    public String getWithNoArg(){
        return "ok";
    }

    public String getWithArgs(String a){
        return a;
    }

    public Object getQuery(Obj query){
        return query;
    }

    public Object postUrlEncoded(Obj body){
        return body;
    }

    public Object postUrlEncoded2(String a){
        return a;
    }

    public Object postJsonObject(Obj body){
        return body;
    }

    public Object postJsonArray(Arr body){
        return body;
    }


    public Object uploadFile(String cubi){
        return cubi;
    }
}
