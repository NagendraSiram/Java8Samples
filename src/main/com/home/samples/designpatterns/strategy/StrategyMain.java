package com.home.samples.designpatterns.strategy;

/**
 * Behavioural Pattern
 * enables an algorithm's behavior to be selected at runtime.
 */
public class StrategyMain {

    public static void main(String[] args) {
        Validator numericValidator = new Validator(new IsAllNumeric());
        boolean b1 = numericValidator.validate("aaa");

        Validator lowercaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowercaseValidator.validate("aaa");

        //Java 8
        Validator numericValidator1 = new Validator(str -> str.matches("[a-z]+"));
        Validator lowercaseValidator1 = new Validator(str -> str.matches("\\d+"));

    }
}
