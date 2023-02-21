package org.example.patterns.structural.decorator;

public class WindInstruments  extends InstrumentsDecorator{
    public WindInstruments(Instrument newInstrument) {
        super(newInstrument);
    }

    @Override
    public String play() {
        return super.play() + " add wind tender music";
    }
}
