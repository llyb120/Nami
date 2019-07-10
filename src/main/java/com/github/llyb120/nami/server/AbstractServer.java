package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.server.Response.CRLF;

public abstract class AbstractServer {

    private HashMap<Class, Object> clzInstances = new HashMap<>();

    public abstract void start(int port, boolean async) throws Exception;


    protected boolean handleOptions(){
        //如果是options
        return false;
    }

    protected boolean handleFavicon(){
        return false;
    }

    public void handle(Response resp) throws Exception {
        var req = resp.request;
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
                Object[] args = Param.AutoWiredParams(clz, method, resp, null);
                if (aops != null) {
                    result = doAop(loader, aops, clz, method, instance, args, resp);
                } else {
                    result = method.invoke(instance, args);
                }
                break;
            }
        }

        if(result instanceof File){
            downloadFile(resp, new MultipartFile((File)result));
        } else if(result instanceof MultipartFile){
            downloadFile(resp, (MultipartFile) result);
        } else {
            resp.setHeader("Content-Type", "application/json; charset=utf-8");
            //close
            resp.writeObject(result);
            resp.flush();
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


    private Object doAop(ClassLoader loader, String[] aops, Class clz, Method method, Object instance, Object[] args, Response response) throws Exception {
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
            Object[] aopArgs = Param.AutoWiredParams(clzAop, methodAop, response, staticArgs);
            invoke = new AopInvoke(clzAop, methodAop, aopInstance, aopArgs);
        }
        return invoke.call();
    }



    public void downloadFile(Response response, MultipartFile multipartFile) throws IOException, ExecutionException, InterruptedException {
        var length = multipartFile.length();
        response.setFileDescription(multipartFile);
        if(length > -1){
            if(directDownloadLength() >= length){
                response.writeHeaders((int) length);
                response.write(multipartFile).flush();
//                multipartFile.transferTo(response.channel);
            } else {
                response.setChunked(true);
                response.writeHeaders(-1);
                var size = directDownloadLength();
//                var buf = new Buffer();
                try(
                        var fis = multipartFile.openChannel();
                        ){
                    var n = -1;
                    while(true){
                        var bs = ByteBuffer.allocateDirect(size);
                        n = fis.read(bs);
                        if(n < 1){
                            break;
                        }
                        response.write(Integer.toHexString(n).getBytes())
                                .write(CRLF)
                                .write(bs.flip())
                                .write(CRLF)
                                .flush();
                    }
                    response.write((byte) '0')
                        .write(CRLF)
                        .write(CRLF)
                        .flush();
                }
            }
        }
    }


    protected int directDownloadLength(){
        return 4096;
    }
}
