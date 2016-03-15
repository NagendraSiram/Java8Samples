package com.home.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Nagendra on 15/03/2016.
 */
public class SampleLamdaDemo {

    public static void main(String st[]) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("tom", 30, Gender.MALE));
        personList.add(new Person("bob", 45, Gender.MALE));
        personList.add(new Person("john", 25, Gender.MALE));
        personList.add(new Person("ann", 28, Gender.FEMALE));

        //Sum of age
        int sum1 = personList.stream()
                .mapToInt(p -> p.getAge())
                .sum();
        System.out.println("sum = " + sum1);

        int sum2 = personList.stream()
                .map(Person::getAge) //or .mapToInt(p -> p.getAge())
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum1);

        //Average
        Map<Gender, Double> averageByGenderAge = personList.stream()
                .collect(Collectors.groupingBy(Person::getSex, Collectors.averagingInt(Person::getAge)));

        System.out.println("Average = " + averageByGenderAge);

        //Female names
        personList.stream()
                .filter(p -> p.getSex() == Gender.FEMALE)
                .forEach(e -> System.out.println(e.getName()));
        //or
        personList.stream()
                .filter(p -> p.getSex() == Gender.FEMALE)
                .map(p -> p.getName())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Sort by names
        System.out.println("Sort by names:");
        personList.stream()
                .map(p -> p.getName())
                .sorted((n1, n2) -> n1.compareTo(n2))
                .forEach(System.out::println);

        //Max age
        int maxAge1 = personList.stream()
                .map(Person::getAge)
                .mapToInt(i -> i)
                .summaryStatistics()
                .getMax();
        System.out.println("Max age:" + maxAge1);

        //or
        int maxAge2 = personList.stream()
                .map(Person::getAge)
                .reduce((a, b) -> a > b ? a : b)
                .get();
        System.out.println("Max age:" + maxAge2);

        ///////flatMap/////////
        personList.get(1).addAddress(new Address("line1", "p1"));
        personList.get(1).addAddress(new Address("line2", "p2"));
        personList.get(2).addAddress(new Address("line3", "p1"));

        //count the number of postcodes with p1
        long count = personList.stream()
                .flatMap(person -> person.getAddresses().stream())
                .filter(address -> address.getPostCode().equalsIgnoreCase("p1"))
                .count();
        System.out.println("Count:" + count);

    }
}

class Person {

    private String name;

    private int age;

    private Gender sex;

    private List<Address> addresses = new ArrayList<>();

    public Person(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getSex() {
        return sex;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }
}

class Address {

    private String line1;

    private String postCode;

    public Address(String line1, String postCode) {
        this.line1 = line1;
        this.postCode = postCode;
    }

    public String getLine1() {
        return line1;
    }

    public String getPostCode() {
        return postCode;
    }
}

enum Gender {
    MALE, FEMALE
}