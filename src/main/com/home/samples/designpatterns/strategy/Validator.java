package com.home.samples.designpatterns.strategy;

/**
 * Created by nagendra on 14/12/2016.
 */
public class Validator {

    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy v) {
        this.strategy = v;
    }

    public boolean validate(String str) {
        return strategy.validate(str);
    }
}
