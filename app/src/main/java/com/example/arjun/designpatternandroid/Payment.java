package com.example.arjun.designpatternandroid;

public class Payment {

    Strategy strategy;

    public Payment(Strategy strategy) {
        this.strategy = strategy;
    }

    public String processpayment(float f){
        return strategy.processPayment(f);
    }

}
