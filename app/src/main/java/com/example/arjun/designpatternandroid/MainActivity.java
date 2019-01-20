package com.example.arjun.designpatternandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    TextView tv1,tv2,tv3;

    Payment payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv1:
                payment=new Payment(new Card());
                break;

            case R.id.tv2:
                payment=new Payment(new Coupon());

                break;
            case R.id.tv3:
                payment=new Payment(new Cash());
                break;
        }
        String price=new StringBuilder().append("Total cost").append(payment.processpayment(1.2f)).append("c").toString();
        Toast.makeText(this, ""+price, Toast.LENGTH_SHORT).show();

    }
}
