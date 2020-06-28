package com.example.ejercicios_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ejercicio8 extends AppCompatActivity {
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);
        tv2=(TextView)findViewById(R.id.tv2);
    }

    //Este método se ejecutará cuando se presione el ImageButton
    public void llamar(View view) {
        tv2.setText("Llamando");
    }

    public void principal(View view){
        Intent principal = new Intent(this,  MainActivity.class);
        startActivity(principal);
    }
}
