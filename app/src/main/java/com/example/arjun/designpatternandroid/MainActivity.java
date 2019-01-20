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
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        Sandwich offtheshelf=SandwichBuilder.readymade();
        tv1.setText(""+offtheshelf.getcalorie());
        offtheshelf.getSandwich();


        SandwichBuilder sandwichBuilder=new SandwichBuilder();
        Sandwich sandwich=new Sandwich();
        sandwich=sandwichBuilder.build(sandwich,new Bagel());
        sandwich=sandwichBuilder.build(sandwich,new Smokedsalmon());

       // tv2.setText(sandwich.getcalorie());
        sandwich.getSandwich();


    }
}
