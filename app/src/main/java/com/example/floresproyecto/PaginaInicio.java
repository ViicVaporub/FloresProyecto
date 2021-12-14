package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.floresproyecto.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaginaInicio extends AppCompatActivity {
    Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnCatalogo;
        Button btnWhats;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicio);
        btnCerrar = findViewById(R.id.btnCerrar);


        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
                preferences.edit().clear().commit();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnCatalogo = (Button) findViewById(R.id.btnCatalago);
        {
            btnCatalogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(PaginaInicio.this, naturalartificial.class);
                    startActivity(i);

                }
            });
        }
        btnWhats = (Button) findViewById(R.id.btnWhats);
        {
            btnWhats.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(PaginaInicio.this, whatsaap.class);
                    startActivity(i);

                }
            });
        }



    }

}