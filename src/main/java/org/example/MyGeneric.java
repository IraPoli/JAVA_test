package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MyGeneric {

    public static <T> int numberOfElements(List<T> list, UnaryPredicate<T> p ){
        int num = 0;
        for (T el :list){
            if (p.test(el)) {
                num++;
            }
        }
        return num;
    }



    public interface UnaryPredicate<T> {
        public boolean test(T obj);
    }
    static class OddPredicate implements UnaryPredicate<Integer> {
        public boolean test(Integer i) { return i % 2 == 0; }
    }

    //-----------------------
    //provide data for test
    //        MyGeneric.AddTenEl<String> addTenEl = new MyGeneric.AddTenEl<>(String::new);

/*

 mySupplier<Integer> f = new mySupplier<Integer>();

 MyGeneric.AddTenEl<Integer> addTenEl = new MyGeneric.AddTenEl<>(f);


    public static class mySupplier<Integer> implements Supplier<java.lang.Integer> {

        @Override
        public java.lang.Integer get() {
            return  generate(10,50);
        }
        public static int generate(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
        }
    }*/
    //-------------------
    public static class AddTenEl <T> {
        private  ArrayList<T> arr = new ArrayList<>();

        public ArrayList<T> getList(){
            return this.arr;
        }

        public  AddTenEl(Supplier<T> factory)  {
          for (int i=0; i<10; i++){
             this.arr.add(factory.get());
          }

        }

    }

}
