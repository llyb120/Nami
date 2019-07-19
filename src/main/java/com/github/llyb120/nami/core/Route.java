package com.github.llyb120.nami.core;

import cn.hutool.core.util.ArrayUtil;

import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Route {

    public static List<Route> routes = new Vector<>();

//    public int cIndex = -1;
//    public int aIndex = -1;
    public Pattern reg = null;
    public String packageName = null;
    public String[] aops;
    public String className = null;


    public String tempC;
    public String tempA;

    public Route(String str){
        String[] route = str.split("\\s*->\\s*");
        String[] left = route[0].substring(1).split("/");
        String ctrl = null;
        if(route.length == 2){
            ctrl = route[1];
        } else if(route.length == 3){
            ctrl = route[2];
            aops = route[1].split(",");
        }
//        int i = 0;
//        for (String s : left) {
//            ArrayUtil.indexOf(left, ":c");
//            if(":c".equals(s)){
//                cIndex = i;
//            } else if(":a".equals(s)){
//                aIndex = i;
//            }
//            i++;
//        }
        //如果没有指定控制器，则直接指向类
        if(!str.contains(":c")){
            className = ctrl;
        } else {
            packageName = ctrl;
        }

        reg = Pattern.compile(
            "^" + route[0].replaceAll(":c|:a", "([a-zA-Z0-9\\-\\_]+)") + "$"
        );
    }

    private Matcher match(String url){
        return reg.matcher(url);
    }

    public static Object[] getMatchedRoute(String path){
        for (Route route : routes) {
            Matcher m = route.match(path);
            if(m.find()){
                if(m.groupCount() == 2){
                    return new Object[]{route.packageName, route.packageName + "." + m.group(1), m.group(2), route.aops};
                } else if(m.groupCount() == 1){
                    return new Object[]{route.className, null, m.group(1), route.aops};
                }
            }
        }
        return null;
    }


}
