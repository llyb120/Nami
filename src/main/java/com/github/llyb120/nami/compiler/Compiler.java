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
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.a;

//import io.methvin.watcher.DirectoryWatcher;

//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class Compiler {

    public static ReentrantLock lock = new ReentrantLock();
    private static BlockingQueue<MemoryJavaFileObject> queue = new LinkedBlockingQueue();
    public static File CLASS_DIR;// = null;System.getProperty("java.io.tmpdir");
    public static JavaCompiler javac;
//    public static Map<String, ByteCode> codeCache = new ConcurrentHashMap<>();
//    public static Map<String, Future> compiling = new HashMap<>();
    //    public static Map<String, Boolean> codeReloadCache = new HashMap<>();
//    private static Map<String, Condition> classCondition = new HashMap<>();
//    private static long lastRecompileTime = -1;
//    private static final int MIN_COMPILE_STEP = 300;
    static volatile Future compileTask;
    static long compileStartTime = -1;
//    private static Timer compileTimer = new Timer();
    private static Set<String> compileTaskSet = new ConcurrentSkipListSet<>();

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

//    static class ByteCode {
//        public byte[] bytes;
//        public long lastModified;
//    }

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

//    public static Condition getClassCondition(String name) {
//        Condition condition = classCondition.get(name);
//        if (condition == null) {
//            condition = lock.newCondition();
//            classCondition.put(name, condition);
//        }
//        return condition;
//    }

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

//    public static void analyzeCodeImport(String className, File file, Map<String, MemoryJavaFileObject> ret) {
//        if (ret.containsKey(className)) {
//            return;
//        }
//        String code = FileUtil.readUtf8String(file);
//        ret.put(className, new MemoryJavaFileObject(className, code));
//        //列出同包下
//        String name = className.replace(".", "/");
//        int lastDot = className.lastIndexOf(".");
//        if (lastDot > -1) {
//            for (File listFile : new File(config.workDir, name).getParentFile().listFiles()) {
//                if (listFile.isFile()) {
//                    analyzeCodeImport(className.substring(0, lastDot) + "." + listFile.getName().substring(0, listFile.getName().length() - ".java".length()), listFile, ret);
//                }
//            }
//        }
//        BufferedReader reader = new BufferedReader(new StringReader(code));
//        String line = null;
//        try {
//            while ((line = reader.readLine()) != null) {
//                line = line.trim();
//                if (line.startsWith("public") && line.contains("class")) {
//                    break;
//                }
//                if (line.startsWith("import")) {
//                    line = line.substring("import".length(), line.length() - 1)
//                            .trim();
//                    String pkg;
//                    boolean isStatic = false;
//                    if (line.startsWith("static")) {
//                        pkg = line.substring("static".length())
//                                .trim();
//                        isStatic = true;
//                    } else {
//                        pkg = line;
//                    }
//                    if (!config.isHotSwap(pkg)) {
//                        continue;
//                    }
//                    if (isStatic) {
//                        int lastdot = pkg.lastIndexOf(".");
//                        if (lastdot > -1) {
//                            pkg = pkg.substring(0, lastdot);
//                        }
//                        File f = toJavaFile(pkg);
//                        if (f.exists()) {
//                            analyzeCodeImport(pkg, f, ret);
//                        }
//                    } else {
//
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }

//    public static Future compile(String className, File file) {
//        Future future = null;
//        synchronized (compiling) {
//            future = compiling.get(className);
//            if (null == future || future.isDone() || future.isCancelled()) {
//                Map<String, MemoryJavaFileObject> ret = new HashMap<>();
////                analyzeCodeImport(className, file, ret);
//                future = Async.execute(() -> {
//                    ret.put(className, new MemoryJavaFileObject(className, file));
//                    compileWithEcj(ret);
//                });
//                compiling.put(className, future);
//            }
//        }
//        return future;
//    }

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
                        AppClassLoader.loader = new AppClassLoader();
                    }
                }
                compileTask = null;
            });
            return compileTask;
        }
        return compileTask;

    }


//    public static ByteCode getByteCode(String className, File file, boolean force) {
//        ByteCode byteCode = null;
//        lock.lock();
//        try {
//            if (force) {
//                codeCache.remove(className);
//            }
//            byteCode = codeCache.get(className);
//            if (byteCode == null || byteCode.lastModified < file.lastModified()) {
//                compile(className, file).get();
//                byteCode = codeCache.get(className);
//            }
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
////        byte[] code = codeCache.computeIfAbsent(className, k -> {
////            try {
////                return compile(className, file).get();
////            } catch (InterruptedException | ExecutionException e) {
////                e.printStackTrace();
////            }
////            return new byte[0];
////        });
//        return byteCode;
//    }

