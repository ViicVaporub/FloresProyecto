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
    private RecyclerView rvlista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicio);
        btnCerrar=findViewById(R.id.btnCerrar);

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences=getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
                preferences.edit().clear().commit();

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        initViews();
        initValues();
    }
    private void initViews(){
     rvlista = findViewById(R.id.rvLista);
     }

    private void initValues(){
    LinearLayoutManager manager= new LinearLayoutManager(this);
    rvlista.setLayoutManager(manager);

     items = getItems();
     adapter = new RecyclerAdapter(items);
    rvlista.setAdapter(adapter);
    }

    private List<ItemList> getItems(){
     List<ItemList> itemLists = new ArrayList<>();
     itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.flor));
     return itemLists;

    }
}