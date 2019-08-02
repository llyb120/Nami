package com.github.llyb120.nami;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.ext.file.SimpleStorage;
import com.github.llyb120.nami.ext.file.Storage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import static com.github.llyb120.nami.core.Config.config;

public class TestStorage {

    public String content;
    public String id;

    @BeforeClass
    public static void before(){
        Nami.dev();
    }


    @Test
    public void test01_initStorage(){
        Assert.assertNotNull(Storage.getStorage("test1"));
    }

    @Test
    public void test02_upload() throws IOException {
        SimpleStorage simpleStorage = (SimpleStorage) Storage.getStorage("test1");
        File file = File.createTempFile("123",".txt");
        file.deleteOnExit();
        content = RandomUtil.randomString(1024);
        IoUtil.write(new FileOutputStream(file), true, content.getBytes());
        id = simpleStorage.upload(new MultipartFile(file));
        Assert.assertNotNull(id);


        file = File.createTempFile("123",".txt");
        HttpUtil.download("http://127.0.0.1:" + config.port + "/test/a/downloadStorageFile?path=" + id, new FileOutputStream(file), true);

        String str = IoUtil.read(new FileReader(file));
        Assert.assertEquals(str, content);
    }


}

