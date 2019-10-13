package com.github.llyb120.nami.compiler;

import com.github.llyb120.nami.bean.*;
import com.github.llyb120.nami.compiler.data.AopData;
import com.github.llyb120.nami.compiler.data.ControllerData;
import com.github.llyb120.nami.compiler.data.MethodData;
import com.github.llyb120.nami.server.AbstractServer;
import com.github.llyb120.nami.server.Aop;
import com.github.llyb120.nami.server.Ctrl;
import com.github.llyb120.nami.server.DevServer;
import com.github.llyb120.nami.util.Util;
import com.github.llyb120.nami.version.Version;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static com.github.llyb120.nami.log.Log.error;

public class AppClassLoader extends ClassLoader {
    public static ClassLoader defaultClassLoader = ClassLoader.getSystemClassLoader();//AppClassLoader.class.getClassLoader();
    public static AppClassLoader loader = new AppClassLoader();

    private static Map<String,BeanHolder> beans = new HashMap<>();

    private Map<String, ControllerData> controllerCache = new ConcurrentHashMap<>();
    private Map<String, AopData> aopCache = new ConcurrentHashMap<>();

    static class BeanHolder{
        public Class clz;
        public Object ins;
        public List<Method> createMethods = new ArrayList<>();
        public List<Method> destroyMethods = new ArrayList<>();

        private AbstractServer server;

        public BeanHolder(Class clz) throws IllegalAccessException, InstantiationException{
            this.clz = clz;
            this.ins = clz.newInstance();

            scanMethods();
            onCreate();
        }

        public void scanMethods(){
            Server server = (Server) clz.getAnnotation(Server.class);
            if (server != null) {
                this.server = new DevServer(server.packages());
                try {
                    this.server.start(server.port());
                } catch (Exception e) {
                    e.printStackTrace();
                    error("启动服务器失败");
                }
            }

            for (Method method : clz.getDeclaredMethods()) {
                if(!isValidBean(method)){
                    continue;
                }
                OnCreate create = method.getAnnotation(OnCreate.class);
                if (create != null) {
                    createMethods.add(method);
                }
                OnDestroy destroy = method.getAnnotation(OnDestroy.class);
                if (destroy != null) {
                    destroyMethods.add(method);
                }
            }
        }

        public void onCreate() {
            for (Method method : createMethods) {
                try{
                    method.invoke(ins);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onDestroy(){
            if (server != null) {
                server.shutdown();
            }
            for (Method method : destroyMethods) {
                try{
                    method.invoke(ins);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }

    public void preloadClasses(Collection<String> clzs) {
        for (String clz : clzs) {
            try {
                loadClass(clz);
            } catch (ClassNotFoundException e) {
            }
        }
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
        File srcFile = Compiler.toJavaFile(name);
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
        try {
            analyzeClass(name, clz);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
        }
        return clz;
    }


    private void analyzeClass(String clzName, Class<?> clz) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if(clz.isInterface()){
            return;
        }
        if (Ctrl.class.isAssignableFrom(clz) ) {
            analyzeController(clzName, clz);
        }
        if(Aop.class.isAssignableFrom(clz)){
            analyzeAop(clzName, clz);
        }
//        if(Bean.class.isAssignableFrom(clz)){
        analyzeBean(clzName, clz);
//        }
    }

    private static boolean isValidBean(Class clz){
        OnVersion version = (OnVersion) clz.getAnnotation(OnVersion.class);
        if (version == null) {
            return true;
        }
        return Version.match(version.name(), version.version());
    }

    private static boolean isValidBean(Method method){
        OnVersion version = (OnVersion) method.getAnnotation(OnVersion.class);
        if (version == null) {
            return true;
        }
        return Version.match(version.name(), version.version());
    }


    private void analyzeBean(String clzName, Class<?> clz) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        if(!isValidBean(clz)){
            return;
        }
        for (Annotation annotation : clz.getAnnotations()) {
            if(annotation instanceof Server || annotation instanceof Bean){
                beans.put(clzName, new BeanHolder(clz));
            }
        }
        //是否装载过别的类
//        Bean ins = null;
//        try {
//            ins = (Bean) clz.newInstance();
//            ins.onCreate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (ins != null) {
//                beans.put(clzName, new BeanHolder(clz, ins));
//            }
//        }
    }

    public static void removeBeans(Collection<String> paths){
        synchronized (beans){
            for (String clzName : paths) {
                BeanHolder holder = beans.get(clzName);
                if (holder != null) {
                    holder.onDestroy();
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




//    public static void scan()
}
