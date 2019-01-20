package com.example.arjun.designpatternandroid;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {


    private static final String TAG = "Sandwich";

    private List<Integredient> integredientslist=new ArrayList<>();

    public void addintegredient(Integredient integredients) {
        integredientslist.add(integredients);
    }

    public int getcalorie(){
        int c=0;
        for(Integredient i:integredientslist){
            c+=i.calories();
            Log.d(TAG, "getcalorie: "+c);

        }
        return c;
    }

    public void getSandwich(){
        for(Integredient i:integredientslist){
            Log.d(TAG, "getSandwich: "+"name :"+i.name()+"calories:"+i.calories());

        }
    }
}
