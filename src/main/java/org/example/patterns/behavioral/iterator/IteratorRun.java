package org.example.patterns.behavioral.iterator;

public class IteratorRun {
    public static void run(){
        CollectionOfCar collectionOfCar = new CollectionOfCar();

        for(Iterator iterator = collectionOfCar.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Car brand : " + name);
        }
    }
}
