package com.ucts.oopsiesmeasurement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button button0;
    private android.widget.Button button1;
    private android.widget.Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (android.widget.Button) findViewById(R.id.button0);
        button1 = (android.widget.Button) findViewById(R.id.button1);
        button2 = (android.widget.Button) findViewById(R.id.button2);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, Educational.class);
                startActivity(int1);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, fun_facts_page1.class);
                startActivity(int2);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, Settings.class);
                startActivity(int3);
            }
        });
    }
}