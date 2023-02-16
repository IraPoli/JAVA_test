package org.example.putterns.structural.decorator;

public abstract class InstrumentsDecorator implements Instrument{

    private Instrument newInstrument;
    public InstrumentsDecorator(Instrument newInstrument){
        this.newInstrument= newInstrument;
    }

    @Override
    public String play() {
        return newInstrument.play();

    }
}
