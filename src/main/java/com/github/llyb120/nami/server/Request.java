package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.github.llyb120.nami.core.Cookie;
import com.github.llyb120.nami.core.Json;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Obj;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.github.llyb120.nami.core.Json.o;

public class Request {
    public Obj headers = o();
    public Obj query = o();
    public Obj params = o();
    public Method method = null;
    public String path;
    public String version;
    public InputStream is;
    public ReadableByteChannel channel;
    public JSON body;
    public Cookie cookie;

    private ByteBuff buf = new ByteBuff();
    private Buffer buffer = new Buffer();

    enum Method {
        GET,
        POST,
        OPTIONS,
        HEAD,
        DELETE
    }

    public void setInputstream(InputStream is){
        channel = Channels.newChannel(is);
    }

    private Obj decodeQuery(String query) {
        var ret = o();
        var qs = query + "&";
        qs = URLUtil.decode(qs);
        var len = qs.length();
        var ptr = 0;
        var key = "";
        var value = "";
        //0 - readkey
        //1 - readvalue
        var mode = 0;
        var sb = new StringBuilder();
        while (ptr < len) {
            var ch = qs.charAt(ptr);
            switch (ch) {
                case '=':
                    if (mode == 0) {
                        key = sb.toString();
                        sb.setLength(0);
                        mode = 1;
                    } else {
                        sb.append(ch);
                    }
                    break;

                case '&':
                    //如果直接被终结了,类似?aaa&
                    if (mode == 0) {
                        key = sb.toString();
                    } else {
                        mode = 0;
                        value = sb.toString();
                    }
                    //无论如何,都要清空缓冲
                    sb.setLength(0);
                    if (key.isEmpty()) {
                        break;
                    }
                    ret.put(key, value);
                    key = "";
                    value = "";
                    break;

                default:
                    sb.append(ch);
                    break;
            }
            ptr++;
        }
        return ret;
    }

    /**
     * 解析query
     *
     * @param path
     */
    private void decodePath(String path) {
        var qmark = path.indexOf("?");
        if (qmark == -1) {
            this.path = path;
        } else {
            this.path = path.substring(0, qmark);
            var obj = decodeQuery(path.substring(qmark + 1));
            this.query.putAll(obj);
        }
    }

    public void decode() throws Exception {
//        dis = new DataInputStream(is);

        //解析头
//        var surplus = decodeHeaders2();
        decodeHeaders3();
        params.putAll(query);

        //解析body
        if (method != Method.POST) {
            return;
        }
        //header的解析器有可能多读了一部分数据

        var ctype = getHeader("Content-Type");
        if (ctype.contains("application/x-www-form-urlencoded")) {
            decodeFormEncoded();
        } else if (ctype.contains("application/json")) {
            decodeJsonEncoded();
        } else if (ctype.contains("multipart/form-data")){
            decodeFormDataEncoded(ctype);
        }

        if(body instanceof Map){
            params.putAll((Map) body);
        }
    }

    private String[] getFormDataKV(String str){
        var eq = str.indexOf("=");
        var left = str.substring(0, eq);
        var right = str.substring(eq + 1);
        var first = right.indexOf("\"");
        var last = right.lastIndexOf("\"");
        var key = right.substring(first + 1, last);
        return new String[]{left, key};
    }


