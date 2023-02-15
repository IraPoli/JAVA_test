package org.example.putterns.creational.abstructFactory.food;

public class FishCatsFood implements Food {
    @Override
    public void count(int age) {
        System.out.println("Hire is my "+ age/4 + "kg of fish");
    }
}
