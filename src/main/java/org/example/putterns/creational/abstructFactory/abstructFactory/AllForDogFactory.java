package org.example.putterns.creational.abstructFactory.abstructFactory;

import org.example.putterns.creational.abstructFactory.animal.Animal;
import org.example.putterns.creational.abstructFactory.animal.Dog;
import org.example.putterns.creational.abstructFactory.food.Food;
import org.example.putterns.creational.abstructFactory.food.BonesDogsFood;

public class AllForDogFactory implements PetStoreFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Food createFood() {
        return new BonesDogsFood();
    }
}
