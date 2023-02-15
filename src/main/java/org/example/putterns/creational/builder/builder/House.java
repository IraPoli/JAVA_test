package org.example.putterns.creational.builder.builder;

import org.example.putterns.creational.builder.components.Roof;

public class House {
    private HouseType type;
    private int rooms;
    private Roof roof;

     protected House(HouseType type, int rooms, Roof roof) {
        this.type = type;
        this.rooms = rooms;
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "We build "  + type+ " house with " + rooms +" rooms";
    }
}
