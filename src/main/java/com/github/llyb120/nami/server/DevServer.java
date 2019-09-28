package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.core.Config;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.channels.Channels;

public class DevServer extends AbstractServer {


    public DevServer(Config.Server server) {
        super(server);
    }

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
        try {
            Response resp = new Response(this, socket);
            Socket _socket = socket;
            resp.channel = Channels.newChannel(_socket.getOutputStream());
            resp.request.channel = Channels.newChannel(_socket.getInputStream());
//            Pipe pipe = Pipe.open();
//            Async.execute(() -> read(resp, pipe));
            readQueue.put(resp);
            analyzeQueue.put(resp);

//            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
//            boolean abort = false;
//            while(!abort && resp.pipe.source().read(byteBuffer) > 0){
//                byteBuffer.flip();
//                abort = resp.request.analyze(byteBuffer);
//                byteBuffer.flip();
//            }
//            System.out.println("fuck");
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
//            resp.request.analyzeEnd();
//            handle(resp);
        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        }
    }

}
