package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.core.Obj;
import com.github.llyb120.nami.dao.FBsql;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDao {

    @Test
    public void testjdbc() throws ClassNotFoundException, SQLException {
        var stime = System.currentTimeMillis();
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        DriverManager.getConnection("jdbc:db2://47.94.97.138:50000/test:currentSchema=DB2INST1;", "db2inst1", "db2inst1");
        System.out.println(System.currentTimeMillis() - stime);

    }

    @Test
    public void test() {
        Nami.test();
        var sql = new FBsql(Config.config.db.get("main"));
        var compName = "";
        var list = sql.select(
                "l11",
                "rule", "11.1",
                "oname", compName
        );

        var d = 1;
//        var a = new String[]{"1"};
//        sql.select("fuck", a, "ri");
    }
}
