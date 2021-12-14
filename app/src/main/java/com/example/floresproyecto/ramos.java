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
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr1));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr2));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr3));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr4));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr5));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr6));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr7));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr8));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr9));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr10));
        itemLists.add(new ItemList("Rosa blanca","Naturales y preciosas",R.drawable.naturalr11));
        return itemLists;

    }
}