package com.example.arjun.designpatternandroid;

import com.example.arjun.designpatternandroid.bread.Baguette;
import com.example.arjun.designpatternandroid.bread.Bread;
import com.example.arjun.designpatternandroid.bread.Brioche;
import com.example.arjun.designpatternandroid.bread.Roll;
import com.example.arjun.designpatternandroid.Filling.Cheese;
import com.example.arjun.designpatternandroid.Filling.Filling;

public class BreadFactory  extends AbstractFactory{

    @Override
    Bread getBread(String bread) {
        if(bread=="BRI"){
            return new Brioche();
        }else if(bread=="BAG"){
            return new Baguette();
        }else if(bread=="ROLL"){
            return new Roll();

        }
        return null;
    }

    @Override
    Filling getFilling(String filing) {
        if(filing=="CH"){
            return new Cheese();
        }
        return null;
    }
}
