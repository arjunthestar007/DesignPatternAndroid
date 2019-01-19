package com.example.arjun.designpatternandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.arjun.designpatternandroid.bread.Bread;
import com.example.arjun.designpatternandroid.Filling.Filling;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=findViewById(R.id.tv1);
        TextView tv2=findViewById(R.id.tv2);
        TextView tv3=findViewById(R.id.tv3);

        TextView tv4=findViewById(R.id.tv4);


        AbstractFactory abstractFactory=FactoryGenerator.getFactory("BRE");
        Bread bread=abstractFactory.getBread("BRI");
        Filling filling=abstractFactory.getFilling("CH");
        tv1.setText(bread.name());
        tv2.setText(bread.calories());
        tv3.setText(filling.name());
        tv4.setText(filling.calories());


    }
}
