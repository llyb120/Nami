package com.github.llyb120.nami.server;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.llyb120.nami.core.*;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponse;

import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static com.github.llyb120.nami.core.Config.config;

public abstract class AbstractServer {

    private HashMap<Class, Object> clzInstances = new HashMap<>();

    public abstract void start(int port) throws Exception;


    protected boolean handleOptions(){
        //如果是options
        return false;
    }

    protected boolean handleFavicon(){
        return false;
    }

    public void handle(Request req, Response resp) throws Exception {
        if(req.method.equals(Request.Method.OPTIONS)){
            if(!handleOptions()){
                return;
            }
        }

        if(req.path.equals("/favicon.ico")){
            if(!handleFavicon()){
                return;
            }
        }

        var ctx = Context.holder.get();
        ctx.reset();

        ctx.body = req.body;
        ctx.params.putAll(ctx.query);
        if (ctx.body instanceof Obj) {
            ctx.params.putAll((Obj) ctx.body);
        }

        //header
        ctx.headers.putAll(req.headers);

        //end

        //路由匹配
        var route = Route.getMatchedRoute(req.path);
        if (route == null) {
            return;
        }
        String className = (String) route[1];
        String methodName = (String) route[2];
        String packageName = (String) route[0];
        String[] aops = (String[]) route[3];

        ClassLoader loader = null;
        if(config.dev){
            loader = new MyClassLoadader();
        } else {
            loader = getClass().getClassLoader();
        }
        Class clz = loader.loadClass(packageName + "." + className);
        Object result = null;
        for (Method method : clz.getDeclaredMethods()) {
            if (method.getName().equalsIgnoreCase(methodName)) {
                Object instance = getInstance(clz);
                Object[] args = Param.AutoWiredParams(clz, method, null);
                if (aops != null) {
                    result = doAop(loader, aops, clz, method, instance, args);
                } else {
                    result = method.invoke(instance, args);
                }
                break;
            }
        }

        if(result instanceof File){
            downloadFile(req,resp, new MultipartFile((File)result));
        } else if(result instanceof MultipartFile){

        } else {
            resp.setHeader("Content-Type", "application/json; charset=utf-8");
            resp.write(result);
        }

    }

    private Object getInstance(Class clz) throws IllegalAccessException, InstantiationException {
        if(config.dev){
            return clz.newInstance();
        } else {
            Object ins = null;
            synchronized (clzInstances){
                ins = clzInstances.get(clz);
                if (ins == null) {
                    ins = clz.newInstance() ;
                    clzInstances.put(clz, ins);
                }
            }
            return ins;
        }
    }


    private Object doAop(ClassLoader loader, String[] aops, Class clz, Method method, Object instance, Object[] args) throws Exception {
        AopInvoke invoke = null;
        invoke = new AopInvoke(clz, method, instance, args);
        int i = aops.length;
        while (i-- > 0) {
            String aop = aops[i];
            //如果有已经包装的方法
            Class<?> clzAop = loader.loadClass(aop);
            //查找一个名为around的方法
            Method methodAop = null;
            for (Method m : clzAop.getMethods()) {
                if (m.getName().equals("around")) {
                    methodAop = m;
                    break;
                }
            }
            Map<Class, Object> staticArgs = new HashMap<>();
            staticArgs.put(AopInvoke.class, invoke);
            Object aopInstance = getInstance(clzAop);
            Object[] aopArgs = Param.AutoWiredParams(clzAop, methodAop, staticArgs);
            invoke = new AopInvoke(clzAop, methodAop, aopInstance, aopArgs);
        }
        return invoke.call();
    }



    public void downloadFile(Request request, Response response, MultipartFile multipartFile){

    }

}
