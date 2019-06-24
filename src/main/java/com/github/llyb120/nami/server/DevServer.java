package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.core.Context;
import com.github.llyb120.nami.core.R;
import com.github.llyb120.nami.core.Route;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class DevServer extends AbstractServer{

    //这个方法不会被大量并发访问，不太需要考虑效率，直接进行方法同步就行了
    public void start(int port) throws Exception {
        var stime = System.currentTimeMillis();
        ServerSocket server = new ServerSocket(port);
        //通过构造函数创建ServerSocket
        //如果端口合法且空闲，服务端就监听成功
        System.out.printf("boot server on port %d takes %s ms\n\n", port, System.currentTimeMillis() - stime);
        //通过无线循环监听客户端连接
        //如果没有客户端接入，将阻塞在accept操作上。
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
        var req = new Request();
        var resp = new Response();
        InputStream is = null;
        OutputStream os = null;
        try {
            is = _socket.getInputStream();
            os = _socket.getOutputStream();
            req.is = is;
            req.decode();
            resp.os = os;
            handle(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
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