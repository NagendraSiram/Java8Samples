package com.home.samples;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nagendra on 03/12/2016.
 */
public class CollectExample {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Eg:1
        IntSummaryStatistics collect = input.stream()
                .collect(Collectors.summarizingInt(i -> i));

        System.out.println(collect);

        //Eg:1
        Optional<Integer> max = input.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(i -> i)));

        System.out.println("Max:" + max);

        //Eg:1
        String result = input.stream()
                .map(i -> Integer.toString(i))
                .collect(Collectors.joining());

        System.out.println(result);

        //Eg:1
        String result2 = input.stream()
                .map(i -> Integer.toString(i))
                .collect(Collectors.joining(", ")); //overloaded joining

        System.out.println(result2);

        //Eg:1
        Optional<Integer> sum = input.stream()
                .collect(Collectors.reducing((a, b) -> a + b));
        System.out.println(sum.get());

        //Eg:1
        Integer sum2 = input.stream()
                .collect(Collectors.reducing(0, i -> i, (a, b) -> a + b));
        System.out.println(sum2);
    }
}
