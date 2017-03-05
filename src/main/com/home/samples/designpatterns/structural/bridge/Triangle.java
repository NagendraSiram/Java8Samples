package com.home.samples.designpatterns.structural.bridge;

/**
 * Created by nagendra on 22/12/2016.
 */
public class Triangle extends Shape{

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}