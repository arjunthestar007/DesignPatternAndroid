package com.example.arjun.designpatternandroid;

public class BreadFactory {

    public  Bread getbreadfactory(String breadtype){

        if(breadtype=="BRI"){
            return new Brioche();
        }else if(breadtype=="BAG"){
            return new Baguette();
        }else if(breadtype=="ROLL"){
            return new Roll();

        }
        return null;
    }

}
