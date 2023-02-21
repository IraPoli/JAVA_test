package org.example.patterns.creational.factoryMathod.ride;

import org.example.patterns.creational.factoryMathod.vhicle.Vehicle;

public abstract class UseVehicle {

    public void start() {
        Vehicle vehicle = createVehicle();
        vehicle.move();
        System.out.println("We will ride 10 km in " + vehicle.countTimeForeRoad(10) + "minutes");
    }

    public abstract Vehicle createVehicle();
}
