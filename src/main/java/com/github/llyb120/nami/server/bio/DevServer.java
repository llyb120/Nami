package com.github.llyb120.nami.server.bio;

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
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
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
            Async.execute(() -> read(resp, taskList));
            boolean abort = false;
            while (!abort) {
                ByteBuffer byteBuffer = taskList.poll(5, TimeUnit.SECONDS);
                if (byteBuffer == null) {
                    break;
                }
                byteBuffer.flip();
                abort =  resp.request.analyze(byteBuffer);
            }
            resp.request.analyzeEnd();
            handle(resp);
        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        }
    }

    private void read(Response response, BlockingQueue<ByteBuffer> taskList){
        int size = 10;
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


}
