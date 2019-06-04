//package com.beeasy.easyshop;
//
//import com.alibaba.fastjson.com.alibaba.fastjson.JSON;
//
//public class R {
//    public int code = 200;
//    public Object data = null;
//    public String errMessage = "";
//
//    public static R ok(Object object){
//        R r =  new R();
//        r.code = 200;
//        r.data = object;
//        return r;
//    }
//
//    public static R fail(){
//        return fail(null);
//    }
//
//    public static R fail(Object object){
//        R r = new R();
//        r.code = 500;
//        r.errMessage = "错误请求";
//        if(object instanceof  String){
//            r.errMessage = (String) object;
//        } else {
//            r.data = object;
//        }
//        return r;
//    }
//
//    @Override
//    public String toString() {
//        return com.alibaba.fastjson.JSON.toJSONString(this);
//    }
//}
