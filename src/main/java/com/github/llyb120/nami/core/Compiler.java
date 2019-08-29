package com.github.llyb120.nami.core;

import cn.hutool.core.collection.ConcurrentHashSet;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.thread.ThreadUtil;
import io.methvin.watcher.DirectoryWatcher;
import org.eclipse.jdt.internal.compiler.tool.EclipseCompiler;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.github.llyb120.nami.core.Config.config;

//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class Compiler {

    static OutputStream bos = new ByteArrayOutputStream();
    static PrintWriter errorWriter = new PrintWriter(bos);
    static JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
    static StandardJavaFileManager javaFileManager = javaCompiler.getStandardFileManager(null, null, null);
    private static ExecutorService executor = Executors.newCachedThreadPool();
    private static Set<String> compiling = new ConcurrentHashSet<>();
    private static Map<String, SimpleClassFile> byteCodeCache = new HashMap<>();

    public static class SimpleClassFile {
        public byte[] bytes;
        public long lastModified;

        public SimpleClassFile(File file) throws IOException {
            try (
                    FileInputStream fis = new FileInputStream(file);
            ) {
                byte[] bs = IoUtil.readBytes(fis);
                this.lastModified = file.lastModified();
                this.bytes = bs;
            }
        }
    }

//    public static Main main = (new Main( errorWriter, errorWriter, false));

    public static byte[] readClass(String className) throws IOException {
        synchronized (byteCodeCache) {
            String realName = className.replaceAll("\\.", "/");
            File file = new File(config.target, realName + ".class");
            String path = file.getAbsolutePath();
            SimpleClassFile scf = byteCodeCache.get(path);
            if (scf == null) {
                scf = new SimpleClassFile(file);
                //没有的话 直接读取最新的文件
            } else {
                //比较最后修改时间，如果小于缓存则直接返回，大于则覆盖
                if (file.lastModified() <= scf.lastModified) {
                    return scf.bytes;
                } else {
                    scf = new SimpleClassFile(file);
                }
            }
            byteCodeCache.put(path, scf);
            return scf.bytes;
        }
    }

    public static void waitForAllCompiled() {
        while (true) {
            if (compiling.size() > 0) {
                ThreadUtil.sleep(16);
            } else {
                break;
            }
        }
    }

    public static void compile(File file) {
        compile(file, false);
    }


    public static void compile(File file, boolean force) {
        executor.submit(() -> {
            if (!force) {
                if (config.hotswap.size() == 0) {
                    return;
                }
            }
            //只动态编译需要编译的文件
            String path = file.getAbsolutePath();
            String classPath = path.replace(config.source, "")
                    .replaceAll("\\\\|/", ".")
                    .substring(1);
            boolean flag = config.hotswap.stream()
                    .anyMatch(i -> classPath.startsWith(i));
            if (force) {
                flag = true;
            }
            if (!flag) {
                return;
            }
            //如果一个文件在被编译，那么不再做相同的事
            synchronized (compiling) {
                if (compiling.contains(path)) {
                    return;
                }
                compiling.add(path);
            }
            System.out.println(Thread.currentThread().getName() + ": reloading " + path);
            try {
                compileWithEcj(path);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //编译完成后，直接放入缓存
                synchronized (byteCodeCache) {
                    try {
                        byteCodeCache.put(path, new SimpleClassFile(new File(path)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (compiling) {
                    compiling.remove(path);
                }
            }
        });
    }


//    private static byte[] compileWithJavac(String name) throws IOException {
//        Iterable it = javaFileManager.getJavaFileObjects(config.source + File.separator + name.replaceAll("\\.", "/") + ".java");
//        //创建编译任务
//        JavaCompiler.CompilationTask task = javaCompiler.getTask(new StringWriter(), null, null, Arrays.asList("-d", config.target, "-parameters", "-nowarn", "-source", config.version), null, it);
//        //执行编译
//        task.call();
//        return readClass(name);
//    }
//
//    private static byte[] compileWithEcj(String name) throws IOException {
//        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.version, "-d", config.target, config.source + File.separator + name.replaceAll("\\.", "/") + ".java"});
//        return readClass(name);
//    }


    private static JavaCompiler javac = new EclipseCompiler();
    private static Writer compileWriter = new PrintWriter(System.out);

    public static void compileWithEcj(String path) {
        compileWithEcj(path, null);
    }
    public static void compileWithEcj(String path, String target) {
        Iterable it = javaFileManager.getJavaFileObjects(path);
//        //创建编译任务
        JavaCompiler.CompilationTask task = javac.getTask(compileWriter, null, null, Arrays.asList("-noExit", "-parameters", "-nowarn", "-source", config.version, "-d", target == null ? config.target : target), null, it);
        task.call();
//        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.version, "-d", config.target, file.getAbsolutePath()});
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

    @Deprecated
    public static void start() {
        Async.submit(() -> {
            Path targetPath = Paths.get(config.source);
            WatchService watchService = targetPath.getFileSystem().newWatchService();
            Files.walkFileTree(targetPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                        throws IOException {
                    dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.OVERFLOW);
                    return FileVisitResult.CONTINUE;
                }
            });
            System.out.println("watching dir " + config.source + " to compile automaualy");
            WatchKey watchKey = null;
            while (true) {
                try {
                    watchKey = watchService.take();
                    List<WatchEvent<?>> watchEvents = watchKey.pollEvents();
                    for (final WatchEvent<?> event : watchEvents) {
                        WatchEvent<Path> watchEvent = (WatchEvent<Path>) event;
                        WatchEvent.Kind<Path> kind = watchEvent.kind();

                        Path watchable = ((Path) watchKey.watchable()).resolve(watchEvent.context());
                        if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                            if (Files.isDirectory(watchable)) {
                                watchable.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
                            } else {
                            }
                        }

                        if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                            //todo: 删除对应的类文件

                        } else {
                            if (watchable.toString().endsWith(".java")) {
                                compile(watchable.toFile());
                            }
                        }

                    }
                    //consumer.accept(targetPath);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (watchKey != null) {
                        watchKey.reset();
                    }
                }
            }
        });
    }


}