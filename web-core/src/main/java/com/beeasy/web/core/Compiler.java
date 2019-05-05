package com.beeasy.web.core;

import cn.hutool.core.io.IoUtil;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.eclipse.jdt.internal.compiler.batch.Main;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.beeasy.web.core.Config.config;

public class Compiler{

    static OutputStream bos = new ByteArrayOutputStream();
    static PrintWriter errorWriter = new PrintWriter(bos);
    static JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
    static StandardJavaFileManager javaFileManager = javaCompiler.getStandardFileManager(null, null, null);
    private static Map<String, Long> lastModify = new HashMap<>();
//    public static Main main = (new Main( errorWriter, errorWriter, false));

    public static byte[] compile(String name) throws IOException {
        File src = new File(config.compile.source + File.separator + name + ".java");
        Long lastCompile = lastModify.get(name);
        if(null != lastCompile && src.lastModified() == lastCompile){
            return readClassFile(name);
        }
        //需要编译的情况
        lastModify.put(name, src.lastModified());

        if("javac".equals(config.compile.compiler)){
            return compileWithJavac(name);
        } else {
            return compileWithEcj(name);
        }
    }

    private static byte[] compileWithJavac(String name) throws IOException {
        Iterable it = javaFileManager.getJavaFileObjects(config.compile.source + File.separator + name + ".java");
        //创建编译任务
        JavaCompiler.CompilationTask  task = javaCompiler.getTask(new StringWriter(), null, null, Arrays.asList("-d", config.compile.target, "-parameters"), null, it);
        //执行编译
        task.call();
        return readClassFile(name);
    }

    private static byte[] compileWithEcj(String name) throws IOException {

        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", "1.8","-d", config.compile.target, config.compile.source+ File.separator+name+".java"});
        return readClassFile(name);
    }

    private static byte[] readClassFile(String name) throws IOException {
        try(
            InputStream is = new FileInputStream(config.compile.target + File.separator + name + ".class");
        ){
            return IoUtil.readBytes(is);
        }
    }


}