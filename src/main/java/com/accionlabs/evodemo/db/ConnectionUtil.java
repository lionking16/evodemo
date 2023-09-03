// Copyright (c) 2023 AccionLabs.
package com.accionlabs.evodemo.db;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public final class ConnectionUtil {

    private PooledConnection pooledConnection;

    private final static class ConnectionUtilInstance {
        public static final ConnectionUtil connectionUtil;

        static {
            try {
                connectionUtil = new ConnectionUtil();
            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private ConnectionUtil() throws IOException, SQLException {
        MysqlConnectionPoolDataSource mysqlConnectionPoolDataSource = new MysqlConnectionPoolDataSource();

        Properties config = new Properties();
        config.load(new FileInputStream(new File("src/main/resources/config.properties")));

        mysqlConnectionPoolDataSource.setUrl(config.getProperty("url"));
        mysqlConnectionPoolDataSource.setUser(config.getProperty("user"));
        mysqlConnectionPoolDataSource.setPassword(config.getProperty("password"));

        pooledConnection = mysqlConnectionPoolDataSource.getPooledConnection();
    }

    public static ConnectionUtil getInstance() {
        return ConnectionUtilInstance.connectionUtil;
    }

    public Connection getConnection() throws SQLException {
        return pooledConnection.getConnection();
    }

    public void closePooledConnection() throws SQLException {
        pooledConnection.close();
    }

}
