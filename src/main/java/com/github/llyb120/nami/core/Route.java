package com.github.llyb120.nami.core;

import cn.hutool.core.util.ArrayUtil;

import java.util.regex.Pattern;


public class Route {

    public int cIndex = -1;
    public int aIndex = -1;
    public Pattern reg = null;
    public String packageName = null;
    public String[] aops;

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
        int i = 0;
        for (String s : left) {
            ArrayUtil.indexOf(left, ":c");
            if(":c".equals(s)){
                cIndex = i;
            } else if(":a".equals(s)){
                aIndex = i;
            }
            i++;
        }
        packageName = ctrl;

        reg = Pattern.compile(
            "^" + route[0].replaceAll(":c|:a", "[a-zA-Z0-9\\-\\_]+") + "$"
        );
    }

    public boolean match(String url){
        return reg.matcher(url).find();
    }
}
