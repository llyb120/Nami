package com.github.llyb120.nami.server.aio;

import cn.hutool.socket.aio.AioServer;
import com.github.llyb120.nami.server.Response;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class ReadHandler implements CompletionHandler<Integer, ByteBuffer> {
    private AIOResponse response;

    public ReadHandler(AIOResponse response) {
        this.response = response;
    }

    @Override
    public void completed(Integer result, ByteBuffer attachment) {
            attachment.flip();
            boolean abort = response.request.analyze(attachment);
            if(abort){
                 response.request.analyzeEnd();
                try {
                    response.server.handle(response);
                } catch (Exception e) {
                    e.printStackTrace();
                    response.close();
                }
            } else {
                attachment.flip();
                response.channel.read(attachment, attachment, this);
            }

    }

    @Override
    public void failed(Throwable exc, ByteBuffer attachment) {
        exc.printStackTrace();
        response.close();
    }
}
