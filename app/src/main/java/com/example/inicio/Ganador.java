package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ganador extends AppCompatActivity {
    String Empate="Empate";
    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganador);

        msj= (TextView) findViewById(R.id.textView);

        Bundle miBundle=this.getIntent().getExtras();
        Bundle gana=this.getIntent().getExtras();

        if(miBundle!=null){

            String nombre=miBundle.getString("nombre");
            String ganador=gana.getString("ganador");
            msj.setText(ganador + nombre);


        }
    }
}