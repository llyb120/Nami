package com.github.llyb120.nami.server.aio;

import cn.hutool.core.thread.ThreadFactoryBuilder;
import com.github.llyb120.nami.server.AbstractServer;
import com.github.llyb120.nami.server.Response;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;

public class AIOServer extends AbstractServer {

    private AsynchronousServerSocketChannel channel;

    @Override
    public void start(int port) throws Exception {
        long stime = System.currentTimeMillis();
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withFixedThreadPool(//
                16, // 默认线程池大小
                ThreadFactoryBuilder.create().setNamePrefix("Nami-AioServer-").build()//
        );
        channel = AsynchronousServerSocketChannel.open(group);
        channel.bind(new InetSocketAddress(port));
        channel.accept(this, new ConnectHandler(channel));

        System.out.printf("boot server on port %d takes %s ms\n\n", port, System.currentTimeMillis() - stime);

    }

    @Override
    public int directDownloadLength() {
        return 4096;
    }


}
