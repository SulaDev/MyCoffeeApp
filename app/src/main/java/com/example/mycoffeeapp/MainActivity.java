package com.example.mycoffeeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    int kolichestvo = 0;
    Button buttonPlus, buttonMinus, buttonZakazat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlus = findViewById(R.id.btnPlus);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonZakazat = findViewById(R.id.btnZakazat);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });

        buttonMinus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
            }
        });

        buttonZakazat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitOrder();
            }
        });

    }


    public void submitOrder() {
        int price = kolichestvo *5;
        displayPrice(price);
    }

    public void increment() {
        kolichestvo = kolichestvo + 1;
        display(kolichestvo);
    }

    public void decrement() {
        if (kolichestvo >0){
            kolichestvo = kolichestvo - 1;
            display(kolichestvo);
        }
    }


    private void display(int number) {
        TextView quantityText = findViewById(R.id.textCups);
        quantityText.setText("" + number);
    }


    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.textPrice);

        priceTextView.setText("С вас "+ number +" долларов");
    }
}
