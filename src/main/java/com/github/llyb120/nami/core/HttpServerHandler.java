package com.github.llyb120.nami.core;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.cookie.ServerCookieDecoder;
import io.netty.handler.codec.http.multipart.Attribute;
import io.netty.handler.codec.http.multipart.FileUpload;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import io.netty.handler.codec.http.multipart.InterfaceHttpData;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.handler.stream.ChunkedNioFile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.github.llyb120.nami.core.Config.config;
import static io.netty.handler.codec.http.HttpResponseStatus.NOT_FOUND;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

//import io.netty.handler.codec.http.cookie.Cookie;

public class HttpServerHandler extends ChannelInboundHandlerAdapter {
//    private static List<Route> RouteList = new ArrayList<>();

    public static List<Route> ctrls = new ArrayList<>();
    public static Vector<Channel> clients = new Vector<>();
    private WebSocketServerHandshaker handshaker = null;

    private static Map<String, Pattern> urlRegexs = new HashMap<>();

    //dev-start
    private static final HashMap<Class, Object> clzInstances = new HashMap<>();
    //dev-end

    public void write(ChannelHandlerContext ctx, HttpResponse response, boolean keepAlive) {
        HttpUtil.setContentLength(response, 0);
        var future = ctx.writeAndFlush(response);
        if(!keepAlive){
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof FullHttpRequest) {
            // 请求，解码器将请求转换成HttpRequest对象
            handleHttpRequest(ctx, (FullHttpRequest) msg);
        } else if (msg instanceof WebSocketFrame) {
            handleWebSocketRequest(ctx, (WebSocketFrame) msg);
        }
    }

    public void handleWebSocketRequest(ChannelHandlerContext ctx, WebSocketFrame frame) {
        if (frame instanceof CloseWebSocketFrame) {
            clients.remove(ctx.channel());
            handshaker.close(ctx.channel(), ((CloseWebSocketFrame) frame).retain());
        } else if (frame instanceof PingWebSocketFrame) {
            ctx.channel().write(new PongWebSocketFrame(frame.content().retain()));
        } else if (frame instanceof TextWebSocketFrame) {
            ctx.channel().writeAndFlush(new TextWebSocketFrame(((TextWebSocketFrame) frame).text()));
        }
    }


