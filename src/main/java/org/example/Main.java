package org.example;

import org.example.codingTasks.*;
import org.example.exceptions.ImproperAgeValueException;
import org.example.java8.Collections.ConcurrentCollections;
import org.example.java8.streams.Streams;
import org.example.jdbc.JDBC_Example;
import org.example.threads.RunWithAnonymousClass;
import org.example.threads.TryRunnable;
import org.example.threads.TryThreads;
import org.example.threads.WithLambda;


import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;
import org.example.tryAbstract.TryAbstract;

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
    public static void main(String[] args) throws ImproperAgeValueException, InterruptedException {
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
        TryAbstract.someMethod();
        //////
        ConcurrentCollections.tryMup();
        RunWithAnonymousClass.tryWith();
        WithLambda.tryWithLambda();




        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

    //    for (int i = 0; i < 2; i++) {
         //   TryRunnable threads = new TryRunnable(i, concurrentHashMap);
            TryRunnable threadsRunnable = new TryRunnable(1, hashMap);
            Thread thread = new Thread(threadsRunnable);
            thread.start();
            System.out.println("Active threads =" + Thread.activeCount());
            //thread.join(); // wait until this thread complete

            Thread.sleep(500);
           threadsRunnable.requestStop();
    //    }

        for (int i = 0; i < 4; i++) {
            TryThreads threads = new TryThreads(i);
            threads.start();
        }
        System.out.println("stop[");
/*
        ////
        JDBC_Example.run();
        useComparatorAndComparable.runComp();
    //try to modify immutable obj,
        ImmutableClass immutableObj  = new ImmutableClass("Stabile",10,new LinkedList<String>(Arrays.asList("one", "two")));
        System.out.println(immutableObj);
        immutableObj.getSkills().add("add one more");
        System.out.println(immutableObj);
        //
*/
        //try Mup

/*
        System.out.println(Solution.isPalindrome(11511));
        System.out.println(Solution.isPalindrome(114511));
        System.out.println(Solution.isValid("{}([])"));
        System.out.println(Solution.isValid("fsddsfdsfsdf({}dsf[sdf])sdf"));
        System.out.println(Solution.isValid("(((})))"));
        System.out.println(Solution.uniqueOccurrences(new int[]{1, 2, 2,}) );
        System.out.println(Solution.uniqueOccurrences(new int[]{1, 2,}) );
        //coding tasks\
        System.out.println(StringTask.reverseString("Test"));
        NumbersTask.swapTwoNumbers();
        System.out.println(StringTask.isVowelPresent("DtA"));
        System.out.println(NumbersTask.isPrime(19));

        System.out.println("fibonacci");
        NumbersTask.printFibonacci(10);
        List<Integer> list =  Arrays.asList(2, 5, 7, 5, 3);
        System.out.println("Array contains only odd"+ NumbersTask.listContainsOnlyOdd(list));
    //    System.out.println("Remove space- "+ StringTask.removeSpace("Hello everyone !"));
*/
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



