package com.beeasy.easyshop;


import cn.hutool.core.io.IoUtil;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.web.core.Config;
import com.beeasy.web.core.DBService;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.core.kit.GenKit;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.GenFilter;
import org.beetl.sql.ext.gen.SourceGen;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.util.List;

import static com.beeasy.web.core.DBService.sqlManager;

public class Generate {

    @BeforeClass
    public static void before(){
        Config.init("config.json");
        DBService.start(false);
    }

    @Test
    public void test() throws Exception {
        if(true){
            return;
        }

        sqlManager.genALL("com.beeasy.easyshop.model", new GenConfig(), new GenFilter() {
            @Override
            public boolean accept(String s) {
                if(s.equals("ra_goods_package")){
                    return false;
                }
                if(s.startsWith("ra_")){
                    return true;
                }
                return false;
            }
        });
    }


    @Test
    public void genOne() throws Exception {
        sqlManager.genPojoCode("ra_album_class", "com.beeasy.easyshop.model");
    }
    @Test
    public void genOneSql() throws Exception {
        var bos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(bos);
        System.setOut(printStream);
        sqlManager.genSQLTemplateToConsole("ra_album_class");

        var bs = bos.toByteArray();
        var str = new String(bs);
        int d = 1;
//        sqlManager.genSQLTemplateToConsole("ra_order", "");
    }

    @Test
    public void gen() throws Exception {
        var tables = sqlManager.execute(new SQLReady("select table_name from information_schema.tables where table_schema='yoehi'"), JSONObject.class);
        var config = new GenConfig();
        String template = config.getTemplate();
//        config.setTemplate(IoUtil.read(new FileReader("D:\\work\\easyshop\\easy-shop\\src\\main\\resources\\template\\pojo")));
        for (JSONObject table : tables) {
            var name = table.getString("table_name");
//            String srcPath = GenKit.getJavaSRCPath();
//            SourceGen gen = new SourceGen(sqlManager, name, "com.beeasy.easyshop.model", srcPath, config);
//            gen.gen();
            sqlManager.genPojoCode(name, "com.beeasy.easyshop.model", config);
        }
        int d = 1;
    }


}
