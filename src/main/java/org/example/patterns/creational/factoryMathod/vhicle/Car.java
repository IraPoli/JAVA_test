package org.example.patterns.creational.factoryMathod.vhicle;

public class Car implements Vehicle {
    @Override
    public int countTimeForeRoad(int length) {
        return length*100;
    }

    @Override
    public void move() {
        System.out.println("Car start moving");
    }
}
