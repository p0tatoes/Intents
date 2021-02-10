package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);
        int month = 0;

        Intent next = getIntent();

        month = next.getIntExtra("input_number", 0);

        switch (month) {
            case 1:
                textView.setText("The month is January");
                break;
            case 2:
                textView.setText("The month is February");
                break;
            case 3:
                textView.setText("The month is March");
                break;
            case 4:
                textView.setText("The month is April");
                break;
            case 5:
                textView.setText("The month is May");
                break;
            case 6:
                textView.setText("The month is June");
                break;
            case 7:
                textView.setText("The month is July");
                break;
            case 8:
                textView.setText("The month is August");
                break;
            case 9:
                textView.setText("The month is September");
                break;
            case 10:
                textView.setText("The month is October");
                break;
            case 11:
                textView.setText("The month is November");
                break;
            case 12:
                textView.setText("The month is December");
                break;
            default:
                textView.setText("ERROR: Input is invalid.");
                break;
        }
    }
}