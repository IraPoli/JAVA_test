package org.example;

import org.example.exceptions.ImproperAgeValueException;
import org.example.patterns.behavioral.iterator.IteratorRun;
import org.example.patterns.behavioral.state.RunStatePattern;
import org.example.patterns.behavioral.strategy.StrategyRun;
import org.example.patterns.creational.abstructFactory.RunAbstractFactory;
import org.example.patterns.creational.builder.BuilderRun;
import org.example.patterns.creational.factoryMathod.FactoryMethod;
import org.example.patterns.creational.singelton.RunSingleton;
import org.example.patterns.structural.adaptor.RunAdapter;
import org.example.patterns.structural.decorator.RunDecorator;
import org.example.patterns.structural.facade.FacadeRun;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.function.Supplier;


class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {

        // creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

class Main {
    static  boolean val1;
    static double val2;
    static float val3;
    static int val4;
    static long val5;
    static String val6;
    static char val7;
    static short val8;

    static byte val9;
    public static void main(String[] args) throws ImproperAgeValueException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
     //   RunException.run();
     //   RunAnnotation.start();

       // GCRun.run();
      //  Streams.run();


      /*

        DemoConsumer.run();

        System.out.println("Data-------------");
        DateTime.run();

        System.out.println("Printer-------------");
        Printer printer = new Printer();
        printer.run();

       */

        IteratorRun.run();
        RunStatePattern.run();
        StrategyRun.run();

        RunAbstractFactory.demo();
        BuilderRun.run();
        FactoryMethod.runFactoryMethod();
        RunSingleton.run();

        RunAdapter.run();
        RunDecorator.run();
        FacadeRun.run();

    }
    public static class mySupplier<Integer> implements Supplier<java.lang.Integer> {

        @Override
        public java.lang.Integer get() {
            return  generate(10,50);
        }
        public static int generate(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
        }
    }


    public static String ex1(String str){
        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i < str.length(); i++){
                    if (str.substring(i+1,str.length()).indexOf(str.charAt(i))>=0
                            ){
                        newStr.append(str.charAt(i));
                    };

        }
        return newStr.toString();
    }
    public static String ex2(String str){
        Set<Character> set = new HashSet<>();
        for(int i=0; i < str.length(); i++){
            if (str.substring(i+1,str.length()).indexOf(str.charAt(i))>=0
            ) {
                set.add(str.charAt(i));
            }
        }
        return set.toString();
    }

 public static String rev(String str){
        StringBuilder strB = new StringBuilder("");
        for (int i=str.length()-1; i>=0;i--) strB.append(str.charAt(i));
    return strB.toString();
        };

}



