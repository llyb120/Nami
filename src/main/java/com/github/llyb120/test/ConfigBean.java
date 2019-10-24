package com.github.llyb120.test;

import com.github.llyb120.nami.bean.Bean;
import com.github.llyb120.nami.bean.OnConfig;
import com.github.llyb120.nami.core.Config;

@Bean
public class ConfigBean {

    @OnConfig
    public Config.Db db(){
        Config.Db db = new Config.Db() ;
        db.url = "jdbc:db2://47.94.97.138:50000/test";
        db.driver = "com.ibm.db2.jcc.DB2Driver";
        db.username = "db2inst1";
        db.password = "db2inst1";
        return db;
    }
}
