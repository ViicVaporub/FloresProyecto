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



        }


    }
}