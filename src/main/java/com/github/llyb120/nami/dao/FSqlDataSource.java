package com.github.llyb120.nami.dao;

import com.github.llyb120.nami.core.Config;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class FSqlDataSource implements DataSource {

    public static DataSource dataSource;

    static {
        System.out.println("initializing DataSource");
        Config.Db ds = Config.config.db.get("default");
        if (ds == null) {
            throw new RuntimeException("无法找到默认的数据源");
        }
        dataSource = new FSqlDataSource(ds);
    }

    private ReentrantLock lock;
    private Config.Db db;
    private ConcurrentLinkedDeque<Connection> pool = new ConcurrentLinkedDeque<>();

    public FSqlDataSource(Config.Db db){
        this.db = db;
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection item = pool.poll();
        if(item == null){
            item = createConnection();
        } else {
            if(item.isClosed()){
                pool.remove(item);
                item = createConnection();
            }
        }
        return item;
    }

    public void freeConnection(Connection connection){
        pool.offer(connection);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return getConnection();
    }

    private Connection createConnection() throws SQLException {
        return new FSqlConnection(this, DriverManager.getConnection(db.url, db.username, db.password));
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
