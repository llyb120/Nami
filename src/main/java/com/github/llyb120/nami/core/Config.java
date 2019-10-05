package com.github.llyb120.nami.core;

import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.ext.file.SimpleStorage;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.server.Route;
import com.github.llyb120.nami.util.Util;

import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

import static com.github.llyb120.nami.json.Json.a;
import static com.github.llyb120.nami.json.Json.o;

public class Config {
    public static Config config;
    //    public int port;
    public Map<String, Db> db = new ConcurrentHashMap<>();
//    public Set<String> hotswap = new ConcurrentHashSet<>();
    public Set<String> magicvar = new ConcurrentSkipListSet<>();
    //    public List<String> route = new Vector<>();
//    public Compile compile = new Compile();
    public Cors cors = new Cors();
    public Obj ext = o();
    public Obj var = o();
    public boolean dev = false;
    public List<String> link = new ArrayList<>();
    public Map<String, Link> links = new HashMap<>();
    public Map<String, StorageConfig> storages = new ConcurrentHashMap<>();
//    public Obj statics = o();
    public String jdkVersion;
    public Version version = new Version();
    public List<String> crontabs = new ArrayList<>();
    public List<Server> servers = new ArrayList<>();
    public String workspace;
    public String pkg;

//    public String source;
//    public String target;

    private int ptr = 0;
    private String str = null;
    private List<String> lines;
    private int linePtr = 0;
    private Pattern hotPattern;
    public File workDir;
//    private byte[] bs = null;

    static {
        config = new Config(Env.configPath);
    }


    private Config(String path) {
        initConf(path);
    }

    private boolean isKey(char c) {
        return c == '[' || c == ']' || c == '{' || c == '}';
    }

    private String getNextLine() {
        if (str == null || ptr >= str.length()) {
            if (linePtr < lines.size()) {
                str = lines.get(linePtr++);
            } else {
                return null;
            }
            ptr = 0;
        }
        return str;
    }

    private String readToken() {
        String line = null;// = getNextLine();
        while ((line = getNextLine()) != null) {
            int left = -1;
            for (; ptr < line.length(); ptr++) {
                char c = line.charAt(ptr);
                if (Util.isBlankChar(c)) {
                    if (left > -1) {
                        return line.substring(left, ptr++);
                    }
                    continue;
                }
                if (isKey(c)) {
                    if (left > -1) {
                        return line.substring(left, ptr);
                    } else {
                        ptr++;
                        return c + "";
                    }
                }
                if (left == -1) {
                    left = ptr;
                }
            }
            if (left > -1) {
                return line.substring(left);
            }
        }
        return null;
    }

    private String readToEnd() {
        String line = getNextLine();
        String t = line.substring(ptr).trim();
        str = null;
        return t;
    }

    private void startRead(String path) {
        lines = Util.readLines(path);
    }

    private void initConf(String path) {
        //jdk版本
        String version = System.getProperty("java.version");
        if (version.startsWith("1.8")) {
            this.jdkVersion = "1.8";
        } else {
            this.jdkVersion = version;
        }
        ;
        startRead(path);
        String token;
        while ((token = readToken()) != null) {
            switch (token) {
                case "db":
                    Db db = readDb();
                    this.db.put(db.name, db);
                    break;

                case "dev":
                    dev = Boolean.parseBoolean(readToken());
                    break;

                case "workspace":
                    workspace = readToEnd();
                    break;

                case "package":
                    pkg = readToEnd();
                    break;

//                case "hotswap":
//                    readToken();
//                    readStringArray(hotswap);
//                    break;

                case "magicVar":
                    readToken();
                    readStringArray(magicvar);
                    break;

                case "cors":
                    readCors();
                    break;

//                case "static":
//                    readToken();
//                    readObj(statics);
//                    //fixme 这里不应该去掉/，而是应该补上/，所有的请求path都应该补上/，路由匹配应按照树来查找，而不是简单的正则
//                    statics.flex(new FlexAction() {
//                        @Override
//                        public boolean canFlex(String k, Object v) {
//                            return k.endsWith("/");
//                        }
//
//                        @Override
//                        public Object call(String k, Object v) {
//                            return new HashMap.SimpleEntry(k.substring(0, k.length() - 1), v);
//                        }
//                    });
//                    break;


                case "crontab":
                    readToken();
                    readStringArray(crontabs);
                    break;


                case "storage":
                    readStorage();
                    break;

                case "ext":
                    readToken();
                    readObj(ext);
                    break;

                case "var":
                    readToken();
                    readObj(var);
                    break;

                case "server":
                    servers.add(readServer());
                    break;

                case "version":
                    readVersion();
                    break;

            }
        }

//        if (dev) {
//            source = GenKit.getJavaSRCPath();
//            target = new File(source, "../../../target/classes").getAbsolutePath();
//        }

        workDir = new File(workspace);
        workspace = workDir.getAbsolutePath();

        //hot
//        hotPattern = Pattern.compile(hotswap.stream()
//            .map(e -> e.replace(".", "\\."))
//            .map(e -> e + "\\.*")
//            .collect(Collectors.joining("|")));
        //add magic vars
//        magicvar.add("com.github.llyb120.nami.server.Vars");

        for (String s : link) {
            String[] Json = s.toLowerCase().split("\\s*(:|\\.|->|=>)\\s*");
            Link link = new Link();
            link.name = Json[0];
            link.fromClz = Json[1];
            link.fromField = Json[2];
            link.toClz = Json[3];
            link.toField = Json[4];
            link.many = s.contains("=>");
            if (Json.length == 5) {
                links.put(link.fromClz + link.name, link);
            }
        }
    }

