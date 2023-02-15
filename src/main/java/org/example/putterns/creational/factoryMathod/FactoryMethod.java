package org.example.putterns.creational.factoryMathod;

import org.example.putterns.creational.factoryMathod.ride.UseBicycle;
import org.example.putterns.creational.factoryMathod.ride.UseBoat;
import org.example.putterns.creational.factoryMathod.ride.UseCar;
import org.example.putterns.creational.factoryMathod.ride.UseVehicle;

public class FactoryMethod {
    private static UseVehicle useVehicle;

    static void preSet(String vehicle){
        if (vehicle.equals("Road")){
             useVehicle = new UseCar();
        }
        if (vehicle.equals("Wood")){
             useVehicle = new UseBicycle();
        }
        if (vehicle.equals("River")){
            useVehicle = new UseBoat();
        }
    }

     static void ride(){
            useVehicle.start();
    }

    public static void runFactoryMethod(){
        preSet("River"); // River,Road ,Wood
        ride();
    }

}
