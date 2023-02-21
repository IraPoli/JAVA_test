package org.example.patterns.structural.adaptor;

public class RunAdapter {
    public static void run(){
        ITarget target = new Adapter(new Adaptee());
               target.request(); //call Specific request
    }
}
