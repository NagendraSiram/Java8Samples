package com.home.samples.designpatterns.structural.bridge;

/**
 * Created by nagendra on 22/12/2016.
 */
public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}