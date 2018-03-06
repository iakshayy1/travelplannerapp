package com.example.s528772.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GallonEntryOnClick(View v) {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

    public void priceOnClick(View v) {

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void reqGallonsForTrip(View v) {

        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

}

