package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class naturalartificial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturalartificial);
    }
    public void naturalartificial(View view){
        startActivity(new Intent(getApplicationContext(),ramoarreglo.class));
        finish();
    }
    public void artificial(View view){
        startActivity(new Intent(getApplicationContext(),artificial.class));
        finish();
    }
}