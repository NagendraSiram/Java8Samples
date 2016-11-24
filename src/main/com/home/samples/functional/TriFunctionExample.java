package com.home.samples.functional;

import com.home.samples.domain.Gender;
import com.home.samples.domain.Person;

/**
 * Created by nagendra on 24/11/2016.
 */
public class TriFunctionExample {

    public static void main(String[] args) {
        //Eg: 1
        TriFunction<Float, Float, Float, Float> volume = (x, y, z) -> x * y * z;
        System.out.println(volume.apply(2.4f, 5.3f, 10.4f));

        //Eg: 2
        TriFunction<String, Integer, Gender, Person> create = Person::new;
        Person person = create.apply("Nagendra", 30, Gender.MALE);

        System.out.println(person);
    }
}
