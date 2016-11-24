package com.home.samples.functional;

import java.util.Objects;
import java.util.function.Function;

/**
 * Created by nagendra on 24/11/2016.
 */
@FunctionalInterface
public interface TriFunction<A, B, C, R> {
    R apply(A a, B b, C c);

    default <V> TriFunction<A, B, C, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (A a, B b, C c) -> after.apply(apply(a, b, c));
    }

}
