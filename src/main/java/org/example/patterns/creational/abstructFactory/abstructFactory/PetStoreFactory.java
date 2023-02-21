package org.example.patterns.creational.abstructFactory.abstructFactory;

import org.example.patterns.creational.abstructFactory.animal.Animal;
import org.example.patterns.creational.abstructFactory.food.Food;

public interface PetStoreFactory {
    Animal createAnimal();
    Food createFood();
}
