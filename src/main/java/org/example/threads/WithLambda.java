package org.example.threads;

public class WithLambda {
    public static void  tryWithLambda() {
        Runnable runnable = () -> {
            System.out.println(" thread with lambda Class");
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
