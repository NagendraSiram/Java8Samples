package com.home.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nagendra on 22/11/2016.
 */
public class LambdaExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        //Older Java version
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        //Java 1.8 using
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        //(or)
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        //(or)
        Collections.sort(names, (a, b) -> b.compareTo(a));

    }
}
