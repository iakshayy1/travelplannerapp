package com.example.s528772.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void PriceDisplayOnClick(View v) {

        Intent intent = new Intent(this, Main3Activity.class);
        EditText ed3 = (EditText) findViewById(R.id.editText);
        String s = ed3.getText().toString();

        EditText ed4 = (EditText) findViewById(R.id.editText4);
        String s1 = ed4.getText().toString();


//        if(s.equals(" ")|| s1.equals(" ")){
//            TextView tv14 = (TextView) findViewById(R.id.textView14);
//            tv14.setText("Error: requires both fields");
//        }
//        else {
        if (s1.length() > 0) {
            double a = Double.parseDouble(s);
            intent.putExtra("gallon", a);
            double b = Double.parseDouble(s1);
            intent.putExtra("price", b);


            String v2 = ed4.getText().toString();

            if (v2.length() > 0) {
                double v1 = Double.parseDouble(v2);
                intent.putExtra("defaultPrice", v1);

                startActivity(intent);
            }
        }
    }

    public void GallonCalculate(View v) {
        EditText ed = (EditText) findViewById(R.id.editText3);
        String a = ed.getText().toString();

        EditText ed1 = (EditText) findViewById(R.id.editText2);
        String b = ed1.getText().toString();
        if (a.equals("") || b.equals("")) {
            TextView tV = (TextView) findViewById(R.id.textView3);
            tV.setText("error");
        }
        else{
            double distance = Double.parseDouble(a);
            double mileage = Double.parseDouble(b);
            double result = (distance / mileage);
            String sb = Double.toString(result);
            TextView tV = (TextView) findViewById(R.id.textView3);
            tV.setText(sb);
        }
    }
}

