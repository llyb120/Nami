package com.github.llyb120.nami.core;

import cn.hutool.core.thread.ThreadUtil;
import com.github.llyb120.nami.sqltool.sqltool;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.util.CharsetUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.DBService.sqlManager;

public class Nami {

//    public static ChakraCore chakraCore;

    public static void start(String configPath, Listener listener){
//        disableAccessWarnings();
        Config.init(configPath);
        DBService.start(true, listener);

//        Chakra.start();

        if(config.dev && config.compile.parallel){
//            Compiler.start();
            Compiler.macOsStart();
        }

        //注册基本类
        sqltool.init();

//        if(StrUtil.isNotEmpty(config.chakra)){
//            chakraCore = new ChakraCore();
//            chakraCore.start(true);
////        }

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            var stime = System.currentTimeMillis();

            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {


                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        //将请求和应答消息编码或解码为HTTP消息
                        pipeline.addLast(new HttpServerCodec());
                        //将HTTP消息的多个部分组合成一条完整的HTTP消息
                        pipeline.addLast(new StringDecoder(CharsetUtil.UTF_8));
                        pipeline.addLast(new HttpObjectAggregator(1024 * 1024));
//                        pipeline.addLast(new HttpStaticHandleAdapter());
                        pipeline.addLast(new ChunkedWriteHandler());
                        pipeline.addLast(new HttpServerHandler());

                    }
                });

            ChannelFuture f = b.bind(Config.config.port).sync();
            System.out.printf("boot success takes %d ms\n", System.currentTimeMillis() - stime);
            System.out.println(String.format("port is on %d \n", Config.config.port));
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void test(String config){
        Async.exitWhenError(() -> start(config));
        waitFor(5000, sqlManager);
    }

    public static void test(){
        test("config.json");
    }

    public static void start(String config){
        start(config, null);
    }

    public static void start(){
        start("config.json");
    }

    public static abstract class Listener{
        public void onDBServiceBooted(){}
    }

    public static void waitFor(int maxDelay, Object ...objects){
        var stime = System.currentTimeMillis();
        wait: {
            while(true){
                if(System.currentTimeMillis() - stime >= maxDelay){
                    break wait;
                }
                check:{
                    for (Object object : objects) {
                        if(object == null){
                            break check;
                        }
                    }
                    break wait;
                }
                ThreadUtil.sleep(16);
            }
        }
    }


    @SuppressWarnings("unchecked")
    private static void disableAccessWarnings() {
        try {
            Class unsafeClass = Class.forName("sun.misc.Unsafe");
            Field field = unsafeClass.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object unsafe = field.get(null);

            Method putObjectVolatile = unsafeClass.getDeclaredMethod("putObjectVolatile", Object.class, long.class, Object.class);
            Method staticFieldOffset = unsafeClass.getDeclaredMethod("staticFieldOffset", Field.class);

            Class loggerClass = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field loggerField = loggerClass.getDeclaredField("logger");
            Long offset = (Long) staticFieldOffset.invoke(unsafe, loggerField);
            putObjectVolatile.invoke(unsafe, loggerClass, offset, null);
        } catch (Exception ignored) {
        }
    }

//    public static void registerController(String prefix, String packageName){
//        HttpServerHandler.ctrls.put(prefix, packageName);
//    }
}
