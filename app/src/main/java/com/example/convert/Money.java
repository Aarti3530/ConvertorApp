package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class Money extends AppCompatActivity {
    TextInputEditText text;
    Button convert,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        bindView();
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(null);
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rupee = Integer.parseInt(text.getText()+"");
                text.setText((rupee*0.013)+"");
            }
        });
    }

    private void bindView() {
        text = (TextInputEditText) findViewById(R.id.money_text);
        convert = findViewById(R.id.convert);
        clear = findViewById(R.id.clear);
    }
}