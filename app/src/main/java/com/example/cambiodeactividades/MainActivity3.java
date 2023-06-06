package com.example.cambiodeactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void A1(View view){
        Intent A1 = new Intent(this, MainActivity.class);
        startActivity(A1);

    }

    public void A2(View view){
        Intent A2 = new Intent(this, MainActivity2.class);
        startActivity(A2);

    }

}