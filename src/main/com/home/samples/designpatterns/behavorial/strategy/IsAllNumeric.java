package com.home.samples.designpatterns.behavorial.strategy;

/**
 * Created by nagendra on 14/12/2016.
 */
public class IsAllNumeric implements ValidationStrategy {

    @Override
    public boolean validate(String str) {
        return str.matches("\\d+");
    }
}
