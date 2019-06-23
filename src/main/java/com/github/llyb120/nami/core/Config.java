package com.github.llyb120.nami.core;

import com.alibaba.fastjson.JSON;
import org.beetl.sql.core.kit.GenKit;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Config {
    public static Config config;
    public int port;
    public Map<String, Db> db = new Hashtable<>();
    public Set<String> hotswap = new HashSet<>();
    public List<String> route = new Vector<>();
    public Compile compile = new Compile();
    public Cors cors = new Cors();
    public Obj ext;
    public boolean dev = true;
    public List<String> link = new ArrayList<>();
    public Map<String, Link> links = new HashMap<>();

    private int ptr = 0;
    private byte[] bs = null;

    static {
//        System.setProperty("illegal-access", "deny");
    }


    public Config(String path) {
        config = this;
        initConf(path);
    }


    private void initConf(String path) {
        try (
                var fis = new FileInputStream(path);
        ) {
            bs = fis.readAllBytes();
            String token;
            while ((token = readNextToken()) != null) {
                switch (token) {
                    case "port":
                        port = Integer.parseInt(readNextToken());
                        break;

                    case "db":
                        readDb();
                        break;

                    case "dev":
                        dev = Boolean.parseBoolean(readNextToken());
                        break;

                    case "hotswap":
                        readStringArray(hotswap);
                        break;

                    case "compile":
                        readCompile();
                        break;

                    case "route":
                        readStringArray(route);
                        break;

                    case "cors":
                        readCors();
                        break;
                }
            }


            for (String s : route) {
                Route.routes.add(new Route(s));
            }
            if (config.compile.source == null) {
                config.compile.source = GenKit.getJavaSRCPath();
                if (config.compile.target == null) {
                    config.compile.target = new File(config.compile.source, "../../../target/classes").getAbsolutePath();
                }
            }
            for (String s : config.link) {
                String[] arr = s.toLowerCase().split("\\s*(:|\\.|->|=>)\\s*");
                Link link = new Link();
                link.name = arr[0];
                link.fromClz = arr[1];
                link.fromField = arr[2];
                link.toClz = arr[3];
                link.toField = arr[4];
                link.many = s.contains("=>");
                if (arr.length == 5) {
                    config.links.put(link.fromClz + link.name, link);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readStringArray(Collection collection) {
        //skip [
        readNextToken();
        var token = "";
        while ((token = readUntilLine2()) != null) {
            if (token.equals("]")) {
                break;
            }
            collection.add(token);
        }
    }

    private void readCors() {
        //skip {
        readNextToken();
        String token = null;
        scan:
        {
            while ((token = readNextToken()) != null) {
                switch (token) {
                    case "origin":
                        cors.origin = readUntilLine2();
                        break;

                    case "method":
                        cors.method = readUntilLine2();
                        break;

                    case "headers":
                        cors.headers = readUntilLine2();
                        break;

                    case "}":
                        break scan;
                }
            }
        }
    }


    private void readCompile() {
        //skip {
        readNextToken();
        String token = null;
        scan:
        {
            while ((token = readNextToken()) != null) {
                switch (token) {
                    case "compiler":
                        compile.compiler = token;
                        break;

                    case "parallel":
                        compile.parallel = Boolean.parseBoolean(readNextToken());
                        break;

                    case "}":
                        break scan;
                }
            }
        }
    }

    private void readDb() {
        //skip {
        readNextToken();
        //读取一个数据源名
        String token = null;
        while ((token = readNextToken()) != null) {
            if (token.equals("}")) {
                return;
            } else {
                var ds = new Db();
                this.db.put(token, ds);
                //skip {
                readNextToken();
                while (true) {
                    token = readNextToken();
                    if (token == null) {
                        break;
                    }
                    if (token.equals("}")) {
                        break;
                    }
                    switch (token) {
                        case "url":
                            ds.url = readUntilLine2();
                            break;

                        case "driver":
                            ds.driver = readUntilLine2();
                            break;

                        case "username":
                            ds.username = readUntilLine2();
                            break;

                        case "password":
                            ds.password = readUntilLine2();
                            break;

                        case "style":
                            ds.style = readUntilLine2();
                            break;

                        case "schema":
                            ds.schema = readUntilLine2();
                            break;
                    }
                }
            }
        }

    }


    private String readUntilLine2() {
        var left = -1;
        var right = -1;
        while (ptr < bs.length) {
            switch (bs[ptr]) {
                case ' ':
                case '\t':
                    break;

                case '\n':
                    if (left > -1) {
                        if (right == -1) {
                            return new String(bs, left, (ptr++) - left);
                        } else {
                            ptr++;
                            return new String(bs, left, right - left + 1);
                        }
                    }
                    break;

                default:
                    if (left == -1) {
                        left = ptr;
                    } else {
                        right = ptr;
                    }
                    break;
            }
//            if(bs[ptr] == '\n'){
//                return new String(bs, lastptr, (ptr++) - lastptr).trim();
//            }
            ptr++;
        }
        return null;
    }

    private String readUntilLine() {
        var lastNotEmptyPtr = -1;
        while (ptr < bs.length) {
            switch (bs[ptr]) {
                case ' ':
                case '\t':
                case '\n':
                    if (lastNotEmptyPtr > -1) {
                        return new String(bs, lastNotEmptyPtr, (ptr++) - lastNotEmptyPtr);
                    }
                    break;

                default:
                    if (lastNotEmptyPtr == -1) {
                        lastNotEmptyPtr = ptr;
                    }
                    break;
            }
            ptr++;
        }
        return null;
    }

    private String readNextToken() {
        var lastNotEmptyPtr = -1;
        while (ptr < bs.length) {
            switch (bs[ptr]) {
                case ' ':
                case '\t':
                    if (lastNotEmptyPtr != -1) {
                        return new String(bs, lastNotEmptyPtr, (ptr++) - lastNotEmptyPtr);
                    }
                    break;

                case '{':
                    if (lastNotEmptyPtr != -1) {
                        return new String(bs, lastNotEmptyPtr, ptr - lastNotEmptyPtr);
                    } else {
                        ptr++;
                        return "{";
                    }

                case '}':
                    ptr++;
                    return "}";

                case '[':
                    if (lastNotEmptyPtr != -1) {
                        return new String(bs, lastNotEmptyPtr, (ptr) - lastNotEmptyPtr);
                    } else {
                        ptr++;
                        return "[";
                    }

                case ']':
                    ptr++;
                    return "]";

                case '\n':
                    if (lastNotEmptyPtr != -1) {
                        ptr++;
                        return new String(bs, lastNotEmptyPtr, ptr - lastNotEmptyPtr - 1);
                    }
                    break;

                default:
                    if (lastNotEmptyPtr == -1) {
                        lastNotEmptyPtr = ptr;
                    }
                    break;
            }
            ptr++;
        }
        return null;
    }


    @Deprecated
    private static void init(String path) {
        try (
                RandomAccessFile raf = new RandomAccessFile(path, "r");
//            FileInputStream fis = new FileInputStream(path);
        ) {
            var bs = new byte[(int) raf.length()];
            raf.readFully(bs);
            config = JSON.parseObject(bs, Config.class);

            if (config.route != null) {
                for (String s : config.route) {
                    Route.routes.add(new Route(s));
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
                    String[] arr = s.toLowerCase().split("\\s*(:|\\.|->|=>)\\s*");
                    Link link = new Link();
                    link.name = arr[0];
                    link.fromClz = arr[1];
                    link.fromField = arr[2];
                    link.toClz = arr[3];
                    link.toField = arr[4];
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

    public static class Db {
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

    public static class Cors {
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
