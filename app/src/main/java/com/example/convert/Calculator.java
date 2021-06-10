package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.*;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,C,mul,add,div,sub,equal;
    EditText look;
    boolean Aadd,Asub,Amul,Adiv;
    float num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        bindView();
        clickListener();
    }

    private void clickListener() {
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               look.setText(look.getText()+"1");
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"2");
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"3");
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"4");
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"5");
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"6");
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"7");
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"8");
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"9");
            }
        });
        b0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText(look.getText()+"0");
            }
        });
        C.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                look.setText("");
            }
        });
        add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(look.getText()+"");
                Aadd = true;
                look.setText(null);
            }
        });
        mul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(look.getText()+"");
                Amul = true;
                look.setText(null);
            }
        });
        div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(look.getText()+"");
                Adiv = true;
                look.setText(null);
            }
        });
        sub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(look.getText()+"");
                Asub = true;
                look.setText(null);
            }
        });
        equal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Float.parseFloat(look.getText()+"");
                look.setText(null);
                if(Aadd == true){
                    look.setText(num1 + num2 + "");
                    Aadd = false;
                }
                else if(Asub == true){
                    look.setText(num1 - num2 + "");
                    Asub = false;
                }
                else if(Amul == true){
                    look.setText(num1 * num2 + "");
                    Amul = false;
                }
                else if(Adiv == true){
                    look.setText(num1 / num2 + "");
                    Adiv = false;
                }
            }
        });
    }

    private void bindView() {
        look = (EditText) findViewById(R.id.pannel);
        b1 = findViewById(R.id.num1);
        b2 = findViewById(R.id.num2);
        b3 = findViewById(R.id.num3);
        b4 = findViewById(R.id.num4);
        b5 = findViewById(R.id.num5);
        b6 = findViewById(R.id.num6);
        b7 = findViewById(R.id.num7);
        b8 = findViewById(R.id.num8);
        b9 = findViewById(R.id.num9);
        b0 = findViewById(R.id.num0);
        C = findViewById(R.id.C);
        equal = findViewById(R.id.equal);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);
    }
}