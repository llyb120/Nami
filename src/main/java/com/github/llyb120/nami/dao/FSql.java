package com.github.llyb120.nami.dao;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.util.ClassPathResource;
import com.github.llyb120.nami.util.Util;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.beetl.sql.core.kit.GenKit;

import javax.sql.DataSource;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.core.DBService.fSql;
import static com.github.llyb120.nami.json.Json.a;
import static com.github.llyb120.nami.json.Json.o;


public class FSql {

    private Map<String,TableMetaData> tables = new Hashtable<>();
    private DataSource dataSource;
    private Config.Db db;
    private Future future;
    //todo: 相同的不再分析
    private Map<String,String> tableNameCache = new Hashtable<>();
    private DB2Driver driver;

    public FSql(Config.Db db) throws InterruptedException, ExecutionException, SQLException, IOException {
        this.db = db;
        if(db.url.startsWith("jdbc:db2:")){
            driver = new DB2Driver(this);
        }
//        future = Async.execute(() -> initDataSource());
//        if(config.dev){
////            initAllTableName();
//            future = Async.execute(() -> initDataSource());
//        } else {
//            future = Async.execute(() -> {
//                initDataSource();
////                if(!config.dev){
////                    initAllTableName();
////                }
//            });
//        }
    }

//    public SimpleQuery simple(String table){
//        return new SimpleQuery();
//    }

    public List<Json> select(String table, Object ...values){
        return select(table, Json.class, values);
    }

