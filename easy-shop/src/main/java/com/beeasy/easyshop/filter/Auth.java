package com.beeasy.easyshop.filter;

import com.beeasy.web.core.AopInvoke;

public class Auth {
    
    public Object around(AopInvoke invoke) throws Exception {
        Object ret = invoke.call(); 
        return ret;
    }
}
