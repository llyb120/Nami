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
            resp.channel = Channels.newChannel((socket.getOutputStream()));
            resp.request.channel = Channels.newChannel((socket.getInputStream()));
            Async.execute(() -> read(resp));
            Async.execute(() -> analyze(resp));
        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        }
    }

}
