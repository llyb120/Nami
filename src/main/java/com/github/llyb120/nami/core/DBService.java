package com.github.llyb120.nami.core;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.StrUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.beetl.sql.core.*;
import org.beetl.sql.core.annotatoin.Table;
import org.beetl.sql.core.db.DB2SqlStyle;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.KeyWordHandler;
import org.beetl.sql.core.db.MySqlStyle;

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class DBService {
    public static DataSource dataSource; 
    public static SQLManager sqlManager;

    private static void init(Nami.Listener listener){
        //修复beetl不支持java11的问题
//        System.setProperty("java.version", "11.0");
        Config.Db ds = Config.config.db.get("main");

//            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
//            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

//        dataSource = new HikariDataSource(hikariConfig);
        //异步延迟初始化数据源
        dataSource = (DataSource) Proxy.newProxyInstance(DataSource.class.getClassLoader(), new Class[]{DataSource.class}, new InvocationHandler() {
            private Future future = null;
            private DataSource _dataSource;
            {{
                future = Async.submit(() -> {
                    HikariConfig hikariConfig = new HikariConfig();
                    //设置url
                    hikariConfig.setJdbcUrl(ds.url);
                    //数据库帐号
                    hikariConfig.setUsername(ds.username);
                    //数据库密码
                    hikariConfig.setPassword(ds.password);
                    hikariConfig.setDriverClassName(ds.driver);
                    hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
                    _dataSource = new HikariDataSource(hikariConfig);
                });
            }}

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                while (!future.isDone()){
                    ThreadUtil.sleep(16);
                }
                return method.invoke(_dataSource, args);
            }
        });
        ConnectionSource source = ConnectionSourceHelper.getSingle(dataSource);
        ClasspathLoader loader = new ClasspathLoader("/sql");
        NameConversion nc;
        if (null != ds.style && ds.style.equals("_")) {
            nc = new NameConversion() {

                @Override
                public String getClassName(String tableName) {
                    var name = StrUtil.toCamelCase(tableName.toLowerCase());
                    return name.substring(0,1).toUpperCase() + name.substring(1);
                }

                @Override
                public String getTableName(Class<?> c) {
                    Table table = (Table)c.getAnnotation(Table.class);
                    if (table != null) {
                        return table.name().toLowerCase();
                    }

                    return c.getSimpleName();
                }

                @Override
                public String getColName(Class<?> aClass, String s) {
                    return s.toLowerCase();
                }

                @Override
                public String getPropertyName(Class<?> aClass, String s) {
                    return s.toLowerCase();
                }
            };
        } else {
            nc = new UnderlinedNameConversion();
        }
        DBStyle style = null;
        if("com.mysql.jdbc.Driver".equals(ds.driver)){
            style = new MySqlStyle();
            style.setKeyWordHandler(new KeyWordHandler() {
                @Override
                public String getTable(String tableName) {
                    return "`" + tableName + "`";
                }

                @Override
                public String getCol(String colName) {
                    return colName;
                }
            });
        } else if("com.ibm.db2.jcc.DB2Driver".equals(ds.driver)){
            style = new DB2SqlStyle();
        }
        var property = new Properties();
        property.setProperty("CHARSET", "UTF-8");
        sqlManager = new SQLManager(style, loader,source,nc,new Interceptor[]{new MyDebugInterceptor()}, ds.schema, property);

        if (listener != null) {
            listener.onDBServiceBooted();
        }

    }

    public static void start(boolean async){
        start(async, null);
    }

    public static void start(boolean async, Nami.Listener listener){
        if(!async){
            init(listener);
        } else {
            Async.submit(() -> init(listener));
        }
    }




}
