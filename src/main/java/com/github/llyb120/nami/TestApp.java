package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;

//import javassist.ClassPool;
//import javassist.CtClass;
//import javassist.CtMethod;
//import javassist.CtNewMethod;
//import javassist.bytecode.MethodInfo;

public class TestApp {

    public static void main(String[] args) throws InterruptedException {
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
