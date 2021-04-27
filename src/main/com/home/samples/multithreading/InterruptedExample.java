package com.home.samples.multithreading;

/**
 * Created by nagendra on 25/04/2021.
 */
public class InterruptedExample {
    public static void main(String[] args) {
        Thread t = new Thread(new BlockingThread());
        t.start();
        t.interrupt();
        System.out.println("Main thread ended");
    }

    private static class BlockingThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Start thread");
            try {
                Thread.sleep(3000l);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("End thread");
        }
    }
}
