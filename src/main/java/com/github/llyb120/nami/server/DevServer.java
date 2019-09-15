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

    private void loop(ServerSocket server) throws IOException {
        while (true) {
            Socket socket = server.accept();
            //当有新的客户端接入时，会执行下面的代码
            //然后创建一个新的线程处理这条Socket链路
            Async.submitCache(() -> {
                handle(socket);
            });
        }
    }

    private void handle(Socket _socket) {
        InputStream is = null;
        OutputStream os = null;
        try (
                Response resp = new Response();
                ){
            is = _socket.getInputStream();
            os = _socket.getOutputStream();
//            req.is = is;
            resp.request.setInputstream(is);
//            var bs = new byte[1024];
//            is.read(bs);
//            var str = new String(bs);
            resp.request.decode();
            resp.setOutputStream(os);
//            resp.os = os;
            handle(resp);
        } catch (Exception e) {
            if(!(e instanceof SocketException)){
                e.printStackTrace();
            }
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
