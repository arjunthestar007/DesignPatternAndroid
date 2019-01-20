package com.example.arjun.designpatternandroid;

public class SandwichBuilder {

    public static Sandwich readymade(){

        Sandwich sandwich=new Sandwich();
        sandwich.addintegredient(new Bagel());
        sandwich.addintegredient(new Smokedsalmon());
        return sandwich;
    }

    public static Sandwich build(Sandwich s,Integredient i){
        s.addintegredient(i);
        return s;

    }
}