    public void handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest request) throws Exception {
        String uri = request.uri();
        if (uri.equalsIgnoreCase("/ws")) {
            WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
                String.format("http://0.0.0.0:%d/ws/", Config.config.port), null, false);
            handshaker = wsFactory.newHandshaker(request);
            if (handshaker == null) {
                WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
            } else {
                handshaker.handshake(ctx.channel(), request);
                clients.add(ctx.channel());
            }
            return;
        }

        if (HttpUtil.is100ContinueExpected(request)) {
            ctx.write(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE));
        }

        HttpResponse response = new DefaultHttpResponse(HTTP_1_1, OK);
        //写入跨域
        writeCors(response);

        if(request.method().equals(HttpMethod.OPTIONS)){
            write(ctx, response, false);
            return;
        }

        if (uri.equals("/favicon.ico")) {
            response.setStatus(NOT_FOUND);
            write(ctx, response, false);
            return;
        }

        boolean keepAlive = HttpUtil.isKeepAlive(request);
        keepAlive = false;

        //写入keepalive
        if(keepAlive){
            HttpUtil.setKeepAlive(response, keepAlive);
        }

        String path = URLUtil.getPath(uri);
        String[] arr = path.substring(1).split("\\/");
        route:
        {
            Route route = null;
//            for (Route ctrl : Route.routes) {
//                if (ctrl.match(path)) {
//                    route = ctrl;
//                    break;
//                }
//            }
            if (route == null) {
                break route;
            }

            //开始解析请求
            var context = Context.holder.get();
            context.reset();
            decodeQuery(request, context.query);
            if (request.headers().contains(HttpHeaders.Names.COOKIE)) {
                context.cookie.wrap(ServerCookieDecoder.LAX.decode(request.headers().get(HttpHeaders.Names.COOKIE)));
            }

            if (HttpMethod.POST == request.method()) {
                String contentType = request.headers().getAsString("Content-Type");
                if (contentType.contains("application/json")) {
                    context.body = decodeJson(request);
                } else {
                    context.body = decodePost(request);
                }
            }

            //全放到这里
            context.params.putAll(context.query);
            if (context.body instanceof Obj) {
                context.params.putAll((Obj) context.body);
            }

            //header
            for (Map.Entry<String, String> header : request.headers()) {
                context.headers.put(header.getKey(), header.getValue());
            }
            //end

            String className = ArrayUtil.get(arr, route.cIndex);
            String methodName = ArrayUtil.get(arr, route.aIndex);

            ClassLoader loader = null;
            if(config.dev){
                loader = new MyClassLoadader();
            } else {
                loader = getClass().getClassLoader();
            }
            Class clz = loader.loadClass(route.packageName + "." + className);
            Object result = null;
            for (Method method : clz.getDeclaredMethods()) {
                if (method.getName().equalsIgnoreCase(methodName)) {
                    Object instance = getInstance(clz);
                    Object[] args = Param.AutoWiredParams(clz, method, null);
                    if (route.aops != null) {
                        result = doAop(request, loader, route.aops, clz, method, instance, args);
                    } else {
                        result = method.invoke(instance, args);
                    }
                    break;
                }
            }
            if(result instanceof File){
                //提供文件下载
                downloadFile(ctx, response, keepAlive, new MultipartFile(((File) result).getName(), (File)result));
            } else if(result instanceof MultipartFile){
                MultipartFile mfile = (MultipartFile) result;
                if (mfile.byteBuf != null || mfile.file != null) {
                    downloadFile(ctx, response, keepAlive, mfile);
                }
            } else {
                byte[] responseBytes;
                if(result instanceof String){
                    responseBytes = ((String) result).getBytes(StandardCharsets.UTF_8);
                } else {
                    responseBytes = JSON.toJSONString(result, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.PrettyFormat).getBytes(StandardCharsets.UTF_8);
                }
                ByteBuf buf = Unpooled.wrappedBuffer(responseBytes);
//                var resp = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, buf);
                response.headers().set(HttpHeaders.Names.CONTENT_TYPE, "application/json; charset=utf-8");
                response.headers().set(HttpHeaders.Names.CONTENT_LENGTH, buf.readableBytes());
                context.cookie.writeToResponse(response);
                ctx.write(response);
                var future = ctx.writeAndFlush(buf);
//                var future = ctx.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT);
                if(!keepAlive){
                    future.addListener(ChannelFutureListener.CLOSE);
                }
            }
            return;
        }

        response.setStatus(NOT_FOUND);
        write(ctx, response, keepAlive);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
//        LastException = cause;
        cause.printStackTrace();
        //write error
        ctx.close();
//        HttpResponse response =
//        ctx.writeAndFlush(getResponse(cause,200));
//        ctx.close();
    }


    public static Obj decodeQuery(FullHttpRequest request) {
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri(), StandardCharsets.UTF_8);
        Obj object = new Obj();
        decoder.parameters().forEach((k, v) -> object.put(k, v.get(0)));
        return object;
    }

    public static void decodeQuery(FullHttpRequest request, Obj query){
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri(), StandardCharsets.UTF_8);
        decoder.parameters().forEach((k, v) -> query.put(k, v.get(0)));
    }

    public static Obj decodePost(FullHttpRequest request) {
        Obj ret = new Obj();
        HttpPostRequestDecoder decoder = new HttpPostRequestDecoder(request);
        decoder.offer(request);
        List<InterfaceHttpData> parmList = decoder.getBodyHttpDatas();
        for (InterfaceHttpData parm : parmList) {
            Attribute data = null;
            if (parm instanceof Attribute) {
                data = (Attribute) parm;
            } else if (parm instanceof FileUpload) {
                ret.put(parm.getName(), new MultipartFile((FileUpload) parm));
                continue;
            }
            try {
                ret.put(data.getName(), data.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    private static JSON decodeJson(FullHttpRequest request) {
        ByteBuf buf = request.content();
        String str = buf.toString(StandardCharsets.UTF_8);
        var json = (JSON) JSON.parse(str);
        if(json instanceof JSONArray){
            return new Arr((JSONArray)json);
        } else {
            return new Obj<>((JSONObject)json);
        }
    }

    private static void writeCors(HttpResponse response){
        if (config.cors == null) {
           return;
        }
        HttpHeaders headers = response.headers();
        if (StrUtil.isNotEmpty(config.cors.origin)) {
            headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN, config.cors.origin);
        }
        if (StrUtil.isNotEmpty(config.cors.method)) {
            headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_METHODS, config.cors.method);
        }
        if (StrUtil.isNotEmpty(config.cors.headers)) {
            headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_HEADERS, config.cors.headers);
        }
        if (StrUtil.isNotEmpty(config.cors.credentials)) {
            headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_CREDENTIALS, config.cors.credentials);
        }
    }
