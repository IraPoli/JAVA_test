package org.example.patterns.structural.facade;

public class Reno implements CarCreate{
    @Override
    public void model() {
        System.out.println("Toyota");
    }

    @Override
    public void price() {
        System.out.println("It's price is 40");
    }
}
