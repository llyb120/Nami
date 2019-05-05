package com.beeasy.easyshop;

import com.alibaba.fastjson.JSONObject;

public class U {

    public static JSONObject obj(Object ...objects) {
        JSONObject object = new JSONObject();
        for(short i = 0; i < objects.length; i+=2){
            object.put((String) objects[i], objects[i + 1]);
        }
        return object;
    }
}
