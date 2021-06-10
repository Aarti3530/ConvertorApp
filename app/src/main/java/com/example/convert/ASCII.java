package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ASCII extends AppCompatActivity {
    Button display,clear;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s_c_i_i);
        bindView();
        clickListener();
    }

    private void bindView() {
        display = findViewById(R.id.Enter);
        clear = findViewById(R.id.Clear);
        text = findViewById(R.id.ascii);
    }

    private void clickListener() {
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = String.valueOf(text.getText());
                char ch = s.charAt(0);
                if(Character.isDigit(ch)){
                    int N = Integer.parseInt(s);
                      digitAscii(N);
                }
                else if(Character.isLetter(ch)){
                    int ascii = (int) ch;
                    text.setText(""+ascii+"");
                }
                else
                    text.setText("Invalid Input");
            }

            private void digitAscii(int ch) {
                if(ch == 0){
                    text.setText(""+48);
                    return;
                }
                while(ch >= 0){
                    int d = ch % 10;
                    text.setText(d+48+"");
                    ch = ch/10;
                }
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