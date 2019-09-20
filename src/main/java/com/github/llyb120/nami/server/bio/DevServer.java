package com.github.llyb120.nami.server.bio;

import cn.hutool.core.io.IoUtil;
import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.server.AbstractServer;
import com.github.llyb120.nami.server.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class DevServer extends AbstractServer {

    public void start(int port) throws Exception {
        long stime = System.currentTimeMillis();
        ServerSocket server = new ServerSocket(port);
        Async.execute(() -> loop(server));
        System.out.printf("boot server on port %d takes %s ms\n\n", port, System.currentTimeMillis() - stime);
    }


    private void loop(ServerSocket server) {
        while (true) {
            try {
                Socket socket = server.accept();
                socket.setTcpNoDelay(true);
                Async.execute(() -> {
                    handle(socket);
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handle(Socket socket) {
        try (
                BIOResponse resp = new BIOResponse(this);
                Socket _socket = socket;
                ){
            resp.channel = Channels.newChannel(_socket.getOutputStream());
            resp.request.channel = Channels.newChannel(_socket.getInputStream());
            LinkedBlockingQueue<ByteBuffer> taskList = new LinkedBlockingQueue<>();
            Pipe pipe = Pipe.open();
            Async.execute(() -> read(resp, pipe));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10);
            boolean abort = false;
            while(!abort && pipe.source().read(byteBuffer) > 0){
                byteBuffer.flip();
                abort = resp.request.analyze(byteBuffer);
                byteBuffer.flip();
                int d = 2;
            }
            System.out.println("fuck");
//            ReadableByteChannel readableByteChannel = pipe.source();
//            boolean abort = false;
//            long stime = System.currentTimeMillis();
//            while (!abort) {
//                ByteBuffer byteBuffer = taskList.poll(5, TimeUnit.SECONDS);
//                if (byteBuffer == null) {
//                    break;
//                }
//                byteBuffer.flip();
//                abort =  resp.request.analyze(byteBuffer);
//                int d = 2;
//            }
//            System.out.println(System.currentTimeMillis() - stime);
            resp.request.analyzeEnd();
            handle(resp);
        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        }
    }

    private void read(Response response, BlockingQueue<ByteBuffer> taskList){
        int size = 409600000;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(size);
                int n = ((ReadableByteChannel) response.request.channel).read(byteBuffer);
                if (n < 1) {
                    break;
                }
                taskList.put(byteBuffer);
            }
        } catch (IOException e) {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void read(Response response, Pipe pipe){
//        int size = 409600000;
        try {
            IoUtil.copy(((ReadableByteChannel) response.request.channel), pipe.sink());
        } catch (Exception e){ }
        System.out.println("copy end");
//        try {
//            while (true) {
//                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(size);
//                int n = ((ReadableByteChannel) response.request.channel).read(byteBuffer);
//                if (n < 1) {
//                    break;
//                }
//                pipe.sink().write(byteBuffer);
//                taskList.put(byteBuffer);
//            }
//        } catch (IOException e) {
//        }
    }


}
