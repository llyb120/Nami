package com.github.llyb120.nami.server;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.aaa;
import static com.github.llyb120.nami.json.Json.o;

public class Response implements AutoCloseable{
    public int status;
    public Request request = new Request();
    public Obj headers = o();
    public WritableByteChannel channel;
    public static final byte[] CRLF = "\r\n".getBytes();
    private Buffer buffer = new Buffer();

    private boolean closed = false;
    public static final Object EOF = new Object();

    Socket socket;
    SocketChannel sc;
    Pipe pipe;
    AbstractServer server;

    public Response(AbstractServer server, Socket socket) throws IOException {
        pipe = Pipe.open();
        this.socket = socket;
        this.server = server;
    }

    public Response(AbstractServer server, SocketChannel sc) throws IOException {
        pipe = Pipe.open();
        this.sc = sc;
        this.server = server;
    }

    public Response flush() {
        Arr bfs = aaa(buffer.getNioBuffers());
        buffer.getNioBuffers().clear();
        for (Object bf : bfs) {
            flush(bf);
        }
        return this;
    }

    public void flush(Object object){
        if (object == EOF) {
            close();
        } else if (object instanceof ByteBuffer) {
            try {
                channel.write((ByteBuffer) object);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void close(){
        if(closed){
            return;
        }
        flush();
        closed = true;
        IoUtil.close(channel);
        IoUtil.close(request);
        IoUtil.close(socket);
        IoUtil.close(sc);
    }

    public void eof() {
        flush(EOF);
    }

    public void writeHeaders(int bodyLen) throws IOException, ExecutionException, InterruptedException {
        enableCors();
        setKeepAlive(false);

        //写入200
        buffer.writeNio("HTTP/1.1 200 OK\r\n");
        if(bodyLen > -1){
            setContentLength(bodyLen);
        }
        if(request.cookie.hasChanged()){
            headers.put("Set-Cookie", request.cookie.toSetCookieString());
        }
        for (Object o : headers.entrySet()) {
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) o;
            String value = (String) entry.getValue();
            String line = entry.getKey() + ": " + value + "\r\n";
            buffer.writeNio(line);
        }
        buffer.writeNio(CRLF);
    }

    public Response write(MultipartFile file) throws IOException {
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
    public void writeObject(Object body) throws IOException, ExecutionException, InterruptedException {
        byte[] bs;
        if (body instanceof String) {
            bs = ((String) body).getBytes(StandardCharsets.UTF_8);
        } else {
            bs = Json.stringify(body).getBytes(StandardCharsets.UTF_8);
//            bs = JSON.toJSONBytes(body, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.PrettyFormat);
        }
        writeHeaders(bs.length);
        buffer.writeNio(bs);
    }


    public Response write(ByteBuffer buffers){
        buffer.writeNio(buffers);
        return this;
    }

    public Response write(byte[] bs, int offset, int length) throws IOException, ExecutionException, InterruptedException {
        buffer.writeNio(bs, offset, length);
        return this;
    }

    public Response write(byte[] bs) throws IOException, ExecutionException, InterruptedException {
        return write(bs, 0, bs.length);
    }

    public Response write(byte b) throws IOException, ExecutionException, InterruptedException {
        buffer.writeNio(b);
        return this;
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setKeepAlive(boolean b){
        if(b){
            setHeader("Connection", "keep-alive");
        } else {
            setHeader("Connection", "close");
        }
    }

    public void setContentLength(int length) {
        headers.put("Content-Length", length + "");
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
            setHeader("Access-Control-Allow-Origin", config.cors.origin);
        }
        if (StrUtil.isNotEmpty(config.cors.method)) {
            setHeader("Access-Control-Allow-Methods", config.cors.method);
        }
        if (StrUtil.isNotEmpty(config.cors.headers)) {
            setHeader("Access-Control-Allow-Headers", config.cors.headers);
        }
        if (StrUtil.isNotEmpty(config.cors.credentials)) {
            setHeader("Access-Control-Allow-Credentials", config.cors.credentials);
        }
    }
}
