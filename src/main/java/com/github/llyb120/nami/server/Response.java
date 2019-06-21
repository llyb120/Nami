package com.github.llyb120.nami.server;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.llyb120.nami.core.Obj;
import io.netty.handler.codec.http.HttpHeaders;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.Json.o;

public class Response {
    public int status;
    public Request request;
    public Obj headers = o();
    public OutputStream os;

    public void write(Object body) throws IOException {
        enableCors();

        //写入200
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        byte[] bs;
        if (body instanceof String) {
            bs = ((String) body).getBytes(StandardCharsets.UTF_8);
        } else {
            bs = JSON.toJSONBytes(body, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.PrettyFormat);
        }
        setContentLength(bs.length);
        for (Map.Entry<String, Object> entry : headers.entrySet()) {
            String value = (String) entry.getValue();
            os.write((entry.getKey() + ": " + value + "\r\n").getBytes());
        }
        os.write("\r\n".getBytes());
        os.write(bs);
    }

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setContentLength(int length) {
        headers.put("Content-Length", length + "");
    }


    public void enableCors() {
        if (config.cors == null) {
            return;
        }
        if (StrUtil.isNotEmpty(config.cors.origin)) {
            setHeader("Access-Control-Allow-Origin", config.cors.origin);
        }
        if (StrUtil.isNotEmpty(config.cors.method)) {
            setHeader("Access-Control-Allow-Methods", config.cors.method);
        }
        if (StrUtil.isNotEmpty(config.cors.headers)) {
            setHeader("Access-Control-Allow-Origin", config.cors.headers);
        }
        if (StrUtil.isNotEmpty(config.cors.credentials)) {
            setHeader("Access-Control-Allow-Credentials", config.cors.credentials);
        }
    }
}
