package com.github.llyb120.nami.core;

import com.alibaba.fastjson.JSON;
import org.beetl.sql.core.kit.GenKit;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class Config {
    public static Config config;
    public int port;
    public Map<String, Db> db;
    public Set<String> hotswap;
    public LinkedHashSet<String> route;
    public Compile compile = new Compile();
    public Cors cors;
    public Obj ext;
    public boolean dev = true;
    public List<String> link;
    public Map<String, Link> links;

    static {
        System.setProperty("illegal-access", "deny");
    }


    public static void init(String path) {
        try (
                RandomAccessFile raf = new RandomAccessFile(path, "r");
//            FileInputStream fis = new FileInputStream(path);
        ) {
            var bs = new byte[(int) raf.length()];
            raf.readFully(bs);
            config = JSON.parseObject(bs, Config.class);

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
                }
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
                    if (arr.length == 5) {
                        config.links.put(link.fromClz + link.name, link);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Db {
        public String url;
        public String driver;
        public String username;
        public String password;
        public String style;
        public String schema;
    }

    static class Compile {
        public String source;
        public String target;
        public String compiler;
        public boolean parallel;
    }

    static class Cors {
        public String origin;
        public String method;
        public String headers;
        public String credentials;
    }


    static class Link {
        public String fromClz;
        public String fromField;
        public String toClz;
        public String toField;
        public String name;
        public boolean many = false;
    }
}
