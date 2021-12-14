package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class whatsaap extends AppCompatActivity {
    EditText txtmensaje;
    Button btnwts;
    String mensajetr ="Hola";
    String telefono = "+524492178980";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsaap);



        btnwts=findViewById(R.id.btnwts);

        btnwts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (!mensajetr.isEmpty()){

                    if (isWhatsappInstalled()){

                        Intent i= new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://api.whatsapp.com/send?phone="+telefono+"&text"+mensajetr));
                        startActivity(i);


                    }else{

                        Toast.makeText(whatsaap.this,"No tienes instalado Whatsapp",Toast.LENGTH_SHORT).show();

                    }

                }else{
                    Toast.makeText(whatsaap.this,"Porfavor llena el mensaje",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    private boolean isWhatsappInstalled(){
        PackageManager packageManager=getPackageManager();
        boolean whatsappInstalled;

        try {
            packageManager.getPackageInfo("com.whatsapp",PackageManager.GET_ACTIVITIES);
            whatsappInstalled = true;
        }catch (PackageManager.NameNotFoundException e){
            whatsappInstalled = false;
        }
        return whatsappInstalled;
    }
}