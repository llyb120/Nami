package com.github.llyb120.nami.compiler;

import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

public class MemoryJavaFileObject extends SimpleJavaFileObject{

        private String contents = null;


        public MemoryJavaFileObject(String className, String contents) {
            super(URI.create("string:///" + className.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension), JavaFileObject.Kind.SOURCE);
            this.contents = contents;
        }

        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            return contents;
        }

    }
