package com.home.samples.multithreading.interrupt;

/**
 * Created by nagendra on 27/04/2021.
 */
class UsingWait {
    boolean isCompleted = false;

    public synchronized void declareSuccess() throws InterruptedException {
        while (!isCompleted) {
            wait();
        }

        System.out.println("Success!!");
    }

    public synchronized void finishWork() {
        isCompleted = true;
        notify();
    }
}
