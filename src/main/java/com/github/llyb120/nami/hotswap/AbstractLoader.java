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
import java.util.concurrent.locks.Condition;

import static com.github.llyb120.nami.compiler.Compiler.*;
import static com.github.llyb120.nami.core.Config.config;

public abstract class AbstractLoader extends ClassLoader {
    public static ClassLoader defaultClassLoader = DevLoader.class.getClassLoader();
    public static File tempDir = new File(System.getProperty("java.io.tmpdir"));
    //    public static File userDir = new File(System.getProperty("user.dir"));
    public static File sourceDir;
    public static File targetDir;

    static {
        sourceDir = new File(tempDir, "nami_func_source");
        targetDir = new File(tempDir, "nami_func_target");
        if (!sourceDir.exists()) {
            FileUtil.mkdir(sourceDir);
        }
        if (!targetDir.exists()) {
            FileUtil.mkdir(targetDir);
        }
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

    public Class<?> loadFuncClass(String name) throws ClassNotFoundException {
        if (name.startsWith("NamiFunc")) {
            return loadCompiledClass(name);
//            compile(name, );
//            if(!Files.exists(Paths.get(targetDir.getAbsolutePath(), name + ".class"))){
//                compileWithEcj(new File(sourceDir, name + ".java").getAbsolutePath(), targetDir.getAbsolutePath());
//            }
//            byte[] bytes = FileUtil.readBytes(new File(targetDir, name + ".class"));
//            return defineClass(name, bytes, 0, bytes.length);
        }
        return null;
    }

    protected Class<?> loadCompiledClass(String name) throws ClassNotFoundException {
        Class<?> clz = findLoadedClass(name);
        if (clz != null) {
            return clz;
        }
        System.out.println("load class:" + name);
        boolean isScript = name.startsWith("NamiFunc");
        byte[] code = null;
        Compiler.lock.lock();
        try {
            Condition condition = getClassCondition(name);
            while (true) {
                code = codeCache.get(name);
                if (code == null) {
                    if (isScript) {

                    } else {
                        File file = new File(config.target, name.replaceAll("\\.", "/") + ".class");
                        code = FileUtil.readBytes(file);
                        break;
                    }
                } else {
                    break;
//                        condition.await();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Compiler.lock.unlock();
        }

        try{
            FileUtil.writeBytes(code, new File(config.target, name.replaceAll("\\.", "/") + ".class"));
            return defineClass(null, code, 0, code.length);
        } catch (Exception e){
            return super.findClass(name);
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
