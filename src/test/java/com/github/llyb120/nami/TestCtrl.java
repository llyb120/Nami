package com.github.llyb120.nami;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.util.FastByteBuffer;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.github.llyb120.nami.json.Json.a;
import static com.github.llyb120.nami.json.Json.o;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCtrl {

    private int port = 8085;

    @BeforeClass
    public static void before() throws InterruptedException {
//        Route.routes.add(new Route("/test/:c/:a -> com.github.llyb120.nami.test"));
        Nami.dev();
    }



    @Test
    public void test_01_getWithNoArg() {
        String res = HttpUtil.get("http://127.0.0.1:" + port + "/test/a/getWithNoArg");
        assertEquals(res, "ok");
    }


    @Test
    public void test_02_getWithArgs() {
        String res = HttpUtil.get("http://127.0.0.1:" + port + "/test/a/getWithArgs", o("a", 1).map());
        assertEquals(res, "1");
    }

    @Test
    public void test_03_getQuery() {
        Obj query = o("a", "1", "b", "2");
        String res = HttpUtil.get("http://127.0.0.1:" + port + "/test/a/getQuery", query);
        assertEquals(res, query.toString());
    }

    @Test
    public void test_04_postUrlEncoded() {
        Obj query = o("a", "1", "b", "2");
        String res = HttpUtil.post("http://127.0.0.1:" + port + "/test/a/postUrlEncoded", query);
        assertEquals(res, query.toString());

        res = HttpUtil.post("http://127.0.0.1:" + port + "/test/a/postUrlEncoded2", query);
        assertEquals(res, "1");
    }

    @Test
    public void test_05_postJson() {
        Json Json = a("1", "2", "3");
        String res = HttpUtil.createPost("http://127.0.0.1:" + port + "/test/a/postJsonArray")
                .body(Json.toString())
                .header("Content-Type", "application/json")
                .execute()
                .body();
        System.out.println(res);
        assertEquals(res, Json.toString());

        Json = o("a", "2", "b", a("1", "2"));
        res = HttpUtil.createPost("http://127.0.0.1:" + port + "/test/a/postJsonObject")
                .body(Json.toString())
                .header("Content-Type", "application/json")
                .execute()
                .body();
        assertEquals(res, Json.toString());
    }

    @Test
    public void test_06_getWithEntity(){
        String res = HttpUtil.get("http://127.0.0.1:" + port + "/test/a/getWithEntity", o("a", "1", "b", "2").map());
        assertNotNull(res);
        assertNotEquals(res, "null");
    }

    @Test
    public void test_07_cookie(){
        String res = HttpUtil.createGet("http://127.0.0.1:" + port + "/test/a/testCookie")
                .header("Cookie", "_ga=GA1.2.2106664825.1561338214; UM_distinctid=16bb6c1b19615-0092e59a330b4b-2b580b4d-144000-16bb6c1b198bc; CNZZDATA1258351730=1961795621-1562137993-null%7C1562143853")
                .execute()
                .body();
        assertEquals(res, "GA1.2.2106664825.1561338214");
    }

    @Test
    public void test_08_php_style(){
        String val = RandomUtil.randomString(1024);
        String res = HttpUtil.get("http://127.0.0.1:" + port + "/test/a/phpStyleGet", o("dev", val).map());
        assertEquals(res, val);
    }
    @Test
    public void test_09_php_style() {
        String val = RandomUtil.randomString(1024);
        Obj parasm = o("dev", val);
        String res = HttpUtil.get("http://127.0.0.1:" + port + "/test/a/phpStyleRequest", parasm);
        assertEquals(parasm.toString(), res);
    }

    @Test
    public void test_99_uploadAndDownload() throws Exception {
        // 换行符
        final String newLine = "\r\n";
        // 服务器的上传地址
        String fileName = RandomUtil.randomString(10);
        // 上传文件
        StringBuilder sb = new StringBuilder();
        // 文件参数
        sb.append("------WebKitFormBoundaryari0emH33oMihIU4\r\n");
        sb.append("Content-Disposition: form-data; name=\"test\"");
        sb.append(newLine);
        sb.append(newLine);
        sb.append(fileName);
        sb.append(newLine);
        sb.append("------WebKitFormBoundaryari0emH33oMihIU4\r\n" +
                "Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName + "\"");
        sb.append(newLine);
        sb.append("Content-Type:application/octet-stream");
        // 参数头设置完以后需要两个换行，然后才是参数内容
        sb.append(newLine);
        sb.append(newLine);

        FastByteBuffer buf = new FastByteBuffer();
        buf.append(sb.toString().getBytes(StandardCharsets.UTF_8));
        String str = RandomUtil.randomString(4024) + "\r\n" + RandomUtil.randomString(4024);
        byte[] bufferOut = new byte[2048];
        int bytes = 0;
        // 每次读2KB数据,并且将文件数据写入到输出流中
        buf.append(str.getBytes(StandardCharsets.UTF_8));
        // 最后添加换行
        buf.append(newLine.getBytes());
        // 定义最后数据分隔线，即--加上BOUNDARY再加上--。
        byte[] end_data = "------WebKitFormBoundaryari0emH33oMihIU4--".getBytes();
        // 写上结尾标识
        buf.append(end_data);

        String res = HttpUtil.createPost("http://127.0.0.1:" + port + "/test/a/uploadFile")
                .contentType("multipart/form-data; boundary=----WebKitFormBoundaryari0emH33oMihIU4")
                .body(buf.toArray())
                .execute()
                .body();

//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        // 设置为POST情
//        conn.setRequestMethod("POST");
//        // 发送POST请求必须设置如下两行
//        conn.setDoOutput(true);
//        conn.setDoInput(true);
//        conn.setUseCaches(false);
//        // 设置请求头参数
//        conn.setRequestProperty("connection", "Keep-Alive");
//        conn.setRequestProperty("Charsert", "UTF-8");
//        conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryari0emH33oMihIU4");
//        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.146 Safari/537.36");
//
//        OutputStream out = (conn.getOutputStream());
//
//         fileName = RandomUtil.randomString(10);
//        // 上传文件
//        StringBuilder sb = new StringBuilder();
//        // 文件参数
//        sb.append("------WebKitFormBoundaryari0emH33oMihIU4\n");
//        sb.append("Content-Disposition: form-data; name=\"dev\"");
//        sb.append(newLine);
//        sb.append(newLine);
//        sb.append(fileName);
//        sb.append(newLine);
//        sb.append("------WebKitFormBoundaryari0emH33oMihIU4\n" +
//                "Content-Disposition: form-data; name=\"file\"; filename=\"" + fileName + "\"");
//        sb.append("Content-Type:application/octet-stream");
//        // 参数头设置完以后需要两个换行，然后才是参数内容
//        sb.append(newLine);
//        sb.append(newLine);
//
//        // 将参数头的数据写入到输出流中
//        out.write(sb.toString().getBytes());
//
//        // 数据输入流,用于读取文件数据
//         str = RandomUtil.randomString(4024) + "\r\n" + RandomUtil.randomString(4024);
//        byte[] bufferOut = new byte[2048];
//        int bytes = 0;
//        // 每次读2KB数据,并且将文件数据写入到输出流中
//        out.write(str.getBytes(StandardCharsets.UTF_8));
//        // 最后添加换行
//        out.write(newLine.getBytes());
//        // 定义最后数据分隔线，即--加上BOUNDARY再加上--。
//        byte[] end_data = "------WebKitFormBoundaryari0emH33oMihIU4--".getBytes();
//        // 写上结尾标识
//        out.write(end_data);
//        out.flush();
//        out.close();
//
//        // 定义BufferedReader输入流来读取URL的响应
//         resp = new String(conn.getInputStream().readAllBytes());
        String[] Json = res.split("\\|");
        Assert.assertEquals(Json[0], fileName);
        System.out.println(Json[1]);
        byte[] bs = IoUtil.readBytes(new FileInputStream(Json[1]));
        Assert.assertArrayEquals(bs, str.getBytes());
//            BufferedReader reader = new BufferedReader(new InputStreamReader(
//                    conn.getInputStream(),"UTF-8"));
//            StringBuffer buffer = new StringBuffer();
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                buffer.append(line);
//            }



        File temp = File.createTempFile("123", "123");
        temp.deleteOnExit();
        HttpUtil.downloadFile("http://127.0.0.1:" + port + "/test/a/downloadFile1?path=" + Json[1], temp);
        Assert.assertEquals(IoUtil.read(new FileReader(temp)), str);

        HttpUtil.downloadFile("http://127.0.0.1:" + port + "/test/a/downloadFile2?path=" + Json[1], temp);
        Assert.assertEquals(IoUtil.read(new FileReader(temp)), str);

    }


    private void test_06_sup(int length) throws IOException {
        String str = RandomUtil.randomString(length);
        File temp = File.createTempFile("123", "123");
        temp.deleteOnExit();
        FileUtil.writeUtf8String(str, temp);
//        IoUtil.write(new FileOutputStream(temp), true, str.getBytes());
        File temp2 = File.createTempFile("444", "555");
        temp2.deleteOnExit();
        HttpUtil.downloadFile("http://127.0.0.1:" + port + "/test/a/downloadFile1?path=" + temp.getAbsolutePath(), temp2);
        Assert.assertEquals(FileUtil.readString(temp2, StandardCharsets.UTF_8), str);

        temp2 = File.createTempFile("444","555");
        temp2.deleteOnExit();
        HttpUtil.downloadFile("http://127.0.0.1:" + port + "/test/a/downloadFile2?path=" + temp.getAbsolutePath(), temp2);
        Assert.assertEquals(FileUtil.readString(temp2, StandardCharsets.UTF_8), str);
    }

    @Test
    public void test_06_testDownload() throws IOException {
        test_06_sup(1024);
        test_06_sup(2028);
        test_06_sup(4096);
        test_06_sup(8192);
    }
}
