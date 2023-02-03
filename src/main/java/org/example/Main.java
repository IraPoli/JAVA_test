package org.example;

import org.example.annotaions.RunAnnotation;
import org.example.exceptions.ImproperAgeValueException;
import org.example.exceptions.Person;
import org.example.exceptions.PersonaList;
import org.example.exceptions.RunException;

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
    public static void main(String[] args) throws ImproperAgeValueException, InvocationTargetException, IllegalAccessException {
     /*   AnonymousDemo an = new AnonymousDemo();
        an.createClass();


        System.out.println("val1 boolean =   "+ val1);
        System.out.println("val2  double=   "+ val2);
        System.out.println("val3 float =   "+ val3);
        System.out.println("val4 int =   "+ val4);
        System.out.println("val5  long =   "+ val5);
        System.out.println("val6 String =   "+ val6);
        System.out.println("val7 char =   "+ val7);
        System.out.println("val8 short =   "+ val8);
        System.out.println("val9 byte =   "+ val9);



        int [] arr ={5,6,7,4};
        int n = 0;
        for (int i: arr) {
        System.out.println(i + " " + n++);
        }
        System.out.println(rev("Hello!"));
        System.out.println(ex1("Hello!"));
        System.out.println(ex2("Hello!"));

*/
        Arrays Arry;
        List l = Arrays.asList(3,6,81,4,6,8);

        MyGeneric.OddPredicate o = new MyGeneric.OddPredicate();
        Object ob = new Object();


        System.out.println(MyGeneric.numberOfElements(l, o));


        mySupplier<Integer> f = new mySupplier<Integer>();

                MyGeneric.AddTenEl<Integer> addTenEl = new MyGeneric.AddTenEl<>(f);
        System.out.println(addTenEl);




        //------------------
        /*
        HashMap myMap= new HashMap();
        ArrayList nList = new ArrayList();
        List ll  =new LinkedList<Integer>();
        //-----------
        HashSet hs =new HashSet<>();

        TreeMap tm = new TreeMap();
        */

        //
/*
        TryReflection tryReflection = new TryReflection();
        tryReflection.test();



 */


       // RunException.run();
        RunAnnotation.start();

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



