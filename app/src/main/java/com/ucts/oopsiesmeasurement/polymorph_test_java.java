package com.ucts.oopsiesmeasurement;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public abstract class polymorph_test_java extends AppCompatActivity implements polymorph_test_interface {

    private Button openHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(loadLayoutView());
        openHomeButton = findViewById(openHomePage());
        openHomeButton.setOnClickListener(onClickOpenHome());
    }

    private View.OnClickListener onClickOpenHome() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        };
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
