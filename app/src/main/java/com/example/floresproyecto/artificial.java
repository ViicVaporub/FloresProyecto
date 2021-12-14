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
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial1));
        itemLists.add(new ItemList("Girasol","Naturales y preciosas",R.drawable.artificial2));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial3));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial4));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial5));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial6));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial7));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial8));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial9));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial10));
        itemLists.add(new ItemList("Ortencias","Naturales y preciosas",R.drawable.artificial11));

        return itemLists;

    }
}