package com.home.samples;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by nagendra on 20/11/2016.
 */
public class ReduceExample {

    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};

        //Eg:1
        int max = Arrays.stream(arr)
                .reduce((a, b) -> Integer.max(a, b)).getAsInt();
        System.out.println(max);

        //Eg:2
        int maxIdx = IntStream.range(0, arr.length)
                .reduce((i, j) -> arr[i] < arr[j] ? j : i)
                .getAsInt();
        System.out.println(maxIdx);
    }
}
