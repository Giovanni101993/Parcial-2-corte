package com.example.miprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonIngreso;
    EditText editUsuario, editPassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario = (EditText) findViewById(R.id.editUsuario);
        editPassword = (EditText) findViewById(R.id.editPassword);


        botonIngreso = (Button) findViewById(R.id.btnIngreso);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, contrase;
                String user="giovanni";
                String pass= "1234";

                usuario= String.valueOf(editUsuario);
                contrase= String.valueOf(editPassword);
                if ((user!=usuario)||(pass!=contrase)){
                        Toast.makeText(getApplicationContext(),"Los datos ingresados no son validos", Toast.LENGTH_SHORT).show();
                }

                else{
                    cambiarMapa();
                }
            }

        });

    }


        public void cambiarMapa(){
            Intent mapa = new Intent(this, mapa.class);
            startActivity(mapa);
        }


}
