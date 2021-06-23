package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class phenomena_illusions_page2 extends polymorph_test_java {

    private android.widget.Button buttonNext;
    private android.widget.Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buttonNext = (android.widget.Button) findViewById(R.id.buttonNext);
        buttonBack = (android.widget.Button) findViewById(R.id.buttonBack);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(phenomena_illusions_page2.this, phenomena_illusions_page3.class);
                startActivity(int1);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(phenomena_illusions_page2.this, phenomena_illusions_page1.class);
                startActivity(int2);
            }
        });
    }

    @Override
    public int loadLayoutView() {
        return R.layout.activity_phenomena_illusions_page2;
    }

    @Override
    public int openHomePage() {
        return R.id.buttonHome;
    }
}