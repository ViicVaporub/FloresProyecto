package com.example.floresproyecto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.floresproyecto.adapter.RecyclerAdapter;


import java.util.ArrayList;
import java.util.List;

public class ramos extends AppCompatActivity {
    private RecyclerView rvlista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramos);
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
        itemLists.add(new ItemList("Ramo 12 Rosas","Ramo Rosas Rojas Con Papel Negro Y Nube","R110",R.drawable.naturalr1));
        itemLists.add(new ItemList("Ramo Rosas con Girasol","Ramo Rosas Rojas Con Un Girasol En El Centro Y Nube","R111",R.drawable.naturalr2));
        itemLists.add(new ItemList("Ramo Tulipanes","Ramo De Tulipanes Rojos Con Nube","R112",R.drawable.naturalr3));
        itemLists.add(new ItemList("Ramo 24 Rosas","Ramo De Rosas Rojas Forma Acostado","R113",R.drawable.naturalr4));
        itemLists.add(new ItemList("Ramo Lilis con Gerberas","Ramo de Lilis y Gerberas Rosas","R114",R.drawable.naturalr5));
        itemLists.add(new ItemList("Ramo de Lilis y Girasoles","Ramo de Lilis Blanco Con Girasoles","R115",R.drawable.naturalr6));
        itemLists.add(new ItemList("Ramo 24 Rosas Con Girasoles","Ramo de Rosas Rojas Con Un Girasol Forma Acostado","R116",R.drawable.naturalr7));
        itemLists.add(new ItemList("Ramo 50 Rosas","Ramo De Rosas Blancas y Moradas","R117",R.drawable.naturalr8));
        itemLists.add(new ItemList("Ramo 40 Rosas","Ramo De Rosas Amarillas Forma Acostado","R118",R.drawable.naturalr9));
        itemLists.add(new ItemList("Ramo Rosas Arcoiris","Ramo De Rosas Color Arcoiris Con Papel Transaparente","R119",R.drawable.naturalr10));
        itemLists.add(new ItemList("Ramo Rosas Papel de Estrasa","Ramo De Rosas Blancas y Rojas Intercaladas","R120",R.drawable.naturalr11));
        return itemLists;

    }
}