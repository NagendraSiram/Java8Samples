package com.home.samples.designpatterns.structural.adapter;

/**
 * Structural Pattern
 * The adapter pattern convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
 */
public class AdapterMain {
    public static void main(String args[]) {
        Fighter barbarian = new Knight();
        Wizard wizard = new Wizard();
        WizardAdapter wizardAdapter = new WizardAdapter(wizard);

        System.out.println("-----Knight's Action------");
        barbarian.attack();
        barbarian.defend();
        barbarian.escape();

        System.out.println("\n-----Wizard's Action------");
        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();
    }
}
