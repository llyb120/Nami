package com.github.llyb120.nami;

import cn.hutool.core.thread.ThreadUtil;
import com.github.llyb120.nami.core.Compiler;
import com.github.llyb120.nami.core.Nami;
import org.beetl.sql.core.kit.GenKit;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

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
                    Compiler.compile(file, "ecj", true);
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
}
