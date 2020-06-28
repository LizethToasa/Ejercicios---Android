package com.example.ejercicios_android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método menu
    public void Ejercicio7(View view){
        Intent ejercicio7 = new Intent(this, Ejercicio7.class);
        startActivity(ejercicio7);
    }

    public void Ejercicio8(View view){
        Intent ejercicio8 = new Intent(this, ejercicio8.class);
        startActivity(ejercicio8);
    }

    public void Ejercicio16(View view){
        Intent ejercicio16 = new Intent(this, ejercicio16.class);
        startActivity(ejercicio16);
    }

    public void Ejercicio35(View view){
        Intent ejercicio35 = new Intent(this, ejercicio35.class);
        startActivity(ejercicio35);
    }

    public void Ejercicio42(View view){
        Intent ejercicio42 = new Intent(this, ejercicio42.class);
        startActivity(ejercicio42);
    }
}
