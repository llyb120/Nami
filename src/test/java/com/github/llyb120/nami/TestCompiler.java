package com.github.llyb120.nami;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.compiler.MemoryFileManager;
import com.github.llyb120.nami.compiler.MemoryJavaFileObject;
import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.core.Nami;
import org.beetl.sql.core.kit.GenKit;
import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

import static com.github.llyb120.nami.compiler.Compiler.javac;
import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.a;

public class TestCompiler {


    private boolean start = false;

    public void walk(File file) throws IOException {
        if(!start){
            if (file.getName().equals("nami")) {
                start = true;
            }
        }
        if(file.isDirectory()){
            for (File listFile : file.listFiles()) {
                walk(listFile);
            }
        }
            if (start) {
                if (file.isFile()) {
                    System.out.println("compiling " + file.getName());
//                    Compiler.compile(file, true);
                }
            }
    }

    @Test
    public void test() throws IOException {
        Nami.dev();
        String path = GenKit.getJavaSRCPath();
        walk(new File(path));
        for (int i = 0; i < 10; i++) {
            ThreadUtil.sleep(1000);
        }
    }


    @Test
    public void test_01_single(){
        Nami.dev();
//        Compiler.compileWithEcj(("D:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\nami\\sqltool\\a.java"));
    }


    @Test
    public void test_02_blockMap() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(16);
        for (int i = 0; i < 16; i++) {
            service.execute(() -> {
            });
        }

        Thread.sleep(2000);
        Thread.sleep(10000);
    }

    public static JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
    @Test
    public void t2t2(){
        StringWriter writer = StrUtil.getWriter();
        MemoryFileManager fileManager = new MemoryFileManager();
        //创建编译任务
//        JavaCompiler.CompilationTask task =
        Properties ps = System.getProperties();
        ps.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });
        //.list(System.out);
        long st = System.currentTimeMillis();
                javac.run(
                null,
                null,
                null,
//                "-noExit",
                        "-parameters",
                        "-nowarn",
                        "-source",
                        config.jdkVersion,
                        "-sourcepath",
                        "E:\\work\\Nami\\src\\main\\java",
                        "-d",
                        "E:\\work\\Nami\\target\\classes",
                        "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\a.java"
//                null,
//                a(new MemoryJavaFileObject("com.github.llyb120.test.a", new File("E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\a.java")))
        );
        System.out.println(System.currentTimeMillis() - st);
//        boolean success = task.call();
//        if(!success){
//            System.out.println(writer.getBuffer().toString());
//        }
        int c = 2;
        System.out.println("ok");
    }


    @Test
    public void t3t3() throws InterruptedException {
        t2t2();
        Thread.sleep(20000);
        t2t2();
    }

    @Test
    public void ttt() throws InterruptedException {
        List<File> files = FileUtil.loopFiles(new File("E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test"), new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        });
        Map map = new HashMap<>();
//        Compiler.analyzeCodeImport("com.github.llyb120.test.a", new File("E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\a.java"), map);
//        ForkJoinPool pool = ForkJoinPool.commonPool();
//        CountDownLatch cl = new CountDownLatch(files.size());
//        List list = new ArrayList();
//        Path base = Paths.get("E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test");
//        for (File file : files) {
//            Async.execute(() -> {
//                try{
//                    list.add(new MemoryJavaFileObject(file.getAbsolutePath().replace(base.toString(), "").replace(".java", "").replace("/", ".").replace("\\",".").substring(1), FileUtil.readUtf8String(file)));
//                } finally {
//                    cl.countDown();
//                }
//            });
//        }
//        cl.await();
//        pool.awaitQuiescence()
        StringWriter writer = StrUtil.getWriter();
        MemoryFileManager fileManager = new MemoryFileManager();
//        Collection<MemoryJavaFileObject> mfs = files.values();
        //创建编译任务
//        Iterable<? extends JavaFileObject> fs = javac.getStandardFileManager(null, null, null)(Collections.singleton("E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\*.java"));
//        JavaCompiler.CompilationTask task =
            javac.run(
                null,
                null,
                null,
                "-noExit",
                        "-parameters",
                        "-proceedOnError",
                        "-nowarn",
                        "-source",
                        config.jdkVersion,

                    "-classpath",
                    "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test",
                    "-sourcepath",
                        "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test",
                        "-d",
                    "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\d",
                "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\a.java"
//                fs
//                map.values()
        );
            Thread.sleep(10000);
        javac.run(
                null,
                null,
                null,
                "-noExit",
                "-parameters",
                "-proceedOnError",
                "-nowarn",
                "-cp",
                "E:\\work\\Nami\\src\\main\\java",
                "-sourcepath",
                "E:\\work\\Nami\\src\\main\\java",
                "-source",
                config.jdkVersion,
                "-d",
                "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\d",
                "E:\\work\\Nami\\src\\main\\java\\com\\github\\llyb120\\test\\a.java"
//                fs
//                map.values()
        );
//        long st = System.currentTimeMillis();
//        boolean success = task.call();
//        System.out.println(System.currentTimeMillis() - st);
        int d = 2;
    }
}
