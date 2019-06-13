package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import org.beetl.sql.core.kit.GenKit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Config {
    public static Config config;
    public int port;
    public Map<String,Db> db;
    public Set<String> hotswap;
    public LinkedHashSet<String> route;
    public Compile compile = new Compile();
    public Cors cors;
    public Obj ext;
    public String upload;
    public File uploadDir;
    public boolean dev = true;
//    public Set<String> model;
    public List<String> link;
    public Map<String, Link> links;

    static {
        System.setProperty("illegal-access","deny");
    }


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

            if (config.link != null) {
                config.links = new HashMap<>();
                for (String s : config.link) {
                    String[] arr = s.split("\\s*(:|\\.|->|=>)\\s*");
                    Link link = new Link();
                        link.name = arr[0];
                        link.fromClz = arr[1].toLowerCase();
                        link.fromField = arr[2].toLowerCase();
                        link.toClz = arr[3].toLowerCase();
                        link.toField = arr[4].toLowerCase();
                        link.many = s.contains("=>");
                    if(arr.length == 5){
                        config.links.put(link.fromClz + link.name, link);
                    }
                }
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
        public boolean parallel;
    }

    static class Cors{
        public String origin;
        public String method;
        public String headers;
        public String credentials;
    }


    static class Link{
        public String fromClz;
        public String fromField;
        public String toClz;
        public String toField;
        public String name;
        public boolean many = false;
    }
}
