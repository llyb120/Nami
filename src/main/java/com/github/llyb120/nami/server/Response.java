package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Obj;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.Json.o;

public class Response {
    public int status;
    public Request request;
    public Obj headers = o();
    public WritableByteChannel channel;
    public static byte[] CRLF = "\r\n".getBytes();

    private Buffer buffer = new Buffer();

    public Response setOutputStream(OutputStream os){
        channel = Channels.newChannel(os);
        return this;
    }

    public void writeHeaders(int bodyLen) throws IOException {
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
        for (Map.Entry<String, Object> entry : headers.entrySet()) {
            String value = (String) entry.getValue();
            var line = entry.getKey() + ": " + value + "\r\n";
            buffer.writeNio(line);
        }
        buffer.writeNio(CRLF);
        buffer.writeToChannel(channel);
    }

    public void writeObject(Object body) throws IOException {
        byte[] bs;
        if (body instanceof String) {
            bs = ((String) body).getBytes(StandardCharsets.UTF_8);
        } else {
            bs = JSON.toJSONBytes(body, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.PrettyFormat);
        }
        writeHeaders(bs.length);
        buffer.writeNio(bs);
        buffer.writeToChannel(channel);
    }

    public Response write(byte[] bs, int offset, int length) throws IOException {
        buffer.writeNio(bs, offset, length);
        buffer.writeToChannel(channel);
        return this;
    }

    public Response write(byte[] bs) throws IOException {
        return write(bs, 0, bs.length);
    }

    public Response write(byte b) throws IOException {
        buffer.writeNio(b);
        buffer.writeToChannel(channel);
        return this;
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setKeepAlive(boolean b){
        if(b){
            setHeader("Connection", "Keep-Alive");
        } else {
            setHeader("Connection", "Close");
        }
    }

    public void setContentLength(int length) {
        headers.put("Content-Length", length + "");
    }


    public void setFileDescription(MultipartFile multipartFile){
        var fileName = URLUtil.encode(multipartFile.fileName, StandardCharsets.UTF_8);
        setContentType(multipartFile.contentType);
        headers.put("Content-Disposition", "attachment; filename=\"" + fileName + "\"; filename*=utf-8''" + fileName);
//        headers.put(HttpHeaderNames.TRANSFER_ENCODING, HttpHeaderValues.CHUNKED);
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
