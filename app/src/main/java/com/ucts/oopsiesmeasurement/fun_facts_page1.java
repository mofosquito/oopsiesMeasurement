package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fun_facts_page1 extends AppCompatActivity {

    private android.widget.Button buttonNext;
    private android.widget.Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_page1);

        buttonNext = (android.widget.Button) findViewById(R.id.buttonNext);
        buttonBack = (android.widget.Button) findViewById(R.id.buttonBack);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(fun_facts_page1.this, fun_facts_page2.class);
                startActivity(int1);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(fun_facts_page1.this, MainActivity.class);
                startActivity(int2);
            }
        });
    }
}