package com.example.arjun.designpatternandroid;

public class Cash implements Strategy {


    @Override
    public String processPayment(float price) {
        return String.format("%.2f",price*0.25f);
    }
}
