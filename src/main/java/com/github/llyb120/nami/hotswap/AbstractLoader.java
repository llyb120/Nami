package com.github.llyb120.nami.hotswap;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ModifierUtil;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.server.Response;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.github.llyb120.nami.compiler.Compiler.compileWithEcj;
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
        if(!sourceDir.exists()){
            FileUtil.mkdir(sourceDir);
        }
        if(!targetDir.exists()){
            FileUtil.mkdir(targetDir);
        }
    }


    private Map<String, Holder> instances = new HashMap<>();

    private class Holder{
        Object ins;
        Class clz;
        List<Field> fields = new ArrayList<>();

        public Holder(String s) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            instances.put(s, this);
            this.clz = loadClass(s);
            ins = clz.newInstance();
            for (Field field : clz.getDeclaredFields()) {
                if(ModifierUtil.isStatic(field)) {
                    field.setAccessible(true);
                    fields.add(field);
                }
            }
        }

    }

    public Class<?> loadFuncClass(String name){
        if(name.startsWith("NamiFunc")){
            if(!Files.exists(Paths.get(targetDir.getAbsolutePath(), name + ".class"))){
                compileWithEcj(new File(sourceDir, name + ".java").getAbsolutePath(), targetDir.getAbsolutePath());
            }
            byte[] bytes = FileUtil.readBytes(new File(targetDir, name + ".class"));
            return defineClass(name, bytes, 0, bytes.length);
        }
        return null;
    }

    public void loadMagicVars(Response response){
        for (String s : config.magicvar) {
            try {
                Holder holder = instances.get(s);
                if (holder == null) {
                    holder = new Holder(s);
                }
                for (Field field : holder.fields) {
                    String name = field.getName();
                    if(name.startsWith("$")){
                        name = name.substring(1);
                    }
                    Object value;
                    if(name.equalsIgnoreCase("get")){
                        value = response.request.query;
                    } else if(name.equalsIgnoreCase("post") && response.request.body instanceof Obj){
                        value = response.request.body;
                    } else if(name.equalsIgnoreCase("postA") && response.request.body instanceof Arr){
                        value = response.request.body;
                    } else if(name.equalsIgnoreCase("request")){
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