    public <T> List<T> select(String table, Class<T> clz, Object ...values){
        try (
                Connection conn = getConnection();
                ){
            String tname = getTableMetaData(table);
            StringBuilder sb = new StringBuilder();
            sb.append("select * from ");
            sb.append(tname);
            buildWhere(tname, sb, values);
            return (List<T>) execute(sb.toString(), conn).to(clz);
        } catch (InterruptedException | ExecutionException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insert(String table, Iterable objects){
        TableMetaData metadata = getMetaData(table);
    }

    public Json insert(String table, Object object){
        StringBuilder sb = new StringBuilder("insert into ");
        sb.append(table);
        sb.append("(");
        StringBuilder val = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        if(object instanceof Map){
            if(((Map) object).size() > 0){
                ((Map) object).forEach((k,v) -> {
                    sb.append(k);
                    sb.append(",");
                    if(v == null){
                        val.append("null,");
                    } else {
                        if(v instanceof Date){
                            v = sdf.format(v);
                        }
                        val.append("'");
                        val.append(v);
                        val.append("'");
                        val.append(",");
                    }
                });
                sb.deleteCharAt(sb.length() - 1);
                val.deleteCharAt(val.length() - 1);
            }
        } else {

        }
        sb.append(")vals(");
        sb.append(val);
        sb.append(")");
        Json id = executeInsert(sb.toString());
        return id;
    }

    private TableMetaData getMetaData(String table){
        if(config.dev){

        } else {

        }
        return null;
    }



    private void buildWhere(String tname, StringBuilder sb, Object ...values){
        sb.append(" where 1 = 1");
        TableMetaData table = tables.get(tname);
        for (int i = 0; i < values.length; i++) {
            if (table == null) {
//                sb.append("")
            } else {
                sb.append(" and ");
                sb.append(getField(table, (String)values[i]));
                sb.append(" = ");
                sb.append("'" + ((String)values[++i]) + "'");
            }
        }
    }

    private Arr execute(String sql, Connection connection) throws SQLException {
        System.out.println(sql);
        Arr list = a();
        try(
                Statement stmt = connection.createStatement();
                ){
            ResultSet ret = stmt.executeQuery(sql);
            ResultSetMetaData metadata = ret.getMetaData();
            while(ret.next()){
                Obj Json = o();
                list.add(Json);
                for(int i = 1; i <= metadata.getColumnCount(); i++){
                    Json.put(metadata.getColumnLabel(i).toLowerCase(), ret.getObject(i)) ;
                }
            }
            return list;
        }
    }

    public Json execute(String sql){
        try(
               Connection conn = getConnection();
                ){
            System.out.println(sql);
            return execute(sql, conn);
        } catch (SQLException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return a();
    }

    private int executeUpdate(String sql){
        try(
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ){
            System.out.println(sql);
//            conn.prepareStatement()
            int ret = stmt.executeUpdate(sql);
            return ret;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    private Arr executeInsert(String sql){
        Arr ret = a();
        try(
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ) {
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            ResultSetMetaData metadata = rs.getMetaData();
            while(rs.next()){
                Obj Json = o();
                for (int i = 1; i <= metadata.getColumnCount(); i++) {
                    Json.put(metadata.getColumnLabel(i), rs.getObject(i));
                }
                ret.add(Json);
            }
            return ret;
        } catch (InterruptedException | ExecutionException | SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }

    private Connection getConnection() throws SQLException, ExecutionException, InterruptedException {
        if(!future.isDone()) future.get();
        return dataSource.getConnection();
    }

    private String getTableMetaData(String tableName) throws InterruptedException, ExecutionException, SQLException {
        tableName = tableName.toUpperCase();
        String finalTableName = tableName;
        List<Object[]> list = tables.keySet()
                .stream()
                .map(e -> new Object[]{e, FBsqlUtil.sim(e, finalTableName)})
                .sorted((a, b) -> Double.compare((double) b[1], (double) a[1]))
                .collect(Collectors.toList());
        return (String) list.get(0)[0];
    }

    private String getField(TableMetaData metaData, String key){
        key = key.toUpperCase();
        String finalKey = key;
        List<Object[]> list = metaData.fields.stream()
                .map(e -> new Object[]{e, FBsqlUtil.sim(e, finalKey)})
                .sorted((a, b) -> Double.compare((double) b[1], (double) a[1]))
                .collect(Collectors.toList());
        return (String) list.get(0)[0];
    }


    @Deprecated
    private void initAllTableName() throws InterruptedException, ExecutionException, SQLException, IOException {
        if(config.dev){
            try(
                    InputStream is = new ClassPathResource("fsql/cache/ALL_TABLES").getStream();
                    ){
                tables = Util.unserialize(Util.readBytes(is));
            } catch (Exception e){
                System.out.println("加载缓存失败，你可能需要生成fsql的缓存");
            }
        } else {
            String sql = String.format("select table_name as t, column_name as c, data_type as type, CHARACTER_MAXIMUM_LENGTH as len from sysibm.columns where table_schema = '%s' and table_name not like 'explain%%'", db.schema);
            Arr ret = execute(sql, dataSource.getConnection());
            for (Object o : ret) {
                Obj Json = (Obj) o;
                String tname = Json.s("t");
                TableMetaData metadata = tables.get(tname);
                if (metadata == null) {
                    metadata = new TableMetaData();
                    metadata.name = tname;
                    tables.put(tname, metadata);
                }
                metadata.fields.add(Json.s("c"));
            }
        }
    }

    public static void mkCache(){
        Nami.dev();
        File path = new File(GenKit.getJavaResourcePath(), "fsql/cache");
        //reset
        path.mkdirs();
        for (File file : path.listFiles()) {
            file.delete();
        }
        //生成表名索引
        try(
             RandomAccessFile raf = new RandomAccessFile(new File(path, "ALL_TABLES"), "rw");
                ) {
            String sql = String.format("select table_name as t, column_name as c, data_type as type, CHARACTER_MAXIMUM_LENGTH as len from sysibm.columns where table_schema = '%s' and table_name not like 'EXPLAIN_%%'", fSql.db.schema);
            Arr ret = fSql.execute(sql, fSql.getConnection());
            for (Object o : ret) {
                Obj Json = (Obj) o;
                String tname = Json.s("t");
                TableMetaData metadata = fSql.tables.get(tname);
                if (metadata == null) {
                    metadata = new TableMetaData();
                    metadata.name = tname;
                    metadata.fields = new Vector<>();
                    fSql.tables.put(tname, metadata);
                }
                metadata.fields.add(Json.s("c"));
            }

            raf.write(
                    Util.serialize(fSql.tables)
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



