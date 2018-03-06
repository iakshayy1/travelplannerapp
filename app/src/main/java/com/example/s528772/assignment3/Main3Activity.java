package com.example.s528772.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);
        Double a = getIntent().getDoubleExtra("gallon",1);
        double unleaded = a*2.43;
        tv4.setText(a+" gallons of unleaded cost is "+unleaded);
        TextView tv5 = (TextView) findViewById(R.id.textView5);
        Double b = getIntent().getDoubleExtra("gallon",1);
        double diesel = a*2.6;
        tv5.setText(b+" gallons of diesel cost is "+diesel);
        TextView tv6 = (TextView) findViewById(R.id.textView6);
        Double c = getIntent().getDoubleExtra("gallon",1);
        double premium = a*2.81;
        tv6.setText(c+" gallons of premium gas cost is "+premium);
        TextView tv13 = (TextView) findViewById(R.id.textView13);
        Double d = getIntent().getDoubleExtra("gallon",1);
        Double e = getIntent().getDoubleExtra("defaultPrice",2.30);
        double def = d*e;
        tv13.setText(d+ " gallons of gas specified/default cost is "+(Double) def + "dollars");

    }


    public void backToStart(View v){
        TextView tv1= (TextView) findViewById(R.id.textView);
        Intent i=new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


}
