package com.github.llyb120.nami.core;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import static com.github.llyb120.nami.log.Log.debug;

public class Env {
    public static String configPath = "nami.conf";
    public static String workspace = "";
    public static File workDir;

    public static String versionName;
    public static int[] versionNo;
    public static String jdkVersion;
    public static Mode bootMode = Mode.DEV;

    enum Mode{
        PHP,
        JAR,
        DEV
    }

    static {
        //jdk
        String version = System.getProperty("java.version");
        if (version.startsWith("1.8")) {
            jdkVersion = "1.8";
        } else {
            jdkVersion = version;
        }

        //
        URL url = null;
        try {
            Enumeration<URL> urls = Env.class.getClassLoader().getResources("com/github/llyb120");
            if(urls.hasMoreElements()){
                url = urls.nextElement();
                String protocol  = url.getProtocol();
                //jar包启动
                if("jar".equals(protocol)){
                    int i = url.getPath().lastIndexOf("!");
                    if(i > -1){
                        File file = new File(url.getPath().substring(0, i), "/../app");
                        if(file.exists()){
                            bootMode = Mode.PHP;
                            workDir = file;
                            workspace = file.getAbsolutePath();
                            debug("boot as php mode");
                        } else {
                            bootMode = Mode.JAR;
                            debug("boot as jar mode");
                        }
                    }
                } else {
                    File file = new File(url.getPath(), "/../../../../../src/main/java");
                    if(file.exists()){
                        workDir = file;
                        workspace = file.getAbsolutePath();
                        bootMode = Mode.DEV;
                        debug("boot as dev mode");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
