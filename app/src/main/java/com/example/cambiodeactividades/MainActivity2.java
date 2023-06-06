package com.example.cambiodeactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void A1(View view){
        Intent A1 = new Intent(this, MainActivity.class);
        startActivity(A1);

    }

    public void A3(View view){
        Intent A3 = new Intent(this, MainActivity3.class);
        startActivity(A3);

    }
}