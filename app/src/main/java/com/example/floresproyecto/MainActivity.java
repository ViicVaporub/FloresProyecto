package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.floresproyecto.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvlista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button botonabout;
        Button botoncontacto;
        Button botonlogin;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setTheme(R.style.Theme_FloresProyecto);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonabout = (Button) findViewById(R.id.botonabout);
        botoncontacto = (Button) findViewById(R.id.botoncontacto);
        botonlogin = (Button) findViewById(R.id.botonlogin);
        {

            botonabout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, about.class);
                    startActivity(i);
                }
            });
            botoncontacto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, contacto.class);
                    startActivity(i);
                }
            });
            botonlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, login.class);
                    startActivity(i);
                }
            });


            // initViews();
            // initValues();
        }

        // private void initViews(){
        // rvlista = findViewById(R.id.rvLista);
        // }

        //private void initValues(){
        //LinearLayoutManager manager= new LinearLayoutManager(this);
        //rvlista.setLayoutManager(manager);

        // items = getItems();
        // adapter = new RecyclerAdapter(items);
        //rvlista.setAdapter(adapter);
        //}

        //private List<ItemList> getItems(){
        // List<ItemList> itemLists = new ArrayList<>();
        // itemLists.add(new ItemList("Rosas","Naturales y poreciosas",R.drawable.logo));
        // return itemLists;

        // }
    }
}