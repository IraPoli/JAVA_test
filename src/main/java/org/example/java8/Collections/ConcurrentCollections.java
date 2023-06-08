package org.example.java8.Collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentCollections {
    public static void tryMup(){
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(); //how many threads allowed to get the lock
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();

    }
}
