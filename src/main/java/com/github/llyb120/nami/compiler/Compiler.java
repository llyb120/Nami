package com.github.llyb120.nami.compiler;

import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.json.Arr;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.a;
import static com.github.llyb120.nami.log.Log.info;

//import io.methvin.watcher.DirectoryWatcher;

//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class Compiler {

    public static ReentrantLock lock = new ReentrantLock();
    public static File CLASS_DIR;// = null;System.getProperty("java.io.tmpdir");
    public static JavaCompiler javac;
    static volatile Future compileTask;

    static {
        CLASS_DIR = new File(config.workDir, "../../../target/classes");
        if(!CLASS_DIR.exists()){
            CLASS_DIR = new File(System.getProperty("java.io.tmpdir"), "nami-classes");
            CLASS_DIR.mkdirs();
        }
        javac = ToolProvider.getSystemJavaCompiler(); //new EcjCompiler();
        if (javac == null) {
            System.err.println("无法初始化编译器，请参照 https://www.cnblogs.com/yjmyzz/p/3521554.html");
            System.exit(-1);
        }

        Async.execute(() -> {
            try {
                watch();
            } catch (IOException | InterruptedException e) {
                System.err.println("");
                System.exit(-1);
            }
        });
    }

    public static void start(){ }


    static Future recompile(Collection<String> files, boolean reloadLoader){
        if(compileTask == null){
            compileTask = Async.execute(() -> {
//                if(compileStartTime > -1){
//                    try{
//                        long left;
//                        while((left = compileStartTime - System.currentTimeMillis()) > 0){
//                            Thread.sleep(left);
//                        }
//                    } catch (InterruptedException e) {
//                    }
//                }
                boolean success = compileAll(files);
                if(success){
                    if(reloadLoader){
                        List<String> clzs = files.stream()
                                .map(Compiler::toClassName)
                                .collect(Collectors.toList());
                        AppClassLoader.removeBeans(clzs);
                        //如果需要，卸载掉正在运行的bean
                        AppClassLoader.loader = new AppClassLoader();
                        AppClassLoader.loader.preloadClasses(clzs);
                    }
                }
                compileTask = null;
            });
            return compileTask;
        }
        return compileTask;

    }


    public static File toJavaFile(String className) {
        if (!canCompile(className)) {
            return null;
        }
        className = className.replace(".", "/");
        File file = new File(config.workspace, className + ".java");
        if(!file.exists()){
            return null;
        }
        return file;
    }

    public static boolean canCompile(String className){
        if(className.startsWith("java.")){
            return false;
        }
        if(className.startsWith("com.github.llyb120.nami.")){
            return false;
        }
        return true;
    }

    public static boolean canCompile(File file){
        return canCompile(toClassName(file));
    }

    public static String toClassName(String path){
        String classPath = path
                .substring(0, path.length() - 5)
                .replace(config.workspace, "")
                .replace("\\", ".")
                .replace("/", ".");
        if(classPath.startsWith(".")){
            classPath = classPath.substring(1);
        }
        return classPath;
    }
    public static String toClassName(File file){
        String path = file.getAbsolutePath();
        return toClassName(path);
    }

    public static File toClassFile(String className){
        return new File(CLASS_DIR, className.replace(".", "/") + ".class");
    }




    public static boolean compileAll(Collection<String> files){
        lock.lock();
        try{
            Arr<String> args = a(
//                    "-noExit",
//                    "-proceedOnError",
                    "-parameters",
                    "-nowarn",
                    "-source",
                    config.jdkVersion,
                    "-sourcepath",
                    config.workspace,
                    "-d",
                    CLASS_DIR.getAbsolutePath()
//                    file.getAbsolutePath()
//                    "E:\\work\\Nami\\target\\classes"
            );

            //todo: remove掉bean后需要重新装载
            AppClassLoader.removeBeans(files);
            args.addAll(files);

            int status = javac.run(
                    null,
                    null,
                    null,
                    args.toArray(new String[0])
            );
            if(status == 0){
                return true;
            }
        } finally {
//            compileTaskSet.clear();
            lock.unlock();
        }

        return false;
    }

    private static Set<String> watchList = new ConcurrentSkipListSet<>();
    private static Future watchAction;
    private static void recompileOne(File file){
        if (!canCompile(file)) {
            return;
        }
        watchList.add(file.getAbsolutePath());
        if (watchAction != null) {
            watchAction.cancel(true);
        }
        watchAction = Async.execute(() -> {
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                return;
            }
            List<String> args = new ArrayList(watchList);
            watchList.clear();
            recompile(args, true);
            watchAction = null;
        });
    }

    public static void watch() throws IOException, InterruptedException {
        WatchService watcher = FileSystems.getDefault().newWatchService();
        List<String> beans = new ArrayList<>();
        Files.walkFileTree(Paths.get(config.workspace), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                dir.register(watcher,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                String fileName = file.toFile().getName();
                File f = file.toFile();
                String clzName = toClassName(f);
                if(canCompile(clzName)){
                    beans.add(clzName);
                }
//                if(fileName.endsWith("Bean.java") && fileName.length() > "Bean.java".length()){
//                    beans.add(file.toString());
//                }
                return FileVisitResult.CONTINUE;
            }
        });

        //初始化bean
        Async.execute(() -> {
//            recompile(beans, false);
            info("loading beans");
            AppClassLoader.loader.preloadClasses(beans);
        });

        while (true) {
            WatchKey key = watcher.take();
            for (WatchEvent<?> event: key.pollEvents()) {
                Path path = ((Path) key.watchable()).resolve((Path)event.context());
                WatchEvent.Kind eventKind = event.kind();
                if(eventKind == StandardWatchEventKinds.ENTRY_CREATE){
                    if(Files.isDirectory(path)){
                        path.register(watcher,
                                StandardWatchEventKinds.ENTRY_CREATE,
                                StandardWatchEventKinds.ENTRY_DELETE,
                                StandardWatchEventKinds.ENTRY_MODIFY);
                    } else {
                        String p = path.toString();
                        if(p.endsWith(".java")){
                            recompileOne(path.toFile());
                        }
                    }
                } else if(eventKind == StandardWatchEventKinds.ENTRY_MODIFY){
                    if(!Files.isDirectory(path)){
                        String p = path.toString();
                        if(p.endsWith(".java")){
                            recompileOne(path.toFile());
                        }
                    }
                } else if(eventKind == StandardWatchEventKinds.ENTRY_DELETE){
                }
            }
            key.reset();
        }

    }

}