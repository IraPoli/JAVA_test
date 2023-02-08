package org.example.putterns.creational.builder;

import org.example.putterns.creational.builder.builder.HouseBuilder;
import org.example.putterns.creational.builder.builder.HouseType;
import org.example.putterns.creational.builder.builder.ToyHouseBuilder;
import org.example.putterns.creational.builder.components.Roof;
import org.example.putterns.creational.builder.components.RoofType;
import org.example.putterns.creational.builder.decore.Director;
import org.example.putterns.creational.builder.builder.House;


public class Demo {
    //separate constructor
    public static void run() {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();

        director.projectPrivateHouse(houseBuilder);
       // House house = new House(HouseType.PANEL,4,new Roof(RoofType.PLASTIC,10)); protected constructor so cant create;

        House house = houseBuilder.buildHouse();
        System.out.println("Result -  " + house.toString());

        director.projectApartmentBuilding(houseBuilder);
        House house2 = houseBuilder.buildHouse();
        System.out.println("Result -  " + house2.toString());




        ToyHouseBuilder toyHouseBuilder = new ToyHouseBuilder();
        director.projectApartmentBuilding(toyHouseBuilder);
        House toyHouse = toyHouseBuilder.buildHouse();


        System.out.println("Toy House -  " + toyHouse.toString());
    }
}



