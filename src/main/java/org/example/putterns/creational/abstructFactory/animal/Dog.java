package org.example.putterns.creational.abstructFactory.animal;

import org.example.putterns.creational.abstructFactory.animal.Animal;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("I am dog: wof-wof");
    }
}
