package com.github.llyb120.nami.core;

import cn.hutool.core.util.StrUtil;
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

import java.nio.charset.Charset;
import  static com.github.llyb120.nami.core.Config.config;

public class Nami {

//    public static ChakraCore chakraCore;

    public static void start(String configPath, Listener listener){
        Config.init(configPath);
        DBService.start(true, listener);

//        Chakra.start();

        if(config.dev && config.compile.parallel){
            Compiler.start();
        }

//        if(StrUtil.isNotEmpty(config.chakra)){
//            chakraCore = new ChakraCore();
//            chakraCore.start(true);
////        }

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        long stime = System.currentTimeMillis();
        try {
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
                        pipeline.addLast(new StringDecoder(Charset.forName("UTF-8")));
                        pipeline.addLast(new HttpObjectAggregator(1024 * 1024));
//                        pipeline.addLast(new HttpStaticHandleAdapter());
                        pipeline.addLast(new ChunkedWriteHandler());
                        pipeline.addLast(new HttpServerHandler());

                    }
                });

            ChannelFuture f = b.bind(Config.config.port).sync();
            System.out.println(String.format("port is on %d", Config.config.port));
            System.out.printf("boot success takes %d ms\n", System.currentTimeMillis() - stime);
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
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

//    public static void registerController(String prefix, String packageName){
//        HttpServerHandler.ctrls.put(prefix, packageName);
//    }
}
