package com.example.arjun.designpatternandroid;

public abstract class AbstractSandwich {

    SandwichInterface sandwichInterface;

    public AbstractSandwich(SandwichInterface sandwichInterface) {
        this.sandwichInterface = sandwichInterface;
    }
    abstract String make();
}