    private void decodeFormDataEncoded(String ctype){
        var ret = o();
        var clen = getContentLength();
        var idex = ctype.indexOf("boundary=");
        if(idex == -1){
            return;
        }
        var token = ctype.substring(idex + 9);
        var start = "--" + token;
        var end = "--" + token + "--";
        var line = "";
        var limit = ("\r\n" + start).getBytes();

//        buf.blockStream(is, clen, true);

        //部分请求可能会多一个\r\n
//        if(line.equals("")){
//             line = buf.readLineStr(is, StandardCharsets.UTF_8);
//        }
        scan: while(clen > 0) {
            while ((line = buffer.readLineStr()) != null) {
                if (line.equals(start)) {
                    File temp = null;
                    String name = "";
                    Object value = null;
                    scan2:{
                        while(clen > 0){
                            while ((line = buffer.readLineStr()) != null) {
                                if (line.isEmpty()) {
                                    break scan2;
                                }
                                //start
                                var arr = line.split("; ");
                                for (int i = 0; i < arr.length; i++) {
                                    if (i > 0) {
                                        var strs = getFormDataKV(arr[i]);
                                        switch (strs[0]) {
                                            case "name":
                                                name = strs[1];
                                                break;

                                            case "filename":
                                                try {
                                                    temp = File.createTempFile("nami", "nami");
                                                    value = new MultipartFile(strs[1], temp, true);
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                                break;
                                        }
                                    } else {

                                    }
                                }
                            }
                        }

                        var n = buffer.writeOnce(channel, Math.min(1024, clen));
                        clen -= n;
                    }


                    //读取value
                    if (temp == null) {
                        try (
                                var sw = new ByteArrayOutputStream();
                        ) {
                            buf.copyUntil(is, sw, limit);
                            value = sw.toString(StandardCharsets.UTF_8);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try (
                                var fos = new FileOutputStream(temp);
                        ) {
//                        var sw = new ByteArrayOutputStream();
//                        buf.copyUntil(is, sw, limit);
//                        var e=  2;
                            buf.copyUntil(is, fos, limit);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    //skip \r\n
                    buf.readNBytes(2);

                    ret.put(name, value);
                    //
                } else if (line.equals(end)) {
                    //end
                    break scan;
                }
            }
            var n = buffer.writeOnce(channel, Math.min(1024, clen));
            clen -= n;
        }

        body = ret;
    }

    private void decodeJsonEncoded() throws IOException {
        buffer.writeOnce(channel, getContentLength() - buffer.length());
        body = Json.parse(buffer.readBytes());
    }

    private void decodeFormEncoded() throws IOException {
        buffer.writeOnce(channel, getContentLength() - buffer.length());
        var str = new String(buffer.readBytes(), StandardCharsets.UTF_8);
        body = decodeQuery(str);
    }

    private int getContentLength(){
        return headers.getInt("Content-Length", headers.getInt("content-length", 0));
    }
    private String getContentType(){
        return getHeader("Content-Type");
    }


    private void decodeHeader(String line, int idex) {
        var i = line.lastIndexOf("\r\n");
        if(i > -1){
            line = line.substring(0, i);
        }
        if (idex == 0) {
            var arr = line.split("\\s+");
            if (arr.length < 3) {
                throw new RuntimeException();
            }
            method = Request.Method.valueOf(arr[0]);
            version = arr[2];
            decodePath(arr[1]);
        } else {
            var comma = line.indexOf(":");
            var key = line.substring(0, comma);
            String value;
            if (line.charAt(comma + 1) == ' ') {
                value = line.substring(comma + 2);
            } else {
                value = line.substring(comma + 1);
            }
            headers.put(key, value);
        }
    }

    private void decodeHeaders3(){
        var i = 0;
        String line = null;
        scan: do{
            while((line = buffer.readLineStr()) != null){
                if(line.isEmpty()){
                    break scan;
                }
                System.out.println(line);
                decodeHeader(line, i++);
            }
            buffer.writeOnce(channel);
        } while(true);
    }

    /**
     * cookie解析器
     */
    private void decodeCookies(){

    }

    /**
     * 半包解码, 解析请求头
     *
     * @throws Exception
     */
    private byte[] decodeHeaders() throws Exception {
        var step = 4096;
        var max = step;
        var bs = new byte[max];
        var readleft = 0;
        var left = 0;
        var idex = 0;
        read:
        {
            while (true) {
                var n = is.read(bs, readleft, bs.length - readleft);
                if (n <= 0) {
                    break;
                }
                int len = readleft + n;
                for (int i = readleft + 1; i < len; i++) {
                    if (bs[i - 1] == '\r' && bs[i] == '\n') {
                        //截取出left到当前的
                        var str = new String(bs, left, i - left - 1);
                        //将指针指向当前
                        left = i + 1;
                        readleft = 0;
//                        System.out.println(str);
                        //header读完
                        if (str.equals("")) {
                            var nbs = new byte[len - left];
                            System.arraycopy(bs, left, nbs, 0, nbs.length);
                            return nbs;
                        } else {
                            decodeHeader(str, idex++);
                        }
                    }
                }
                //如果取完了, left还是0, 表示还有数据包没有读完
                //如果还有剩余
                if (left < n) {
                    //扩容
                    if (max > 1024 * 1024 * 8) {
                        max *= 2;
                    } else {
                        max += step;
                    }
                    var nbs = new byte[max];
                    System.arraycopy(bs, 0, nbs, 0, bs.length);
                    readleft = bs.length;
                    bs = nbs;
                } else {
                    left = 0;
                }
            }
        }
        return null;
    }


    /**
     * 清理
     */
    public void release(){
        //清理request
        ((Map) params).forEach((k,v) -> {
            if(v instanceof MultipartFile){
                ((MultipartFile) v).release();
            }
        });
    }

    /**
     * 无脑取值
     * @param name
     * @param type
     * @return
     */
    public <T> T getParam(String name, Class<T> type) {
        try {
            return params.getObject(name, type);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 得到单一的header
     * 如果取不到的话，则用小写重新取
     * @param key
     * @return
     */
    public String getHeader(String key){
        var val =  headers.getStr(key, "");
        if(val.isEmpty()){
            val = headers.getStr(key.toLowerCase(), "");
        }
        return val;
    }


}
