package org.example.threads;

public class RunWithAnonymousClass {
    public static void tryWith(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" thread with anonymous Class");
            }
        };
        System.out.println("run with anonymous Class before threads start");
         for (int i = 0; i < 5; i++) {
        Thread thread = new Thread(runnable);

            thread.start();
        }
        System.out.println("run with anonymous Class after threads start");



    }
}
