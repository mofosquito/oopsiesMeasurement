package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class length_mass_time_page3 extends polymorph_test_java {

    private android.widget.Button buttonReturn;
    private android.widget.Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buttonReturn = (android.widget.Button) findViewById(R.id.buttonReturn);
        buttonBack = (android.widget.Button) findViewById(R.id.buttonBack);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(length_mass_time_page3.this, Educational.class);
                startActivity(int1);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(length_mass_time_page3.this, length_mass_time_page2.class);
                startActivity(int2);
            }
        });
    }

    @Override
    public int loadLayoutView() {
        return R.layout.activity_length_mass_time_page3;
    }

    @Override
    public int openHomePage() {
        return R.id.buttonHome;
    }
}