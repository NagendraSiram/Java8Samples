package com.home.samples;

import com.home.samples.domain.Gender;
import com.home.samples.domain.Person;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by nagendra on 24/11/2016.
 */
public class BuiltInFunctionalExample {
    public static void main(String[] args) {

        //Predicates are boolean-valued functions of one argument.
        Predicate<String> predicate = (s) -> s.length() > 0;
        predicate.test("foo");
        predicate.negate().test("foo");

        //Suppliers produce a result of a given generic type. Unlike Functions, Suppliers don't accept arguments.
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();

        //Consumers represents operations to be performed on a single input argument.
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getName());
        greeter.accept(new Person("Nagendra", 30, Gender.MALE));

    }
}
