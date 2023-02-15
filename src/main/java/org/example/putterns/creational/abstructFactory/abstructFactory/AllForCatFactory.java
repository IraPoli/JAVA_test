package org.example.putterns.creational.abstructFactory.abstructFactory;

import org.example.putterns.creational.abstructFactory.animal.Animal;
import org.example.putterns.creational.abstructFactory.animal.Cat;
import org.example.putterns.creational.abstructFactory.animal.Dog;
import org.example.putterns.creational.abstructFactory.food.BonesDogsFood;
import org.example.putterns.creational.abstructFactory.food.FishCatsFood;
import org.example.putterns.creational.abstructFactory.food.Food;

public class AllForCatFactory implements PetStoreFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Food createFood() {
        return new FishCatsFood();
    }
}
