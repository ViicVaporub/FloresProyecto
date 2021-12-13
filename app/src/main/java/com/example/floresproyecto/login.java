package com.example.floresproyecto;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {
EditText t_email,t_pass;
String str_email,str_pass;
String url="https://rczqevij.lucusvirtual.es/login.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        t_email=findViewById(R.id.txttemail);
        t_pass=findViewById(R.id.txtpass);
        recuperarPreferencias();
    }

    public void login(View view){
        if(t_email.getText().toString().equals("")){
            Toast.makeText(this,"Ingrese correo",Toast.LENGTH_SHORT).show();
        }else if (t_pass.getText().toString().equals("")){
            Toast.makeText(this,"Ingrese Password",Toast.LENGTH_SHORT).show();
        }else{
            final ProgressDialog progressDialog=new ProgressDialog(this);
            progressDialog.setMessage("Porfavor espere");
            progressDialog.show();

            str_email=t_email.getText().toString().trim();
            str_pass=t_pass.getText().toString().trim();

            StringRequest request= new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();

                    if (response.equalsIgnoreCase("ingreso correctamente")) {
                        t_email.setText("");
                        t_pass.setText("");
                        guardarPreferencias();
                        startActivity(new Intent(getApplicationContext(), PaginaInicio.class));
                        finish();
                    } else {
                        Toast.makeText(login.this, response, Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(login.this,error.getMessage().toString(),Toast.LENGTH_SHORT).show();
                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String,String> params=new HashMap<>();
                    params.put("email",str_email);
                    params.put("password",str_pass);
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(login.this);
            requestQueue.add(request);
        }
    }
    public void registro(View view){
        startActivity(new Intent(getApplicationContext(),registro.class));
        finish();
    }

    private void guardarPreferencias(){
        SharedPreferences preferences=getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("email",str_email);
        editor.putString("password",str_pass);
        editor.putBoolean("sesion", true);
        editor.commit();
    }

    private void recuperarPreferencias(){
        SharedPreferences preferences=getSharedPreferences("preferenciasLogin",Context.MODE_PRIVATE);
        t_email.setText(preferences.getString("email","micorreo@gmail.com"));
        t_pass.setText(preferences.getString("password","123456"));
    }
}