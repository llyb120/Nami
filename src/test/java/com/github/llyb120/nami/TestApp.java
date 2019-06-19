package com.github.llyb120.nami;

import cn.hutool.core.thread.ThreadUtil;
import com.github.llyb120.nami.core.*;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.SQLReady;
import org.junit.Test;

import static com.github.llyb120.nami.core.DBService.sqlManager;
public class TestApp {

    @Test
    public void main(){
        Nami.start();
    }


    @Test
    public void test(){
        Nami.test();
//        Async.submit(() -> Nami.start()) ;
        var cnt = sqlManager.execute(new SQLReady("select count(1) from t_user"), Obj.class);

        int d = 2;
    }
}
