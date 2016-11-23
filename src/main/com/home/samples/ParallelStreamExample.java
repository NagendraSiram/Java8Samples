package com.home.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Created by nagendra on 13/11/2016.
 */
public class ParallelStreamExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Eg:1
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Sequential");
        list.stream()
                .forEach(i -> System.out.print(i + " "));

        //Eg:2
        System.out.println("\nParallel");
        list.stream()
                .parallel()
                .forEach(i -> System.out.print(i + " "));

        //Eg:3 - to showcase the use of peek
        List<String> peeked = Collections.synchronizedList(new ArrayList<>(1));//thread safe data structure
        List<String> output = IntStream.range(0, 50)
                .parallel()
                .filter(i -> i % 5 == 0)
                .mapToObj(i -> String.valueOf(i / 5))
                .peek(s -> peeked.add(s))
                .collect(toList()); //Parallel or Sequential the result is always the same

        System.out.println("\nPeeked:" + peeked);
        System.out.println("Output:" + output);

        //Eg:4 - to limit the number of threads
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        ForkJoinTask<List<Integer>> task = forkJoinPool.submit(() -> {
            return list.parallelStream()
                    .filter(n -> n % 2 == 0)
                    .sorted()
                    .collect(toList());
        });

        List<Integer> even = task.get();
        System.out.println(even);
    }
}
