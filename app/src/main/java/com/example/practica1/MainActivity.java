package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(actMain.this, actpantalla2.class);
        EditText txtNombre = (EditText)findViewById(R.id.txPtNombre);
        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();

        b.putString("NOMBRE", txtPNombre.getText().toString());
        //Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }


}