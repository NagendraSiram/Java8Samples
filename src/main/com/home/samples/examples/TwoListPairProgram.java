package com.home.samples.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nagendra on 03/12/2016.
 */
public class TwoListPairProgram {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

        List<int[]> result = list1.stream()
                .flatMap(i -> list2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        result.stream()
                .forEach(arr -> System.out.println(arr[0] + "-" + arr[1]));

        System.out.println("-------------");

        //Sum divisible by 3
        List<int[]> result2 = list1.stream()
                .flatMap(i -> list2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        result2.stream()
                .forEach(arr -> System.out.println(arr[0] + "-" + arr[1]));

    }
}
