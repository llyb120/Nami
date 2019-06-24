package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.DBService;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.dao.FSql;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

import static com.github.llyb120.nami.core.DBService.fSql;

public class TestDao {

    @Test
    public void testjdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        var stime = System.currentTimeMillis();
        DriverManager.getConnection("jdbc:db2://47.94.97.138:50000/test:currentSchema=DB2INST1;", "db2inst1", "db2inst1");
        System.out.println(System.currentTimeMillis() - stime);
    }

    @Test
    public void testDs(){
        var stime = System.currentTimeMillis();
            HikariConfig hikariConfig = new HikariConfig();
            //设置url
            hikariConfig.setJdbcUrl("jdbc:db2://47.94.97.138:50000/test:currentSchema=DB2INST1;");
            //数据库帐号
            hikariConfig.setUsername("db2inst1");
            //数据库密码
            hikariConfig.setPassword("db2inst1");
            hikariConfig.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
            hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
            var dataSource = new HikariDataSource(hikariConfig);
        System.out.println(System.currentTimeMillis() - stime);
    }

    @Test
    public void testCache(){
        FSql.mkCache();
    }

    @Test
    public void test() throws ExecutionException, InterruptedException {
        Nami.test();
//        var sql = new FSql(Config.config.db.get("main"));
        var compName = "";
        var list = fSql.select(
                "l11",
                "rule", "11.1",
                "oname", compName
        );

        var d = 1;
//        var a = new String[]{"1"};
//        sql.select("fuck", a, "ri");
    }
}
