package org.example.putterns.creational.builder.builder;

import org.example.putterns.creational.builder.components.Roof;

public class ToyHouseBuilder implements Builder{
    private HouseType type;
    private int rooms;
    private Roof roof;
    private int size;


    @Override
    public ToyHouseBuilder setHouseType(HouseType type) {
        this.type = type;
        return this;
    }

    @Override
    public ToyHouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;

    }

    @Override
    public ToyHouseBuilder setRoof(Roof roof) {
        this.roof = roof;
        return this;
    }

    public House buildHouse(){
        return new House(type ,rooms ,roof);
    }
}
