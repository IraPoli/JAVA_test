package org.example;

import org.example.codingTasks.NumbersTask;
import org.example.codingTasks.StringTask;
import org.example.exceptions.ImproperAgeValueException;

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
    public static void main(String[] args) {
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

      /* Patterns
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


       */
        //coding tasks\
        System.out.println(StringTask.reverseString("Test"));
        NumbersTask.swapTwoNumbers();
        System.out.println(StringTask.isVowelPresent("DtA"));
        System.out.println(NumbersTask.isPrime(19));

        System.out.println("fibonacci");
        NumbersTask.printFibonacci(10);
        List<Integer> list =  Arrays.asList(2, 5, 7, 5, 3);
        System.out.println("Array contains only odd"+ NumbersTask.listContainsOnlyOdd(list));

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
}



