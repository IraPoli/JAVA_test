package org.example.patterns.creational.factoryMathod.vhicle;

public class Boat implements Vehicle{
    @Override
    public int countTimeForeRoad(int length) {
        return length*30;
    }

    @Override
    public void move() {
        System.out.println("Boat start moving");
    }
}
