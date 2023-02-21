package org.example.patterns.creational.factoryMathod.ride;

import org.example.patterns.creational.factoryMathod.vhicle.Car;
import org.example.patterns.creational.factoryMathod.vhicle.Vehicle;

public class UseCar extends UseVehicle{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
