package com.example.arjun.designpatternandroid;

import android.preference.SwitchPreference;
import android.util.Log;

public class Open implements SandwichInterface {

    private static final String TAG = "Open";
    @Override
    public String makeSandwich(String filling1, String filling2) {
        return TAG+"filling1 +filling2";
    }
}
