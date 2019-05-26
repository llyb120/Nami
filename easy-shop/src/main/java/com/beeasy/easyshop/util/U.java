package com.beeasy.easyshop.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.beetl.sql.core.engine.PageQuery;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import static com.beeasy.web.core.DBService.sqlManager;
import static com.beeasy.web.core.Config.config;

public class U {

    //
    public static JSONObject o(Object ...objects) {
        JSONObject object = new JSONObject();
        for(short i = 0; i < objects.length; i+=2){
            object.put((String) objects[i], objects[i + 1]);
        }
        return object;
    }

    public static JSONArray a(Object ...objects){
        JSONArray array = new JSONArray();
        for (Object object : objects) {
           array.add(object);
        }
        return array;
    }

    public static JSONArray tree(Collection<JSONObject> list, String parentKey, String childKey){
        var map = new JSONObject();
        for (JSONObject object : list) {
            var key = object.getString(childKey);
            if (key == null) {
                continue;
            }
            map.put(key, object);
//            object.put("children", a());
        }
        var ret = a();
        for (JSONObject object : list) {
            var par = map.getJSONObject(object.getString(parentKey));
            if (par == null) {
                ret.add(object);
                continue;
            }
            var child = par.getJSONArray("children");
            if (child == null) {
                child = a();
                par.put("children", child);
            }
            child.add(object);
        }
        return ret;
    }

    public static <T> PageQuery<T> pageQuery(String sqlId, Class<T> retClz, JSONObject params){
        var pageQuery = new PageQuery();
        var page = 0;
        var size = 0;
        try{
            page = params.getIntValue("page");
        }
        catch (Exception e){
        }
        try{
            size = params.getIntValue("size");
        }
        catch (Exception e){
        }
        if(page <= 0){
            page = 1;
        }
        if(size <= 0){
            size = 10;
        }
        pageQuery.setParas(params);
        pageQuery.setPageNumber(page);
        pageQuery.setPageSize(size);

        return sqlManager.pageQuery(sqlId, retClz, pageQuery);
    }



    public static String getExt(String path){
        File file = new File(path);
        String name = file.getName();
        int lastdot = name.lastIndexOf(".");
        if (lastdot == -1) {
            return ".unknown";
        } else {
            return name.substring(lastdot);
        }
    }

    public static String fixFileName(String fileName){
        var date = DateUtil.format(new Date(), "yyyy-MM-dd");
        fileName = StrUtil.uuid() + U.getExt(fileName);
        var dir = new File(config.uploadDir, date);
        dir.mkdirs();
        return "/" + date + "/" + fileName;
    }

    public static String fixFileName5(String fileName) {
    return "123";
    }
}
