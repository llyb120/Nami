package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.util.Util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLEncoder;
import java.nio.channels.Pipe;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.o;
import static com.github.llyb120.nami.server.AbstractServer.CRLF;

public class Response implements AutoCloseable{
    public int status;
    public Request request = new Request();
    public Obj headers = o();
//    public WritableByteChannel channel;
    public OutputStream os;
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
            os.write(sb.toString().getBytes());
//            channel.write(StrUtil.byteBuffer(sb.toString(), StandardCharsets.UTF_8.name()));
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
        Util.close(os);
        Util.close(request);
        Util.close(socket);
        Util.close(sc);
        cl.countDown();
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
        file.transferTo(os);
        return this;
    };

//    {
//        flush();
////        file.transferTo(channel);
//        return this;
//    }

    /**
     * 写后立刻关闭！
     * @throws IOException
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public Response write(String str) throws IOException, ExecutionException, InterruptedException {
        os.write((str.getBytes(StandardCharsets.UTF_8)));
        return this;
    }

//    public Response write(ByteBuffer byteBuffer) throws IOException {
//        channel.write(byteBuffer);
//        return this;
//    }

    public Response write(byte[] bs, int start, int len) throws IOException {
        os.write(bs, start, len);
        return this;
    }

    public Response write(byte[] bs) throws IOException {
        os.write((bs));
        return this;
    }

    public Response write(byte b) throws IOException {
        os.write(b);
        return this;
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
        String fileName = multipartFile.fileName;
        try {
            fileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
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
        if (Util.isNotEmpty(config.cors.origin)) {
            header("Access-Control-Allow-Origin", config.cors.origin);
        }
        if (Util.isNotEmpty(config.cors.method)) {
            header("Access-Control-Allow-Methods", config.cors.method);
        }
        if (Util.isNotEmpty(config.cors.headers)) {
            header("Access-Control-Allow-Headers", config.cors.headers);
        }
        if (Util.isNotEmpty(config.cors.credentials)) {
            header("Access-Control-Allow-Credentials", config.cors.credentials);
        }
    }
}
