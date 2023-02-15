package org.example.putterns.creational.factoryMathod.ride;

import org.example.putterns.creational.factoryMathod.vhicle.Bicycle;
import org.example.putterns.creational.factoryMathod.vhicle.Boat;
import org.example.putterns.creational.factoryMathod.vhicle.Vehicle;

public class UseBoat extends UseVehicle{
    @Override
    public Vehicle createVehicle() {
        return new Boat();
    }
}
