package com.home.samples.designpatterns.structural.bridge;

/**
 * "prefer composition over inheritance"
 *
 * Bridge pattern is a composite of the Template and Strategy patterns.
 *
 * At first sight, the Bridge pattern looks a lot like the Adapter pattern in that a class is used to
 * convert one kind of interface to another. However, the intent of the Adapter pattern is to make
 * one or more classes' interfaces look the same as that of a particular class. The Bridge pattern
 * is designed to separate a class's interface from its implementation so you can vary or replace
 * the implementation without changing the client code.
 */
public class BridgeMain {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
