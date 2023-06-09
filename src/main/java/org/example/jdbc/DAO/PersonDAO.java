package org.example.jdbc.DAO;


import org.example.jdbc.core.Connection;
import org.example.jdbc.dto.Person;

import java.sql.ResultSet;
import java.sql.Statement;

public class PersonDAO  extends CommonDAO{
    Statement statement;
    public Person getPersonById(int id) {
        try {
            String query = "select firstName, lastName, role from `jdbc-v`.`people` where id = " + id;
            Person person = new Person();
            person.id = id;
            statement = Connection.getInstance();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            person.firstName = resultSet.getString(1);
            person.lastName = resultSet.getString(2);
            person.role = resultSet.getString(3);
            return person;
        } catch (Exception exception){
            System.out.println(exception);
        }
        return null;
    }

    public void addPerson(String firstName, String lastName, String role){

        String updateQuery = "INSERT INTO `jdbc-v`.`people` (`id`, `firstName`, `lastName`, `role`) VALUES ('" + getNextId()
                + "', '" + firstName
                + "', '" + lastName
                + "', '" + role + "');";

        CommonDAO.execute(updateQuery);
    }

    public void setAsProfessor(int id) {
        String updateQuery = "UPDATE `jdbc-v`.`people` SET `role` = 'professor' WHERE (`id` = '" + id + "');";
        CommonDAO.execute(updateQuery);
    }


    public String getPersonNameById(int id) {
        String query = "select firstName from `jdbc-v`.`people` Where id= " + id;
        return CommonDAO.getString(query);
    }

    public static int getNextId(){
        String query = "SELECT COUNT(*) as count_connections from `jdbc-v`.`people`;";
        return CommonDAO.getNext(query);
    }
}
