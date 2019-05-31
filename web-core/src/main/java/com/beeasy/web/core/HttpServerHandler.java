package com.beeasy.web.core;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;
//import io.netty.handler.codec.http.cookie.Cookie;
import io.netty.handler.codec.http.cookie.ServerCookieDecoder;
import io.netty.handler.codec.http.multipart.Attribute;
import io.netty.handler.codec.http.multipart.FileUpload;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import io.netty.handler.codec.http.multipart.InterfaceHttpData;
import io.netty.handler.codec.http.websocketx.*;

import java.io.File;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.beeasy.web.core.Config.config;

public class HttpServerHandler extends ChannelInboundHandlerAdapter {
//    private static List<Route> RouteList = new ArrayList<>();

    public static List<Route> ctrls = new ArrayList<>();
    public static Vector<Channel> clients = new Vector<>();
    private WebSocketServerHandshaker handshaker = null;

    private static final String CONNECTION = ("Connection");
    private static final String KEEP_ALIVE = ("keep-alive");
    public static Throwable LastException = null;
    private static Map<String, Pattern> urlRegexs = new HashMap<>();

    //dev-start
    private static final HashMap<Class, Object> clzInstances = new HashMap<>();
    //dev-end

//    public static void AddRoute(Route... routes) {
//        RouteList.addAll(Arrays.asList(routes));
//    }

    public void send(ChannelHandlerContext ctx, int code, Object msg) {
        ctx.writeAndFlush(getResponse(null, code));
    }

    public FullHttpResponse getResponse(Throwable e, int code) {
        R r = R.fail();
        if (e != null) {
            Throwable cause = e;
            do{
                if(cause instanceof RestException){
                    r.errMessage = ((RestException) cause).msg;
                }
            }while((cause = cause.getCause()) != null);
        }
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(r.toString().getBytes(StandardCharsets.UTF_8));
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND, buf);
        if(code == 404){
           response.setStatus(HttpResponseStatus.NOT_FOUND);
        }
        else if(code == 200){
            response.setStatus(HttpResponseStatus.OK);
        }
        response.headers().set("Content-Type", "application/json; charset=utf-8");
        response.headers().set("Content-Length", buf.readableBytes());
        writeCors(response);
        return response;
    }

    public void write(ChannelHandlerContext ctx, FullHttpResponse response, boolean keepAlive) {
        if (!keepAlive) {
            ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
        } else {
            response.headers().set(CONNECTION, KEEP_ALIVE);
            ctx.writeAndFlush(response);
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
        if (uri.equals("/favicon.ico")) {
            ctx.close();
            return;
        }

        if(request.method().equals(HttpMethod.OPTIONS)){
            ctx.writeAndFlush(getResponse(null,200));
            return;
        }

        boolean keepAlive = HttpUtil.isKeepAlive(request);
        String path = URLUtil.getPath(uri);

        //auto build
        if(path.equals("/filechange")){
            var q = decodeQuery(request);
            var f = q.getString("file");
            if(!f.endsWith(".java")){
                return;
            }
            ThreadUtil.execAsync(() -> {
                Compiler.compile(new File(f), "ecj");
            });
//            int d = 1;
//            Compiler.compile()
        }

        String[] arr = path.substring(1).split("\\/");
        route:
        {
            Route route = null;
            for (Route ctrl : ctrls) {
                if (ctrl.match(path)) {
                    route = ctrl;
                    break;
                }
            }
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
            if (context.body instanceof JSONObject) {
                context.params.putAll((JSONObject) context.body);
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
                    Object[] args = Param.AutoWiredParams(request, clz, method, null);
                    if (route.aops != null) {
                        result = doAop(request, loader, route.aops, clz, method, instance, args);
                    } else {
                        result = method.invoke(instance, args);
                    }
                    break;
                }
            }
            FullHttpResponse response = null;
            byte[] responseBytes;
            if (result instanceof String) {
                responseBytes = ((String) result).getBytes(StandardCharsets.UTF_8);
            } else {
                responseBytes = JSON.toJSONString(result, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.PrettyFormat).getBytes(StandardCharsets.UTF_8);
            }
//                int contentLength = responseBytes.length;
            // 构造FullHttpResponse对象，FullHttpResponse包含message body
            ByteBuf buf = Unpooled.wrappedBuffer(responseBytes);
            response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, buf);
            response.headers().set(HttpHeaders.Names.CONTENT_TYPE, "application/json; charset=utf-8");
            response.headers().set(HttpHeaders.Names.CONTENT_LENGTH, buf.readableBytes());
            writeCors(response);
            context.cookie.writeToResponse(response);
//            buf.release();

            write(ctx, response, keepAlive);
            return;
        }

        send(ctx, 404, null);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LastException = cause;
        cause.printStackTrace();
        ctx.writeAndFlush(getResponse(cause,200));
        ctx.close();
    }


    public static JSONObject decodeQuery(FullHttpRequest request) {
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri(), StandardCharsets.UTF_8);
        JSONObject object = new JSONObject();
        decoder.parameters().forEach((k, v) -> object.put(k, v.get(0)));
        return object;
    }

    public static void decodeQuery(FullHttpRequest request, JSONObject query){
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri(), StandardCharsets.UTF_8);
        decoder.parameters().forEach((k, v) -> query.put(k, v.get(0)));
    }

    public static JSONObject decodePost(FullHttpRequest request) {
        JSONObject ret = new JSONObject();
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
        String json = buf.toString(StandardCharsets.UTF_8);
        return (JSON) JSON.parse(json);
    }

    private static void writeCors(FullHttpResponse response){
        if (config.cors == null) {
           return;
        }
        HttpHeaders headers = response.headers();
        headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN, config.cors.origin);
        headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_METHODS, config.cors.method);
        headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_HEADERS, config.cors.headers);
        headers.set(HttpHeaders.Names.ACCESS_CONTROL_ALLOW_CREDENTIALS, config.cors.credentials);
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
            Object[] aopArgs = Param.AutoWiredParams(request, clzAop, methodAop, staticArgs);
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


}
