package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

import java.math.BigInteger;

public class Data extends AppCompatActivity {
    Button b,clear;
    TextInputEditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        bindViews();
    }

    private void bindViews() {
        b = findViewById(R.id.bytte);
        text = (TextInputEditText) findViewById(R.id.byttetext);
        clear = findViewById(R.id.clearbites);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BigInteger s = new BigInteger(text.getText()+"");
                BigInteger f = new BigInteger("8");
                s = s.multiply(f);
                text.setText(""+s);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(null);
            }
        });
    }
}