package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fun_facts_page3 extends AppCompatActivity {

    private android.widget.Button buttonHome;
    private android.widget.Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_page3);

        buttonBack = (android.widget.Button) findViewById(R.id.buttonBack);
        buttonHome = (android.widget.Button) findViewById(R.id.buttonHome);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(fun_facts_page3.this, fun_facts_page2.class);
                startActivity(int2);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(fun_facts_page3.this, MainActivity.class);
                startActivity(int3);
            }
        });
    }
}