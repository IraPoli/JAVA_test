package org.example.putterns.creational.factoryMathod.vhicle;

public class Bicycle implements Vehicle {

    @Override
    public int countTimeForeRoad(int length) {
        return length*25;
    }

    @Override
    public void move() {
        System.out.println("Bicycle start moving");
    }
}
