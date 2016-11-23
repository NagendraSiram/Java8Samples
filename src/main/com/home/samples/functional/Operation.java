package com.home.samples.functional;

/**
 * Created by nagendra on 22/11/2016.
 */
@FunctionalInterface
public interface Operation {

    int sum(int x, int y); // exactly one abstract method

    default int minus(int x, int y) { //free to add default methods
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }
}
