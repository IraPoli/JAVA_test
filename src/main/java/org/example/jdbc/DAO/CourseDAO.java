package org.example.jdbc.DAO;

import org.example.jdbc.core.Connection;
import org.example.jdbc.dto.Course;
import org.example.jdbc.dto.Person;

import java.sql.ResultSet;
import java.sql.Statement;

public class CourseDAO {
    Statement statement;
    public void createCourse(String name, int duration) {
        String updateQuery = "INSERT INTO `jdbc-v`.`courses` (`idcource`, `name` ,`duration`) VALUES ('" + getNextId()
                + "', '" + name+ "', '"+duration+ "');";
        CommonDAO.execute(updateQuery);
    }
    public void updateCourseNameById(String newName, int id) {
        String updateQuery = "UPDATE `jdbc-v`.`courses` SET `name` = '"+newName+"' WHERE (`idcource` = '"+id+"');";
        CommonDAO.execute(updateQuery);
    }

    public Course getCourseById(int id) {
        try {
            String query = "select * from `jdbc-v`.`people` where idcource = " + id;
            Course course = new Course();
            course.courseId = id;
            statement = Connection.getInstance();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            course.name = resultSet.getString(2);
            course.duration = resultSet.getInt(3);
            return course;
        } catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }


    public String getCourseNameById(int id) {
        String query = "select name from `jdbc-v`.`courses` where idcource = " + id;
       /* try {
            statement = Connection.getInstance();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet.getString(1);
        } catch (Exception exception){
            System.out.println(exception);
        }
        return null;*/
        return CommonDAO.getString(query);
    }

    public static int getNextId(){
        String query = "SELECT COUNT(*) as count_connections from `jdbc-v`.`courses`;";
        return CommonDAO.getInt(query) ;
    }
}
