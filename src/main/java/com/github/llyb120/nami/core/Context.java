//package com.github.llyb120.nami.core;
//
//import com.alibaba.fastjson.JSON;
//import com.github.llyb120.nami.json.Obj2;
//import com.github.llyb120.nami.server.Cookie;
//
//@Deprecated
//public class Context {
//
//    public Obj2 query = new Obj2();
//    public JSON body;
//    public Obj2 params = new Obj2();
//    public Cookie cookie = new Cookie();
//    public Obj2 headers = new Obj2();
//
//    public static ThreadLocal<Context> holder = new ThreadLocal<>(){
//        @Override
//        protected Context initialValue() {
//            return new Context();
//        }
//    };
//
//    public void reset(){
//        query.reset();
//        params.reset();
////        cookie.reset();
//        headers.reset();
//        body = null;
//    }
//
//    public Object getParamValue(String name, Class type) {
//        try {
//            return params.getObject(name, type);
//        } catch (Exception e) {
//            return null;
//        }
//    }
//}
