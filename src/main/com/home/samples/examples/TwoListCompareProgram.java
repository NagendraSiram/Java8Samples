package com.home.samples.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nagendra on 27/04/2021.
 */
public class TwoListCompareProgram {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(4, 5);

        list1.stream()
                .flatMap(i -> list2.stream()
                        .filter(j -> i == j))
                        .forEach(result -> System.out.println(result));

    }
}
