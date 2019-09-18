package com.github.llyb120.nami.server.aio;

import com.github.llyb120.nami.server.Response;

import java.nio.ByteBuffer;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.TimeUnit;

public class WriteHandler implements CompletionHandler<Integer, ByteBuffer> {

    private AIOResponse response;

    public WriteHandler(AIOResponse response) {
        this.response = response;
    }

    @Override
    public void completed(Integer result, ByteBuffer attachment) {
        try {
            Object item = response.buffers.poll(5, TimeUnit.SECONDS);
            if (item == null || item == Response.EOF) {
                response._close();
                return;
            }
            response.channel.write((ByteBuffer) item, null, this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void failed(Throwable exc, ByteBuffer attachment) {
        exc.printStackTrace();
        response._close();
    }
}
