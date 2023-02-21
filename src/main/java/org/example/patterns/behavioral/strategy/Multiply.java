package org.example.patterns.behavioral.strategy;

public class Multiply implements Strategy{
    @Override
    public float apply(float n1, float n2) {
        return n1*n2;
    }
}
