package org.example.jdbc.dto;

public class Person {
    public int id;
    public String firstName;
    public String lastName;
    public String role;

    @Override
    public String toString() {
        return firstName + " " + lastName + "  role-" + role;
    }
}
