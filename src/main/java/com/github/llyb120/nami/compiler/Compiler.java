package com.github.llyb120.nami.compiler;

import cn.hutool.core.io.FileUtil;
import io.methvin.watcher.DirectoryWatcher;

import javax.tools.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

import static com.github.llyb120.nami.core.Config.config;

//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class Compiler {

//    static OutputStream bos = new ByteArrayOutputStream();
//    static PrintWriter errorWriter = new PrintWriter(bos);
//    static JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
//    static StandardJavaFileManager javaFileManager = javaCompiler.getStandardFileManager(null, null, null);
//    private static ExecutorService executor = Executors.newCachedThreadPool();
//    private static Set<String> compiling = new ConcurrentHashSet<>();
//    private static Map<String, SimpleClassFile> byteCodeCache = new HashMap<>();

    private static volatile int inCompiling = 0;
    private static int threadCount = 4;
    private static BlockingQueue<MemoryJavaFileObject> queue = new LinkedBlockingQueue();

    static {
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                while (true) {
                    try {
                        MemoryJavaFileObject item = queue.take();
                        inCompiling++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        inCompiling--;
                    }
                }
            });
        }
    }

//    public static class SimpleClassFile {
//        public byte[] bytes;
//        public long lastModified;
//
//        public SimpleClassFile(File file) throws IOException {
//            try (
//                    FileInputStream fis = new FileInputStream(file);
//            ) {
//                byte[] bs = IoUtil.readBytes(fis);
//                this.lastModified = file.lastModified();
//                this.bytes = bs;
//            }
//        }
//    }
//    public static Main main = (new Main( errorWriter, errorWriter, false));
//    public static byte[] readClass(String className) throws IOException {
//        synchronized (byteCodeCache) {
//            String realName = className.replaceAll("\\.", "/");
//            File file = new File(config.target, realName + ".class");
//            String path = file.getAbsolutePath();
//            SimpleClassFile scf = byteCodeCache.get(path);
//            if (scf == null) {
//                scf = new SimpleClassFile(file);
//                //没有的话 直接读取最新的文件
//            } else {
//                //比较最后修改时间，如果小于缓存则直接返回，大于则覆盖
//                if (file.lastModified() <= scf.lastModified) {
//                    return scf.bytes;
//                } else {
//                    scf = new SimpleClassFile(file);
//                }
//            }
//            byteCodeCache.put(path, scf);
//            return scf.bytes;
//        }
//    }

    public static void waitForAllCompiled() {
        try {
            while (inCompiling > 0) {
                TimeUnit.MILLISECONDS.sleep(16);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void compile(String className, File file) {
//        compile(file, false);
//        queue.add(new MemoryJavaFileObject(className, file));
    }

    public static void compile(String className, String code){
        queue.add(new MemoryJavaFileObject(className, code));
    }


    public static void compile(File file, boolean force) {
//        executor.submit(() -> {
//            //只动态编译需要编译的文件
//            String path = file.getAbsolutePath();
//            String classPath = path.replace(config.source, "")
//                    .replaceAll("\\\\|/", ".")
//                    .substring(1);
//            boolean flag = config.hotswap.stream()
//                    .anyMatch(i -> classPath.startsWith(i));
//            if (force) {
//                flag = true;
//            }
//            if (!flag) {
//                return;
//            }
//            //如果一个文件在被编译，那么不再做相同的事
//            synchronized (compiling) {
//                if (compiling.contains(path)) {
//                    return;
//                }
//                compiling.add(path);
//            }
//            System.out.println(Thread.currentThread().getName() + ": reloading " + path);
//            try {
//                compileWithEcj(path);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                //编译完成后，直接放入缓存
//                synchronized (byteCodeCache) {
//                    try {
//                        byteCodeCache.put(path, new SimpleClassFile(new File(path)));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                synchronized (compiling) {
//                    compiling.remove(path);
//                }
//            }
//        });
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
    private static Writer compileWriter = new PrintWriter(System.out);

    public static void compileWithEcj(String path) {
        compileWithEcj(path, null);
    }

    public static void compileWithEcj(String path, String target) {
        Iterable it = Collections.singletonList(new MemoryJavaFileObject(FileUtil.mainName(path), FileUtil.readString(path, StandardCharsets.UTF_8)));
//                 javaFileManager.getJavaFileObjects(path);

        JavaFileManager fileManager = new MemoryFileManager();
//        //创建编译任务
        JavaCompiler.CompilationTask task = javac.getTask(compileWriter, fileManager, null, Arrays.asList("-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", target == null ? config.target : target), null, it);
        task.call();

        int d = 2;
//        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", config.target, file.getAbsolutePath()});
    }


    public static void macOsStart() throws IOException {
        DirectoryWatcher watcher = DirectoryWatcher.builder()
                .path(Paths.get(config.source)) // or use paths(directoriesToWatch)
                .listener(event -> {
                    switch (event.eventType()) {
                        case CREATE: /* file created */
                        case MODIFY: /* file modified */
                            if (event.path().toString().endsWith(".java")) {
                                compile(event.path().toFile());
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
        System.out.println("watching dir " + config.source + " to compile automaualy");
        watcher.watchAsync();
    }

}