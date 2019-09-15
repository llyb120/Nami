package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.AopInvoke;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Param;
import com.github.llyb120.nami.hotswap.AbstractLoader;
import com.github.llyb120.nami.hotswap.DevLoader;
import com.github.llyb120.nami.hotswap.ProductLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.server.Response.CRLF;

public abstract class AbstractServer {

    private HashMap<Class, Object> clzInstances = new HashMap<>();
    private ThreadLocal<ProductLoader> loaders = new ThreadLocal<ProductLoader>(){
        @Override
        protected ProductLoader initialValue() {
            return new ProductLoader();
        }
    };

    public abstract void start(int port) throws Exception;


    public void handleOptions(Response resp) throws Exception {
        //如果是options
        resp.writeHeaders(-1);
        resp.flush();
    }

    public boolean handleFavicon(){
        return false;
    }

    public void handle(Response resp) throws Exception {
        Request req = resp.request;
        if(req.method.equals(Request.Method.OPTIONS)){
            handleOptions(resp);
            return;
        }

        if(req.path.equals("/favicon.ico")){
            if(!handleFavicon()){
                return;
            }
        }

        //静态资源
        for (String s : config.statics.keySet()) {
            if(req.path.startsWith(s)){
                String relative = req.path.replace(s, "");
                File file = new File(config.statics.s(s), relative);
                if(file.exists()){
                    if(file.isFile()){
                        proxyFile(resp, new MultipartFile(file), false);
                    } else {
                        file = new File(file, "index.html");
                        if(file.exists()){
                            proxyFile(resp, new MultipartFile(file), false);
                        }
                    }
                }
                return;
            }
        }

        //路由匹配
        Object[] route = Route.getMatchedRoute(req.path);
        if (route == null) {
            return;
        }
        String className = (String) route[1];
        String methodName = (String) route[2];
        String packageName = (String) route[0];
        if(className == null){
           className = packageName;
        }
        String[] aops = (String[]) route[3];

        AbstractLoader loader = null;
        if(config.dev){
            loader = new DevLoader();
        } else {
            loader = loaders.get();
        }
        Thread.currentThread().setContextClassLoader(loader);
        Class clz = loader.loadClass(className);
        loader.loadMagicVars(resp);

        Object result = null;
//        var ma = MethodAccess.g(clz);
//        var ca = ConstructorAccess.g(clz);
//        var i = 0;
//        for (String name : ma.getMethodNames()) {
//            if (name.equalsIgnoreCase(methodName)) {
//                result = ma.invoke(ca.newInstance(), i);
//            }
//            i++;
//        }
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
            proxyFile(resp, new MultipartFile((File)result));
        } else if(result instanceof MultipartFile){
            proxyFile(resp, (MultipartFile) result);
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



    public void proxyFile(Response response, MultipartFile multipartFile) throws InterruptedException, ExecutionException, IOException {
        proxyFile(response, multipartFile, true);
    }

    public void proxyFile(Response response, MultipartFile multipartFile, boolean download) throws IOException, ExecutionException, InterruptedException {
        long length = multipartFile.length();
        response.setFileDescription(multipartFile,download);
        if(length > -1){
            if(directDownloadLength() >= length){
                response.writeHeaders((int) length);
                response.write(multipartFile).flush();
//                multipartFile.transferTo(response.channel);
            } else {
                response.setChunked(true);
                response.writeHeaders(-1);
                int size = directDownloadLength();
//                var buf = new Buffer();
                try(
                    ReadableByteChannel fis = multipartFile.openChannel();
                        ){
                    int n = -1;
                    while(true){
                        ByteBuffer bs = ByteBuffer.allocateDirect(size);
                        n = fis.read(bs);
                        if(n < 1){
                            break;
                        }
                        response.write(Integer.toHexString(n).getBytes())
                                .write(CRLF)
                                .write((ByteBuffer)bs.flip())
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