//    public static Map<String, Object> getGetParamsFromChannel(FullHttpRequest fullHttpRequest) {
//
//        Map<String, Object> params = new HashMap<String, Object>();
//
//        if (fullHttpRequest.method() == HttpMethod.GET) {
//            // 处理get请求
//            QueryStringDecoder decoder = new QueryStringDecoder(fullHttpRequest.uri());
//            Map<String, List<String>> paramList = decoder.parameters();
//            for (Map.Entry<String, List<String>> entry : paramList.entrySet()) {
//                params.put(entry.getKey(), entry.getValue().get(0));
//            }
//            return params;
//        } else {
//            return null;
//        }
//
//    }

    public static boolean matches(String url, String pattern) {
//        pattern = pattern ;
        Pattern p = urlRegexs.get(pattern);
        if (p == null) {
            p = Pattern.compile(pattern);
            urlRegexs.put(pattern, p);
        }
        Matcher m = p.matcher(url);
        if (m.find()) {
            if (url.length() == m.end()) {
                return true;
            }
            char c = url.charAt(m.end());
            if (c == '?' || c == '#' || c == '/' || c == '.') {
                return true;
            }
        }
        return false;

    }

    private Object doAop(FullHttpRequest request, ClassLoader loader, String[] aops, Class clz, Method method, Object instance, Object[] args) throws Exception {
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



    private static Object getInstance(Class clz) throws IllegalAccessException, InstantiationException {
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


    private void writeFileDesc(HttpResponse response, MultipartFile multipartFile){
        var headers = response.headers();
        headers.set("Content-Type", (multipartFile.contentType));
        var fileName = URLUtil.encode(multipartFile.fileName, CharsetUtil.UTF_8);
        headers.set("Content-Disposition", "attachment; filename=\"" + fileName + "\"; filename*=utf-8''" + fileName);
        headers.set(HttpHeaderNames.TRANSFER_ENCODING, HttpHeaderValues.CHUNKED);
    }
    /**
     * 文件下载
     * @param ctx
     * @param response
     * @param file
     */
    private void downloadFile(ChannelHandlerContext ctx, HttpResponse response, boolean keepAlive, MultipartFile multipartFile){
        try{
//            RandomAccessFile raf = new RandomAccessFile(file, "r");
//            long fileLength = file.length();
//            HttpUtil.setContentLength(response, fileLength);
            writeFileDesc(response, multipartFile);

//            response.headers().set("Content-Type", "application/json; charset=utf-8");
//        setContentTypeHeader(response, file);
//        setDateAndCacheHeaders(response, file);
//            if (HttpUtil.isKeepAlive(request)) {
//                response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
//            }

            // Write the initial line and the header.
            ctx.write(response);

            // Write the content.
            ChannelFuture sendFileFuture;
            ChannelFuture lastContentFuture;
//            if (ctx.pipeline().get(SslHandler.class) == null) {
                if(multipartFile.byteBuf != null){
                    sendFileFuture = ctx.write(multipartFile.byteBuf, ctx.newProgressivePromise());
                } else if(multipartFile.file != null){
                    sendFileFuture = ctx.write(new ChunkedNioFile(multipartFile.file), ctx.newProgressivePromise());
                } else {
                    throw new IOException();
                }
                // Write the end marker.
                lastContentFuture = ctx.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT);
                ;
//            } else {
//                if(multipartFile.byteBuf != null){
//
//                } else if(multipartFile.file != null){
//                    sendFileFuture = ctx.writeAndFlush(new HttpChunkedInput(new ChunkedFile(multipartFile.file)),
//                        ctx.newProgressivePromise());
//                } else {
//                    throw new IOException();
//                }
//                // HttpChunkedInput will write the end marker (LastHttpContent) for us.
//                lastContentFuture = sendFileFuture;
//            }

            sendFileFuture.addListener(new ChannelProgressiveFutureListener() {
                @Override
                public void operationProgressed(ChannelProgressiveFuture future, long progress, long total) {
                }

                @Override
                public void operationComplete(ChannelProgressiveFuture future) {
                    multipartFile.release();
                }
            });

            if(!keepAlive){
                lastContentFuture.addListener(ChannelFutureListener.CLOSE);
            }

        }
        catch (IOException e){
            response.setStatus(NOT_FOUND);
            write(ctx, response, keepAlive);
        }
    }


}
