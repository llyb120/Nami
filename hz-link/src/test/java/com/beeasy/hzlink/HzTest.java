package com.beeasy.hzlink;

import cn.hutool.core.thread.ThreadUtil;
import com.beeasy.hzlink.model.CusCom;
import com.beeasy.hzlink.model.CusIndiv;
import com.beeasy.hzlink.service.Link;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.github.llyb120.nami.core.DBService.sqlManager;

public class HzTest {

    ExecutorService exec;

    @BeforeClass
    public static void before(){
//        ThreadUtil.execAsync(() -> App.main(new String[]{"-c", "config_qcc.json"}));
        ThreadUtil.execAsync(() -> App.main(new String[]{"-c", "config_back.json"}));
        while(sqlManager == null){
            ThreadUtil.sleep(100);
        }
    }

    @Before
    public void onbefore(){
        exec = Executors.newFixedThreadPool(16);
    }

    @After
    public void onafter() throws InterruptedException {
        exec.shutdown();;
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
    }



    @Test
    public void test11_5() throws InterruptedException {
        var exec = Executors.newFixedThreadPool(16);
        sqlManager.lambdaQuery(CusCom.class)
            .select()
            .forEach(e -> {
                exec.submit(() -> {
                    Link.do11_5(e.getCus_name());
                });
            });
        exec.shutdown();;
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
    }

    @Test
    public void test11_6() throws InterruptedException {
        sqlManager.lambdaQuery(CusCom.class)
            .select()
            .forEach(e -> {
                exec.submit(() -> {
                    Link.do11_6(e.getCus_name());
                });
            });
    }

    @Test
    public void test11_5_1() throws InterruptedException {
        var exec = Executors.newFixedThreadPool(16);
        sqlManager.lambdaQuery(CusCom.class)
            .select()
            .forEach(e -> {
                exec.submit(() -> {
                    Link.do11_5_1(e.getCus_name(), true);
                });
            });
        sqlManager.lambdaQuery(CusIndiv.class)
            .select()
            .forEach(e -> {
                exec.submit(() -> {
                    Link.do11_5_1(e.getCus_name(), false);
                });
            });
        exec.shutdown();;
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
    }
}
