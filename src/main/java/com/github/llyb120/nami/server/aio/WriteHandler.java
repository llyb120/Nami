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
        Object item = null;
        try {
            item = response.buffers.poll(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (item == null || item == Response.EOF) {
            response.close();
            return;
        }
        response.channel.write((ByteBuffer) item, null, this);
    }

    @Override
    public void failed(Throwable exc, ByteBuffer attachment) {
        exc.printStackTrace();
        response.close();
    }
}
