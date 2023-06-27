package org.example.threads;

public class TryThreads extends Thread {
    int number;
    public TryThreads(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
        //    System.out.println(i+ "this is thread "+ number);
            System.out.println(i+ Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
