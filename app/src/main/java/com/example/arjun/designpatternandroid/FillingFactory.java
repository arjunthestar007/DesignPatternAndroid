package com.example.arjun.designpatternandroid;

import com.example.arjun.designpatternandroid.bread.Bread;
import com.example.arjun.designpatternandroid.Filling.Cheese;
import com.example.arjun.designpatternandroid.Filling.Filling;

public class FillingFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filing) {

        if(filing=="CHE"){
            return new Cheese();
        }else if(filing=="TOM"){
            return new Cheese();
        }

        return null;
    }
}
