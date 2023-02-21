package org.example.patterns.creational.abstructFactory.abstructFactory;

import org.example.patterns.creational.abstructFactory.animal.Animal;
import org.example.patterns.creational.abstructFactory.animal.Dog;
import org.example.patterns.creational.abstructFactory.food.Food;
import org.example.patterns.creational.abstructFactory.food.BonesDogsFood;

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
