package com.home.samples.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagendra on 24/11/2016.
 */
public class Person {

    private String name;

    private int age;

    private Gender sex;

    private List<Address> addresses = new ArrayList<>();

    public Person(){}

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", addresses=" + addresses +
                '}';
    }
}
