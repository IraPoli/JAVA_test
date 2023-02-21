package org.example.patterns.creational.builder.builder;

import org.example.patterns.creational.builder.components.Roof;

public class HouseBuilder  implements Builder {
    private HouseType type;
    private int rooms;
    private Roof roof;



    @Override
    public HouseBuilder setHouseType(HouseType type) {
        this.type = type;
        return this;
    }

    @Override
    public HouseBuilder setRooms(int rooms){
        this.rooms = rooms;
        return this;
    }


    @Override
    public HouseBuilder setRoof(Roof roof){
        this.roof = roof;
        return this;
    }

    public House buildHouse(){
        return new House(type ,rooms ,roof);
    }
}
