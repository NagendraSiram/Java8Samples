package com.home.samples.multithreading;

/**
 * Created by nagendra on 26/04/2021.
 */
public class MinMaxMetrics {

    // Add all necessary member variables
    private volatile long minValue;
    private volatile long maxValue;

    private final Object minValLock = new Object();
    private final Object maxValLock = new Object();

    /**
     * Initializes all member variables
     */
    public MinMaxMetrics() {
        this.maxValue = Long.MIN_VALUE;
        this.minValue = Long.MAX_VALUE;
    }

    /**
     * Adds a new sample to our metrics.
     */
    public void addSample(long newSample) {
        // Add code here
        synchronized (minValLock) {
            if (minValue > newSample) {
                minValue = newSample;
            }
        }
        synchronized (maxValLock) {
            if (newSample > maxValue) {
                maxValue = newSample;
            }
        }
    }

    /**
     * Returns the smallest sample we've seen so far.
     */
    public long getMin() {
        return minValue;
    }

    /**
     * Returns the biggest sample we've seen so far.
     */
    public long getMax() {
        return maxValue;
    }
}
