package org.example.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Objects;


import org.example.annotaions.IString;
import org.example.annotaions.RunNow;
import org.example.exceptions.ImproperAgeValueException;
public class Person {
    int age;
    @IString
    String name;
    int phoneNumber;


    //throw exception
    public Person(int age, String name) throws ImproperAgeValueException {
        if (age<=0){
            throw new ImproperAgeValueException(new RuntimeException()); //to print what cause this exception
           // throw new ImproperAgeValueException(name + " have age" + age);
         //   throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;

        this.name = name;
    }


    //try with resources
     public  void readPersonFromFile(String path){

        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String[] data = br.readLine().split("_");
            this.age = Integer.parseInt(data[1]);
            this.name = data[0];
        }catch (Exception e){
            System.out.println("catch exception : " + e);
        }
    }

    public String getInfo() {
        return this.name+"+" +this.age;
    }

    @RunNow(times = 3)
    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return ("Name - " + this.name + ". Age - " + this.age + ".");
    }


    @Override
    public boolean equals(Object p) {
        if (p instanceof Person) {
            return (Objects.equals(((Person) p).getInfo(), this.getInfo()));
        }
        return false;
    }


}
