package org.example.java8.itarator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TryIterator {
    public void tryIterator(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");


        Collection<String> list = arrayList;
        Iterable<String> iterable = list;

        for (var el:list) {
            System.out.println(el);
        }

        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        arrayList.forEach(System.out::println);

    }
}
