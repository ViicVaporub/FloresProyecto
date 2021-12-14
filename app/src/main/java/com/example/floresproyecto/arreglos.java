package com.example.floresproyecto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.floresproyecto.adapter.RecyclerAdapter;


import java.util.ArrayList;
import java.util.List;

public class arreglos extends AppCompatActivity {
    private RecyclerView rvlista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arreglos);
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
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala1));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala2));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala3));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala4));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala5));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala6));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala7));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala8));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala9));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala10));
        itemLists.add(new ItemList("Rosas","Naturales y preciosas",R.drawable.naturala11));
    return itemLists;

    }
}