package org.example.patterns.structural.decorator;

public class RunDecorator {
    public static void run() {
        Instrument music1 = new WindInstruments( new StringsInstrument());
        System.out.println("Music1 -" + music1.play());

        Instrument music2 = new PercussionInstruments( new StringsInstrument());
        System.out.println("Music2 -" +music2.play());


        Instrument music3 = new PercussionInstruments(new WindInstruments( new StringsInstrument()));
        System.out.println("Music2 -" +music3.play());

    }

}
