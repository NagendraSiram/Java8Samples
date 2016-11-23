package com.home.samples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by nagendra on 13/11/2016.
 */
public class ListSetExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        Set<Integer> set = new HashSet<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));

        System.out.println("List:");
        list.stream()
//                .parallel()
                .forEach(i -> System.out.print(i + " "));//List is always in insertion order

        System.out.println("");
        System.out.println("Set:");
        set.stream()
//                .parallel()
                .forEach(i -> System.out.print(i + " ")); //HashSet is always in natural order

    }
}