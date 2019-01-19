package com.example.arjun.designpatternandroid.Filling;

public class Cheese implements Filling
{
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return "65kcal";
    }
}
