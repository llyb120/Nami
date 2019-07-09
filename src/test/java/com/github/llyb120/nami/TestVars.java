package com.github.llyb120.nami;

import cn.hutool.core.util.RandomUtil;
import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.server.Vars;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestVars {

    @Test
    public void test() throws InterruptedException {
        var vars = new Vars();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 100 ; i++) {
            exec.submit(() -> {
                var key = RandomUtil.randomString(10);
                var n = RandomUtil.randomInt();
                vars.put(key, n);
//                Assert.assertEquals(n, vars.i(key));
                Assert.assertTrue(n == vars.i(key));

            });
        }

        exec.shutdown();;
        exec.awaitTermination(10000, TimeUnit.DAYS);


    }
}
