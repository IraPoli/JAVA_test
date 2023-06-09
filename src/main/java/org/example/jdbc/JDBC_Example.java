package org.example.jdbc;

import org.example.jdbc.DAO.ConnectionDAO;
import org.example.jdbc.DAO.CourseDAO;
import org.example.jdbc.DAO.PersonDAO;
import org.example.jdbc.dto.Person;


public class JDBC_Example {
    public static void run()  {
        PersonDAO personDAO = new PersonDAO();
        Person p4 = personDAO.getPersonById(4);
        System.out.println(p4);
        personDAO.addPerson("New","Person","student");
        personDAO.setAsProfessor(8);


        ///group
        CourseDAO groupDAO = new CourseDAO();
        groupDAO.createCourse("Testnow3",4);
        groupDAO.updateCourseNameById("biology",2);
        System.out.println("stop");

        //connection
        ConnectionDAO connectionDAO = new ConnectionDAO();
        //connectionDAO.addConnection(4,1,10);


        connectionDAO.addConnection(2,1,1);
        connectionDAO.addConnection(1,1,1);
        System.out.println("stop");
    }



}
