package com.example.arjun.designpatternandroid;

import android.util.Log;

public class Closed implements SandwichInterface {
    private static final String TAG = "Closed";
    @Override
    public String makeSandwich(String filling1, String filling2) {
        return TAG+"+filling1+filling2";
    }
}
