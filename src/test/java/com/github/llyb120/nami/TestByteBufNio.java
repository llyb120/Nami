//package com.github.llyb120.nami;
//
//import cn.hutool.core.io.IoUtil;
//import cn.hutool.core.util.RandomUtil;
//import cn.hutool.core.util.StrUtil;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class TestByteBufNio {
//
//    private byte[] bs;
//    private String str;
//    private int step = RandomUtil.randomInt(50,100);
//
//    private Buffer buf ;
//    private File file;
//
//
//    @Before
//    public void before() throws IOException {
//         buf = new Buffer(step);
//         str = (RandomUtil.randomString(step * 5) + "\r\n");
//         bs = str.getBytes();
//        file = genFile();
//    }
//
//    @Test
//    public void testWriteBytes(){
//        buf.writeNio(bs, 4, 4);
//        Assert.assertArrayEquals(str.substring(4,8).getBytes(), buf.readBytes());
//    }
//
//    @Test
//    public void testAppendBytes(){
//        testWriteBytes();
//        String str = genRandomStr();
//        buf.writeNio(str);
//        Assert.assertArrayEquals(str.getBytes(), buf.readBytes());
//    }
////
////    @Test
////    public void testWriteOnce() throws IOException {
////        var fos = new FileOutputStream(file);
////        fos.writeNio(bs);
////        var fis = new FileInputStream(file);
////        buf.writeOnce(Channels.newChannel(fis));
////        Assert.assertArrayEquals(str.substring(0,step).getBytes(), buf.readBytes());
////    }
//
//
//
//    @Test
//    public void testReadLine() throws IOException {
//        FileInputStream fis = new FileInputStream(file);
//        buf.writeNio(IoUtil.readBytes(fis));
//
//        byte[] line = buf.readLine();
//        Assert.assertNotNull(line);
//    }
//
////    @Test
////    public void testWriteFull() throws IOException {
////        var fis = new FileInputStream(file);
////        buf.writeFull(Channels.newChannel(fis));
////        Assert.assertArrayEquals(bs, buf.readBytes());
////    }
//
//    @Test
//    public void testGetBytes(){
//        buf.writeNio(bs);
//        byte[] a = buf.getBytes();
//        byte[] b = buf.readBytes();
//        Assert.assertArrayEquals(a, b);
//        Assert.assertArrayEquals(a, bs);
//    }
//
//
//    @Test
//    public void testWriteBefore(){
//        String str = RandomUtil.randomString(1024);
//        buf.writeNio(bs);
//        buf.readNBytes(str.length() / 2);
//        buf.writeBefore(str.getBytes());
//        Assert.assertEquals(buf.toString().substring(0, str.length()), str);
//
//        buf.writeBefore(str.getBytes(), 500, 350);
//        Assert.assertEquals(buf.toString().substring(0, 350), str.substring(500, 850));
//    }
//
//    public File genFile() throws IOException {
//        File file = File.createTempFile("123", "456");
//        file.deleteOnExit();
//        FileOutputStream fos = new FileOutputStream(file);
//        fos.write(bs);
//        return file;
//    }
//
//    public String genRandomStr(){
//        return RandomUtil.randomString(20);
//    }
//
//
//
//    @Test
//    public void test(){
//        Buffer buf = new Buffer();
//        buf.writeNio(StrUtil.repeat("a", 100));
//        buf.writeNio(StrUtil.repeat("b", 100));
//
//        int n = buf.indexOf("ab".getBytes());
//        int e = 2;
////        var str = RandomUtil.randomString(100);
////        var a = buf.writeNio(str.getBytes(), 0, 50);
////
////        var b = buf.readNBytes(50);
////        var e = 2;
////        var c = new String(a.readNBytes(3));
////        var e = new String(a.readNBytes(3));
////        var d = 1;
//    }
//
//
//
//
//
//}