    private Server readServer() {
        //skip {
        readToken();
        Server server = new Server();
        String key;
        scan:
        while ((key = readToken()) != null) {
            switch (key) {
                case "}":
                    break scan;

                case "location":
                    String url = readToken();
                    //分析url
//                    int start = 0;
//                    int end = url.length();
//                    if(url.endsWith("/")){
//                        end--;
//                    }
//                    if (url.startsWith("/")) {
//                        start++;
//                    }
//                    if(start != 0 || end != url.length()){
//                        url = url.substring(start, end);
//                    }
                    Route location = readLocation(url);
//                    String[] arr = StrUtil.splitToArray(url, '/');
//                    Route.Node node = server.root;
//                    for (String s : arr) {
//                        if (s.isEmpty()) {
//                            continue;
//                        }
//                        node = node.getNode(s);
//                    }
//                    node.ctrl = location.ctrl;
                    server.locations.add(location);
                    break;

                case "listen":
                    String port = readToEnd();
                    server.listen = Integer.parseInt(port);
                    break;
            }
        }
        return server;
    }

    private Route readLocation(String url) {
        readToken();
        Route route = new Route();
        route.setUrl(url);
        String key;
        scan:
        while ((key = readToken()) != null) {
            switch (key) {
                case "}":
                    break scan;

                case "proxy_pass":
                    readToEnd();
//                    location.proxy_pass = readToEnd();
                    break;

                case "root":
                    route.root = readToEnd();
                    break;

                case "ctrl":
                    route.ctrl = readToEnd();
                    break;

                case "aop":
                    key = readToken();
                    if(key.equals("[")){
                        readStringArray(route.aops);
                    } else {
                        route.aops.add(key);
                    }
                    break;

            }
        }
        return route;
    }

    private void readStorage() {
        //skip {
        readToken();
        String key = null;
        StorageConfig storage = new StorageConfig();
        while ((key = readToken()) != null) {
            switch (key) {
                case "name":
                    storage.name = readToEnd();
                    break;

                case "driver":
                    storage.driver = readToEnd();
                    break;

                case "path":
                    storage.path = new File(readToEnd());//storage.path;
                    break;

                case "}":
                    storages.put(storage.name, storage);

                    //make instance
                    if ("simple".equalsIgnoreCase(storage.driver)) {
                        storage.instance = new SimpleStorage(storage);
                    }
                    return;
            }
        }
    }

    private void readVersion() {
        readToken();
        String key = null;
        while ((key = readToken()) != null) {
            switch (key) {
                case "}":
                    return;
                case "name":
                    version.name = readToEnd();
                    break;

                case "no":
                    String no = readToEnd();
                    String[] items = Util.splitToArray(no, '.');
                    version.no = new int[items.length];
                    for (int i = 0; i < items.length; i++) {
                        version.no[i] = Integer.parseInt(items[i]);
                    }
                    break;
            }
        }
    }

    private void readObj(Map obj) {
        //read key
        String key = null;
        while ((key = readToken()) != null) {
            if (key.equals("}")) {
                return;
            }
            //read value
            String value = readToEnd();
            if (value.equals("{")) {
                Obj nobj = o();
                obj.put(key, nobj);
                readObj(nobj);
            } else if (value.equals("[")) {
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
        while ((token = readToEnd()) != null) {
            if (token.isEmpty()) {
                continue;
            }
            if (token.equals("]")) {
                break;
            }
            collection.add(token);
        }
    }

    private void readCors() {
        //skip {
        readToken();
        String token = null;
        scan:
        {
            while ((token = readToken()) != null) {
                switch (token) {
                    case "origin":
                        cors.origin = readToEnd();
                        break;

                    case "method":
                        cors.method = readToEnd();
                        break;

                    case "headers":
                        cors.headers = readToEnd();
                        break;

                    case "}":
                        break scan;
                }
            }
        }
    }

    private Db readDb() {
        //skip {
        readToken();
        //读取一个数据源名
        String token = null;
        Db ds = new Db();
        while ((token = readToken()) != null) {
            if (token.equals("}")) {
                return ds;
            } else {
                switch (token) {
                    case "name":
                        ds.name = readToEnd();
                        break;

                    case "url":
                        ds.url = readToEnd();
                        break;

                    case "driver":
                        ds.driver = readToEnd();
                        break;

                    case "username":
                        ds.username = readToEnd();
                        break;

                    case "password":
                        ds.password = readToEnd();
                        break;

                    case "style":
                        ds.style = readToEnd();
                        break;

                    case "schema":
                        ds.schema = readToEnd();
                        break;
                }
            }
        }
        return ds;
    }


    public File findSrcFile(String className){
        if(className.startsWith("java.")){
            return null;
        }
        if(className.startsWith("com.github.llyb120.nami.")){
            return null;
        }
        File file = Compiler.toJavaFile(className);
        if(file.exists()){
            return file;
        }
        return null;
    }


    public static class Db {
        public String name = "default";
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
        public String name;
        public String driver;
        public File path;
        public com.github.llyb120.nami.ext.file.Storage instance;
    }

    public static class Server {
        public List<Route> locations = new CopyOnWriteArrayList<>();
        public int listen;
    }

//    public static class Location {
//        public Route route;
//    }

    public static class Version {
        public String name = "default";
        public int[] no = {0, 0, 1};
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
