package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class heat_temp_page1 extends AppCompatActivity {

    private android.widget.Button buttonNext;
    private android.widget.Button buttonBack;
    private android.widget.Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heat_temp_page1);

        buttonNext = (android.widget.Button) findViewById(R.id.buttonNext);
        buttonBack = (android.widget.Button) findViewById(R.id.buttonBack);
        buttonHome = (android.widget.Button) findViewById(R.id.buttonHome);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(heat_temp_page1.this, heat_temp_page2.class);
                startActivity(int1);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(heat_temp_page1.this, Educational.class);
                startActivity(int2);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(heat_temp_page1.this, MainActivity.class);
                startActivity(int3);
            }
        });
    }
}