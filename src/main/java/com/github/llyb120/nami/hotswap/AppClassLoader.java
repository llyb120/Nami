package com.github.llyb120.nami.hotswap;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ModifierUtil;
import com.github.llyb120.nami.compiler.Compiler;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.server.Response;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import static com.github.llyb120.nami.compiler.Compiler.*;
import static com.github.llyb120.nami.core.Config.config;

public class AppClassLoader extends ClassLoader {
    public static ClassLoader defaultClassLoader = AppClassLoader.class.getClassLoader();
//    public static File tempDir = new File(System.getProperty("java.io.tmpdir"));
//    //    public static File userDir = new File(System.getProperty("user.dir"));
//    public static File sourceDir;
//    public static File targetDir;
//
//    static {
//        sourceDir = new File(tempDir, "nami_func_source");
//        targetDir = new File(tempDir, "nami_func_target");
//        if (!sourceDir.exists()) {
//            FileUtil.mkdir(sourceDir);
//        }
//        if (!targetDir.exists()) {
//            FileUtil.mkdir(targetDir);
//        }
//    }


    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return loadCompiledClass(name);
    }

    private Map<String, Holder> instances = new HashMap<>();

    private class Holder {
        Object ins;
        Class clz;
        List<Field> fields = new ArrayList<>();

        public Holder(String s) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            instances.put(s, this);
            this.clz = loadClass(s);
            ins = clz.newInstance();
            for (Field field : clz.getDeclaredFields()) {
                if (ModifierUtil.isStatic(field)) {
                    field.setAccessible(true);
                    fields.add(field);
                }
            }
        }

    }


    protected Class<?> loadCompiledClass(String name) throws ClassNotFoundException {
        Class<?> clz = findLoadedClass(name);
        if (clz != null) {
            return clz;
        }
        byte[] code = null;
        boolean isScript = name.startsWith("NamiFunc");
        if(config.dev){
            boolean hotswap = config.hotswap
                    .stream()
                    .anyMatch(name::startsWith);
            if(!hotswap && !isScript){
                return defaultClassLoader.loadClass(name);
            }
        } else {
            if(!isScript){
                return defaultClassLoader.loadClass(name);
            }
        }
        Compiler.lock.lock();
        try {
            if(!codeReloadCache.containsKey(name) && !isScript){
                codeReloadCache.put(name, Boolean.TRUE);
                code = FileUtil.readBytes(new File(config.target, name.replaceAll("\\.", "/") + ".class"));
                codeCache.put(name, code);
//                return defaultClassLoader.loadClass(name);
            } else {
                Condition condition = getClassCondition(name);
                while((code = codeCache.get(name)) == null){
                    condition.await(3, TimeUnit.SECONDS);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Compiler.lock.unlock();
        }
        if (code != null) {
            return defineClass(name, code, 0, code.length);
        } else {
            return defaultClassLoader.loadClass(name);
        }
    }

    public void loadMagicVars(Response response) {
        for (String s : config.magicvar) {
            try {
                Holder holder = instances.get(s);
                if (holder == null) {
                    holder = new Holder(s);
                }
                for (Field field : holder.fields) {
                    String name = field.getName();
                    if (name.startsWith("$")) {
                        name = name.substring(1);
                    }
                    Object value;
                    if (name.equalsIgnoreCase("get")) {
                        value = response.request.query;
                    } else if (name.equalsIgnoreCase("post") && response.request.body instanceof Obj) {
                        value = response.request.body;
                    } else if (name.equalsIgnoreCase("postA") && response.request.body instanceof Arr) {
                        value = response.request.body;
                    } else if (name.equalsIgnoreCase("request")) {
                        value = response.request.params;
                    } else {
                        value = response.request.params.get(name, field.getType());
                    }
                    field.set(holder.ins, value);
                }

            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
