package com.liusara.lab04_viewdemonstrations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.buttonLayout1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Layout1.class);
                startActivity(intent1);
            }
        });
        button2 = findViewById(R.id.buttonLayout2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Layout2.class);
                startActivity(intent2);
            }
        });
        button3 = findViewById(R.id.buttonLayout3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), Layout3.class);
                startActivity(intent3);
            }
        });
        button4 = findViewById(R.id.buttonLayout4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), Layout4.class);
                startActivity(intent4);
            }
        });
        button5 = findViewById(R.id.buttonLayout5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), Layout5.class);
                startActivity(intent5);
            }
        });
        button6 = findViewById(R.id.buttonLayout6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), Layout6.class);
                startActivity(intent6);
            }
        });
        button7 = findViewById(R.id.buttonLayout7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getApplicationContext(), Layout7.class);
                startActivity(intent7);
            }
        });
    }
}
