package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ramoarreglo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramoarreglo);
    }
    public void ramos(View view){
        startActivity(new Intent(getApplicationContext(),ramos.class));
        finish();
    }
    public void arreglos(View view){
        startActivity(new Intent(getApplicationContext(),arreglos.class));
        finish();
    }
}