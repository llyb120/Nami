package com.github.llyb120.nami.core;

//import io.netty.bootstrap.ServerBootstrap;
//import io.netty.buffer.ByteBuf;
//import io.netty.channel.*;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Chakra {

    private static native void start(String workDir, String fileName);

    public static void start(){
        //判断是否可以加载chakracore
        //必须异步启动
        Async.execute(() -> {
//            System.loadLibrary("chakracore");
            System.loadLibrary("node");
//            System.load("D:\\work\\easyshop\\easy-shop\\node.dll");
            System.out.println("chakracore boot success");
            //启动工作进程
//            ThreadUtil.execAsync(Chakra::startSocketServer);
            start("", "D:\\work\\easyshop\\easy-shop\\js\\1.js");
        });


    }

//    private static void startSocketServer(){
//        EventLoopGroup bossGroup = new NioEventLoopGroup();
//        EventLoopGroup workerGroup = new NioEventLoopGroup();
//        try {
//            ServerBootstrap b = new ServerBootstrap();
//            b.group(bossGroup, workerGroup)
//                .channel(NioServerSocketChannel.class)
//                .childHandler(new ChannelInitializer<SocketChannel>() {
//                    @Override
//                    protected void initChannel(SocketChannel ch) throws Exception {
//                        ch.pipeline()
//                            .addLast(new ChakraSocketServer());
//                    }
//                });
//            ChannelFuture f = b.bind(6380).sync();
////            System.out.println(String.format("port is on %d", Config.config.port));
////            System.out.printf("boot success takes %d ms\n", System.currentTimeMillis() - stime);
//            f.channel().closeFuture().sync();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            workerGroup.shutdownGracefully();
//            bossGroup.shutdownGracefully();
//        }
//
//    }
//
//
//    public static class ChakraSocketServer extends ChannelInboundHandlerAdapter {
//
//
//
//        @Override
//        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//            super.exceptionCaught(ctx, cause);
//        }
//
//
//        @Override
//        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//            ByteBuf byteBuf = (ByteBuf) msg;
//            int len = byteBuf.readInt();
//            System.out.println(byteBuf.readCharSequence(len, StandardCharsets.UTF_8));
////            super.channelRead(ctx, msg);
//        }
//
//    }
}
