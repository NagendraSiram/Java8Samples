package com.home.samples.examples;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by nagendra on 03/12/2016.
 */
public class FibonacciProgram {

    //0,1,1,2,3,5,8
    //{0, 1}, {1, 1}, {1, 2}, {2, 3}, {3, 5}, {5, 8}
    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);

    }
}
