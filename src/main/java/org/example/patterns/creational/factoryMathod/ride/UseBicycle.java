package org.example.patterns.creational.factoryMathod.ride;

import org.example.patterns.creational.factoryMathod.vhicle.Bicycle;
import org.example.patterns.creational.factoryMathod.vhicle.Vehicle;

public class UseBicycle extends UseVehicle{
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
