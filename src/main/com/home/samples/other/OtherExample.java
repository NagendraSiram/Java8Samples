package com.home.samples.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by nagendra on 27/11/2016.
 */
public class OtherExample {

    public static void main(String[] args) {
//        _1(); // Streams are lazy
//        _2(); //To avoid Streams with null pointer exceptions
        _3();
    }

    static void _3() {
        int numToFind = 3;
        List<Integer> values = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8);
        values.stream()
                .filter(i -> i == numToFind)
                .reduce((a, b) -> {
                    throw new IllegalStateException("Multiple items found for given id : " + numToFind);
                })
                .ifPresent(i -> System.out.print(i));
    }

    static void _2() {
        final List<String> list = Arrays.asList("c", "b", "a", null, "d"); // fixed-size list

        String result = list.stream()
                .filter(Objects::nonNull) //To avoid null pointer exceptions
                .sorted()
                .collect(joining(",")); //use of joining

        System.out.println(result);
    }

    static void _1() {
        final List<Integer> ints1 = new ArrayList<>();
        ints1.add(1);
        ints1.add(2);
        ints1.add(3);
        ints1.add(4);
        ints1.add(5);

        final Stream<Integer> stream1 = ints1.stream();

        ints1.add(6);

        final Stream<Integer> stream2 = ints1.stream();

        System.out.println("stream1:");
        stream1.forEach(System.out::print);

        System.out.println("\nstream2:");
        stream2.forEach(System.out::print);
    }
}
