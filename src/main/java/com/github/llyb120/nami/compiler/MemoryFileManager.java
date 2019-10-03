package com.github.llyb120.nami.compiler;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.github.llyb120.nami.compiler.Compiler.javac;

public class MemoryFileManager implements JavaFileManager {
    private static JavaFileManager fileManager = javac.getStandardFileManager(null, null, null);;

    public Map<String,ByteArrayOutputStream> oss = new HashMap<>();//ByteArrayOutputStream();

    @Override
    public ClassLoader getClassLoader(Location location) {
        return fileManager.getClassLoader(location);
    }

    @Override
    public Iterable<JavaFileObject> list(Location location, String packageName, Set<JavaFileObject.Kind> kinds, boolean recurse) throws IOException {
        return fileManager.list(location, packageName, kinds, recurse);
    }

    @Override
    public String inferBinaryName(Location location, JavaFileObject file) {
        return null;
    }

    @Override
    public boolean isSameFile(FileObject a, FileObject b) {
        return fileManager.isSameFile(a,b);
    }

    @Override
    public boolean handleOption(String current, Iterator<String> remaining) {
        return fileManager.handleOption(current, remaining);
    }

    @Override
    public boolean hasLocation(Location location) {
        return fileManager.hasLocation(location);
    }

    @Override
    public JavaFileObject getJavaFileForInput(Location location, String className, JavaFileObject.Kind kind) throws IOException {
        return fileManager.getJavaFileForInput(location, className, kind);
    }

    @Override
    public JavaFileObject getJavaFileForOutput(Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
        String name = className.replaceAll("/", ".");
        ByteArrayOutputStream os = oss.get(name);
        if (os == null) {
            os = new ByteArrayOutputStream();
            oss.put(name, os);
        }
        ByteArrayOutputStream finalOs = os;
        return new MemoryJavaFileObject(className, ""){
            @Override
            public OutputStream openOutputStream() throws IOException {
                return finalOs;
//                return super.openOutputStream();
            }
        };
    }

    @Override
    public FileObject getFileForInput(Location location, String packageName, String relativeName) throws IOException {
        return null;
    }

    @Override
    public FileObject getFileForOutput(Location location, String packageName, String relativeName, FileObject sibling) throws IOException {
        return null;
    }

    @Override
    public void flush() throws IOException {
        fileManager.flush();
    }

    @Override
    public void close() throws IOException {
        fileManager.close();
    }

    @Override
    public int isSupportedOption(String option) {
        return 0;
    }
}
