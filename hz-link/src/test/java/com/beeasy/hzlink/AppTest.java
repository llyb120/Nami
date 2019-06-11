package com.beeasy.hzlink;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.thread.ThreadUtil;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.hzlink.model.CusCom;
import com.beeasy.hzlink.model.CusComList;
import com.beeasy.hzlink.service.Link;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.Json;
import com.github.llyb120.nami.core.Obj;
import io.netty.util.CharsetUtil;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.ext.gen.GenConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.a;

public class AppTest {
    ExecutorService exec;

    @BeforeClass
    public static void before() {
        ThreadUtil.execAsync(() -> App.main(new String[]{"-c", "config_back.json"}));
        while (sqlManager == null) {
            ThreadUtil.sleep(100);
        }
    }


    @Before
    public void onbefore() {
        exec = Executors.newFixedThreadPool(16);
    }

    @After
    public void onafter() throws InterruptedException {
        exec.shutdown();
        ;
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);

        int d = 1;
    }


    @Test
    public void test() {
//        var a = sqlManager.execute(new SQLReady("values 1"), Obj.class);
//        int d = 1;

        Link.do11_1("惠州市键荣置业有限公司");
    }

    @Test
    public void testall() throws InterruptedException {
//        Link.do11_4("惠州市金泽国际物流有限公司");

//        var r = a();
//        var exec = Executors.newFixedThreadPool(16);
        var resource = new ClassPathResource("1.json");
        var cnt = IoUtil.read(resource.getReader(CharsetUtil.UTF_8));
        var arr = (Arr) Json.parseObject(cnt).getByPath("data.list");
        for (Obj obj : arr.toObjList()) {
            exec.submit(() -> {
//                    Link.do11_1(obj.getStr("CUS_NAME"));
//                Link.do11_3(obj.getStr("CUS_NAME"));
//                    Link.do11_4(obj.getStr("CUS_NAME"));
//                Link.do12_2(obj.getStr("CUS_NAME"));
//                Link.do12_3(obj.getStr("CUS_NAME"));
                Link.do12_4(obj.getStr("CUS_NAME"));
            });
        }

//        sqlManager.lambdaQuery(CusCom.class)
//            .select()
//            .forEach(e -> {
//            });
//        exec.shutdown();;
//        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
    }

    @Test
    public void genOne() throws Exception {
        GenConfig genConfig = new GenConfig();
        ClassPathResource resource = new ClassPathResource("pojo.tmpl");
        genConfig.setTemplate(IoUtil.read(resource.getStream(), CharsetUtil.UTF_8));
        String[] models = new String[]{
            "LINK_11_1"
        };
        for (String model : models) {
            sqlManager.genPojoCode(model, "com.beeasy.hzlink.model", genConfig);
        }
    }


    @Test
    public void t2() throws FileNotFoundException {
        var obj = Json.parseObject(IoUtil.read(new FileReader("D:\\work\\easyshop\\hz-link\\src\\main\\resources\\1.json")));
        sqlManager.executeUpdate(new SQLReady("delete from cus_com_list"));
        for (JSONObject o : obj.getObj("data").getArr("list").toObjList()) {
            sqlManager.executeUpdate(new SQLReady(String.format("insert into cus_com_list(cus_id,cus_name)values('%s','%s')", o.getString("CUS_ID"), o.getString("CUS_NAME"))));
        }
    }


    @Test
    public void test11_5() {
        Link.do11_5_1("白佳鹏", false);
    }
}