package com.home.samples.designpatterns.structural.bridge;

/**
 * Created by nagendra on 22/12/2016.
 */
public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
