package com.home.samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by nagendra on 27/11/2016.
 */
public class SupplierExample {

    public static void main(String[] args) {
        final List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        final Supplier<List<Integer>> evenInts = () -> allEvenNumbers(values);

        System.out.println("End");

        System.out.println(evenInts.get());
    }

    static List<Integer> allEvenNumbers(final List<Integer> values) {
        System.out.println("I shouldn't be called until list is used");
        return values.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }
}
