package org.example.patterns.creational.builder.components;

public class Roof {
    private RoofType composition;
    private int color;

    public Roof(RoofType composition, int color) {
        this.composition = composition;
        this.color = color;
    }

    public RoofType getComposition() {
        return composition;
    }

    public int getColor() {
        return color;
    }
}
