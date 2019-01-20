package com.example.arjun.designpatternandroid;

public class BasicPrice {

    private static BasicPrice basicPrice=new BasicPrice();

    private float price;

    //prevent more thn one copy
    private BasicPrice(){

    }
    
    // return only instance
    public static BasicPrice getInstance(){
        return basicPrice;
    }


    protected float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

}
