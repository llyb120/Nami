package com.github.llyb120.nami.server;

import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AIOServer extends AbstractServer {

    private AsynchronousServerSocketChannel channel;
//    private AioServer aioServer;

    @Override
    public void start(int port, boolean async) throws Exception {
//        aioServer = new AioServer(port);
//        aioServer.setIoAction(new IoAction<ByteBuffer>() {
//            Response response = new Response();
//            {
//                Request request = new Request();
//                response.request = request;
//            }
//
//            @Override
//            public void accept(AioSession aioSession) {
//            }
//
//            @Override
//            public void doAction(AioSession aioSession, ByteBuffer byteBuffer) {
//                try {
//                    response.request.decodeOnce(byteBuffer, false);
//                    if(response.request.hasRemaining()){
//                        aioSession.read();
//                    } else {
//                        //end
//                        var buf = ByteBuffer.allocateDirect(4096);
//                        buf.set("HTTP/1.1 200 OK\r\n\r\n".getBytes());
//
//                        aioSession.writeAndClose(buf.flip());
//                    }
//                } catch (IOException e) {
//                    throw new RuntimeException();
//                }
//
////                aioSession.read();
////                aioSession.read(new CompletionHandler<Integer, AioSession>() {
////                    @Override
////                    public void completed(Integer result, AioSession attachment) {
////                        if(result > 0){
////                            var buf =
////                            attachment.getReadBuffer();
//////                            buf.flip();
////                            var bs = new byte[4096];
////                            buf.g(bs);
////                            System.out.println(new String(bs));
////                        } else {
////
////                        }
////                    }
////
////                    @Override
////                    public void failed(Throwable exc, AioSession attachment) {
////
////                    }
////                });
//            }
//
//            @Override
//            public void failed(Throwable throwable, AioSession aioSession) {
//                throwable.printStackTrace();
//                aioSession.close();
//            }
//        });
//        aioServer.start(false);
////        if(true){
////            return;
////        }
//
        long stime = System.currentTimeMillis();
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withFixedThreadPool(//
                16, // 默认线程池大小
                ThreadFactoryBuilder.create().setNamePrefix("Nami-AioServer-").build()//
        );
        channel = AsynchronousServerSocketChannel.open(group);
        channel.bind(new InetSocketAddress(port));
        channel.accept(this, new CompletionHandler<AsynchronousSocketChannel, AIOServer>() {
            @Override
            public void completed(AsynchronousSocketChannel ch, AIOServer attachment) {
                channel.accept(attachment, this);
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
                ch.read(byteBuffer, byteBuffer, new ReadHandler(ch));
            }

            @Override
            public void failed(Throwable exc, AIOServer attachment) {
                exc.printStackTrace();
            }
        });
        System.out.printf("boot server on port %d takes %s ms\n\n", port, System.currentTimeMillis() - stime);
        if (!async) {
            synchronized (this) {
                this.wait();
            }
        }
    }

    public class ReadHandler implements CompletionHandler<Integer, ByteBuffer> {
        private AsynchronousSocketChannel sch;
        private Response response = new Response();

        public ReadHandler(AsynchronousSocketChannel sch) {
            this.sch = sch;
            response.setAsyncChannel(sch);
        }

        @Override
        public void completed(Integer result, ByteBuffer attachment) {
            try {
                if (result > 0) {
                    //写入解析
                    response.request.decodeOnce((ByteBuffer)attachment.flip(), true);
                }
                if (response.request.hasRemaining()) {
                    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
                    sch.read(byteBuffer, byteBuffer, this);
                } else {
                    response.request.decodeEnd();
                    handle(response);
                    sch.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void failed(Throwable exc, ByteBuffer attachment) {
            exc.printStackTrace();
            try {
                sch.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
