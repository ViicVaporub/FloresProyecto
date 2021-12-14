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
        itemLists.add(new ItemList("Caja de Rosas","Caja de Rosas Color Salmon y Blancas Con Caja Negra","A133",R.drawable.naturala1));
        itemLists.add(new ItemList("Arreglo Girasoles, Rosas, Lilis, Gerberas","Arreglo Con Girasoles Lilis Gerberas y Rosas En Forma Escalera","A134",R.drawable.naturala2));
        itemLists.add(new ItemList("Arreglo Con Rosas, Gerberas y Lilis","Arreglo Redondo Con Gerbera Rosa y Rosas Color Rojo","A135",R.drawable.naturala3));
        itemLists.add(new ItemList("Caja 50 Rosas","Caja Negra Con Rosas Rojas ","A137",R.drawable.naturala4));
        itemLists.add(new ItemList("Arreglo con Canasta de Gerberas y Lilis","Arreglo Redondo Con Tonalidades Rosas y Canasta","A138",R.drawable.naturala5));
        itemLists.add(new ItemList("Arreglo De Rosas y Lilis","Arreglo Con Rosas Color Rosas Y Lilis Naranja Redondo Con Base de Cristal","A139",R.drawable.naturala6));
        itemLists.add(new ItemList("Arreglo de Tulipanes","Arreglo De Tulipanes Amarillos y Narnajas De Una Vista ","A140",R.drawable.naturala7));
        itemLists.add(new ItemList("Caja de Corazon","Caja de Rosas Rojas En Forma de Corazon","A141",R.drawable.naturala8));
        itemLists.add(new ItemList("Arreglo Forma de Corazon Con Chocolates","Arreglo Con Rosas Rojas Forma de Corazon Con Chocolates Ferrero","A142",R.drawable.naturala9));
        itemLists.add(new ItemList("Arreglo Circular","Arreglo Con Rosas De Diferentes Colores Con Base De Cristal","A143",R.drawable.naturala10));
        itemLists.add(new ItemList("Arreglo Cascada","Arreglo Con Rosas Rojas Y Gerberas Blancas Amarillas Y Rojas","A144",R.drawable.naturala11));
    return itemLists;

    }
}