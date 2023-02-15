package org.example.putterns.creational.abstructFactory.abstructFactory;

import org.example.putterns.creational.abstructFactory.animal.Animal;
import org.example.putterns.creational.abstructFactory.food.Food;

public interface PetStoreFactory {
    Animal createAnimal();
    Food createFood();
}
