package com.beeasy.web.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.beetl.sql.core.kit.GenKit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Struct;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Config {
    public static Config config;
    public int port;
    public Map<String,Db> db;
    public Set<String> hotswap;
    public LinkedHashSet<String> route;
    public Compile compile;
    public Cors cors;
    public JSONObject ext;
    public String upload;
    public File uploadDir;

    public static void init(String path){
        try (
            FileInputStream fis = new FileInputStream(path);
        ){
            String str = IoUtil.read(fis).toString(StandardCharsets.UTF_8);
            config = JSON.parseObject(str, Config.class);

            if (config.route != null) {
                for (String s : config.route) {
                    HttpServerHandler.ctrls.add(new Route(s));
                }
            }
            if (config.compile != null) {
                if (config.compile.source == null) {
                    config.compile.source = GenKit.getJavaSRCPath();
                }
                if (config.compile.target == null) {
                    config.compile.target = new File(config.compile.source, "../../../target/classes").getAbsolutePath();
//                     new File(target, "target/classes").getAbsolutePath();
                }
            }
            if(StrUtil.isNotEmpty(config.upload)){
                config.uploadDir = new File(config.upload);
                config.uploadDir.mkdirs();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Db{
        public String url;
        public String driver;
        public String username;
        public String password;
        public String style;
    }

    static class Compile{
        public String source;
        public String target;
        public String compiler;
    }

    static class Cors{
        public String origin;
        public String method;
        public String headers;
        public String credentials;
    }
}
