package com.example.arjun.designpatternandroid.bread;

public class Brioche implements Bread
{
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return "85kcal";
    }
}
