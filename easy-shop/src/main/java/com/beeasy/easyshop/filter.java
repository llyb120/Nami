package com.beeasy.easyshop;

import com.beeasy.web.core.AopInvoke;

public class filter{

    public Object around(AopInvoke invoke) throws Exception {
        int a = 1;
        System.out.println("rilegou before + 1");
        return null;
//        Object ret = invoke.call();
//        System.out.println("rilegou after");
//        return ret;
    }
    
}
