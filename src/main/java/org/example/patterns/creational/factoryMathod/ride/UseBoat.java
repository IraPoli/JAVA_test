package org.example.patterns.creational.factoryMathod.ride;

import org.example.patterns.creational.factoryMathod.vhicle.Boat;
import org.example.patterns.creational.factoryMathod.vhicle.Vehicle;

public class UseBoat extends UseVehicle{
    @Override
    public Vehicle createVehicle() {
        return new Boat();
    }
}
