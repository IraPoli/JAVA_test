package org.example.jdbc.core;

import java.sql.DriverManager;
import java.sql.Statement;

import static org.example.jdbc.core.Const.*;

public class Connection {
    private static final ThreadLocal<Statement> statementThreadLocal = new ThreadLocal<>();

    public static Statement getInstance() {
        if (statementThreadLocal.get() == null) {
            try {
                Class.forName("org.postgresql.Driver");
                java.sql.Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                statementThreadLocal.set(statement);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return statementThreadLocal.get();
    }
}
