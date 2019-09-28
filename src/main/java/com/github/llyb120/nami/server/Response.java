package com.github.llyb120.nami.server;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Obj;

import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

import static cn.hutool.core.util.StrUtil.CRLF;
import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.o;

public class Response implements AutoCloseable{
    public int status;
    public Request request = new Request();
    public Obj headers = o();
    public WritableByteChannel channel;
//    private Buffer buffer = new Buffer();

    volatile boolean closed = false;

    Socket socket;
    SocketChannel sc;
    Pipe pipe;
    AbstractServer server;
    StringBuilder sb = new StringBuilder();
    long stime;
    CountDownLatch cl = new CountDownLatch(1);

    public Response(AbstractServer server, Socket socket) throws IOException {
        pipe = Pipe.open();
        this.socket = socket;
        this.server = server;
        stime = System.currentTimeMillis();
    }

    public Response(AbstractServer server, SocketChannel sc) throws IOException {
        pipe = Pipe.open();
        this.sc = sc;
        this.server = server;
    }

    public Response flush() {
        if(sb.length() == 0){
            return this;
        }
        try {
            channel.write(StrUtil.byteBuffer(sb.toString(), StandardCharsets.UTF_8.name()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sb.setLength(0);
        }
        return this;
    }
//
//    public void flush(Object object){
//        if (object == EOF) {
//            close();
//        } else if (object instanceof ByteBuffer) {
//            try {
//                channel.write((ByteBuffer) object);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public void close(){
        if(closed){
            return;
        }
        closed = true;
        flush();
        IoUtil.close(channel);
        IoUtil.close(request);
        IoUtil.close(socket);
        IoUtil.close(sc);
        cl.countDown();
        System.out.println("fuck" + (System.currentTimeMillis() - stime));
    }

//    public void eof() {
//        flush(EOF);
//    }

    public Response writeHeaders(int bodyLen){
        enableCors();
        setKeepAlive(false);

        //写入200
        sb.append("HTTP/1.1 200 OK");
        sb.append(CRLF);
//        buffer.writeNio("HTTP/1.1 200 OK\r\n");
        if(bodyLen > -1){
            setContentLength(bodyLen);
        }
        if(request.cookie.hasChanged()){
            header("Set-Cookie", request.cookie.toSetCookieString());
        }
        headers.forEach((k,v) -> {
            sb.append(k);
            sb.append(": ");
            sb.append(v);
            sb.append(CRLF);
        });
        sb.append(CRLF);
//        for (Object o : headers.entrySet()) {
//            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) o;
//            String value = (String) entry.getValue();
//            String line = entry.getKey() + ": " + value + "\r\n";
//            buffer.writeNio(line);
//        }
//        buffer.writeNio(CRLF);
        flush();
        return this;
    }

    public Response write(MultipartFile file) throws IOException {
        file.transferTo(channel);
        return this;
    };

//    {
//        flush();
////        file.transferTo(channel);
//        return this;
//    }

    /**
     * 写后立刻关闭！
     * @param body
     * @throws IOException
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public Response write(String str) throws IOException, ExecutionException, InterruptedException {
        channel.write(StrUtil.byteBuffer(str, CharsetUtil.UTF_8));
        return this;
    }

    public Response write(ByteBuffer byteBuffer) throws IOException {
        channel.write(byteBuffer);
        return this;
    }

    public Response write(byte[] bs) throws IOException {
        channel.write(ByteBuffer.wrap(bs));
        return this;
    }

    public Response write(byte b) throws IOException {
        return write(new byte[]{b});
    }




    public void header(String key, String value) {
        headers.put(key, value);
    }

    public void setKeepAlive(boolean b){
        if(b){
            header("Connection", "keep-alive");
        } else {
            header("Connection", "close");
        }
    }

    public void setContentLength(int length) {
        header("Content-Length", length + "");
    }


    public void setFileDescription(MultipartFile multipartFile, boolean download){
        String fileName = URLUtil.encode(multipartFile.fileName, StandardCharsets.UTF_8);
        setContentType(multipartFile.contentType);
        if(download){
            headers.put("Content-Disposition", "attachment; filename=\"" + fileName + "\"; filename*=utf-8''" + fileName);
        }
    }

    public void setChunked(boolean b){
        if(b){
            headers.put("Transfer-Encoding", "chunked");
        }
    }

    public void setContentType(String contentType){
        headers.put("Content-Type", contentType);
    }


    public void enableCors() {
        if (StrUtil.isNotEmpty(config.cors.origin)) {
            header("Access-Control-Allow-Origin", config.cors.origin);
        }
        if (StrUtil.isNotEmpty(config.cors.method)) {
            header("Access-Control-Allow-Methods", config.cors.method);
        }
        if (StrUtil.isNotEmpty(config.cors.headers)) {
            header("Access-Control-Allow-Headers", config.cors.headers);
        }
        if (StrUtil.isNotEmpty(config.cors.credentials)) {
            header("Access-Control-Allow-Credentials", config.cors.credentials);
        }
    }
}
