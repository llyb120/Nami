package com.github.llyb120.nami.compiler;

import cn.hutool.core.io.FileUtil;

import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class MemoryJavaFileObject extends SimpleJavaFileObject{
        public String content = null;
        public String name = null;
        public long lastModified = 0;

        public MemoryJavaFileObject(String className, Object contents) {
            super(URI.create("string:///" + className.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension), JavaFileObject.Kind.SOURCE);
            this.name = className;
            if(contents instanceof File){
                this.lastModified = ((File) contents).lastModified();
                this.content = FileUtil.readUtf8String((File) contents);
            } else if(contents instanceof String){
                this.lastModified = System.currentTimeMillis();
                this.content = (String) contents;
            }
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            return content;
        }
}
