package com.beeasy.easyshop;

import com.beeasy.web.core.AopInvoke;

public class filter2 {

    public Object around(AopInvoke invoke) throws Exception {
        System.out.println("filter 2 start");
        Object ret = invoke.call();
        System.out.println("filter 2 end");
        return ret;
    }

}
