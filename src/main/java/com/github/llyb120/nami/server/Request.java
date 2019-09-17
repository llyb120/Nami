package com.github.llyb120.nami.server;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.URLUtil;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.github.llyb120.nami.json.Json.o;
import static com.github.llyb120.nami.server.Response.CRLF;

public class Request implements AutoCloseable{
    public Obj headers = o();
    public Obj query = o();
    public Obj params = o();
    public Method method = null;
    public String path;
    public String version;
//    public InputStream is;
    public ReadableByteChannel channel;
    public Json body;
    public Cookie cookie = new Cookie();


    private Buffer buffer = new Buffer();
    public boolean headerDecoded = false;
    private int currentBodyLength = 0;
    private FormDataTemp temp;

    @Override
    public void close() throws Exception {
        IoUtil.close(channel);
        params.forEach((k, v) -> {
            IoUtil.closeIfPosible(v);
        });
    }

    enum Method {
        GET,
        POST,
        OPTIONS,
        HEAD,
        DELETE
    }

    enum FormDataStep {
        //等待读出头
        WAIT_FOR_START,
        WAIT_FOR_READ_PROPERTY,
        WAIT_FOR_END,
        WAIT_FOR_READ_VALUE,
        ;
    }

    static class FormDataTemp {
        String start = null;
        String end = null;
        byte[] limit = null;
        FormDataStep step;
        OutputStream tempOs;
        String name;
        MultipartFile file;

