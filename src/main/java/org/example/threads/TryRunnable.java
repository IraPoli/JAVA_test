package org.example.threads;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.sleep;

public class TryRunnable implements Runnable {
  //  ConcurrentHashMap<Integer, String> concurrentHashMap;
  HashMap<Integer, String> hashMap;
  private boolean stopRequest = false;
    int number;
 //   public TryRunnable(int number,HashMap<Integer, String> concurrentHashMap) {
      //  this.concurrentHashMap = concurrentHashMap;
     public TryRunnable(int number,HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
        this.number = number;
    }

    @Override
    public void run() {
         int i = 0;
      //  for (int i = 0; i < 100; i++) {
        while (!stopRequest){
            i++;
          //  System.out.println(i+ "this is thread RUNNABLE number "+ number);
         //   concurrentHashMap.put(i,"was called by order-"+ i+"this is thread RUNNABLE number "+ Thread.currentThread().getName());
            hashMap.put(i,"was called by order-"+ i+"this is thread RUNNABLE number "+ Thread.currentThread().getName());
            System.out.println(i+"this is thread RUNNABLE number " + Thread.currentThread().getName());
          /*  try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }

    public synchronized boolean isStopRequest(){
         return stopRequest;
    }
    public synchronized void requestStop(){
         this.stopRequest = true;
        System.out.println("WAS STOP");
    }
}
