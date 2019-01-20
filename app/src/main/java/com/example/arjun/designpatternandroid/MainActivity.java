package com.example.arjun.designpatternandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.tv1);

        BasicPrice basicPrice=BasicPrice.getInstance();
        basicPrice.setPrice(1.5f);

        textView.setText(""+basicPrice.getPrice());
    }
}
