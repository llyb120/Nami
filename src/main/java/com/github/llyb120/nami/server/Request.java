package com.github.llyb120.nami.server;

import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.github.llyb120.nami.core.Json;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Obj;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static com.github.llyb120.nami.core.Json.o;

public class Request {
    public Obj headers = o();
    public Obj query = o();
    public Method method = null;
    public String path;
    public String version;
    public InputStream is;
    public JSON body;

    private ByteBuff buf = new ByteBuff();

    enum Method {
        GET,
        POST,
        OPTIONS,
        HEAD,
        DELETE
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

        //解析body
        if (method != Method.POST) {
            return;
        }
        //header的解析器有可能多读了一部分数据

        var ctype = headers.getStr("Content-Type", "");
        if (ctype.contains("application/x-www-form-urlencoded")) {
            decodeFormEncoded();
        } else if (ctype.contains("application/json")) {
            decodeJsonEncoded();
        } else if (ctype.contains("multipart/form-data")){
            decodeFormDataEncoded(ctype);
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


    private String readLine(int[] ptr) throws IOException {
        var line = buf.readLineStr(is, StandardCharsets.UTF_8);
        ptr[0] += (line.length() + 2);
        return line;
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
        var ptr = new int[]{0};
        var similar = 0;
        var line = "";

        //部分请求可能会多一个\r\n
//        if(line.equals("")){
//             line = buf.readLineStr(is, StandardCharsets.UTF_8);
//        }
        while((line = buf.readLineStr(is, StandardCharsets.UTF_8)) != null){
            if(line.equals(start)){
                while((line = buf.readLineStr(is, StandardCharsets.UTF_8)) != null){
                    if(line.isEmpty()){
                        break;
                    }
                    //start
                    var arr = line.split("; ");
                    for (int i = 0; i < arr.length; i++) {
                        if(i > 0){
                            var strs = getFormDataKV(arr[i]);
                            switch (strs[0]){

                            }
                        } else {

                        }
                    }
                }
                //读取value
//                var value = buf.readUntil()
//                var bs =
//                var value = buf.readLineStr(is, StandardCharsets.UTF_8);
//                var e = 2;
                //
            } else if(line.equals(end)){
                //end
                break;
            }
        }
        //start

        var d = 1;

//        try{
//            while(ptr[0] < clen){
//                //skip key
////                var line = readLine(ptr);
//                MultipartFile file = null;
////                new MultipartFile();
//                //read keys
//                do{
//                   line = readLine(ptr);
//                    var arr = line.split("; ");
//                    //第0个有特殊作用
//                    for (int i = 0; i < arr.length; i++) {
//                        if(i > 0) {
//                            var eq = arr[i].indexOf("=");
//                            var left = arr[i].substring(0, eq);
//                            var right = arr[i].substring(eq + 1);
//                            var value = getFormDataValue(right);
//                            var e = 1;
//                            switch (left){
//                                case "name":
//                                    break;
//
//                                case "filename":
//                                    //如果存在filename, 则开始读取文件
////                                    isfile = true;
//                                    break;
//                            }
//                        } else {
//
//                        }
//                    }
////                   idex = line.indexOf(":");
////                   if(idex == -1){
////                      break;
////                   }
////                   var left = line.substring(0, idex);
////                   var right = line.substring(idex + 1);
//
//                }while(ptr[0] < clen && !line.equals(""));
//
//                if(file == null){
//                    continue;
//                }
//
//
//
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        while(true){
//            var line = dis.readLine();
//        }

//        while(ptr++ < clen){
//            try {
//                var c = is.read();
//                if(c < 0){
//                    break;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            var bs = is.readAllBytes();
//            var d = 1;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void decodeJsonEncoded() throws IOException {
        byte[] bs = new byte[0];
        try {
            bs = buf.readNBytes(is, getContentLength());
        } catch (ByteBuff.EOFException e) {
            e.printStackTrace();
        }
        body = Json.parse(bs);
    }

    private void decodeFormEncoded() throws IOException {
        byte[] bs = new byte[0];
        try {
            bs = buf.readNBytes(is, getContentLength());
        } catch (ByteBuff.EOFException e) {
            e.printStackTrace();
        }
        var str = new String(bs, StandardCharsets.UTF_8);
        body = decodeQuery(str);
    }

    private int getContentLength(){
        return headers.getInt("Content-Length", headers.getInt("content-length", 0));
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
        String line = null;
        var i = 0;
        while((line = buf.readLineStr(is, StandardCharsets.UTF_8)) != null){
            if(line.isEmpty()){
                break;
            }
            decodeHeader(line, i++);
        }
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
                        System.out.println(str);
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
}
