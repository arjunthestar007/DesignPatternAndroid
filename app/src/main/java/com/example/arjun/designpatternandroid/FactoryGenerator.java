package com.example.arjun.designpatternandroid;

public class FactoryGenerator {

    public  static AbstractFactory getFactory(String factory){
        if(factory=="BRE"){
            return  new BreadFactory();
        }else  if(factory=="FIL"){
            return  new FillingFactory();
        }
        return null;
    }
}
