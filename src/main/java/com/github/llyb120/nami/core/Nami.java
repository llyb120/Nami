package com.github.llyb120.nami.core;

import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.util.Util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static com.github.llyb120.nami.log.Log.info;

//import com.github.llyb120.nami.sqltool.sqltool;

public class Nami {

//    public static ChakraCore chakraCore;
    public static void start(String[] args) {
        //关掉烦人的警告
//        Async.execute(() -> {
//            disableAccessWarnings();
//        });
        info("NaMi is starting");
        for (int i = 0; i < args.length; i++) {
            switch (args[i]){
                case "-v":
                    String version = args[++i];
                    int j = version.indexOf(":");
                    if(j > -1){
                        Env.versionName = version.substring(0, j);
                        Env.versionNo = Util.splitToInt(version.substring(j + 1), '.');
                    }
                    break;
            }
        }
        if(Util.isEmpty(Env.versionName)){
            Env.versionName = "default";
        }
        if (Env.versionNo == null) {
            Env.versionNo = new int[]{1,0};
        }
//        try {
//            Env.configPath = configPath;

//        Config.init(configPath);
//        if(config.ext.b("BeetlSql")){
//            DBService.start(true, listener);
//        }

//        Chakra.start();

//        var main = config.db.g("main");
//        if (main != null) {
//            DBService.fSql = new FSql(config.db.g("main"));
//        }
//            if (config.dev) {
            Compiler.start();
//            }
            //定时任务
//            Crontab.start();

            //注册基本类
//        sqltool.init();

//        if(StrUtil.isNotEmpty(config.chakra)){
//            chakraCore = new ChakraCore();
//            chakraCore.start(true);
////        }
//        System.out.println(String.format("prepare system takes %d ms", System.currentTimeMillis() - stime));

//        Thread.currentThread().setContextClassLoader(new ProductLoader());

            //暂时只能用devserver
//            for (Config.Server _server : config.servers) {
//                AbstractServer server = null;
//                if (config.dev) {
//                    server = new DevServer(_server);
//                } else {
//                    server = new NIOServer(_server);
//                }
//                server.start(_server.listen);
//            }

//            if (!async) {
//                CountDownLatch cd = new CountDownLatch(1);
//                cd.await();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.exit(-1);
//        }
    }

    public static void dev() {
        start(new String[0]);
    }

//    private static void start(String config, boolean async) {
//        start(config, null, async);
//    }

//    public static void start() {
//        start("nami.conf", false);
//    }

    public static abstract class Listener {
        public void onDBServiceBooted() {
        }
    }

//    public static void waitFor(int maxDelay, Object ...objects){
//        long stime = System.currentTimeMillis();
//        wait: {
//            while(true){
//                if(System.currentTimeMillis() - stime >= maxDelay){
//                    break wait;
//                }
//                check:{
//                    for (Object object : objects) {
//                        if(object == null){
//                            break check;
//                        }
//                    }
//                    break wait;
//                }
//                ThreadUtil.sleep(16);
//            }
//        }
//    }


    @SuppressWarnings("unchecked")
    private static void disableAccessWarnings() {
        try {
            Class unsafeClass = Class.forName("sun.misc.Unsafe");
            Field field = unsafeClass.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object unsafe = field.get(null);

            Method putObjectVolatile = unsafeClass.getDeclaredMethod("putObjectVolatile", Object.class, long.class, Object.class);
            Method staticFieldOffset = unsafeClass.getDeclaredMethod("staticFieldOffset", Field.class);

            Class loggerClass = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field loggerField = loggerClass.getDeclaredField("logger");
            Long offset = (Long) staticFieldOffset.invoke(unsafe, loggerField);
            putObjectVolatile.invoke(unsafe, loggerClass, offset, null);
        } catch (Exception ignored) {
        }
    }

//    public static void registerController(String prefix, String packageName){
//        HttpServerHandler.ctrls.set(prefix, packageName);
//    }
}
