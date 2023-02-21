package org.example.java8.consumerTime;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

    @Override
    public Consumer<Integer> andThen(Consumer<? super Integer> after) {
        return Consumer.super.andThen(after);
    }
}

public class DemoConsumer {
 public static void run(){
     List<Integer> list = Arrays.asList(1,3,64,6);
     ConsImpl cons = new ConsImpl();

     Consumer<Integer> consumer2 = (i)-> System.out.println("i");

     list.forEach(cons);
     list.forEach(consumer2);
     list.forEach(System.out::println);
 }
}
