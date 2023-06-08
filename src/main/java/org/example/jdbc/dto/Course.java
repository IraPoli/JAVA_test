package org.example.jdbc.dto;

public class Course {
    public int courseId;
    public String name;
    public int duration;

    @Override
    public String toString() {
       return  courseId + " " + name + " " + duration;
    }
}
