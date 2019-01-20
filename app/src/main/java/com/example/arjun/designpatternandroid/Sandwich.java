package com.example.arjun.designpatternandroid;

public class Sandwich extends AbstractSandwich {
    String filling1,filling2;

    public Sandwich(String filling1,String filling2,SandwichInterface sandwichInterface) {
        super(sandwichInterface);
        this.filling1=filling1;
        this.filling2=filling2;

    }

    @Override
    String make() {
        return sandwichInterface.makeSandwich(filling1,filling2);
    }
}
