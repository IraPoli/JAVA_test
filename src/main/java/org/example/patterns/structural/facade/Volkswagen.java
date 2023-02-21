package org.example.patterns.structural.facade;

public class Volkswagen implements CarCreate {
    @Override
    public void model() {
        System.out.println("Volkswagen");

    }

    @Override
    public void price() {
        System.out.println("It's price is 40");
    }
}
