package com.home.samples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by nagendra on 13/11/2016.
 */
public class ListSetExample {
    /*
    http://www.lambdafaq.org/in-what-order-do-the-elements-of-a-stream-become-available/
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        Set<Integer> set = new HashSet<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));

        System.out.println("\nList:");
        list.stream()
                .forEach(i -> System.out.print(i + " "));//List is always in insertion order

        System.out.println("\nList Parallel Ordered:");
        list.stream()
                .parallel()
                .forEachOrdered(i -> System.out.print(i + " "));

        System.out.println("\nList Parallel:");
        list.stream()
                .parallel()
                .forEach(i -> System.out.print(i + " "));


        System.out.println("\nSet:");
        set.stream()
                .forEach(i -> System.out.print(i + " ")); //HashSet is always in natural order


        System.out.println("\nSet Parallel Ordered:");
        set.stream()
                .parallel()
                .forEachOrdered(i -> System.out.print(i + " "));


        System.out.println("\nSet Parallel:");
        set.stream()
                .parallel()
                .forEach(i -> System.out.print(i + " "));
    }
}