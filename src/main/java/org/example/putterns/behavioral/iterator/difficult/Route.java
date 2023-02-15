package org.example.putterns.behavioral.iterator.difficult.route;

import org.example.putterns.behavioral.iterator.difficult.countreas.TravelType;
import org.example.putterns.behavioral.iterator.difficult.itarator.SightseeingIterator;

public class Route {
    public SightseeingIterator iterator;
    public TravelType travelType;

    public Route(TravelType travelType) {
        this.travelType = travelType;
    }

    public void printRoad(){
        System.out.println("Iterate");
        //iterator = travelType.
    }
}
