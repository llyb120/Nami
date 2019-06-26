package com.github.llyb120.nami.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

public class AsyncServerHandler implements Runnable {
    public CountDownLatch latch;
    public AsynchronousServerSocketChannel channel;
    public AsyncServerHandler(int port) {
        try {
            var stime = System.currentTimeMillis();
            System.out.println("rilegou");
            //创建服务端通道
            channel = AsynchronousServerSocketChannel.open();
            //绑定端口
            channel.bind(new InetSocketAddress(port));
            System.out.println("服务器已启动，端口号：" + port);
            System.out.println(System.currentTimeMillis() - stime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new AsyncServerHandler(8089)).start();
    }

    @Override
    public void run() {
        //CountDownLatch初始化
        //它的作用：在完成一组正在执行的操作之前，允许当前的现场一直阻塞
        //此处，让现场在此阻塞，防止服务端执行完成后退出
        //也可以使用while(true)+sleep
        //生成环境就不需要担心这个问题，以为服务端是不会退出的
        latch = new CountDownLatch(1);
        //用于接收客户端的连接
        channel.accept(this,new AcceptHandler());
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //作为handler接收客户端连接
    public class AcceptHandler implements CompletionHandler<AsynchronousSocketChannel, AsyncServerHandler> {
        @Override
        public void completed(AsynchronousSocketChannel channel, AsyncServerHandler serverHandler) {
            //继续接受其他客户端的请求
//            Server.clientCount++Server;
//            System.out.println("连接的客户端数：" + Server.clientCount);
            serverHandler.channel.accept(serverHandler, this);
            //创建新的Buffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //异步读  第三个参数为接收消息回调的业务Handler
            channel.read(buffer, buffer, new ReadHandler(channel));
        }
        @Override
        public void failed(Throwable exc, AsyncServerHandler serverHandler) {
            exc.printStackTrace();
            serverHandler.latch.countDown();
        }
    }

    public class ReadHandler implements CompletionHandler<Integer, ByteBuffer> {
        //用于读取半包消息和发送应答
        private AsynchronousSocketChannel channel;
        public ReadHandler(AsynchronousSocketChannel channel) {
            this.channel = channel;
        }
        //读取到消息后的处理
        @Override
        public void completed(Integer result, ByteBuffer attachment) {
            //flip操作
            attachment.flip();
            //根据
            byte[] message = new byte[attachment.remaining()];
            attachment.get(message);
            try {
                String expression = new String(message, "UTF-8");
                attachment.flip();
                try {
                    attachment.compact();
                    channel.read(attachment).get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                System.out.println("服务器收到消息: " + expression);
                String calrResult = null;
                try{
                    System.out.println(Thread.currentThread().getName());
                    calrResult = "HTTP/1.1 200 OK\r\n" +
                            "Access-Control-Allow-Origin: *\r\n" +
                            "Access-Control-Allow-Methods: GET,POST,OPTIONS\r\n" +
                            "Access-Control-Allow-Headers: X-Requested-With, Authorization, TOKEN, Content-Type\r\n" +
                            "content-type: application/json; charset=utf-8\r\n" +
                            "content-length: 0\r\n\r\n";
//                    calrResult = Calculator.cal(expression).toString();
                }catch(Exception e){
                    calrResult = "计算错误：" + e.getMessage();
                }
                //向客户端发送消息
                doWrite(calrResult);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        //发送消息
        private void doWrite(String result) {
            byte[] bytes = result.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            //异步写数据 参数与前面的read一样
            channel.write(writeBuffer, writeBuffer,new CompletionHandler<Integer, ByteBuffer>() {
                @Override
                public void completed(Integer result, ByteBuffer buffer) {
                    //如果没有发送完，就继续发送直到完成
                    if (buffer.hasRemaining())
                        channel.write(buffer, buffer, this);
                    else{
                        try {
                            channel.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        //创建新的Buffer
//                        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
//                        异步读  第三个参数为接收消息回调的业务Handler
//                        channel.read(readBuffer, readBuffer, new ReadHandler(channel));
                    }
                }
                @Override
                public void failed(Throwable exc, ByteBuffer attachment) {
                    try {
                        channel.close();
                    } catch (IOException e) {
                    }
                }
            });
        }

        @Override
        public void failed(Throwable exc, ByteBuffer attachment) {
            try {
                this.channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
