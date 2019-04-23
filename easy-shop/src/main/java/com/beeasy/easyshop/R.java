package com.beeasy.easyshop;

public class R {
    public boolean success = false;

    public static R ok(){
        R r =  new R();
        r.success = true;
        return r;
    }
}
