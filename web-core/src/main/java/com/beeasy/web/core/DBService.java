package com.beeasy.web.core;

import cn.hutool.core.thread.ThreadUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.beetl.sql.core.*;
import org.beetl.sql.core.db.MySqlStyle;

import javax.sql.DataSource;
import java.lang.reflect.Proxy;

public class DBService {
    public static DataSource dataSource; 
    public static SQLManager sqlManager;

    private static void init(){
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
        ConnectionSource source = ConnectionSourceHelper.getSingle(dataSource);
        ClasspathLoader loader = new ClasspathLoader("/sql");
        UnderlinedNameConversion nc = new UnderlinedNameConversion();
        sqlManager = new SQLManager(new MySqlStyle(),loader,source,nc,new Interceptor[]{new MyDebugInterceptor()});
        System.out.println("db service boot success");
    }

    public static void start(boolean async){
        if(!async){
            init();
        } else {
            ThreadUtil.execAsync(DBService::init);
        }
    }



}
