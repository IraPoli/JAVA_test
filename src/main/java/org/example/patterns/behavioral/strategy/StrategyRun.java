package org.example.patterns.behavioral.strategy;

public class StrategyRun {
    public static void run(){
        float number1=  342345;
        float number2 = 352543;
        Context context = new Context(new Add());


        System.out.println("Addition = " + context.executeStrategy(number1, number2));
    }
}
