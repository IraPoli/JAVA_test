package org.example.putterns.creational.abstructFactory;

import org.example.putterns.creational.abstructFactory.abstructFactory.PetStoreFactory;
import org.example.putterns.creational.abstructFactory.animal.Animal;
import org.example.putterns.creational.abstructFactory.food.Food;

public class AnimalSet {
    private Animal animal;
    private Food food;

    public AnimalSet(PetStoreFactory petStoreFactory) {
        this.animal = petStoreFactory.createAnimal();
        this.food = petStoreFactory.createFood();
    }

    public void printDescription(int age){
        animal.say();
        food.count(age);
    }
}
