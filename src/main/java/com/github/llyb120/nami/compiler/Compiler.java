package com.github.llyb120.nami.compiler;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.core.Async;
import io.methvin.watcher.DirectoryWatcher;

import javax.tools.JavaCompiler;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.github.llyb120.nami.core.Config.config;

//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class Compiler {

    public static ReentrantLock lock = new ReentrantLock();
    private static BlockingQueue<MemoryJavaFileObject> queue = new LinkedBlockingQueue();
    private static String tempDir = System.getProperty("java.io.tmpdir");
    public static Map<String, ByteCode> codeCache = new ConcurrentHashMap<>();
    public static Map<String, Future> compiling = new HashMap<>();
    //    public static Map<String, Boolean> codeReloadCache = new HashMap<>();
    private static Map<String, Condition> classCondition = new HashMap<>();
    private static long lastRecompileTime = -1;
    private static final int MIN_COMPILE_STEP = 300;

    static class ByteCode{
        public byte[] bytes;
        public long lastModified;
    }

//    static {
//        int threadCount = 16;
//        for (int i = 0; i < threadCount; i++) {
//            Async.execute(() -> {
//                while (true) {
//                    try {
//                        MemoryJavaFileObject item = queue.take();
//                        compileWorker(item);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//    }

    public static Condition getClassCondition(String name) {
        Condition condition = classCondition.get(name);
        if (condition == null) {
            condition = lock.newCondition();
            classCondition.put(name, condition);
        }
        return condition;
    }

//    private static void compileWorker(MemoryJavaFileObject item){
//        Map<String, ByteArrayOutputStream> oss = compileWithEcj(item);
//        lock.lock();
//        try {
//            for (Map.Entry<String, ByteArrayOutputStream> entry : oss.entrySet()) {
//                codeCache.put(entry.getKey(), entry.getValue().toByteArray());
//                Condition condition = getClassCondition(entry.getKey());
//                condition.signalAll();
//            }
//        } finally{
//            lock.unlock();
//        }
//    }

    private static void analyzeCodeImport(String className, File file, Map<String, MemoryJavaFileObject> ret){
        if(ret.containsKey(className)){
            return;
        }
        String code = FileUtil.readUtf8String(file);
        ret.put(className, new MemoryJavaFileObject(className, code));
        BufferedReader reader = new BufferedReader(new StringReader(code));
        String line = null;
        try{
            while((line = reader.readLine()) != null){
                line = line.trim();
                if(line.startsWith("public") && line.contains("class")){
                    break;
                }
                if(line.startsWith("import")){
                    line = line.substring("import".length(), line.length() - 1)
                            .trim();
                    String pkg;
                    boolean isStatic = false;
                    if(line.startsWith("static")){
                        pkg = line.substring("static".length())
                                .trim();
                        isStatic = true;
                    } else {
                        pkg = line;
                    }
                    if(!config.isHotSwap(pkg)){
                        continue;
                    }
                    if(isStatic){
                        int lastdot = pkg.lastIndexOf(".");
                        if(lastdot > -1){
                            pkg = pkg.substring(0, lastdot);
                        }
                        File f = findSrcFile(pkg);
                        if(f.exists()){
                            analyzeCodeImport(pkg, f, ret);
                        }
                    } else {

                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }

    public static Future compile(String className, File file) {
        Future future = null;
        synchronized (compiling){
            future = compiling.get(className);
            if(null == future || future.isDone() || future.isCancelled()){
                Map<String, MemoryJavaFileObject> ret = new HashMap<>();
                analyzeCodeImport(className, file, ret);
                future = Async.execute(() -> {
//                    ret.add(new MemoryJavaFileObject(className, file));
                    compileWithEcj(ret);
                });
                compiling.put(className, future);
            }
        }
        return future;
    }

    private static Future recompile(File file) {
        String path = file.getAbsolutePath();
        String classPath = path
            .substring(0, path.length() - 5)
            .replace(config.workspace, "")
            .replace("\\", ".")
            .replace("/", ".")
            .substring(1);
        boolean flag = config.isHotSwap(classPath);
        if (flag) {
            long now = System.currentTimeMillis();
            if(now - lastRecompileTime > MIN_COMPILE_STEP){
                lastRecompileTime = now;
                AppClassLoader.loader = new AppClassLoader();
            }
            System.out.println(Thread.currentThread().getName() + " reloading " + classPath);
            return compile(classPath, file);
        } else {
            return new CompletableFuture<Map<String, ByteArrayOutputStream>>() {};
        }
    }


    public static ByteCode getByteCode(String className, File file, boolean force) {
        ByteCode byteCode = null;
        lock.lock();
        try {
            if (force) {
                codeCache.remove(className);
            }
            byteCode = codeCache.get(className);
            if (byteCode == null || byteCode.lastModified < file.lastModified()) {
                compile(className, file).get();
                byteCode = codeCache.get(className);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
//        byte[] code = codeCache.computeIfAbsent(className, k -> {
//            try {
//                return compile(className, file).get();
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//            return new byte[0];
//        });
        return byteCode;
    }

    public static ByteCode getByteCode(String className, boolean force) {
        return getByteCode(className, findSrcFile(className), force);
    }


    private static File findSrcFile(String className) {
        File file = new File(config.workDir, className.replace(".", "/") + ".java");
        return file;
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


    public static JavaCompiler javac = new EcjCompiler();
//    private static Writer compileWriter = new PrintWriter(System.out);

//    public static byte[] compileWithEcj(String path) {
//        return compileWithEcj(path, null);
//    }

    public static Map<String, ByteArrayOutputStream> compileWithEcj(Map<String, MemoryJavaFileObject> files) {
//        Iterable it = Collections.singletonList(file);
//                 javaFileManager.getJavaFileObjects(path);
        StringWriter writer = StrUtil.getWriter();
        MemoryFileManager fileManager = new MemoryFileManager();
        Collection<MemoryJavaFileObject> mfs = files.values();
        //创建编译任务
        JavaCompiler.CompilationTask task = javac.getTask(writer,
                                                          fileManager,
                                                          null,
                                                          Arrays.asList("-noExit",
                                                                        "-parameters",
                                                                        "-nowarn",
                                                                  "-source",
                                                                        config.jdkVersion,
//                                                                        "-sourcepath",
//                                                                       "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\nami\\test",
                                                                        "-d",
                                                                        tempDir
                                                          ),
                                                          null,
                                                         mfs
        );
        boolean success = task.call();
        if (!success) {
            System.out.println(writer.toString());
        }
        for (Map.Entry<String, ByteArrayOutputStream> entry : fileManager.oss.entrySet()) {
            ByteCode byteCode = new ByteCode();
            for (MemoryJavaFileObject file : mfs) {
                if(entry.getKey().startsWith(file.name)){
                    byteCode.lastModified = file.lastModified;
                }
            }
            byteCode.bytes = entry.getValue().toByteArray();
            codeCache.put(entry.getKey(), byteCode);
        }
        return fileManager.oss;
//        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", config.target, file.getAbsolutePath()});
    }


    public static void macOsStart() throws IOException {
        DirectoryWatcher watcher = DirectoryWatcher.builder()
            .path((config.workDir.toPath())) // or use paths(directoriesToWatch)
            .listener(event -> {
                switch (event.eventType()) {
                    case CREATE: /* file created */
                    case MODIFY: /* file modified */
                        File file = event.path().toFile();
                        if (file.getName().endsWith(".java")) {
                            recompile(file);
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
        System.out.println("watching dir " + config.workDir.getAbsolutePath() + " to compile automatically");
        watcher.watchAsync();
    }

}