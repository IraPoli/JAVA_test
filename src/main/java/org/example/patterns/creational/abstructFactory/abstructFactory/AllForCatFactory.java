package org.example.patterns.creational.abstructFactory.abstructFactory;

import org.example.patterns.creational.abstructFactory.animal.Animal;
import org.example.patterns.creational.abstructFactory.animal.Cat;
import org.example.patterns.creational.abstructFactory.food.FishCatsFood;
import org.example.patterns.creational.abstructFactory.food.Food;

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
