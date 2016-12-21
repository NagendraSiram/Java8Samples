package com.home.samples.designpatterns.strategy;

/**
 * Created by nagendra on 14/12/2016.
 */
public class IsAllLowerCase implements ValidationStrategy {

    @Override
    public boolean validate(String str) {
        return str.matches("[a-z]+");
    }
}
