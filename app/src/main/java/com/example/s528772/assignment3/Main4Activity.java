package com.example.s528772.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void CalculateReqGas(View v){
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        Double d = Double.parseDouble(ed2.getText().toString());
        EditText ed3 = (EditText) findViewById(R.id.editText3);
        Double d1 = Double.parseDouble(ed3.getText().toString());
        TextView tv12 = (TextView) findViewById(R.id.textView12);
        Double d3 = (d/d1);
        String s = d3.toString();
        tv12.setText("The amount of fuel required for trip is " +s+" gallons");
    }

    public void amountForReqGas(View v){
        TextView tv1 = (TextView) findViewById(R.id.textView12);

        String gallon = tv1.getText().toString();

        String[] text1 = gallon.split(" ");
        Intent i = new Intent(this, Main3Activity.class);
        double t = Double.parseDouble(text1[8]);
        i.putExtra("gallon", t);
        startActivity(i);

    }
}
