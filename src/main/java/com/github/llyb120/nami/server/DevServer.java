package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.util.Util;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.Future;

import static com.github.llyb120.nami.log.Log.info;

public class DevServer extends AbstractServer {

    private Future running = null;
    private ServerSocket server;

    public DevServer(String[] packages) {
        super(packages);
    }

    public void start(int port) throws Exception {
        long stime = System.currentTimeMillis();
        server = new ServerSocket(port);
        running = Async.execute(() -> loop(server));
        info("boot server on port %d takes %s ms", port, System.currentTimeMillis() - stime);
    }

    @Override
    public void shutdown() {
        running.cancel(true);
        Util.close(server);
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
            resp.os = socket.getOutputStream();
            resp.request.is = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            handle(resp);
//            Async.execute(() -> read(resp));
//            Async.execute(() -> analyze(resp));

        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        }
    }

}
