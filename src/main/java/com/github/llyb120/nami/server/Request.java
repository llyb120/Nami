package com.github.llyb120.nami.server;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.URLUtil;
import com.alibaba.fastjson.JSON;
import com.github.llyb120.nami.core.Json;
import com.github.llyb120.nami.core.Obj;
import org.apache.commons.compress.utils.ByteUtils;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static com.github.llyb120.nami.core.Json.o;

public class Request {
    public Obj headers = o();
    public Obj query = o();
    public Method method = null;
    public String path;
    public String version;
    public InputStream is;
    public JSON body;

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
        //解析头
        var surplus = decodeHeaders();

        //解析body
        if (method != Method.POST) {
            return;
        }
        //header的解析器有可能多读了一部分数据

        var ctype = headers.getStr("Content-Type", "");
        if (ctype.contains("application/x-www-form-urlencoded")) {
            decodeFormEncoded(surplus);
        }
        else if(ctype.contains("application/json")){
            decodeJsonEncoded(surplus);
        }
    }

    private void decodeJsonEncoded(byte[] surplus) throws IOException {
        var clen = headers.getInt("Content-Length", 0);
        var bs = new byte[clen];
        var left = 0;
        //如果上次预读的数据还有结余
        if (null != surplus) {
            System.arraycopy(surplus, 0, bs, 0, surplus.length);
            left = surplus.length;
        }
        is.read(bs, left, bs.length - left);
        body = Json.parse(bs);
    }

    private void decodeFormEncoded(byte[] surplus) throws IOException {
        var clen = headers.getInt("Content-Length", 0);
        var bs = new byte[clen];
        var left = 0;
        //如果上次预读的数据还有结余
        if (null != surplus) {
            System.arraycopy(surplus, 0, bs, 0, surplus.length);
            left = surplus.length;
        }
        is.read(bs, left, bs.length - left);
        body = decodeQuery(new String(bs, StandardCharsets.UTF_8));
    }


    private void decodeHeader(String line, int idex) {
        if (idex++ == 0) {
            var arr = line.split("\\s+");
            if (arr.length != 3) {
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
