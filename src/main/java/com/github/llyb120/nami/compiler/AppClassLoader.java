package com.github.llyb120.nami.compiler;

import com.github.llyb120.nami.compiler.data.AopData;
import com.github.llyb120.nami.compiler.data.MethodData;
import com.github.llyb120.nami.server.Aop;
import com.github.llyb120.nami.server.Ctrl;
import com.github.llyb120.nami.compiler.data.ControllerData;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.github.llyb120.nami.core.Config.config;

public class AppClassLoader extends ClassLoader {
    public static ClassLoader defaultClassLoader = ClassLoader.getSystemClassLoader();//AppClassLoader.class.getClassLoader();
    public static AppClassLoader loader = new AppClassLoader();

    private Map<String, ControllerData> controllerCache = new ConcurrentHashMap<>();
    private Map<String, AopData> aopCache = new ConcurrentHashMap<>();

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
        if (config.isHotSwap(name)) {
            Compiler.ByteCode byteCode = Compiler.getByteCode(name, false);
            if (byteCode != null) {
                clz = defineClass(name, byteCode.bytes, 0, byteCode.bytes.length);
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
