package com.example.c110112157_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test(View view) {
        EditText editTextNumber =(EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 =(EditText) findViewById(R.id.editTextNumber2);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        double val,tall,weight;

        tall=Double.parseDouble(editTextNumber.getText().toString())/100;
        weight=Double.parseDouble(editTextNumber2.getText().toString());
        val=weight/(tall*tall);
        if(val>24)
            textView4.setText(String.format("您的BMI:\n過胖"));
        else if(val<=18.5)
            textView4.setText(String.format("您的BMI:\n過瘦"));
        else
            textView4.setText(String.format("您的BMI:\n正常"));
    }
}