package com.example.cambiodeactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void A2(View view){
        Intent A2 = new Intent(this, MainActivity2.class);
        startActivity(A2);

    }

    public void A3(View view){
        Intent A3 = new Intent(this, MainActivity3.class);
        startActivity(A3);

    }
}