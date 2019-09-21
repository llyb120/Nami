package com.github.llyb120.nami;

import cn.hutool.core.io.FileUtil;
import com.github.llyb120.nami.core.Nami;
import jdk.internal.org.objectweb.asm.*;

public class TestApp {

    public static void main(String[] args) {
        Nami.start();
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
