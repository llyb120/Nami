package com.github.llyb120.nami.core;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.dao.FSql;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.beetl.sql.core.*;
import org.beetl.sql.core.annotatoin.Table;
import org.beetl.sql.core.db.DB2SqlStyle;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.KeyWordHandler;
import org.beetl.sql.core.db.MySqlStyle;

import javax.sql.DataSource;
import java.util.Properties;

public class DBService {
    public static DataSource dataSource;
    public static FSql fSql;

    static{
        System.out.println("initializing DataSource");
        Config.Db ds = Config.config.db.get("main");
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
//        System.setProperty("java.version", "11.0");
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
