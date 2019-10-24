package com.github.llyb120.test;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.server.Ctrl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.github.llyb120.nami.dao.FSqlDataSource.dataSource;
import static com.github.llyb120.nami.log.Log.info;


public class b extends Ctrl {

    //sdfdd
    public int test() throws InterruptedException {
//        System.out.println(Thread.currentThread().getName() + "-" + a + "-" + $a);
//        Thread.sleep(2000);
        try {
            Statement stmt = dataSource.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("select count(1) from t_user");
            while(res.next()){
                String d = res.getString(1);
                info(d);
            }
            int d = 2;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public String t2(){
        long time = System.currentTimeMillis();
//        Set<Class<?>> list = ClassUtil.scanPackage("com");
//        System.out.println(System.currentTimeMillis() - time);
        return "1";
    }

    public MultipartFile t3(){
        return new MultipartFile("1.js", "classpath:1.js");
    }

    public String t4(){
        return "133";
    }
}
