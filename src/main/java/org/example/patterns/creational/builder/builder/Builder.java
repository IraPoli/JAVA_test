package org.example.patterns.creational.builder.builder;

import org.example.patterns.creational.builder.components.Roof;

public interface Builder {
    Builder setHouseType(HouseType type);
    Builder setRooms(int rooms);

    Builder setRoof(Roof roof);
}
