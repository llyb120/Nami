package com.github.llyb120.nami.server;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.json.Json.o;

public class Response implements AutoCloseable{
    public int status;
    public Request request = new Request();
    public Obj headers = o();
    public WritableByteChannel channel;
    public AsynchronousSocketChannel aChannel;
    public static byte[] CRLF = "\r\n".getBytes();

    private Buffer buffer = new Buffer();
//    private LinkedList<ByteBuffer> buffers = new LinkedList<>();
//    private boolean writing = false;

    Response setOutputStream(OutputStream os){
        channel = Channels.newChannel(os);
        return this;
    }

    Response setInputStream(InputStream is){
        request.setInputstream(is);
        return this;
    }

    Response setAsyncChannel(AsynchronousSocketChannel channel){
        aChannel = channel;
        return this;
    }

    Response flush() throws IOException, ExecutionException, InterruptedException {
        if(aChannel != null){
            writeToAsyncChannel();
        } else if(channel != null){
            writeToChannel();
        }
        return this;
    }

    public void close() throws InterruptedException, ExecutionException, IOException {
        if(buffer.length() > 0){
            flush();
        }
        IoUtil.close(aChannel);
        IoUtil.close(channel);
        IoUtil.close(request);
    }

    private void writeToChannel() throws IOException {
        LinkedList<ByteBuffer> bfs = buffer.getNioBuffers();
        for (ByteBuffer bf : bfs) {
            channel.write(bf);
        }
        bfs.clear();
    }

    private void writeToAsyncChannel(){
        LinkedList<ByteBuffer> bfs = buffer.getNioBuffers();
        for (ByteBuffer bf : bfs) {
            try {
                aChannel.write(bf).get();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            } catch (ExecutionException e) {
                //e.printStackTrace();
            }
        }
        bfs.clear();

//        buffers.addAll(bfs);
//        bfs.reset();
//        if(buffers.length() > 0){
//            var bf = buffers.getFirst();
//            if (bf != null) {
//                buffers.removeFirst();
//                aChannel.write(bf, bf, new CompletionHandler<Integer, ByteBuffer>() {
//                    @Override
//                    public void completed(Integer result, ByteBuffer attachment) {
//                        synchronized (Response.this){
//                            var bf = buffers.getFirst();
//                            if (bf != null) {
//                                buffers.removeFirst();
//                                aChannel.write(bf, bf, this);
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void failed(Throwable exc, ByteBuffer attachment) {
//                        try {
//                            aChannel.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                });
//            }
//        }
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

    public Response write(MultipartFile file) throws InterruptedException, ExecutionException, IOException {
        flush();
        if (aChannel != null) {
            file.transferTo(aChannel);
        }  else if (null != channel){
            file.transferTo(channel);
        }
        return this;
    }

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
