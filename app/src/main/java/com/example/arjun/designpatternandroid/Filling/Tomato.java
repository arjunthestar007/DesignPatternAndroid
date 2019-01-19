package com.example.arjun.designpatternandroid.Filling;

public class Tomato implements Filling
{
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return "75kcal";
    }
}
