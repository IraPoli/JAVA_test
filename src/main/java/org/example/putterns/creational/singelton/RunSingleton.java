package org.example.putterns.creational.singelton;

public class RunSingleton {
    public static void run(){
        Singleton singleton = Singleton.getInstance("First and only");
        Singleton anotherSingleton = Singleton.getInstance("Second");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
