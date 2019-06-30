package com.github.llyb120.nami;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.core.Route;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Optional;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;
import static org.junit.Assert.*;

public class TestCtrl {

    @BeforeClass
    public static void before() throws InterruptedException {
        Route.routes.add(new Route("/test/:c/:a -> com.github.llyb120.nami.test"));
        Nami.test();
        Thread.sleep(100);
    }

    @Test
    public void getWithNoArg() {
        var res = HttpUtil.get("http://127.0.0.1:" + config.port + "/test/a/getWithNoArg");
        assertEquals(res, "ok");
    }


    @Test
    public void getWithArgs() {
        var res = HttpUtil.get("http://127.0.0.1:" + config.port + "/test/a/getWithArgs", o("a", 1));
        assertEquals(res, "1");
    }

    @Test
    public void getQuery() {
        var query = o("a", "1", "b", "2");
        var res = HttpUtil.get("http://127.0.0.1:" + config.port + "/test/a/getQuery", query);
        assertEquals(JSON.parse(res).toString(), query.toJSONString());
    }

    @Test
    public void postUrlEncoded() {
        var query = o("a", "1", "b", "2");
        var res = HttpUtil.post("http://127.0.0.1:" + config.port + "/test/a/postUrlEncoded", query);
        assertEquals(JSON.parse(res).toString(), query.toJSONString());

        res = HttpUtil.post("http://127.0.0.1:" + config.port + "/test/a/postUrlEncoded2", query);
        assertEquals(res, "1");
    }

    @Test
    public void postJson() {
        var arr = a("1", "2", "3");
        var res = HttpUtil.createPost("http://127.0.0.1:" + config.port + "/test/a/postJsonArray")
                .body(arr.toJSONString())
                .header("Content-Type", "application/json")
                .execute()
                .body();
        assertEquals(JSON.parse(res).toString(), arr.toJSONString());

        var obj = o("a", "2", "b", a("1", "2"));
        res = HttpUtil.createPost("http://127.0.0.1:" + config.port + "/test/a/postJsonObject")
                .body(obj.toJSONString())
                .header("Content-Type", "application/json")
                .execute()
                .body();
        assertEquals(JSON.parse(res).toString(), obj.toJSONString());
    }

    @Test
    public void testUploadAndDownload() throws Exception {
        // 换行符
        final String newLine = "\r\n";
        // 服务器的上传地址
        URL url = new URL("http://127.0.0.1:" + config.port + "/test/a/uploadFile");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 设置为POST情
        conn.setRequestMethod("POST");
        // 发送POST请求必须设置如下两行
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
        // 设置请求头参数
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("Charsert", "UTF-8");
        conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryari0emH33oMihIU4");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.146 Safari/537.36");

        OutputStream out = (conn.getOutputStream());

        var fileName = RandomUtil.randomString(10);
        // 上传文件
        StringBuilder sb = new StringBuilder();
        // 文件参数
        sb.append("------WebKitFormBoundaryari0emH33oMihIU4\n");
        sb.append("Content-Disposition: form-data; name=\"test\"");
        sb.append(newLine);
        sb.append(newLine);
        sb.append(fileName);
        sb.append(newLine);
        sb.append("------WebKitFormBoundaryari0emH33oMihIU4\n" +
                "Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName + "\"");
        sb.append("Content-Type:application/octet-stream");
        // 参数头设置完以后需要两个换行，然后才是参数内容
        sb.append(newLine);
        sb.append(newLine);

        // 将参数头的数据写入到输出流中
        out.write(sb.toString().getBytes());

        // 数据输入流,用于读取文件数据
        var str = RandomUtil.randomString(4024) + "\r\n" + RandomUtil.randomString(4024);
        byte[] bufferOut = new byte[2048];
        int bytes = 0;
        // 每次读2KB数据,并且将文件数据写入到输出流中
        out.write(str.getBytes(StandardCharsets.UTF_8));
        // 最后添加换行
        out.write(newLine.getBytes());
        // 定义最后数据分隔线，即--加上BOUNDARY再加上--。
        byte[] end_data = "------WebKitFormBoundaryari0emH33oMihIU4--".getBytes();
        // 写上结尾标识
        out.write(end_data);
        out.flush();
        out.close();

        // 定义BufferedReader输入流来读取URL的响应
        var resp = new String(conn.getInputStream().readAllBytes());
        var arr = resp.split("\\|");
        Assert.assertEquals(arr[0], fileName);
        var bs = IoUtil.readBytes(new FileInputStream(arr[1]));
        Assert.assertArrayEquals(bs, str.getBytes());
//            BufferedReader reader = new BufferedReader(new InputStreamReader(
//                    conn.getInputStream(),"UTF-8"));
//            StringBuffer buffer = new StringBuffer();
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                buffer.append(line);
//            }


        var temp = File.createTempFile("123","123");
        temp.deleteOnExit();
        HttpUtil.downloadFile("http://127.0.0.1:" + config.port + "/test/a/downloadFile1?path=" + arr[1], temp);
        Assert.assertEquals(IoUtil.read(new FileReader(temp)), str);

        HttpUtil.downloadFile("http://127.0.0.1:" + config.port + "/test/a/downloadFile2?path=" + arr[1], temp);
        Assert.assertEquals(IoUtil.read(new FileReader(temp)), str);

    }
}