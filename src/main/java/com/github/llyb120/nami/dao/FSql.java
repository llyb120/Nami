package com.github.llyb120.nami.dao;

import cn.hutool.core.collection.ConcurrentHashSet;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.core.*;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.beetl.core.BeetlKit;
import org.beetl.core.resource.ClasspathResource;
import org.beetl.sql.core.annotatoin.Table;
import org.beetl.sql.core.kit.GenKit;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.DBService.fSql;
import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;


public class FSql {

    private Map<String,TableMetaData> tables = new Hashtable<>();
    private DataSource dataSource;
    private Config.Db db;
    private Future future;
    private Map<String,String> tableNameCache = new Hashtable<>();

    public FSql(Config.Db db) throws InterruptedException, ExecutionException, SQLException, IOException {
        this.db = db;
        if(config.dev){
            initAllTableName();
            future = Async.execute(() -> initDataSource());
        } else {
            future = Async.execute(() -> {
                initDataSource();
                if(!config.dev){
                    initAllTableName();
                }
            });
        }
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
                    obj.put(metadata.getColumnLabel(i).toLowerCase(), ret.getObject(i)) ;
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
        tableName = tableName.toUpperCase();
        String finalTableName = tableName;
        var list = tables.keySet()
                .stream()
                .map(e -> new Object[]{e, FBsqlUtil.sim(e, finalTableName)})
                .sorted((a,b) -> Double.compare((double)b[1], (double)a[1]))
                .collect(Collectors.toList());
        return (String) list.get(0)[0];
    }

    private String getField(TableMetaData metaData, String key){
        key = key.toUpperCase();
        String finalKey = key;
        var list = metaData.fields.stream()
                .map(e -> new Object[]{e, FBsqlUtil.sim(e, finalKey)})
                .sorted((a,b) -> Double.compare((double)b[1], (double)a[1]))
                .collect(Collectors.toList());
        return (String) list.get(0)[0];
    }


    private void initAllTableName() throws InterruptedException, ExecutionException, SQLException, IOException {
        if(config.dev){
            try(
                    var is = new ClassPathResource("fsql/cache/ALL_TABLES").getStream();
                    ){
                tables = ObjectUtil.unserialize(is.readAllBytes());
            } catch (Exception e){
                System.out.println("加载缓存失败，你可能需要生成fsql的缓存");
            }
        } else {
            String sql = String.format("select table_name as t, column_name as c, data_type as type, CHARACTER_MAXIMUM_LENGTH as len from sysibm.columns where table_schema = '%s' and table_name not like 'explain%%'", db.schema);
            var ret = execute(sql, dataSource.getConnection());
            for (Object o : ret) {
                Obj obj = (Obj) o;
                var tname = obj.getStr("t");
                var metadata = tables.get(tname);
                if (metadata == null) {
                    metadata = new TableMetaData();
                    metadata.name = tname;
                    tables.put(tname, metadata);
                }
                metadata.fields.add(obj.getStr("c"));
            }
        }
    }

    public static void mkCache(){
        Nami.test();
        var path = new File(GenKit.getJavaResourcePath(), "fsql/cache");
        //clear
        path.mkdirs();
        for (File file : path.listFiles()) {
            file.delete();
        }
        //生成表名索引
        try(
            var raf = new RandomAccessFile(new File(path, "ALL_TABLES"), "rw");
                ) {
            String sql = String.format("select table_name as t, column_name as c, data_type as type, CHARACTER_MAXIMUM_LENGTH as len from sysibm.columns where table_schema = '%s' and table_name not like 'EXPLAIN_%%'", fSql.db.schema);
            var ret = fSql.execute(sql, fSql.getConnection());
            for (Object o : ret) {
                Obj obj = (Obj) o;
                var tname = obj.getStr("t");
                var metadata = fSql.tables.get(tname);
                if (metadata == null) {
                    metadata = new TableMetaData();
                    metadata.name = tname;
                    metadata.fields = new Vector<>();
                    fSql.tables.put(tname, metadata);
                }
                metadata.fields.add(obj.getStr("c"));
            }

            raf.write(
                    ObjectUtil.serialize(fSql.tables)
            );

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
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

    static class TableMetaData implements Serializable {
        String name;
        List<String> fields;
    }
}



