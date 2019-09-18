package com.github.llyb120.nami.compiler;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.llyb120.nami.core.Async;
import io.methvin.watcher.DirectoryWatcher;

import javax.tools.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static com.github.llyb120.nami.core.Config.config;

//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class Compiler {

    public static ReentrantLock lock = new ReentrantLock();
    private static BlockingQueue<MemoryJavaFileObject> queue = new LinkedBlockingQueue();
    private static String tempDir = System.getProperty("java.io.tmpdir");
    public static Map<String, byte[]> codeCache = new HashMap<>();
    public static Map<String, Boolean> codeReloadCache = new HashMap<>();
    private static Map<String,Condition> classCondition = new HashMap<>();

    static {
        int threadCount = 16;
        for (int i = 0; i < threadCount; i++) {
            Async.execute(() -> {
                while (true) {
                    try {
                        MemoryJavaFileObject item = queue.take();
                        compileWorker(item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static Condition getClassCondition(String name){
        Condition condition = classCondition.get(name);
        if (condition == null) {
            condition = lock.newCondition();
            classCondition.put(name, condition);
        }
        return condition;
    }

    private static void compileWorker(MemoryJavaFileObject item){
        Map<String, ByteArrayOutputStream> oss = compileWithEcj(item);
        lock.lock();
        try {
            for (Map.Entry<String, ByteArrayOutputStream> entry : oss.entrySet()) {
                codeCache.put(entry.getKey(), entry.getValue().toByteArray());
                Condition condition = getClassCondition(entry.getKey());
                condition.signalAll();
            }
        } finally{
            lock.unlock();
        }
    }

    public static void compile(String className, String code){
        lock.lock();
        try{
            codeCache.remove(className);
            queue.put(new MemoryJavaFileObject(className, code));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void compile(String path) {
        Async.execute(() -> {
//            //只动态编译需要编译的文件
            String classPath = path
                    .substring(0, path.length() - 5)
                    .replace(config.source, "")
                    .replaceAll("\\\\|/", ".")
                    .substring(1);
            boolean flag = config.hotswap.stream()
                    .anyMatch(i -> classPath.startsWith(i));
            if(flag){
                compile(classPath, FileUtil.readUtf8String(path));
                System.out.println(Thread.currentThread().getName() + " reloading " + path);
            }
        });
    }


//    private static byte[] compileWithJavac(String name) throws IOException {
//        Iterable it = javaFileManager.getJavaFileObjects(config.source + File.separator + name.replaceAll("\\.", "/") + ".java");
//        //创建编译任务
//        JavaCompiler.CompilationTask task = javaCompiler.getTask(new StringWriter(), null, null, Arrays.asList("-d", config.target, "-parameters", "-nowarn", "-source", config.jdkVersion), null, it);
//        //执行编译
//        task.call();
//        return readClass(name);
//    }
//
//    private static byte[] compileWithEcj(String name) throws IOException {
//        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", config.target, config.source + File.separator + name.replaceAll("\\.", "/") + ".java"});
//        return readClass(name);
//    }


    private static JavaCompiler javac = new EcjCompiler();
//    private static Writer compileWriter = new PrintWriter(System.out);

//    public static byte[] compileWithEcj(String path) {
//        return compileWithEcj(path, null);
//    }

    public static Map<String, ByteArrayOutputStream> compileWithEcj(MemoryJavaFileObject file) {
        Iterable it = Collections.singletonList(file);
//                 javaFileManager.getJavaFileObjects(path);
        StringWriter writer = StrUtil.getWriter();
        MemoryFileManager fileManager = new MemoryFileManager();
//        //创建编译任务
        JavaCompiler.CompilationTask task = javac.getTask(writer, fileManager, null, Arrays.asList("-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", tempDir), null, it);
        boolean success = task.call();
        if(!success){
            System.out.println(writer.toString());
        }
        return fileManager.oss;
//        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", config.target, file.getAbsolutePath()});
    }


    public static void macOsStart() throws IOException {
        DirectoryWatcher watcher = DirectoryWatcher.builder()
                .path(Paths.get(config.source)) // or use paths(directoriesToWatch)
                .listener(event -> {
                    switch (event.eventType()) {
                        case CREATE: /* file created */
                        case MODIFY: /* file modified */
                            String path = event.path().toString();
                            if (path.endsWith(".java")) {
                                compile(path);
                            }
                            break;
                        case DELETE: /* file deleted */
                            ;
                            break;
                    }
                })
                // .fileHashing(false) // defaults to true
                // .logger(logger) // defaults to LoggerFactory.getLogger(DirectoryWatcher.class)
                // .watchService(watchService) // defaults based on OS to either JVM WatchService or the JNA macOS WatchService
                .build();
        System.out.println("watching dir " + config.source + " to compile automatically");
        watcher.watchAsync();
    }

}