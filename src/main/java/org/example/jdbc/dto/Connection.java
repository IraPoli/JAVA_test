package org.example.jdbc.dto;

public class Connection {
           int studentID;
           int courseID;
           int grade;

    @Override
    public String toString() {
        return "Student id"+ studentID + "; course ID " + courseID + "; grade " + grade;
    }
}
