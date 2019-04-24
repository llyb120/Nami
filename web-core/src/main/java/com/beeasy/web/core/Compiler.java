package com.beeasy.web.core;

import cn.hutool.core.io.IoUtil;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.eclipse.jdt.internal.compiler.batch.Main;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static com.beeasy.web.core.Config.config;

public class Compiler{

    static OutputStream bos = new ByteOutputStream();
    static PrintWriter errorWriter = new PrintWriter(bos);
    private static Map<String, Long> lastModify = new HashMap<>();
//    public static Main main = (new Main( errorWriter, errorWriter, false));


    public static byte[] compileWithEcj(String name) throws IOException {
        File src = new File(config.compile.source + File.separator + name + ".java");
        Long lastCompile = lastModify.get(name);
        if(null != lastCompile && src.lastModified() == lastCompile){
            return readClassFile(name);
        }
        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", "1.8","-d", config.compile.target, config.compile.source+ File.separator+name+".java"});
        lastModify.put(name, src.lastModified());
        return readClassFile(name);
    }

    public static byte[] readClassFile(String name) throws IOException {
        try(
            InputStream is = new FileInputStream(config.compile.target + File.separator + name + ".class");
        ){
            return IoUtil.readBytes(is);
        }
    }

}