package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;

//import javassist.ClassPool;
//import javassist.CtClass;
//import javassist.CtMethod;
//import javassist.CtNewMethod;
//import javassist.bytecode.MethodInfo;

public class TestApp {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println(System.getProperty("java.home"));
//        System.setProperty("co.paralleluniverse.fibers.verifyInstrumentation", "false");
//        System.out.println(config.dev);
//
////        QuaLo
//        for (int i = 0; i < 10000000; i++) {
//            int finalI = i;
//            new Fiber<Void>(){
//                @Override
//                protected Void run() throws SuspendExecution, InterruptedException {
//                    System.out.println(finalI);
//                    return null;
//                }
//            }.start();
//        }
//        long stime = System.currentTimeMillis();
//        for (String s : config.hotswap) {
//            Set<Class<?>> clzs = ClassUtil.scanPackage(s);
//            int d = 2;
//        }
//        System.out.println(System.currentTimeMillis() - stime);
//        new b().test();
//        Thread.sleep(1000);
        Nami.start();
//        ClassPool pool = ClassPool.getDefault();
//        try {
//            CtClass cc = pool.makeClass(new FileInputStream("E:\\work\\hz\\Nami\\target\\classes\\com\\github\\llyb120\\nami\\excel\\ExportUtil.class"));
////            cc.addMethod(new CtMethod(new MethodInfo(), cc));
//            CtMethod method = CtNewMethod.make("");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
//
//        ClassVisitor visitor = new ClassVisitor(Opcodes.ASM5) {
//            @Override
//            public MethodVisitor visitMethod(int i, String s, String s1, String s2, String[] strings) {
//                return super.visitMethod(i, s, s1, s2, strings);
//            }
//        };
//
//        ClassReader reader = new ClassReader(FileUtil.readBytes("E:\\work\\hz\\Nami\\target\\classes\\com\\github\\llyb120\\nami\\excel\\ExportUtil.class"));
//        reader.accept(visitor, 0);
//        new ClassReader(new byte[0]).accept(new ClassVisitor(Opcodes.ASM5) {
//        });
    }

}
