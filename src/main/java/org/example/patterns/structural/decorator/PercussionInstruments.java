package org.example.patterns.structural.decorator;

public class PercussionInstruments extends InstrumentsDecorator{
    public PercussionInstruments(Instrument newInstrument) {
        super(newInstrument);
    }

    @Override
    public String play() {
        return super.play() + " add LOUD nose";
    }
}
