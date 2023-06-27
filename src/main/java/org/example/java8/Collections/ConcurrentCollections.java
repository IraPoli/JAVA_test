package org.example.java8.Collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentCollections {
    public static void tryMup() {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(); //how many threads allowed to get the lock
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();


        //ConcurrentHashMap
        Map<String, String> myMap = new ConcurrentHashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: " + myMap);
        Iterator<String> itr1 = myMap.keySet().iterator();

        while (itr1.hasNext()) {
            String key = itr1.next();
            if (key.equals("3")) myMap.put(key + "new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: " + myMap);

        //HashMap concurrency exeption
      /*  myMap = new HashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: " + myMap);
        Iterator<String> itr2 = myMap.keySet().iterator();

        while (itr2.hasNext()) {
            String key = itr2.next();
            if (key.equals("3")) myMap.put(key + "new", "new3");
        }
        System.out.println("HashMap after iterator: " + myMap);
*/

        ///////////////////////4
          CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
      //  List<String> list = new ArrayList<>(); //concurrency error
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (
                String elem : list) {
            if (elem.equals("a")) {
                list.remove(elem);
            }
        }

        for (
                int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("a")) {
                list.remove(list.get(i));
            }
        }
    }


}
