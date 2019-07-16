package com.github.llyb120.nami.dao;
import com.github.llyb120.nami.json.Obj;

public class DB2Driver {

    private FSql fSql;

    public DB2Driver(FSql fSql){
        this.fSql = fSql;
    }

    /**
     * 得到一张表的定义
     * @param table 表名
     * @return
     */
    public FSql.TableMetaData getTableMetadata(String schema, String table){
        String sql = String.format("select table_name as t, column_name as c, data_type as type, CHARACTER_MAXIMUM_LENGTH as len from sysibm.columns where table_schema = '%s' and table_name", schema, table);
        var arr = fSql.execute(sql);
        for (Obj obj : arr.oa()) {

        }
        var ret = new FSql.TableMetaData();
        return ret;
    }

}
