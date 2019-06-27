package com.github.llyb120.nami;

import cn.hutool.core.util.RandomUtil;
import com.github.llyb120.nami.server.ByteBuff;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class TestByteBuf {

    private byte[] bs;
    private String str;
    private int step = RandomUtil.randomInt(50,100);

    private ByteBuff buf ;
    private File file;


    @Before
    public void before() throws IOException {
         buf = new ByteBuff(step);
         str = (RandomUtil.randomString(step * 5) + "\r\n");
         bs = str.getBytes();
        file = genFile();
    }

    @Test
    public void testWriteBytes(){
        buf.write(bs, 4, 4);
        Assert.assertArrayEquals(str.substring(4,8).getBytes(), buf.readBytes());
    }

    @Test
    public void testAppendBytes(){
        testWriteBytes();
        var str = genRandomStr();
        buf.write(str);
        Assert.assertArrayEquals(str.getBytes(), buf.readBytes());
    }

    @Test
    public void testWriteOnce() throws IOException, ByteBuff.EOFException {
        var fos = new FileOutputStream(file);
        fos.write(bs);
        var fis = new FileInputStream(file);
        buf.writeOnce(fis);
        Assert.assertArrayEquals(str.substring(0,step).getBytes(), buf.readBytes());
    }



    @Test
    public void testReadLine() throws IOException {
        var fis = new FileInputStream(file);
        buf.writeFull(fis);

        var line = buf.readLine();
        var e = 2;
    }

    @Test
    public void testWriteFull() throws IOException {
        var fis = new FileInputStream(file);
        buf.writeFull(fis);
        Assert.assertArrayEquals(bs, buf.readBytes());
    }

    @Test
    public void testGetBytes(){
        buf.write(bs);
        var a = buf.getBytes();
        var b = buf.readBytes();
        Assert.assertArrayEquals(a, b);
        Assert.assertArrayEquals(a, bs);
    }


    @Test
    public void testWriteBefore(){
        var str = RandomUtil.randomString(1024);
        buf.write(bs);
        buf.readNBytes(str.length() / 2);
        buf.writeBefore(str.getBytes());
        Assert.assertEquals(buf.toString().substring(0, str.length()), str);

        buf.writeBefore(str.getBytes(), 500, 350);
        Assert.assertEquals(buf.toString().substring(0, 350), str.substring(500, 850));
    }

    public File genFile() throws IOException {
        var file = File.createTempFile("123", "456");
        file.deleteOnExit();
        var fos = new FileOutputStream(file);
        fos.write(bs);
        return file;
    }

    public String genRandomStr(){
        return RandomUtil.randomString(20);
    }







}
