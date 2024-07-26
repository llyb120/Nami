package com.github.llyb120.nami.ext.beetlsql;

import com.github.llyb120.nami.core.Config;
import com.github.llyb120.nami.util.Util;
import org.beetl.sql.core.*;
import org.beetl.sql.core.annotatoin.Table;
import org.beetl.sql.core.db.DB2SqlStyle;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.KeyWordHandler;
import org.beetl.sql.core.db.MySqlStyle;

import java.util.Properties;

import static com.github.llyb120.nami.core.Config.config;
import static com.github.llyb120.nami.dao.FSqlDataSource.dataSource;

public class BeetlSql {
    public static SQLManager sqlManager;

    static {
        System.out.println("Initializing BeetlSql");
        Config.Db ds = config.db.get("default");
        ConnectionSource source = ConnectionSourceHelper.getSingle(dataSource);
        ClasspathLoader loader = new ClasspathLoader("/sql");
        NameConversion nc;
        if (null != ds.style && ds.style.equals("_")) {
            nc = new NameConversion() {

                @Override
                public String getClassName(String tableName) {
                    String name = Util.toCamelCase(tableName.toLowerCase());
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
        Properties property = new Properties();
        property.setProperty("CHARSET", "UTF-8");
        Interceptor[] interceptors = new Interceptor[0];
        if(config.dev){
            interceptors = new Interceptor[]{new MyDebugInterceptor()};
        }
        sqlManager = new SQLManager(style, loader,source,nc, interceptors,ds.schema, property ,"default");

//        if (listener != null) {
//            listener.onDBServiceBooted();
//        }
    }
}
