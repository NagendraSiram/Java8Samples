package com.home.samples.other;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * Created by nagendra on 27/11/2016.
 */
public class StatelessStreamExample {

    private final String pattern;

    public StatelessStreamExample(final String pattern) {
        this.pattern = pattern;
    }

    public List<String> allMatchingElements(final List<String> elements) {
        String localPattern = pattern;
        return elements.stream()
                .filter(e -> e.contains(localPattern)) //pass a local pattern variable, class references shouldn't be used in streams
                //or filter(matches(pattern))
                .collect(Collectors.toList());
    }

    private Predicate<String> matches(String pattern) {
        return e -> e.contains(pattern);
    }
}
