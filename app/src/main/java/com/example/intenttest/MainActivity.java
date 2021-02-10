package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.btnNext);
        next.setOnClickListener(this);

    }
    public void onClick (View view) {

        EditText inputTxt = findViewById(R.id.inputTxt);
        int inputNumber = 0;
        inputNumber = Integer.parseInt(inputTxt.getText().toString());

        Intent next = new Intent(MainActivity.this, SecondActivity.class);

        switch (view.getId()) {
            case R.id.btnNext:

                next.putExtra("input_number", inputNumber);
                startActivity(next);

                break;
        }
    }
}