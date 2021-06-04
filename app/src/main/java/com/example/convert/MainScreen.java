package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.convert.ASCII;
import com.example.convert.Area;
import com.example.convert.Calculator;
import com.example.convert.Data;
import com.example.convert.Length;
import com.example.convert.Mass;
import com.example.convert.Money;
import com.example.convert.R;
import com.example.convert.Speed;
import com.example.convert.Temperature;
import com.example.convert.Time;
import com.example.convert.Volume;
import com.example.convert.Weigth;

public class MainScreen extends AppCompatActivity {
    Button area,ascii,calculator,dataSize,length,mass,money,speed,temperature,time,volume,weight;

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
        area =  findViewById(R.id.area);
        ascii =  findViewById(R.id.ascii);
        calculator = findViewById(R.id.calsi);
        dataSize =  findViewById(R.id.datasize);
        length =  findViewById(R.id.length);
        mass =  findViewById(R.id.mass);
        money =  findViewById(R.id.money);
        speed =  findViewById(R.id.speed);
        temperature =  findViewById(R.id.temperature);
        time = findViewById(R.id.time);
        volume =  findViewById(R.id.volume);
        weight =  findViewById(R.id.weight);
    }
    private void set(){
        area.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Area.class);
                startActivity(intent);
            }
        });
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
        length.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Length.class);
                startActivity(intent);
            }
        });
        mass.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Mass.class);
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
        speed.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Speed.class);
                startActivity(intent);
            }
        });
        temperature.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Temperature.class);
                startActivity(intent);
            }
        });
        time.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Time.class);
                startActivity(intent);
            }
        });
        volume.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Volume.class);
                startActivity(intent);
            }
        });
        weight.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Weigth.class);
                startActivity(intent);
            }
        });
    }
}