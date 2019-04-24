package com.beeasy.web.core;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.Main;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static com.beeasy.web.core.Config.config;

public class MyClassLoadader extends ClassLoader {

    private static ClassLoader defaultClassLoader = MyClassLoadader.class.getClassLoader();
    /**
     * @param filename
     * @return Byte[]
     * @throws IOException
     */
    private byte[] getBytes(String filename) throws IOException {
        File file = new File(filename);
        byte raw[] = new byte[(int) file.length()];
        FileInputStream fin = new FileInputStream(file);
        fin.read(raw);
        fin.close();
        return raw;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        boolean hotswap = false;
        if (Config.config.hotswap != null) {
            for (String s : Config.config.hotswap) {
                if(name.startsWith(s)) {
                    hotswap = true;
                    break;
                }
            }
        }

        if(!hotswap){
            return defaultClassLoader.loadClass(name);
        }

        if(null != config.compile){
            try {
                String realName = name.replaceAll("\\.", "/");
                byte[] b = Compiler.compileWithEcj(realName);
                return defineClass(null, b, 0, b.length);
            } catch (Exception e) {
                e.printStackTrace();
                return super.findClass(name);
            }
        }

        ClassPathResource resource = new ClassPathResource(name.replaceAll("\\.", "/") + ".class");
        try (
            InputStream is = resource.getStream();
            ){
            byte[] b = IoUtil.readBytes(is);
            return defineClass(null, b, 0, b.length);
        } catch (Exception e) {
            return super.findClass(name);
        }
    }


    static JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
    static StandardJavaFileManager javaFileManager = javaCompiler.getStandardFileManager(null, null, null);

    public static byte[] compilerJava(String name) throws Exception{
//        bos.flush();
        return Compiler.compileWithEcj(name);
//        main.relocalize();
//        main.compile();
//        try(
//            InputStream is = new FileInputStream(config.compile.target + File.separator + name + ".class");
//        ){
//            return IoUtil.readBytes(is);
//        }
//        if(true) return null;
//        String source = "D:\\work\\easyshop\\easy-shop\\src\\main\\java\\";
//        String target = "D:\\work\\easyshop\\www\\";
        // 取得当前系统的编译器
//        for (File listFile : new File("D:\\work\\easyshop\\www").listFiles()) {
//            listFile.delete();
//        }
        //获取一个文件管理器
            //文件管理器与文件连接起来
//            Iterable it = javaFileManager.getJavaFileObjects(config.compile.source + File.separator + name + ".java");
////            File dir = new File("D:\\work\\easyshop\\www");
//            //创建编译任务
//            JavaCompiler.CompilationTask  task = javaCompiler.getTask(new StringWriter(), null, null, Arrays.asList("-d", config.compile.target, "-parameters"), null, it);
//            //执行编译
//            task.call();
//            try(
//                InputStream is = new FileInputStream(config.compile.target + File.separator + name + ".class");
//                ){
//                return IoUtil.readBytes(is);
//            }

    }

}
