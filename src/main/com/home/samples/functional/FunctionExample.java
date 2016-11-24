package com.home.samples.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by nagendra on 22/11/2016.
 */
public class FunctionExample {
    public static void main(String[] args) {
        //Eg:1
        Operation sumOperation = (x, y) -> x + y;
        System.out.println(sumOperation.sum(1, 2));

        //Eg:2
        Function<Integer, Integer> sqFun = (a) -> a * a;
        System.out.println(sqFun.apply(2)); //apply is the method

        //Eg:3
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2, 3));

        //Eg:4
        Function<Integer, Integer> fun1 = a -> a + 2;
        Function<Integer, Integer> fun2 = a -> a * a;

        int result1 = fun1.compose(fun2).apply(4);//fun2 executes first
        int result2 = fun1.andThen(fun2).apply(4);//fun1 executes first

        System.out.println("result1:" + result1);//18
        System.out.println("result2:" + result2);//36

        //Eg:5
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BiFunction<Integer, List<Integer>, List<Integer>> filter =
                (x, numList) -> numList.stream()
                        .filter(i -> i % x == 0)
                        .collect(Collectors.toList());

        System.out.println(filter.apply(2, numbers));
        System.out.println(filter.apply(3, numbers));

        //Eg:6 - example for ::
        Function<Integer, Integer> abs = a -> Math.abs(a);
        //(or)
        Function<Integer, Integer> abs2 = Math::abs;

        IntStream.range(0, 10).forEach(i -> System.out.println(i));
        //(or)
        IntStream.range(0, 10).forEach(System.out::print);




    }
}
