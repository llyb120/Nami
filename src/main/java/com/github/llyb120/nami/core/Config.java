package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.ext.file.SimpleStorage;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.FlexAction;
import com.github.llyb120.nami.json.Obj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import static com.github.llyb120.nami.json.Json.a;
import static com.github.llyb120.nami.json.Json.o;

public class Config {
    public static Config config;
    public int port;
    public Map<String, Db> db = new Hashtable<>();
    public Set<String> hotswap = new HashSet<>();
    public Vector<String> magicvar = new Vector<>();
    public List<String> route = new Vector<>();
//    public Compile compile = new Compile();
    public Cors cors = new Cors();
    public Obj ext = o();
    public Obj var = o();
    public boolean dev = false;
    public List<String> link = new ArrayList<>();
    public Map<String, Link> links = new HashMap<>();
    public Map<String, StorageConfig> storages = new Hashtable<>();
    public Obj statics = o();
    public String jdkVersion;
    public Version version = new Version();
    public Arr<String> crontabs = a();

    public String source;
    public String target;

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
        //jdk版本
        String version = System.getProperty("java.version");
        if(version.startsWith("1.8")){
            this.jdkVersion = "1.8";
        } else {
            this.jdkVersion = version;
        }
//        int idex = jdkVersion.indexOf(".");
//        if(idex == -1){
//            this.jdkVersion = jdkVersion;
//        } else {
//            this.jdkVersion = jdkVersion.substring(0, idex);
//        }
        try (
                FileInputStream fis = new FileInputStream(path);
        ) {
            bs = IoUtil.readBytes(fis);
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
                        readNextToken();
                        readStringArray(hotswap);
                        break;

                    case "magicVar":
                        readNextToken();
                        readStringArray(magicvar);
                        //add magic vars
                        magicvar.add("com.github.llyb120.nami.server.Vars");
                        break;

                    case "route":
                        readNextToken();
                        readStringArray(route);
                        break;

                    case "cors":
                        readCors();
                        break;

                    case "static":
                        readNextToken();
                        readObj(statics);
                        //fixme 这里不应该去掉/，而是应该补上/，所有的请求path都应该补上/，路由匹配应按照树来查找，而不是简单的正则
                        statics.flex(new FlexAction() {
                            @Override
                            public boolean canFlex(String k, Object v) {
                                return k.endsWith("/");
                            }
                            @Override
                            public Object call(String k, Object v) {
                                return new HashMap.SimpleEntry(k.substring(0, k.length() - 1), v);
                            }
                        });
                        break;


                    case "crontab":
                        readStringArray(crontabs);
                        break;


                    case "storage":
                        readStorage();
                        break;

                    case "ext":
                        readNextToken();
                        readObj(ext);
                        break;

                    case "var":
                        readNextToken();
                        readObj(var);
                        break;

                    case "version":
                        readNextToken();
                        readVersion();
                        break;

                }
            }


            for (String s : route) {
                Route.routes.add(new Route(s));
            }
            if(config.dev){
                config.source =  GenKit.getJavaSRCPath();
                config.target =  new File(config.source, "../../../target/classes").getAbsolutePath();
            }
            for (String s : config.link) {
                String[] Json = s.toLowerCase().split("\\s*(:|\\.|->|=>)\\s*");
                Link link = new Link();
                link.name = Json[0];
                link.fromClz = Json[1];
                link.fromField = Json[2];
                link.toClz = Json[3];
                link.toField = Json[4];
                link.many = s.contains("=>");
                if (Json.length == 5) {
                    config.links.put(link.fromClz + link.name, link);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readStorage() {
        //skip {
        readNextToken();
        String key = null;
        StorageConfig lastItem = null;
        while((key = readNextToken()) != null){
            if(key.equals("}")) return;
            lastItem = new StorageConfig();
            //skip {
            readNextToken();
            readStorageItem(lastItem);
            storages.put(key, lastItem);

            //make instance
            if("simple".equalsIgnoreCase(lastItem.driver)){
                lastItem.instance = new SimpleStorage(lastItem);
            }
        }
    }

    private void readStorageItem(StorageConfig storage){
        String key = null;
        while((key = readNextToken()) != null){
            if(key.equals("}")) return;
            switch (key){
                case "driver":
                    storage.driver = readNextToken();
                    break;

                case "path":
                    storage.path = new File(readNextToken());//storage.path;
                    break;
            }
        }
    }

    private void readVersion(){
        String key = null;
        while((key = readNextToken()) != null) {
            switch (key){
                case "}":
                    return;
                case "name":
                    version.name = readNextToken();
                    break;

                case "no":
                    String no = readNextToken();
                    version.no = StrUtil.splitToInt(no, ".");
                    break;
            }
        }
    }

    private void readObj(Obj obj){
        //read key
        String key = null;
        while((key = readNextToken()) != null) {
            if (key.equals("}")) {
                return;
            }
            //read value
            String value = readUntilLine2();
            if (value.equals("{")) {
                Obj nobj = o();
                obj.put(key, nobj);
                readObj(nobj);
            } else if(value.equals("[")){
                Arr narr = a();
                obj.put(key, narr);
                readStringArray(narr.list());
            } else {
                obj.put(key, value);
            }
        }
    }

    private void readStringArray(Collection collection) {
        String token = "";
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

    private void readDb() {
        //skip {
        readNextToken();
        //读取一个数据源名
        String token = null;
        while ((token = readNextToken()) != null) {
            if (token.equals("}")) {
                return;
            } else {
                Db ds = new Db();
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
        int left = -1;
        int right = -1;
        while (ptr < bs.length) {
            switch (bs[ptr]) {
                case ' ':
                case '\t':
                case '\r':
                    break;

                case '\n':
                    if (left > -1) {
                        if (right == -1) {
                            //如果有\r
                            int p = ptr;
                            if(bs[ptr - 1] == '\r'){
                                p = ptr -1;
                            }
                            ptr++;
                            return new String(bs, left, p - left);
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
        int lastNotEmptyPtr = -1;
        while (ptr < bs.length) {
            switch (bs[ptr]) {
                case ' ':
                case '\t':
                case '\r':
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
        int lastNotEmptyPtr = -1;
        while (ptr < bs.length) {
            switch (bs[ptr]) {
                case ' ':
                case '\t':
                case '\r':
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

    public static class StorageConfig {
//        public String name;
        public String driver;
        public File path;
        public com.github.llyb120.nami.ext.file.Storage instance;
    }

    public static class Version{
        public String name = "default";
        public int[] no = {0,0,1};
    }


    public static class GenKit {
        private static String srcPathRelativeToSrc = "/main/java";
        private static String resourcePathRelativeToSrc = "/main/resources";

        public GenKit() {
        }

        public static String getJavaSRCPath() {
            return getPath(srcPathRelativeToSrc);
        }

        public static String getJavaResourcePath() {
            return getPath(resourcePathRelativeToSrc);
        }

        private static String getPath(String relativeToSrc) {
            String userDir = System.getProperty("user.dir");
            if (userDir == null) {
                throw new NullPointerException("用户目录未找到");
            } else {
                File src = new File(userDir, "src");
                File resSrc = new File(src.toString(), relativeToSrc);
                String srcPath;
                if (resSrc.exists()) {
                    srcPath = resSrc.toString();
                } else {
                    srcPath = src.toString();
                }

                return srcPath;
            }
        }
    }
}