        public void release() {
            if (tempOs != null) {
                try {
                    tempOs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            name = null;
            file = null;
            tempOs = null;
            step = FormDataStep.WAIT_FOR_START;
        }
    }

    public void setInputstream(InputStream is) {
        channel = Channels.newChannel(is);
    }

    private Json decodeQuery(String query, Obj ret) {
        String qs = query + "&";
        qs = URLUtil.decode(URLUtil.decode(qs));
        int len = qs.length();
        int ptr = 0;
        String key = "";
        String value = "";
        //0 - readkey
        //1 - readvalue
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        while (ptr < len) {
            char ch = qs.charAt(ptr);
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
        int qmark = path.indexOf("?");
        if (qmark == -1) {
            this.path = path;
        } else {
            this.path = path.substring(0, qmark);
            decodeQuery(path.substring(qmark + 1), this.query);
        }
    }

    /**
     * 每次数据进来的时候解析一次
     */
    public void decodeOnce() throws IOException {
        decodeOnce(null, true);
    }
    public void decodeOnce(ByteBuffer byteBuffer) throws IOException {
        decodeOnce(byteBuffer, true);
    }
    public void decodeOnce(ByteBuffer byteBuffer, boolean direct) throws IOException {
        if (byteBuffer != null) {
//            byteBuffer.flip();
            currentBodyLength += byteBuffer.remaining();
            if(direct){
                buffer.writeNio(byteBuffer);
            } else {
                buffer.write(byteBuffer);
            }
        }
        String line = null;
        if (!headerDecoded) {
            while ((line = buffer.readLineStr()) != null) {
                //关键：需要扣除掉头的长度
                currentBodyLength -= (line.length() + 2);
                if (line.isEmpty()) {
                    headerDecoded = true;
                    break;
                }
                decodeHeader(line);
            }
        }
        if (headerDecoded) {
            if (method == Method.GET) {
                return;
            }

            int clen = getContentLength();
            if (clen < 1) {
                return;
            }
            String ctype = getContentType();
            if (ctype.contains("multipart/form-data")) {
                decodeFormDataOnce();
            } else if (clen == buffer.length()) {
                smartDecodeBody();
//                if (ctype.contains("application/x-www-form-urlencoded")) {
//                    decodeFormEncoded();
//                } else if (ctype.contains("application/json")) {
//                    decodeJsonEncoded();
//                } else {
//                    //尝试判断
//                    smar
//                }
            }
        }
    }

    public void decodeEnd() throws IOException {
        //如果body还有剩余，则继续解析
        if (getContentType().contains("multipart/form-data")) {
            //如果一直没有变动，就当作解析失败
            //补充\r\n
            buffer.writeNio(CRLF);
            while (buffer.length() > 0) {
                decodeOnce(null);
            }
        }

        //解析头
//        var surplus = decodeHeaders2();
//        decodeHeaders3();
//        $g.reset();
//        $post.reset();
//        $request.reset();

        params.putAll(query);
        if(null != body){
            if(body instanceof Map){
                params.putAll((Map<? extends String, ?>) body);
            }
        }
    }

    public boolean hasRemaining(){
        return !headerDecoded || currentBodyLength < getContentLength();
    }

    public void decode() throws Exception {
        int size = 4096;
        while (hasRemaining()) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(size);
//            byteBuffer.reset();
            int n = channel.read(byteBuffer);
            if (n < 1) {
                break;
            }
            byteBuffer.flip();
            decodeOnce(byteBuffer);
        }


        decodeEnd();

        //解析body
//        if (method != Method.POST) {
//            return;
//        }
//        //header的解析器有可能多读了一部分数据
//
//        var ctype = getHeader("Content-Type");
//        if (ctype.contains("application/x-www-form-urlencoded")) {
//            decodeFormEncoded();
//        } else if (ctype.contains("application/json")) {
//            decodeJsonEncoded();
//        } else if (ctype.contains("multipart/form-data")) {
//            decodeFormDataEncoded(ctype);
//        }
//
//        if (body instanceof Map) {
//            params.concat((Map) body);
//        }
    }

    private String[] getFormDataKV(String str) {
        int eq = str.indexOf("=");
        String left = str.substring(0, eq);
        String right = str.substring(eq + 1);
        int first = right.indexOf("\"");
        int last = right.lastIndexOf("\"");
        String key = right.substring(first + 1, last);
        return new String[]{left, key};
    }

    private void decodeFormDataOnce() throws IOException {
        if (temp == null) {
            temp = new FormDataTemp();
        }
        if (body == null) {
            body = o();
        }
        if (temp.start == null) {
            String ctype = getContentType();
            int idex = ctype.indexOf("boundary=");
            if (idex == -1) {
                return;
            }
            String token = ctype.substring(idex + 9);
            temp.start = ("--" + token);
            temp.end = ("--" + token + "--");
            temp.limit = ("\r\n" + temp.start).getBytes();
            temp.step = FormDataStep.WAIT_FOR_START;
        }
        if (temp.step != FormDataStep.WAIT_FOR_READ_VALUE) {
            String line = null;
            scan:
            while ((line = buffer.readLineStr()) != null) {
                switch (temp.step) {
                    case WAIT_FOR_START:
                        if (line.equals(temp.start)) {
                            temp.step = FormDataStep.WAIT_FOR_READ_PROPERTY;
                        } else if (line.equals(temp.end)) {
                            return;
                        }
                        break;

                    case WAIT_FOR_READ_PROPERTY:
                        if (line.isEmpty()) {
                            temp.step = FormDataStep.WAIT_FOR_READ_VALUE;
                            break scan;
                        }
                        //todo: 需要解析不正确的情况, 增加容错处理
                        String[] Json = line.split("; ");
                        for (int i = 0; i < Json.length; i++) {
                            if (i > 0) {
                                String[] strs = getFormDataKV(Json[i]);
                                switch (strs[0]) {
                                    case "name":
                                        temp.name = strs[1];
                                        break;

                                    case "filename":
                                        File file = File.createTempFile("nami", "nami");
                                        temp.file = new MultipartFile(strs[1], file, true);
                                        temp.tempOs = new FileOutputStream(file);
                                        break;
                                }
                            }
                        }
                        break;

                    case WAIT_FOR_END:
                        if (line.equals(temp.end)) {
                            temp.step = FormDataStep.WAIT_FOR_START;
                        }
                        break;
                }
            }
        } else {
            //读取value
            if (temp.tempOs == null) {
                temp.tempOs = new ByteArrayOutputStream();
            }
            int i = buffer.indexOf(temp.limit);
            if (i > -1) {
                byte[] bs = buffer.readNBytes(i);
                if (bs != null) {
                    temp.tempOs.write(bs);
                }
                if (temp.tempOs instanceof ByteArrayOutputStream) {
                    ((Obj) body).put(temp.name, ((ByteArrayOutputStream) temp.tempOs).toString(StandardCharsets.UTF_8.name()));
                } else if (temp.tempOs instanceof FileOutputStream) {
                    ((Obj) body).put(temp.name, temp.file);
                }
                buffer.readNBytes(2);
                temp.release();
            } else {
                byte[] bs = buffer.readBytes();
                if (bs != null) {
                    temp.tempOs.write(bs);
                }
            }
        }

    }

//    private void decodeFormDataEncoded(String ctype) {
//        var ret = o();
//        var clen = getContentLength();
//        var idex = ctype.indexOf("boundary=");
//        if (idex == -1) {
//            return;
//        }
//        var token = ctype.substring(idex + 9);
//        var start = "--" + token;
//        var end = "--" + token + "--";
//        var line = "";
//        var limit = ("\r\n" + start).getBytes();
//
////        buf.blockStream(is, clen, true);
//
//        //部分请求可能会多一个\r\n
////        if(line.equals("")){
////             line = buf.readLineStr(is, StandardCharsets.UTF_8);
////        }
//        scan:
//        while (clen > 0) {
//            while ((line = buffer.readLineStr()) != null) {
//                if (line.equals(start)) {
//                    File temp = null;
//                    String name = "";
//                    Object value = null;
//                    scan2:
//                    {
//                        while (clen > 0) {
//                            while ((line = buffer.readLineStr()) != null) {
//                                if (line.isEmpty()) {
//                                    break scan2;
//                                }
//                                //start
//                                var Json = line.split("; ");
//                                for (int i = 0; i < Json.length; i++) {
//                                    if (i > 0) {
//                                        var strs = getFormDataKV(Json[i]);
//                                        switch (strs[0]) {
//                                            case "name":
//                                                name = strs[1];
//                                                break;
//
//                                            case "filename":
//                                                try {
//                                                    temp = File.createTempFile("nami", "nami");
//                                                    value = new MultipartFile(strs[1], temp, true);
//                                                } catch (IOException e) {
//                                                    e.printStackTrace();
//                                                }
//                                                break;
//                                        }
//                                    } else {
//
//                                    }
//                                }
//                            }
//                        }
//
////                        var n = buffer.writeOnce(channel, Math.min(1024, clen));
////                        clen -= n;
//                    }
//
//
//                    //读取value
//                    if (temp == null) {
//                        try (
//                                var sw = new ByteArrayOutputStream();
//                        ) {
//                            buf.copyUntil(is, sw, limit);
//                            value = sw.toString(StandardCharsets.UTF_8);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        try (
//                                var fos = new FileOutputStream(temp);
//                        ) {
////                        var sw = new ByteArrayOutputStream();
////                        buf.copyUntil(is, sw, limit);
////                        var e=  2;
//                            buf.copyUntil(is, fos, limit);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    //skip \r\n
//                    buf.readNBytes(2);
//
//                    ret.set(name, value);
//                    //
//                } else if (line.equals(end)) {
//                    //end
//                    break scan;
//                }
//            }
////            var n = buffer.writeOnce(channel, Math.min(1024, clen));
////            clen -= n;
//        }
//
//        body = ret;
//    }

    private void decodeJsonEncoded() {
//        buffer.writeOnce(channel, getContentLength() - buffer.length());
        currentBodyLength += buffer.length();
        body = Json.parse(buffer.readBytes());
    }

    private void decodeFormEncoded() {
//        buffer.writeOnce(channel, getContentLength() - buffer.length());
        currentBodyLength += buffer.length();
        String str = new String(buffer.readBytes(), StandardCharsets.UTF_8);
        body = o();
        decodeQuery(str, (Obj)body);
    }

    private void smartDecodeBody(){
        currentBodyLength += buffer.length();
        byte[] bytes = buffer.readBytes();
        if(bytes.length > 0){
            if((bytes[0] == '{' && bytes[bytes.length - 1] == '}') || (bytes[0] == '[' && bytes[bytes.length - 1] == ']')){
                body = Json.parse(bytes);
            } else {
                body = o();
                decodeQuery(new String(bytes, StandardCharsets.UTF_8), (Obj)body);
            }
        }
//        String str = new String(buffer.readBytes(), StandardCharsets.UTF_8);
//        String nstr = str.trim();
    }

    private int getContentLength() {
        return headers.i("Content-Length", headers.i("content-length", 0));
    }

    private String getContentType() {
        return getHeader("Content-Type");
    }


    private void decodeHeader(String line) {
//        var i = line.lastIndexOf("\r\n");
//        if(i > -1){
//            line = line.substring(0, i);
//        }
        if (null == method) {
            String[] Json = line.split("\\s+");
            if (Json.length < 3) {
                throw new RuntimeException();
            }
            method = Request.Method.valueOf(Json[0]);
            version = Json[2];
            decodePath(Json[1]);
        } else {
            int comma = line.indexOf(":");
            String key = line.substring(0, comma);
            String value;
            if (line.charAt(comma + 1) == ' ') {
                value = line.substring(comma + 2);
            } else {
                value = line.substring(comma + 1);
            }
            headers.put(key, value);
            if(key.equalsIgnoreCase("Cookie")){
                decodeCookies(value);
            }
        }
    }

//    private void decodeHeaders3() {
//        var i = 0;
//        String line = null;
//        scan:
//        do {
//            while ((line = buffer.readLineStr()) != null) {
//                if (line.isEmpty()) {
//                    break scan;
//                }
//                System.out.println(line);
//                decodeHeader(line);
//            }
//            buffer.writeOnce(channel);
//        } while (true);
//    }

    /**
     * cookie解析器
     */
    private void decodeCookies(String value) {
        if(value.length() == 0){
            return;
        }
        value = URLUtil.decode(value);
        String[] Json = value.split("; ");
        for (String s : Json) {
            int i = s.indexOf("=");
            if(i > -1){
                cookie.set(s.substring(0, i), s.substring(i+1), false);
            }
        }

    }

    /**
     * 半包解码, 解析请求头
     *
     * @throws Exception
     */
//    private byte[] decodeHeaders() throws Exception {
//        var step = 4096;
//        var max = step;
//        var bs = new byte[max];
//        var readleft = 0;
//        var left = 0;
//        var idex = 0;
//        read:
//        {
//            while (true) {
//                var n = is.read(bs, readleft, bs.length - readleft);
//                if (n <= 0) {
//                    break;
//                }
//                int len = readleft + n;
//                for (int i = readleft + 1; i < len; i++) {
//                    if (bs[i - 1] == '\r' && bs[i] == '\n') {
//                        //截取出left到当前的
//                        var str = new String(bs, left, i - left - 1);
//                        //将指针指向当前
//                        left = i + 1;
//                        readleft = 0;
////                        System.out.println(str);
//                        //header读完
//                        if (str.equals("")) {
//                            var nbs = new byte[len - left];
//                            System.arraycopy(bs, left, nbs, 0, nbs.length);
//                            return nbs;
//                        } else {
//                            decodeHeader(str);
//                        }
//                    }
//                }
//                //如果取完了, left还是0, 表示还有数据包没有读完
//                //如果还有剩余
//                if (left < n) {
//                    //扩容
//                    if (max > 1024 * 1024 * 8) {
//                        max *= 2;
//                    } else {
//                        max += step;
//                    }
//                    var nbs = new byte[max];
//                    System.arraycopy(bs, 0, nbs, 0, bs.length);
//                    readleft = bs.length;
//                    bs = nbs;
//                } else {
//                    left = 0;
//                }
//            }
//        }
//        return null;
//    }



    /**
     * 无脑取值
     *
     * @param name
     * @param type
     * @return
     */
    public <T> T getParam(String name, Class<T> type) {
        try {
            Object value = params.get(name, type);
            if(value != null && type.isAssignableFrom(value.getClass())){
                return (T) value;
            }
            throw new RuntimeException();
        } catch (Exception e) {
            try {
                return (T) params.to(type);
            } catch (Exception ee) {
            }
        }
        return null;
    }

    /**
     * 得到单一的header
     * 如果取不到的话，则用小写重新取
     *
     * @param key
     * @return
     */
    public String getHeader(String key) {
        String val = headers.s(key, "");
        if (val.isEmpty()) {
            val = headers.s(key.toLowerCase(), "");
        }
        return val;
    }


}
