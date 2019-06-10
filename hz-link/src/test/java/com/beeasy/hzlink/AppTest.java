package com.beeasy.hzlink;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.thread.ThreadUtil;
import com.alibaba.fastjson.JSONObject;
import com.beeasy.hzlink.model.CusComList;
import com.github.llyb120.nami.core.Json;
import io.netty.util.CharsetUtil;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.ext.gen.GenConfig;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.a;

public class AppTest {

    @BeforeClass
    public static void before(){
        ThreadUtil.execAsync(() -> App.main(new String[]{"-c", "config_qcc.json"}));
        while(sqlManager == null){
            ThreadUtil.sleep(100);
        }
    }


    @Test
    public void test(){
//        var a = sqlManager.execute(new SQLReady("values 1"), Obj.class);
//        int d = 1;

        Link.do11_1("惠州市键荣置业有限公司");
    }

    @Test
    public void testall() throws InterruptedException {
        var r = a();
        var exec = Executors.newFixedThreadPool(16);
        sqlManager.lambdaQuery(CusComList.class)
            .select()
            .forEach(e -> {
                exec.submit(() -> {
                    Link.do11_1(e.getCus_name());
                    Link.do11_3(e.getCus_name());
                    Link.do11_4(e.getCus_name());
                });
            });
        exec.shutdown();;
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
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
    public void test11_5(){
        Link.do11_5_1("白佳鹏", false);
    }
}