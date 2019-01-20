package com.example.arjun.designpatternandroid;

public class Facade {
    private  Product crisps;
    private  Product fruit;
    private  Product drink;

    public Facade() {
        this.crisps = new Crisps();
        this.fruit = new Fruit();
        this.drink = new Drink();
    }

    public int dispenseCrisps(){
        return crisps.despense();
    }
    public int dispenseFruit(){
        return fruit.despense();
    }
    public int dispenseDrink(){
        return  drink.despense();
    }
}