//    public static ByteCode getByteCode(String className, boolean force) {
//        return getByteCode(className, toJavaFile(className), force);
//    }


    public static File toJavaFile(String className, boolean useDot) {
        if(useDot){
            className = className.replace(".", "/");
        }
        File file = new File(config.workspace, className + ".java");
        return file;
    }

    public static File toJavaFile(String className) {
        return toJavaFile(className, true);
    }

    public static String toClassName(File file){
        String path = file.getAbsolutePath();
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

    public static File toClassFile(String className){
        return new File(CLASS_DIR, className.replace(".", "/") + ".class");
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


//    private static Writer compileWriter = new PrintWriter(System.out);

//    public static byte[] compileWithEcj(String path) {
//        return compileWithEcj(path, null);
//    }

    public static boolean compileAll(Collection<String> files){
        lock.lock();
        try{
//            if(compileTaskSet.isEmpty()){
//                return false;
//            }
            System.out.println(Thread.currentThread().getName() + " recompiling");
//            LinkedList<Object> names = new LinkedList<>(compileTaskQueue
//                    .stream()
//                    .distinct()
//                    .collect(Collectors.toList()));
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

            args.addAll(files);
//            args.addAll(compileTaskSet);
//            names.addFirst(null);
//            names.addFirst(null);
//            names.addFirst(null);
//            names.addFirst("-parameters");
//            names.addFirst("-nowarn");
//            names.addFirst("-source");
//            names.addFirst(config.jdkVersion);
//            names.addFirst("-sourcepath");
//            names.addFirst(config.workspace);
//            names.addFirst("-d");
//            names.addFirst("E:\\work\\Nami\\target\\classes");
            int status = javac.run(
                    null,
                    null,
                    null,
//                    "-parameters",
//                    "-nowarn",
//                    "-source",
//                    config.jdkVersion,
//                    "-sourcepath",
//                    config.workspace,
//                    "-d",
//                    "E:\\work\\Nami\\target\\classes"
                    args.toArray(new String[0])
            );
            if(status == 0){
                System.out.println(Thread.currentThread().getName() + " reloading context");
//                Thread.currentThread().setContextClassLoader(AppClassLoader.loader);
//                Set<Class<?>> clzs = ClassUtil.scanPackage("com.github.llyb120.test");
                int d = 2;
                return true;
            }
        } finally {
//            compileTaskSet.clear();
            lock.unlock();
        }

        return false;
    }

//    public static Map<String, ByteArrayOutputStream> compileWithEcj(Map<String, MemoryJavaFileObject> files) {
////        Iterable it = Collections.singletonList(file);
////                 javaFileManager.getJavaFileObjects(path);
//        StringWriter writer = StrUtil.getWriter();
//        MemoryFileManager fileManager = new MemoryFileManager();
//        Collection<MemoryJavaFileObject> mfs = files.values();
//        System.setProperty("java.class.path", System.getProperty("java.class.path") + ";" + "E:\\work\\Nami\\src\\main\\java");
//        //创建编译任务
//        JavaCompiler.CompilationTask task = javac.getTask(writer,
//                fileManager,
//                null,
//                Arrays.asList(
////                        "-noExit",
//                        "-parameters",
//                        "-nowarn",
//                        "-source",
//                        config.jdkVersion,
//                        "-cp",
//                        "E:\\work\\Nami\\src\\main\\java",
////                        "-sourcepath",
////                        "E:\\work\\Nami\\src\\main\\java",
////                                                                       "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\nami\\test",
//                        "-d",
//                        tempDir
//                ),
//                null,
//                a(new MemoryJavaFileObject("com.github.llyb120.test.a", new File("E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\a.java")))
//        );
//        boolean success = task.call();
//        if (!success) {
//            System.out.println(writer.toString());
//        }
//        for (Map.Entry<String, ByteArrayOutputStream> entry : fileManager.oss.entrySet()) {
//            ByteCode byteCode = new ByteCode();
//            for (MemoryJavaFileObject file : mfs) {
//                if (entry.getKey().startsWith(file.name)) {
//                    byteCode.lastModified = file.lastModified;
//                }
//            }
//            byteCode.bytes = entry.getValue().toByteArray();
//            codeCache.put(entry.getKey(), byteCode);
//        }
//        return fileManager.oss;
////        Main.main(new String[]{"-noExit", "-parameters", "-nowarn", "-source", config.jdkVersion, "-d", config.target, file.getAbsolutePath()});
//    }


//    public static void macOsStart() throws IOException {
//        DirectoryWatcher watcher = DirectoryWatcher.builder()
//                .path((config.workDir.toPath())) // or use paths(directoriesToWatch)
//                .listener(event -> {
//                    switch (event.eventType()) {
//                        case CREATE: /* file created */
//                        case MODIFY: /* file modified */
//                            File file = event.path().toFile();
//                            if (file.getName().endsWith(".java") && config.findSrcFile(toClassName(file)) != null){
//                                recompile(file);
//                            }
//                            break;
//                        case DELETE: /* file deleted */
//                            ;
//                            break;
//                    }
//                })
//                // .fileHashing(false) // defaults to true
//                // .logger(logger) // defaults to LoggerFactory.getLogger(DirectoryWatcher.class)
//                // .watchService(watchService) // defaults based on OS to either JVM WatchService or the JNA macOS WatchService
//                .build();
//        System.out.println("watching dir " + config.workspace + " to compile automatically");
//        watcher.watchAsync();
//    }


    private static Set<String> watchList = new ConcurrentSkipListSet<>();
    private static Future watchAction;
    private static void recompileOne(String file){
        watchList.add(file);
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
        Files.walkFileTree(Paths.get(config.workspace), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                dir.register(watcher,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY);
                return FileVisitResult.CONTINUE;
            }

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
                            recompileOne(p);
                        }
                    }
                } else if(eventKind == StandardWatchEventKinds.ENTRY_MODIFY){
                    if(!Files.isDirectory(path)){
                        String p = path.toString();
                        if(p.endsWith(".java")){
                            recompileOne(p);
                        }
                    }
                } else if(eventKind == StandardWatchEventKinds.ENTRY_DELETE){
                }
            }
            key.reset();
        }

    }

}