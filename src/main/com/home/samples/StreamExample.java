package com.home.samples;

import java.util.stream.IntStream;

/**
 * Created by nagendra on 03/12/2016.
 */
public class StreamExample {

    public static void main(String[] args) {
        IntStream.range(0, 10)
                .forEach(System.out::print);

        System.out.println("\n----------\n");

        IntStream.rangeClosed(0, 10)
                .forEach(System.out::print); //Inclusive of 10
    }
}
