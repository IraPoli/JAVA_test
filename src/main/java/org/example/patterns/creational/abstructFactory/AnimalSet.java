package org.example.patterns.creational.abstructFactory;

import org.example.patterns.creational.abstructFactory.abstructFactory.PetStoreFactory;
import org.example.patterns.creational.abstructFactory.animal.Animal;
import org.example.patterns.creational.abstructFactory.food.Food;

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
