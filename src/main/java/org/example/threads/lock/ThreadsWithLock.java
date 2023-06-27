package org.example.threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadsWithLock {
    private int count = 0;
    Lock lock = new ReentrantLock();

    public void run() {
        try {
            lock.lock();
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {

        try {
            lock.lock();
            return count;
        } finally {
            lock.unlock();
        }
    }
}
