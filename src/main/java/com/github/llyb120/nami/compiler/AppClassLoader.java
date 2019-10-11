package com.github.llyb120.nami.compiler;

import com.github.llyb120.nami.bean.Bean;
import com.github.llyb120.nami.compiler.data.AopData;
import com.github.llyb120.nami.compiler.data.ControllerData;
import com.github.llyb120.nami.compiler.data.MethodData;
import com.github.llyb120.nami.server.Aop;
import com.github.llyb120.nami.server.Ctrl;
import com.github.llyb120.nami.util.Util;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static com.github.llyb120.nami.core.Config.config;

public class AppClassLoader extends ClassLoader {
    public static ClassLoader defaultClassLoader = ClassLoader.getSystemClassLoader();//AppClassLoader.class.getClassLoader();
    public static AppClassLoader loader = new AppClassLoader();


    private static Map<String,BeanHolder> beans = new HashMap<>();

    private Map<String, ControllerData> controllerCache = new ConcurrentHashMap<>();
    private Map<String, AopData> aopCache = new ConcurrentHashMap<>();

    static class BeanHolder{
        public Class clz;
        public Bean ins;

        public BeanHolder(Class clz, Bean ins) {
            this.clz = clz;
            this.ins = ins;
        }
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> clz = findLoadedClass(name);
        if (clz != null) {
            return clz;
        }
        if (name.startsWith("java.")) {
            return defaultClassLoader.loadClass(name);
        }
        BeanHolder holder = beans.get(name);
        if (holder != null) {
            return holder.clz;
        }
        //源文件
        File srcFile = config.findSrcFile(name);
        if (null != srcFile) {
            //字节码文件
            File classFile = Compiler.toClassFile(name);
            if(!classFile.exists() || classFile.lastModified() < srcFile.lastModified()) {
                //尝试重新编译
                Future future = Compiler.recompile(Collections.singletonList(srcFile.getAbsolutePath()), false);
                try {
                    future.get();
                } catch (InterruptedException | ExecutionException e) {
                }
            }
            if(classFile.exists()){
                byte[] bytes = Util.readBytes(classFile);
                clz = defineClass(name, bytes, 0, bytes.length);
            }
        }
        if (clz == null) {
            return defaultClassLoader.loadClass(name);
        }
        analyzeClass(name, clz);
        return clz;
    }


    private void analyzeClass(String clzName, Class<?> clz) {
        if(clz.isInterface()){
            return;
        }
        if (Ctrl.class.isAssignableFrom(clz) ) {
            analyzeController(clzName, clz);
        }
        if(Aop.class.isAssignableFrom(clz)){
            analyzeAop(clzName, clz);
        }
        if(Bean.class.isAssignableFrom(clz)){
            analyzeBean(clzName, clz);
        }
    }

    private void analyzeBean(String clzName, Class<?> clz) {
        //是否装载过别的类
        Bean ins = null;
        try {
            ins = (Bean) clz.newInstance();
            ins.onCreate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ins != null) {
                beans.put(clzName, new BeanHolder(clz, ins));
            }
        }
    }

    public static void removeBean(String clzName){
        synchronized (beans){
            BeanHolder holder = beans.get(clzName);
            if (holder != null) {
                try {
                    holder.ins.onDestroy();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    beans.remove(clzName);
                }
            }
        }
    }

    private void analyzeAop(String clzName, Class<?> clz) {
        try {
            AopData data = new AopData(clz);
            aopCache.put(clzName, data);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private void analyzeController(String clzName, Class<?> clz) {
        ControllerData data = new ControllerData(clz);
        for (Method method : clz.getDeclaredMethods()) {
            MethodData methodData = new MethodData(clz);
            methodData.method = method;
            methodData.parameters = method.getParameters();
            data.methods.put(method.getName(), methodData);
        }
        controllerCache.put(clzName, data);
    }


    public ControllerData loadController(String clzName) throws ClassNotFoundException {
        Class clz = loadClass(clzName);
        if (clz == null) {
            return null;
        }
        return controllerCache.get(clzName);
    }

    public AopData loadAop(String clzName) throws ClassNotFoundException {
        Class clz = loadClass(clzName);
        if (clz == null) {
            return null;
        }
        return aopCache.get(clzName);
    }
}
