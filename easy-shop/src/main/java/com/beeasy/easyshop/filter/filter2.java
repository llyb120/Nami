package com.beeasy.easyshop.filter;

import com.beeasy.web.core.AopInvoke;

public class filter2 {

    public Object around(AopInvoke invoke) throws Exception {
        System.out.println("filter 2 start + changed 3times");
        Object ret = invoke.call();
        System.out.println("filter 2 end");
        return ret;
    }

}
