package org.example.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.*;


import org.example.annotaions.IString;
import org.example.annotaions.RunNow;
import org.example.exceptions.ImproperAgeValueException;
public class Person implements Comparable{

    int age;
    @IString
    String name;
    int phoneNumber;

   /* static int i, j;
    static {
        System.out.println("In the static block");
        try {
            i = 0;
            j = 10/i;
        } catch(Exception e){
            System.out.println("Exception while initializing" + e.getMessage());
            try {
                throw new IOException();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            finally {

            }
            // throw new RuntimeException(e.getMessage());
        }
    }*/


    //throw exception
    public Person(int age, String name) throws ImproperAgeValueException {
        if (age <= 0) {
            //throw new ImproperAgeValueException("wrong age");
            throw new ImproperAgeValueException("wrong age", new RuntimeException()); //to print what cause this exception
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


    @Override
    public int compareTo(Object o) {


        if (this.age >  ((Person) o).age) {

            return 1;
        }
        else if (this.age < ((Person) o).age) {

            return -1;
        }
        else {


            return 0;
        }

    }


    public static Comparator<Person> comparatorByName= new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
          if(o1.name.charAt(0)<o2.name.charAt(0))return -1;
          if(o1.name.charAt(0)==o2.name.charAt(0))return 0;
         return 1;
        }

    };
}
