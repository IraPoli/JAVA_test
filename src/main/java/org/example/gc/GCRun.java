package org.example.gc;

import java.util.Date;

public class GCRun {
    public static void run(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("before Total Memory -"+runtime.totalMemory());
        System.out.println("before Free Memory -"+runtime.freeMemory());
    for (int i=0; i<10000000; i++){
        Date date = new Date();
        date = null;
    }
        System.out.println("after Total Memory -"+runtime.totalMemory());
        System.out.println("after Free Memory -"+runtime.freeMemory());

        System.gc();

        System.out.println("after GC Total Memory -"+runtime.totalMemory());
        System.out.println("after GC Free Memory -"+runtime.freeMemory());
    }
}
