package com.home.samples.examples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by nagendra on 09/03/2020.
 */
public class StringExample {
    /*
     output: {a=2, r=1, d=1, e=1, g=1, n=2}
     */
    public static void main(String[] args) {
        String someText = "nagendra";
        Map<Character, Long> collect = someText.chars()
                .boxed()
                .map(c -> (char) c.intValue())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
