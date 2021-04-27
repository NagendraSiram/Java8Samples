package com.home.samples.multithreading.interrupt;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nagendra on 27/04/2021.
 */
public class UsingAwait {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    boolean isCompleted = false;

    public void declareSuccess() throws InterruptedException {
        lock.lock();
        try {
            while (!isCompleted) {
                condition.await();
            }
        }
        finally {
            lock.unlock();
        }

        System.out.println("Success!!");
    }

    public void finishWork() {
        lock.lock();
        try {
            isCompleted = true;
            condition.signal();
        }
        finally {
            lock.unlock();
        }
    }
}