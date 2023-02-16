package org.example.putterns.structural.decorator;

public class StringsInstrument implements Instrument {
    @Override
    public String play() {
       return "Play by strings ";
    }
}
