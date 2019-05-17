package com.beeasy.easyshop;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import org.beetl.sql.core.engine.PageQuery;

import java.io.File;
import java.util.Date;

import static com.beeasy.web.core.DBService.sqlManager;
import static com.beeasy.web.core.Config.config;

public class U {

    public static JSONObject obj(Object ...objects) {
        JSONObject object = new JSONObject();
        for(short i = 0; i < objects.length; i+=2){
            object.put((String) objects[i], objects[i + 1]);
        }
        return object;
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
}
