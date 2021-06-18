package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class estimating_quantities_page2 extends AppCompatActivity {

    private android.widget.Button buttonReturn;
    private android.widget.Button buttonBack;
    private android.widget.Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimating_quantities_page2);

        buttonReturn = (android.widget.Button) findViewById(R.id.buttonReturn);
        buttonBack = (android.widget.Button) findViewById(R.id.buttonBack);
        buttonHome = (android.widget.Button) findViewById(R.id.buttonHome);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(estimating_quantities_page2.this, Educational.class);
                startActivity(int1);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(estimating_quantities_page2.this, estimating_quantities_page1.class);
                startActivity(int2);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(estimating_quantities_page2.this, MainActivity.class);
                startActivity(int3);
            }
        });
    }
}