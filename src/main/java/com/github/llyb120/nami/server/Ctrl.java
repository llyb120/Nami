package com.github.llyb120.nami.server;

import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Obj;

public abstract class Ctrl {
    public Obj $get;
    public Obj $post;
    public Obj $request;
    public Arr $postA;


    protected void init(Request request, Response response){
        $get = request.query;
        if(request.body instanceof Obj){
            $post = (Obj) request.body;
        } else if(request.body instanceof Arr){
            $postA = (Arr) request.body;
        }
        $request = request.params;
    }
}
