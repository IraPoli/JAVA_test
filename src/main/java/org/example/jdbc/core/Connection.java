package org.example.jdbc.core;

import org.example.jdbc.utils.PropertiesReader;

import java.sql.DriverManager;
import java.sql.Statement;

import static org.example.jdbc.core.Const.*;

public class Connection {
    private static final ThreadLocal<Statement> statementThreadLocal = new ThreadLocal<>();

    public static Statement getInstance() {
        if (statementThreadLocal.get() == null) {
            try {
                Class.forName("org.postgresql.Driver");
                PropertiesReader propertiesReader = new PropertiesReader();
                java.sql.Connection connection = DriverManager.getConnection(   propertiesReader.getDBURL(),
                                                                                propertiesReader.getDBName(),
                                                                                propertiesReader.getDBPassword());
                Statement statement = connection.createStatement();
                statementThreadLocal.set(statement);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return statementThreadLocal.get();
    }
}
