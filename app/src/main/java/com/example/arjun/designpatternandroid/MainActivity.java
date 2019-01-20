package com.example.arjun.designpatternandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);

        Facade facade=new Facade();

        tv1.setText( ""+facade.dispenseCrisps());
        tv2.setText(""+facade.dispenseDrink());
        tv3.setText(""+facade.dispenseFruit());
    }
}
