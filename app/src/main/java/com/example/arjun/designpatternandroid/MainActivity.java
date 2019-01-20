package com.example.arjun.designpatternandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbstractSandwich abstractSandwich=new Sandwich("Chesse","Tomato",new Open());
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv1.setText(abstractSandwich.make());
        AbstractSandwich abstractSandwich1=new Sandwich("ham","Eggs",new Closed());
        abstractSandwich1.make();
        tv2.setText(abstractSandwich1.make());


    }
}
