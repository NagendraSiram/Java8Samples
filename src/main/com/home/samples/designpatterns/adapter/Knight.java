package com.home.samples.designpatterns.adapter;

/**
 * Created by nagendra on 21/12/2016.
 */
public class Knight implements Fighter {

    @Override
    public void attack() {
        System.out.println("Knight attacks!!");
    }

    @Override
    public void defend() {
        System.out.println("Knight defends...");
    }

    @Override
    public void escape() {
        System.out.println("Run Knight run...");
    }
}
