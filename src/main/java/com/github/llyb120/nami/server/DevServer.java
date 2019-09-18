package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.Async;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class DevServer extends AbstractServer{

    //这个方法不会被大量并发访问，不太需要考虑效率，直接进行方法同步就行了
    public void start(int port) throws Exception {
        long stime = System.currentTimeMillis();
        ServerSocket server = new ServerSocket(port);
        //通过构造函数创建ServerSocket
        //如果端口合法且空闲，服务端就监听成功
        System.out.printf("boot server on port %d takes %s ms\n\n", port, System.currentTimeMillis() - stime);
        //通过无线循环监听客户端连接
        //如果没有客户端接入，将阻塞在accept操作上。
        Async.execute(() -> loop(server));
    }

    private void loop(ServerSocket server) {
        while (true) {
            Socket socket = null;
            try {
                socket = server.accept();
                Socket finalSocket = socket;
                Async.execute(() -> {
                    handle(finalSocket);
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handle(Socket _socket) {
        try (
                Response resp = new Response();
                ){
//            req.is = is;
            resp.setInputStream(_socket.getInputStream());
            resp.setOutputStream(_socket.getOutputStream());
//            var bs = new byte[1024];
//            is.read(bs);
//            var str = new String(bs);
            resp.request.decode();
//            resp.os = os;
            handle(resp);
        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        } finally {
            if (_socket != null) {
                try {
                    _socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
