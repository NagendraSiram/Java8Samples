package com.home.samples.examples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by nagendra on 03/12/2016.
 */
public class MaxLengthIndexProgram {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana", "pomegranate", "kivi");


        OptionalInt maxIndex = IntStream.range(0, fruits.size() - 1)
                .reduce((a, b) -> fruits.get(a).length() > fruits.get(b).length() ? a : b);

        System.out.println(maxIndex.getAsInt());

    }
}
