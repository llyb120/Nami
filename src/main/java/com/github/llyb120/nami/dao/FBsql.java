package com.github.llyb120.nami.dao;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.Async;
import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Obj;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;


public class FBsql {

    private Map<String,TableMetaData> tables = new Hashtable<>();
    private DataSource dataSource;
    private Config.Db db;
    private Future future;
    private Map<String,String> tableNameCache = new Hashtable<>();

    public FBsql(Config.Db db){
        this.db = db;
        future = Async.execute(() -> {
            initDataSource();
            initAllTableName();
        });
    }

//    public SimpleQuery simple(String table){
//        return new SimpleQuery();
//    }

    public List<Obj> select(String table, Object ...values){
        return select(table, Obj.class, values);
    }

    public <T> List<T> select(String table, Class<T> clz, Object ...values){
        try (
                var conn = getConnection();
                ){
            var tname = getTableMetaData(table);
            var sb = new StringBuilder();
            sb.append("select * from ");
            sb.append(tname);
            buildWhere(tname, sb, values);
            return execute(sb.toString(), conn).toJavaList(clz);
        } catch (InterruptedException | ExecutionException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void buildWhere(String tname, StringBuilder sb, Object ...values){
        sb.append(" where 1 = 1");
        var table = tables.get(tname);
        for (int i = 0; i < values.length; i++) {
            if (table == null) {
//                sb.append("")
            } else {
                sb.append(" and ");
                sb.append(getField(table, (String)values[i]));
                sb.append(" = ");
                sb.append(StrUtil.wrap((String)values[++i], "'"));
            }
        }
    }

    private Arr execute(String sql, Connection connection) throws SQLException {
        System.out.println(sql);
        var list = a();
        try(
                var stmt = connection.createStatement();
                ){
            var ret = stmt.executeQuery(sql);
            var metadata = ret.getMetaData();
            while(ret.next()){
                var obj = o();
                list.add(obj);
                for(var i = 1; i <= metadata.getColumnCount(); i++){
                    obj.put(metadata.getColumnName(i).toLowerCase(), ret.getString(i)) ;
                }
            }
            return list;
        }
    }

    private Arr execute(String sql) throws InterruptedException, ExecutionException, SQLException {
        try(
               var conn = getConnection();
                ){
            System.out.println(sql);
            return execute(sql, conn);
        }
    }

    private Connection getConnection() throws SQLException, ExecutionException, InterruptedException {
        if(!future.isDone()) future.get();
        return dataSource.getConnection();
    }

    private String getTableMetaData(String tableName) throws InterruptedException, ExecutionException, SQLException {
        var list = tables.keySet()
                .stream()
                .map(e -> new Object[]{e, FBsqlUtil.sim(e, tableName)})
                .sorted((a,b) -> Double.compare((double)b[1], (double)a[1]))
                .collect(Collectors.toList());
        return (String) list.get(0)[0];
    }

    private String getField(TableMetaData metaData, String key){
        var list = metaData.fields.stream()
                .map(e -> new Object[]{e, FBsqlUtil.sim(e, key)})
                .sorted((a,b) -> Double.compare((double)b[1], (double)a[1]))
                .collect(Collectors.toList());
        return (String) list.get(0)[0];
    }


    private void initAllTableName() throws InterruptedException, ExecutionException, SQLException {
        String sql = String.format("select table_name as t, column_name as c, data_type as type, CHARACTER_MAXIMUM_LENGTH as len from sysibm.columns where table_schema = '%s' and table_name not like 'explain%%'", db.schema);
        var ret = execute(sql, dataSource.getConnection());
        for (Object o : ret) {
            Obj obj = (Obj) o;
            var tname = obj.getStr("table_name").toLowerCase();
            var metadata = tables.get(tname);
            if (metadata == null) {
                metadata = new TableMetaData();
                metadata.name = tname;
                tables.put(tname, metadata);
            }
            metadata.fields.add(obj.getStr("column_name").toLowerCase());
        }
    }


    private void initDataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        //设置url
        hikariConfig.setJdbcUrl(db.url);
        //数据库帐号
        hikariConfig.setUsername(db.username);
        //数据库密码
        hikariConfig.setPassword(db.password);
        hikariConfig.setDriverClassName(db.driver);
        hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        dataSource = new HikariDataSource(hikariConfig);
    }

    static class TableMetaData{
        String name;
        List<String> fields = new Vector<>();
    }
}



