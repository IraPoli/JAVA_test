package org.example.putterns.creational.factoryMathod.ride;

import org.example.putterns.creational.factoryMathod.vhicle.Bicycle;
import org.example.putterns.creational.factoryMathod.vhicle.Vehicle;

public class UseBicycle extends UseVehicle{
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
