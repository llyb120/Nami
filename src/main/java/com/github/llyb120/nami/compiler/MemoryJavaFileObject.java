package com.github.llyb120.nami.compiler;

import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

import static com.github.llyb120.nami.core.Config.config;

public class MemoryJavaFileObject extends SimpleJavaFileObject{

        public String content = null;
        public String name = null;

        public MemoryJavaFileObject(String className, String contents) {
            super(URI.create("string:///" + className.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension), JavaFileObject.Kind.SOURCE);
            this.name = className;
            this.content = contents;
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            return content;
        }
}
