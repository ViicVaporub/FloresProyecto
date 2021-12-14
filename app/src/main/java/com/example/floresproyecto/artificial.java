package com.example.floresproyecto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.floresproyecto.adapter.RecyclerAdapter;


import java.util.ArrayList;
import java.util.List;

public class artificial extends AppCompatActivity {
    private RecyclerView rvlista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificial);
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
        itemLists.add(new ItemList("Canasta Con Planta Tropical","Canasta Que Tiene Una Planta Tropical Artificial","AT122",R.drawable.artificial1));
        itemLists.add(new ItemList("Arreglo Tulipanes","Arreglo Artificial De Tulipanes Morados","AT123",R.drawable.artificial2));
        itemLists.add(new ItemList("Arreglo De Ortencias Y Dolar","Arreglo Artificial De Ortencias Rosas Con Dolar Morado","AT124",R.drawable.artificial3));
        itemLists.add(new ItemList("Arreglo Acostado","Arreglo Con Rosa Grande Artificial Forma Acostado Con Piedrita Naranja","AT125",R.drawable.artificial4));
        itemLists.add(new ItemList("Arreglo Tulipanes","Arreglo Artificial Tulipanes Naranjas Con Piedrita Naranja","AT126",R.drawable.artificial5));
        itemLists.add(new ItemList("Caja De Cristal Con Ortencias","Caja de Cristal Con Ortencias Artificial Color Blanco, Rosa Con Piedrita Morada y Blanca","AT127",R.drawable.artificial6));
        itemLists.add(new ItemList("Caja Con Rosas Artificiales","Caja Rosa Circular Con Rosas Color Rosa Artificiales Forma Redonda","AT128",R.drawable.artificial7));
        itemLists.add(new ItemList("Arreglo Con Base Forma De Dona","Arreglo Con Tulipanes Morados Con Base Blanca Forma de Dona","AT129",R.drawable.artificial8));
        itemLists.add(new ItemList("Pecera Con Rosa Grande Artificial","Pecera De Cristal Con Rosa Grande Color Rosa Y Piedra","AT130",R.drawable.artificial9));
        itemLists.add(new ItemList("Arreglo Artificial Girasol","Arreglo Artificial Con Girasoles Y Base Negra","AT131",R.drawable.artificial10));
        itemLists.add(new ItemList("Orquidia Phanelopsis","Orquidia Phanelopsis Artificial Color Crema","AT132",R.drawable.artificial11));

        return itemLists;

    }
}