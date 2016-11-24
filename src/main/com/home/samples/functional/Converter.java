package com.home.samples.functional;

/**
 * Created by nagendra on 22/11/2016.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}