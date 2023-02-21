package org.example.patterns.structural.adaptor;

public class Adapter implements ITarget {
    Adaptee adaptee;

    public Adapter(Adaptee a) {
        this.adaptee = a;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
