package com.home.samples.examples;

import java.util.stream.IntStream;

/**
 * Created by nagendra on 03/12/2016.
 */
public class PrimeNumberProgram {

    public static void main(String[] args) {
        final int input = 47;

//        boolean isPrime = IntStream.iterate(2, i -> i + 1)
//                .limit(input - 2) //remove 1 & itself
//                .noneMatch(i -> input % i == 0);

        int end = (int) Math.sqrt((double) input);
        boolean isPrime = IntStream.range(2, end)
                .noneMatch(i -> input % i == 0);

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");
        }
    }
}
