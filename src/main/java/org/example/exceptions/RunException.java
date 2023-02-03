package org.example.exceptions;

public class RunException {
    public static void run(){

        //throws
        Person simon = new Person(-5, "Mike");
        // checked compile-time exceptions
        try {
            Person andrew = new Person(30, "Andrew");
            System.out.println("print Exception");
            andrew.readPersonFromFile("\\src\\main\\resources\\PersonData");
            System.out.println("work");
            andrew.readPersonFromFile("C:\\Users\\Iryna_Poliakova1\\IdeaProjects\\test\\src\\main\\resources\\PersoneData");

            System.out.println(andrew);

            Person mike = new Person(-5, "Mike");
        }

        catch (IllegalArgumentException e) {
            System.out.println("wrong age");
        }
        catch (Exception e){
            System.out.println("exception catch");
        }

        finally {
            System.out.println("Finally block");
        }

        ///

        PersonaList pL = new PersonaList();
        pL.getPersonsFromFile("C:\\Users\\Iryna_Poliakova1\\IdeaProjects\\test\\src\\main\\resources\\PersoneData1");
        pL.getPersonsFromFile("C:\\Users\\Iryna_Poliakova1\\IdeaProjects\\test\\src\\main\\resources\\PersoneData");
        System.out.println(pL);
        ////

        // unchecked exception run time
        Person anton = new Person(65, "Anton");
        Person nik = null;
        System.out.println(pL.getPersonByIndex(0).equals(anton));
        //  System.out.println(nik.equals(anton)); //NullPointerException
        //   pL.getPersonByIndex(5);//IndexOutOfBoundsException


        //


    }
}
