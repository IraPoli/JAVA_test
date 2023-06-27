package org.example.jdbc.DAO;

import org.example.jdbc.core.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

public class CommonDAO {
    static Statement statement;
    public static String getString(String query){
        try {
            statement = Connection.getInstance();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet.getString(1);
        } catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }
    public static int getInt(String query){
        try {
            statement = Connection.getInstance();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (Exception exception){
            System.out.println(exception);
        }
        return 0;
    }

    public static int getNext(String query){
      return   getInt(query)+1;
    }

    public static void execute(String query){
        try {
            statement = Connection.getInstance();

            statement.executeUpdate(query);
        } catch (Exception exception){
            System.out.println(exception);
        }
    }

}
