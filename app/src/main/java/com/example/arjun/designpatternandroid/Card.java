package com.example.arjun.designpatternandroid;

public class Card implements Strategy {
    @Override
    public String processPayment(float price) {
        return String.format("%.2f",price);
    }
}
