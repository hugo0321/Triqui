package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText campoNombre;
    EditText campoNombre3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNombre= (EditText) findViewById(R.id.editText);
        campoNombre3= (EditText) findViewById(R.id.editText3);
    }

    public void onClick1(View view) {
        Intent miIntent= new Intent(MainActivity.this,Juego_Gato.class);
        Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad

        miBundle.putString("nombre",campoNombre.getText().toString()); //variable nombre
        miBundle.putString("nombre3",campoNombre3.getText().toString()); //variable nombre

        miIntent.putExtras(miBundle);
        startActivity(miIntent);
    }
}

