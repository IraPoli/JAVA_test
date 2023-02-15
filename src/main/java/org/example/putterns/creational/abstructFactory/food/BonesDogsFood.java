package org.example.putterns.creational.abstructFactory.food;

public class BonesDogsFood implements Food {

    @Override
    public void count(int age) {
        System.out.println("Hire is my "+ age/6 + "kg of bones");

    }
}
