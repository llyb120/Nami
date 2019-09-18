package com.github.llyb120.nami.server.aio;

import cn.hutool.socket.aio.AioServer;
import com.github.llyb120.nami.server.Response;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.WeakHashMap;

public class ConnectHandler implements CompletionHandler<AsynchronousSocketChannel, AIOServer> {

    private AsynchronousServerSocketChannel sch;

    public ConnectHandler(AsynchronousServerSocketChannel sch){
        this.sch = sch;
    }

    @Override
    public void completed(AsynchronousSocketChannel ch, AIOServer attachment) {
        sch.accept(attachment, this);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
        AIOResponse response = new AIOResponse(attachment);
        response.channel = ch;
        ch.read(byteBuffer, byteBuffer, response.readHandler);
    }

    @Override
    public void failed(Throwable exc, AIOServer attachment) {
        exc.printStackTrace();
    }
}
