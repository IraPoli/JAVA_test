package org.example.patterns.creational.builder.decore;

import org.example.patterns.creational.builder.builder.Builder;
import org.example.patterns.creational.builder.components.Roof;
import org.example.patterns.creational.builder.components.RoofType;
import org.example.patterns.creational.builder.builder.HouseType;

public class Director {
    public void projectApartmentBuilding(Builder builder){
        builder.setHouseType(HouseType.PANEL)
                .setRoof(new Roof(RoofType.METAL,10))
                .setRooms(400);

    }

    public void projectPrivateHouse(Builder builder){
        builder.setHouseType(HouseType.BRICK)
                .setRoof(new Roof(RoofType.CERAMIC,7))
                .setRooms(6);

    }

    public void projectCottage(Builder builder){
        builder.setHouseType(HouseType.WOODEN)
                .setRoof(new Roof(RoofType.METAL,4))
                .setRooms(3);
    }
}