package com.github.llyb120.nami.server;

import com.github.llyb120.nami.compiler.AppClassLoader;
import com.github.llyb120.nami.compiler.data.ControllerData;
import com.github.llyb120.nami.compiler.data.MethodData;
import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Param;
import com.github.llyb120.nami.func.Expression;
import com.github.llyb120.nami.json.Json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;


public abstract class AbstractServer {
    protected volatile boolean running = true;
    static final String CRLF = "\r\n";
//    Config.Server server;
    protected String[] packages;

    public abstract void start(int port) throws Exception;
    public abstract void shutdown();

    public AbstractServer(String[] packages) {
        this.packages = packages;
    }

    void handle(Response resp) {
        //读取header
        byte[] bs = new byte[4096 + 4];
        int i = 0;
        try (Response r = resp) {
//            int n = resp.request.is.read(bs);
//            if (n < 1) {
//                return;
//            }
//            String head = null;
//            for (; i < n - 3; i++) {
//                if (bs[i] == '\r' && bs[i + 1] == '\n' && bs[i + 2] == '\r' && bs[i + 3] == '\n') {
//                    head = new String(bs, 0, i);
//                    i += 4;
//                    break;
//                }
//            }
//            if (head != null) {
                resp.request.decodeHeaders();
                if (resp.request.method == Request.Method.POST) {
                    int finalI = i;
                    Async.execute(() -> {
                        try {
                            analyze(resp);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                } else {
                    resp.request.analyzeEnd();
                    resp.cl.countDown();
                }
                _handle(resp);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    void read(Response resp) {
//        try{
//            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
//            ReadableByteChannel in = resp.request.channel;
//            WritableByteChannel out = resp.pipe.sink();
//            while (in.read(byteBuffer) > 0) {
//                byteBuffer.flip();
//                out.write(byteBuffer);
//                byteBuffer.flip();
//            }
//        } catch (IOException e){}
//    }

    void analyze(Response resp) throws IOException {
        if(resp.request.getContentType().contains("multipart/form-data")){
            resp.request.decodeFormData();
        } else {
            resp.request.decodeBody();
        }
        resp.request.analyzeEnd();
        resp.cl.countDown();

//        try {
//            boolean abort = resp.request.analyze(bs, start, length);
//            int n = -1;
//            while (!abort && (n = resp.request.is.read(bs)) > 0) {
//                abort = resp.request.analyze(bs, 0, n);
//            }
//            resp.request.analyzeEnd();
//            resp.cl.countDown();
//        } catch (IOException e) {
//        }
    }

//    public void handle(Response resp){
//        try(Response r = resp){
//            _handle(resp);
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }


//    static {
//        for (int i = 0; i < 16; i++) {
//            Async.execute(() -> {
//                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
//                while (true) {
//                    Response resp = null;
//                    try {
//                        resp = readQueue.take();
//                        byteBuffer.clear();
//                        ReadableByteChannel in = resp.request.channel;
//                        WritableByteChannel out = resp.pipe.sink();
//                        while (in.read(byteBuffer) != -1) {
//                            byteBuffer.flip();
//                            out.write(byteBuffer);
//                            byteBuffer.flip();
//                        }
//                    } catch (InterruptedException | IOException e) {
//                    }
//
//                }
//            });
//
//            Async.execute(() -> {
//                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
//                while (true) {
//                    Response resp = null; //analyzeQueue.take();
//                    try {
//                        resp = analyzeQueue.take();
//                        byteBuffer.clear();
//                        boolean abort = false;
//                        boolean once = false;
//                        while (!abort && resp.pipe.source().read(byteBuffer) > 0) {
//                            byteBuffer.flip();
//                            abort = resp.request.analyze(byteBuffer);
//                            byteBuffer.flip();
//                            if(resp.request.phase != Request.AnalyzePhase.DECODING_HEAD && !once){
//                                once = true;
//                                handleQueue.put(resp);
//                            }
//                        }
//                        resp.request.analyzeEnd();
//                        resp.cl.countDown();
////                        try {
////                            resp.server.handle(resp);
////                        } catch (Exception e) {
////                            e.printStackTrace();
////                        } finally {
////                            resp.close();
////                        }
////                        handleQueue.put(resp);
//                    } catch (InterruptedException | IOException e) {
//                    }
//                }
//            });
//
//            Async.execute(() -> {
//                while (true) {
//                    try {
//                        Response resp = handleQueue.take();
//                        resp.server.handle(resp);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//        }
//
//    }

    public void handleOptions(Response resp) throws Exception {
        //如果是options
        resp.writeHeaders(-1);
        resp.flush();
    }

    public boolean handleFavicon() {
        return false;
    }

    public final void _handle(Response resp) throws Exception {
        Request req = resp.request;
        if (req.method == null) {
            return;
        }

        if (req.method.equals(Request.Method.OPTIONS)) {
            handleOptions(resp);
            return;
        }

        if (req.path.equals("/favicon.ico")) {
            if (!handleFavicon()) {
                return;
            }
        }

        //静态资源
        /**
         for (String s : config.statics.keySet()) {
         if (req.path.startsWith(s)) {
         String relative = req.path.replace(s, "");
         File file = new File(config.statics.s(s), relative);
         if (file.exists()) {
         if (file.isFile()) {
         proxyFile(resp, new MultipartFile(file), false);
         } else {
         file = new File(file, "index.html");
         if (file.exists()) {
         proxyFile(resp, new MultipartFile(file), false);
         }
         }
         }
         return;
         }
         }
         **/

        //路由匹配
        String path = req.path.replace("/", ".");
//        if(path.endsWith(".")){
//            path = path.substring(0, path.length() - 1);
//        }
        int dot = path.lastIndexOf(".", path.length() - 1);
        String className = null;
        String methodName = null;
        if(dot > -1){
            className = packages[0] + path.substring(0, dot);
            methodName = path.substring(dot + 1);
        }
//        for (String aPackage : packages) {

//            File file = new File(Env.workspace, aPackage.replace(".", "/") + req.path);
//            File par = file.getParentFile();
//            File src =

//            Path file = Paths.get(Env.workspace, aPackage, req.path, ".java");
//            if(Files.exists(file)){
//
//            }
//        }
//        int n = server.locations.size();
//        Route.Item item = null;
//        while (n-- > 0) {
//            Route route = server.locations.get(n);
//            item = (route.match(req.path));
//            if (item == null) {
//                continue;
//            }
//            break;
//        }
//        if (item == null) {
//            return;
//        }

//        List<String> paths = StrUtil.split(req.path, '/', false, true);
//        Route.Node node = server.root.getMatched(paths);
//        if(node == null){
//            return;
//        }
//        String methodName = null;
//        String className = null;
//        String packageName = node.ctrl;
//        do{
//            if(node.type == Route.Node.Type.METHOD){
//                methodName = paths.get(node.deep - 1);
//            } else if(node.type == Route.Node.Type.CLASS){
//                className = paths.get(node.deep - 1);
//            }
//            node = node.parent;
//        } while(node != null);
//        if(methodName == null || className == null){
//            return;
//        }
//        className = packageName + "." + className;
//        Object[] route = Route.getMatchedRoute(req.path);
//        if (route == null) {
//            return;
//        }
//        String className = (String) route[1];
//        String methodName = (String) route[2];
//        String packageName = (String) route[0];
//        if (className == null) {
//            className = packageName;
//        }
//        String[] aops = null;//(String[]) route[3];

        AppClassLoader loader = AppClassLoader.loader;
        Thread.currentThread().setContextClassLoader(loader);
        ControllerData controllerData = loader.loadController(className);
        if (controllerData == null) {
            return;
        }
        MethodData methodData = controllerData.methods.get(methodName);
        if (methodData == null) {
            return;
        }

//        Class clz = loader.loadClass(item.className);
//        loader.loadMagicVars(resp);

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
//        MethodAccess ma = MethodAccess.get(clz, true);
//        int i = ma.getIndex(item.methodName);
//        if(i == -1){
//            return;
//        }
        Expression expression = () -> {
            resp.cl.await();
            Object[] args = Param.AutoWiredParams(methodData.parameters, resp, null);
            Ctrl ctrl = (Ctrl) controllerData.newInstance();
            ctrl.init(resp.request, resp);
            return methodData.method.invoke(ctrl, args);
        };

//        if (item.aops != null) {
//            n = item.aops.size();
//            while (n-- > 0) {
//                String clzName = item.aops.get(n);
////                 Class aopClz = loader.loadClass(clzName);
////                 MethodAccess aopMa = MethodAccess.get(aopClz, true);
////                 Aop aop = (Aop) aopMa.newInstance();
//                Expression lastExpression = expression;
//                expression = () -> {
//                    Aop aop = loader.loadAop(clzName).newInstance();
//                    if (aop instanceof HalfAop) {
//                    } else {
//                        resp.cl.await();
//                    }
//                    return aop.around(req, resp, lastExpression);
//                };
//            }
//
//        }

        result = expression.call();


        if (result instanceof File) {
            proxyFile(resp, new MultipartFile((File) result));
        } else if (result instanceof MultipartFile) {
            proxyFile(resp, (MultipartFile) result);
        } else {
            resp.header("Content-Type", "application/json; charset=utf-8");
            if (result instanceof String) {
                byte[] bs = ((String) result).getBytes();
                resp.writeHeaders(bs.length)
                        .write(bs);
            } else {
                byte[] bs = Json.stringify(result).getBytes();
                resp.writeHeaders(bs.length)
                        .write(bs);
            }
        }

    }

//    private Object getInstance(Class clz) throws IllegalAccessException, InstantiationException {
//        if (config.dev) {
//            return clz.newInstance();
//        } else {
//            Object ins = null;
//            synchronized (clzInstances) {
//                ins = clzInstances.get(clz);
//                if (ins == null) {
//                    ins = clz.newInstance();
//                    clzInstances.put(clz, ins);
//                }
//            }
//            return ins;
//        }
//    }


//    private Object doAop(ClassLoader loader, String[] aops, Class clz, Method method, Object instance, Object[] args, Response response) throws Exception {
//        AopInvoke invoke = null;
//        invoke = new AopInvoke(clz, method, instance, args);
//        int i = aops.length;
//        while (i-- > 0) {
//            String aop = aops[i];
//            //如果有已经包装的方法
//            Class<?> clzAop = loader.loadClass(aop);
//            //查找一个名为around的方法
//            Method methodAop = null;
//            for (Method m : clzAop.getMethods()) {
//                if (m.getName().equals("around")) {
//                    methodAop = m;
//                    break;
//                }
//            }
//            Map<Class, Object> staticArgs = new HashMap<>();
//            staticArgs.put(AopInvoke.class, invoke);
//            Object aopInstance = getInstance(clzAop);
//            Object[] aopArgs = Param.AutoWiredParams(clzAop, methodAop, response, staticArgs);
//            invoke = new AopInvoke(clzAop, methodAop, aopInstance, aopArgs);
//        }
//        return invoke.call();
//    }


    public void proxyFile(Response response, MultipartFile multipartFile) throws InterruptedException, ExecutionException, IOException {
        proxyFile(response, multipartFile, true);
    }

    public void proxyFile(Response response, MultipartFile multipartFile, boolean download) throws IOException, ExecutionException, InterruptedException {
        long length = multipartFile.length();
        response.setFileDescription(multipartFile, download);
        if (length > -1) {
            if (directDownloadLength() >= length) {
                response.writeHeaders((int) length)
                        .write(multipartFile)
                        .close();
            } else {
                response.setChunked(true);
                response.writeHeaders(-1);
                int size = directDownloadLength();
//                var buf = new Buffer();
                try (
                        InputStream is = multipartFile.openInputStream();
//                        ReadableByteChannel fis = multipartFile.openChannel();
                ) {
                    int n = -1;
                    byte[] bs = new byte[4096];
                    while (true) {
                        n = is.read(bs);
                        if (n < 1) {
                            break;
                        }
                        response.write((Integer.toHexString(n).getBytes()))
                                .write(CRLF)
                                .write(bs, 0, n)
                                .write(CRLF);
                    }
                    response
                            .write((byte) '0')
                            .write(CRLF)
                            .write(CRLF);
                    response.write(bs);
                }
            }
        }
    }


    public int directDownloadLength() {
        return 4096;
    }
}
