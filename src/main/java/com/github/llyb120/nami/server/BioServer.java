package com.github.llyb120.nami.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {
    private static int DEFAULT_PORT = 12345;
    //单例的ServerSocket
    private static ServerSocket server;
    //根据传入参数设置监听端口，如果没有参数调用以下方法并使用默认值

    public static void main(String[] args) throws IOException {
        start();
    }
    public static void start() throws IOException{
        //使用默认值
        start(DEFAULT_PORT);
    }
    //这个方法不会被大量并发访问，不太需要考虑效率，直接进行方法同步就行了
    public synchronized static void start(int port) throws IOException {
        if(server != null) return;
        try{
            //通过构造函数创建ServerSocket
            //如果端口合法且空闲，服务端就监听成功
            var stime = System.currentTimeMillis();
            server = new ServerSocket(port);
            System.out.println(System.currentTimeMillis() - stime);
            System.out.println("服务器已启动，端口号：" + port);
            Socket socket;
            //通过无线循环监听客户端连接
            //如果没有客户端接入，将阻塞在accept操作上。
            while(true){
                socket = server.accept();
                //当有新的客户端接入时，会执行下面的代码
                //然后创建一个新的线程处理这条Socket链路
                new Thread(new ServerHandler(socket)).start();
            }
        }finally{
            //一些必要的清理工作
            if(server != null){
                System.out.println("服务器已关闭。");
                server.close();
                server = null;
            }
        }
    }


    public static class ServerHandler implements Runnable{
        private Socket socket;
        public ServerHandler(Socket socket) {
            this.socket = socket;
        }
        @Override
        public void run() {
            BufferedReader in = null;
            PrintWriter out = null;
            try{
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(),true);
                String expression;
                String result;
                while(true){
                    //通过BufferedReader读取一行
                    //如果已经读到输入流尾部，返回null,退出循环
                    //如果得到非空值，就尝试计算结果并返回
                    if((expression = in.readLine())==null) break;
                    System.out.println("服务器收到消息：" + expression);
                    try{
                        result = "fuck";
//                        result = Calculator.cal(expression).toString();
                    }catch(Exception e){
                        result = "计算错误：" + e.getMessage();
                    }
                    out.println(result);
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                //一些必要的清理工作
                if(in != null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    in = null;
                }
                if(out != null){
                    out.close();
                    out = null;
                }
                if(socket != null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    socket = null;
                }
            }
        }
    }
}
