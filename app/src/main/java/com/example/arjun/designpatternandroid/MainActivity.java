package com.example.arjun.designpatternandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=findViewById(R.id.tv1);
        TextView tv2=findViewById(R.id.tv2);

        BreadFactory breadFactory=new BreadFactory();
        Bread bread=breadFactory.getbreadfactory("BRI");
        tv1.setText(bread.name());
        tv2.setText(bread.calories());

    }
}
