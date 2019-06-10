package com.github.llyb120.nami.core;

import cn.hutool.core.collection.ConcurrentHashSet;
import cn.hutool.core.io.IoUtil;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import cn.hutool.core.thread.ThreadUtil;
import org.eclipse.jdt.internal.compiler.batch.Main;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.github.llyb120.nami.core.Config.config;

public class Compiler{

    static OutputStream bos = new ByteArrayOutputStream();
    static PrintWriter errorWriter = new PrintWriter(bos);
    static JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
    static StandardJavaFileManager javaFileManager = javaCompiler.getStandardFileManager(null, null, null);
    private static ExecutorService executor = Executors.newCachedThreadPool();
    private static Set<String> compiling = new ConcurrentHashSet<>();
    private static Map<String, SimpleClassFile> byteCodeCache = new HashMap<>();


    public static class SimpleClassFile{
        public byte[] bytes;
        public long lastModified;

        public SimpleClassFile(File file) throws IOException {
            try(
                FileInputStream fis = new FileInputStream(file);
            ){
                var bs = fis.readAllBytes();
                this.lastModified = file.lastModified();
                this.bytes = bs;
            }
        }
    }

//    public static Main main = (new Main( errorWriter, errorWriter, false));

    public static byte[] readClass(String className) throws IOException {
        synchronized (byteCodeCache){
            var realName = className.replaceAll("\\.", "/");
            var file = new File(config.compile.target, realName + ".class");
            var path = file.getAbsolutePath();
            var scf = byteCodeCache.get(path);
            if (scf == null) {
                scf = new SimpleClassFile(file);
                //没有的话 直接读取最新的文件
            } else {
                //比较最后修改时间，如果小于缓存则直接返回，大于则覆盖
                if(file.lastModified() <= scf.lastModified){
                    return scf.bytes;
                } else {
                    scf = new SimpleClassFile(file);
                }
            }
            byteCodeCache.put(path, scf);
            return scf.bytes;
        }
    }

    public static void waitForAllCompiled(){
        while(true){
            if(compiling.size() > 0){
                ThreadUtil.sleep(16);
            } else {
                break;
            }
        }
    }

    public static void compile(File file, String compiler){
        if("javac".equals(compiler)){
//            return compileWithJavac(file);
        } else {
            executor.submit(() -> {
                if(config.hotswap == null || config.hotswap.size() == 0){
                    return;
                }
                //只动态编译需要编译的文件
                var path = file.getAbsolutePath();
                var classPath = path.replace(config.compile.source, "")
                    .replaceAll("\\\\",".")
                    .substring(1);
                var flag = config.hotswap.stream()
                    .anyMatch(i -> classPath.startsWith(i));
                if(!flag){
                    return;
                }
                //如果一个文件在被编译，那么不再做相同的事
                synchronized (compiling){
                    if(compiling.contains(path)){
                        return;
                    }
                    compiling.add(path);
                }
                System.out.println(Thread.currentThread().getName() + ": reloading " + path);
                compileWithEcj(file);
                //编译完成后，直接放入缓存
                synchronized (byteCodeCache){
                    try {
                        byteCodeCache.put(path, new SimpleClassFile(new File(path)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (compiling){
                    compiling.remove(path);
                }
            });
        }
    }

    @Deprecated
    public static byte[] compile(String name, String compiler) throws IOException {
//        File src = new File(config.compile.source + File.separator + name + ".java");
//        Long lastCompile = lastModify.get(name);
//        if(null != lastCompile && src.lastModified() == lastCompile){
//            return readClassFile(name);
//        }
//        //需要编译的情况
//        lastModify.put(name, src.lastModified());
        if("javac".equals(compiler)){
            return compileWithJavac(name);
        } else {
            return compileWithEcj(name);
        }
    }

    public static byte[] compile(String name) throws IOException {
        return compile(name, config.compile.compiler);
    }

    private static byte[] compileWithJavac(String name) throws IOException {
        Iterable it = javaFileManager.getJavaFileObjects(config.compile.source + File.separator + name.replaceAll("\\.", "/") + ".java");
        //创建编译任务
        JavaCompiler.CompilationTask  task = javaCompiler.getTask(new StringWriter(), null, null, Arrays.asList("-d", config.compile.target, "-parameters", "-nowarn", "-source", "11"), null, it);
        //执行编译
        task.call();
        return readClass(name);
    }

    private static byte[] compileWithEcj(String name) throws IOException {
        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", "11","-d", config.compile.target, config.compile.source+ File.separator+name.replaceAll("\\.", "/")+".java"});
        return readClass(name);
    }

    private static void compileWithEcj(File file){
        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", "11","-d", config.compile.target, file.getAbsolutePath()});
    }


    public static void start(){
            ThreadUtil.execAsync(()->{
                var targetPath = Paths.get(config.compile.source);
                WatchService watchService = targetPath.getFileSystem().newWatchService();
                Files.walkFileTree(targetPath, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                        throws IOException
                    {
                        dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.OVERFLOW);
                        return FileVisitResult.CONTINUE;
                    }
                });
                System.out.println("auto compile service boot success");
                WatchKey watchKey = null;
                while (true) {
                    try {
                        watchKey = watchService.take();
                        List<WatchEvent<?>> watchEvents = watchKey.pollEvents();
                        for (final WatchEvent<?> event : watchEvents) {
                            WatchEvent<Path> watchEvent = (WatchEvent<Path>) event;
                            WatchEvent.Kind<Path> kind = watchEvent.kind();

                            Path watchable = ((Path) watchKey.watchable()).resolve(watchEvent.context());
                            if(kind == StandardWatchEventKinds.ENTRY_CREATE){
                                if(Files.isDirectory(watchable)){
                                    watchable.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
                                }
                                else{
                                }
                            }

                            if(kind == StandardWatchEventKinds.ENTRY_DELETE){
                                //todo: 删除对应的类文件

                            } else {
                                if(watchable.toString().endsWith(".java")){
                                    compile(watchable.toFile(), "ecj");
                                }
                            }

                        }
                        //consumer.accept(targetPath);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        if(watchKey != null){
                            watchKey.reset();
                        }
                    }
                }
            });
    }


}