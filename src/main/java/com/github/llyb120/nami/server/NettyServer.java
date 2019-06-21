package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.HttpServerHandler;
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


public class NettyServer extends AbstractServer{

    public void start(int port){
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

            ChannelFuture f = b.bind(port).sync();
            System.out.printf("boot server on port %d takes %d ms\n\n", port, System.currentTimeMillis() - stime);
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
