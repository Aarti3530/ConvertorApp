package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {
    Button ascii,calculator,dataSize,money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        bndView();
        clickListener();
    }

    private void clickListener() {
        set();
    }

    private void bndView() {
        ascii =  findViewById(R.id.ascii);
        calculator = findViewById(R.id.calsi);
        dataSize =  findViewById(R.id.datasize);
        money =  findViewById(R.id.money);
    }
    private void set(){
        ascii.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, ASCII.class);
                startActivity(intent);
            }
        });
        calculator.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Calculator.class);
                startActivity(intent);
            }
        });
        dataSize.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Data.class);
                startActivity(intent);
            }
        });

        money.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Money.class);
                startActivity(intent);
            }
        });

    }
}