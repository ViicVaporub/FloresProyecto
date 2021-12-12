package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button botoninicio;
        Button botonabout;
        Button botoncontacto;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setTheme(R.style.Theme_FloresProyecto);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botoninicio=(Button)findViewById(R.id.botoninicio);
        botonabout=(Button)findViewById(R.id.botonabout);
        botoncontacto=(Button)findViewById(R.id.botoncontacto);
        botoninicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PaginaInicio.class);
                startActivity(i);
            }
        });
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
    }
}