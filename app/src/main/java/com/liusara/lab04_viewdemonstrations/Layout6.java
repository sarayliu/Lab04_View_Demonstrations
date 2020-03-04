package com.liusara.lab04_viewdemonstrations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout6 extends AppCompatActivity {
    Button backButton1;
    Button backButton2;
    Button backButton3;
    Button backButton4;
    Button backButton5;
    Button backButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout6);
        backButton1 = findViewById(R.id.buttonBack1);
        backButton2 = findViewById(R.id.buttonBack2);
        backButton3 = findViewById(R.id.buttonBack3);
        backButton4 = findViewById(R.id.buttonBack4);
        backButton5 = findViewById(R.id.buttonBack5);
        backButton6 = findViewById(R.id.buttonBack6);

        final View.OnClickListener backButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        };
        backButton1.setOnClickListener(backButton);
        backButton2.setOnClickListener(backButton);
        backButton3.setOnClickListener(backButton);
        backButton4.setOnClickListener(backButton);
        backButton5.setOnClickListener(backButton);
        backButton6.setOnClickListener(backButton);
    }
}
