package com.github.llyb120.nami.core;

import com.github.llyb120.nami.dao.FSql;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DBService {
    public static DataSource dataSource;
    public static FSql fSql;

    static{
        System.out.println("initializing DataSource");
        Config.Db ds = Config.config.db.get("default");
        if (ds == null) {
            throw new RuntimeException("无法找到默认的数据源");
        }
        HikariConfig hikariConfig = new HikariConfig();
        //设置url
        hikariConfig.setJdbcUrl(ds.url);
        //数据库帐号
        hikariConfig.setUsername(ds.username);
        //数据库密码
        hikariConfig.setPassword(ds.password);
        hikariConfig.setDriverClassName(ds.driver);
        hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        dataSource = new HikariDataSource(hikariConfig);
    }

//    private static void initDataSource(Nami.Listener listener){
        //修复beetl不支持java11的问题
//        System.setProperty("java.jdkVersion", "11.0");
//    }

//    public static void start(boolean async) {
//        start(async, null);
//    }
//
//    public static void start(boolean async, Nami.Listener listener) {
//        if (!async) {
//            init(listener);
//        } else {
//            Async.submit(() -> init(listener));
//        }
//    }


}
