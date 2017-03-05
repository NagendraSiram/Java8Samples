package com.home.samples.designpatterns.structural.adapter;

/**
 * Created by nagendra on 21/12/2016.
 */
public class WizardAdapter implements Fighter {

    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        this.wizard.castDestructionSpell();
    }

    @Override
    public void defend() {
        this.wizard.shield();
    }

    @Override
    public void escape() {
        this.wizard.openPortal();
    }
}