package com.example.ejercicios_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ejercicio42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio42);
    }
    public void principal(View view){
        Intent principal = new Intent(this,  MainActivity.class);
        startActivity(principal);
    }
}
