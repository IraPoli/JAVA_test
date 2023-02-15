package org.example.putterns.creational.abstructFactory;

import org.example.putterns.creational.abstructFactory.abstructFactory.AllForCatFactory;
import org.example.putterns.creational.abstructFactory.abstructFactory.AllForDogFactory;
import org.example.putterns.creational.abstructFactory.abstructFactory.PetStoreFactory;

public class RunAbstractFactory {
    private static AnimalSet createSet(String animal){
        AnimalSet animalSet;
        PetStoreFactory petStoreFactory;
        if (animal.equals("Cat")) petStoreFactory = new AllForCatFactory();
        else  petStoreFactory = new AllForDogFactory();


        animalSet = new AnimalSet(petStoreFactory);
        return animalSet;
    }

    public static void demo(){
        AnimalSet animalSet = createSet("Cat");
        animalSet.printDescription(12);
    }
}
