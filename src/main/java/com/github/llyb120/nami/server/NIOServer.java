package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.core.Config;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NIOServer extends AbstractServer {
    private Selector selector;
    private ServerSocketChannel servChannel;
    private boolean running = true;

    public NIOServer(Config.Server server) {
        super(server);
    }


    @Override
    public void start(int port) throws Exception {
        long stime = System.currentTimeMillis();

        //打开多路复用器
        selector = Selector.open();
        //打开服务器通道
        servChannel = ServerSocketChannel.open();
        //设置服务器通道为非阻塞模式
        servChannel.configureBlocking(false);
        //绑定端口,backlog指队列的容量，提供了容量限制的功能，避免太多客户端占用太多服务器资源
        //serverSocketChannel有一个队列，存放没有来得及处理的客户端,服务器每次accept，就会从队列中去一个元素。
        servChannel.socket().bind(new InetSocketAddress(port), 1024);
        //把服务器通道注册到多路复用器上，并监听阻塞事件
        servChannel.register(selector, SelectionKey.OP_ACCEPT);

        System.out.printf("boot server on port %d takes %s ms\n\n", port, System.currentTimeMillis() - stime);

        Async.execute(this::loop);
    }

    private void loop() {
        while (running) {
            try {
                //多路复用器开始工作（轮询），选择已就绪的通道
                //等待某个通道准备就绪时最多阻塞1秒，若超时则返回。
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> it = selectionKeys.iterator();
                SelectionKey key = null;
                while (it.hasNext()) {
                    key = it.next();
                    it.remove();
//                    Async.execute(() -> {
                    try{
                        handleInput(key);
                    } catch (IOException e){
                        key.cancel();
                        if (key.channel() != null) {
                            key.channel().close();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //多路复用器关闭后，所有注册在上面的Channel和Pipe等资源都会自动去注册并关闭
        //所以不需要重复释放资源
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey key) throws IOException {
        if (!key.isValid()) {
            return;
        }
        if (key.isAcceptable()) {
            //获取服务器通道
            ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
            //执行阻塞方法(等待客户端资源)
            SocketChannel sc = ssc.accept();
            //设置为非阻塞模式
            sc.configureBlocking(false);
            //注册到多路复用器上，并设置为可读状态
            sc.register(selector, SelectionKey.OP_READ);
        }
        if (key.isReadable()) {
            //读取数据
            key.cancel();
            SocketChannel sc = (SocketChannel) key.channel();
            Async.execute(() -> handle(sc));
        }
    }

    private void handle(SocketChannel sc) {
        try {
            sc.setOption(StandardSocketOptions.TCP_NODELAY, true);
            Response resp = new Response(this, sc);
            resp.os = Channels.newOutputStream(sc);
            resp.request.is= Channels.newInputStream(sc);
            handle(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
