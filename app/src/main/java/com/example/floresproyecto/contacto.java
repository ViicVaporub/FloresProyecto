package com.example.floresproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class contacto extends AppCompatActivity {
    public TextView mEmail;
    public EditText mMessage;
    public EditText mEmail2;
    public Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        mEmail = (TextView) findViewById(R.id.mailID);
        mEmail2 = (EditText) findViewById(R.id.mail2);
        mMessage = (EditText) findViewById(R.id.messageID);
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
            }
        });
    }

    private void sendMail() {
        String mail = mEmail.getText().toString();
        String mail2 = mEmail2.getText().toString();
        String message = mMessage.getText().toString();
        JavaMailAPI javaMailAPI = new JavaMailAPI(this,mail,mail2,message);
        javaMailAPI.execute();
    }
}