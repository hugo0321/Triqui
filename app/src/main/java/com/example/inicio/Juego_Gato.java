package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Juego_Gato extends AppCompatActivity implements View.OnClickListener {

    //cont=contador
    int turno, cont, conta=1;
    String letra, em="Empate";
    String nombre, nombre3, empate="Empate";
    //Creo mi EdiText
    //EditText Et_Ganador;

    //Creo mis botones
    Button Btn_1, Btn_2, Btn_3, Btn_4, Btn_5, Btn_6, Btn_7, Btn_8, Btn_9, Btn_Salir,Btn_Reset;

    TextView msj;
    TextView msj3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego__gato);

        msj= (TextView) findViewById(R.id.textView);
        msj3= (TextView) findViewById(R.id.textView3);

        Bundle miBundle=this.getIntent().getExtras();

        if(miBundle!=null){

            nombre=miBundle.getString("nombre");
            msj.setText("Jugador X: "+nombre);

            nombre3=miBundle.getString("nombre3");
            msj3.setText("Jugador O: "+nombre3);
        }

        //Tomo las referencias
        //Et_Ganador=(EditText)findViewById(R.id.Et_Ganador);

        Btn_1=(Button)(findViewById(R.id.Btn_1));
        Btn_2=(Button)(findViewById(R.id.Btn_2));
        Btn_3=(Button)(findViewById(R.id.Btn_3));
        Btn_4=(Button)(findViewById(R.id.Btn_4));
        Btn_5=(Button)(findViewById(R.id.Btn_5));
        Btn_6=(Button)(findViewById(R.id.Btn_6));
        Btn_7=(Button)(findViewById(R.id.Btn_7));
        Btn_8=(Button)(findViewById(R.id.Btn_8));
        Btn_9=(Button)(findViewById(R.id.Btn_9));
        Btn_Salir=(Button)(findViewById(R.id.Btn_Salir));
        Btn_Reset=(Button)(findViewById(R.id.Btn_Reset));

        //Estamos haciendo que mis botones los escuche el onClick
        Btn_1.setOnClickListener(this);
        Btn_2.setOnClickListener(this);
        Btn_3.setOnClickListener(this);
        Btn_4.setOnClickListener(this);
        Btn_5.setOnClickListener(this);
        Btn_6.setOnClickListener(this);
        Btn_7.setOnClickListener(this);
        Btn_8.setOnClickListener(this);
        Btn_9.setOnClickListener(this);
        Btn_Salir.setOnClickListener(this);
        Btn_Reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cont++;
        turno=cont%2;
        String TxtColor;

        //Jugador 1 X
        if(turno==1){
            TxtColor="#7D180E";
            imprimirXO('X',v,TxtColor);
        }else{
            //Jugador 2 O
            TxtColor="#081A58";
            imprimirXO('O', v, TxtColor);
        }

    }//Fin de onClick
    public void imprimirXO(char letra, View v, String TxtColor){

        if(v.getId() == R.id.Btn_Reset){
            cont=0;
            conta=0;
            //Et_Ganador.setText("empate");
            //Et_Ganador.setEnabled(false);
            //Et_Ganador.setEnabled(true);
            //Et_Ganador.setText("");

            Btn_1.setEnabled(true);
            Btn_1.setText("");

            Btn_2.setEnabled(true);
            Btn_2.setText("");

            Btn_3.setEnabled(true);
            Btn_3.setText("");

            Btn_4.setEnabled(true);
            Btn_4.setText("");

            Btn_5.setEnabled(true);
            Btn_5.setText("");

            Btn_6.setEnabled(true);
            Btn_6.setText("");

            Btn_7.setEnabled(true);
            Btn_7.setText("");

            Btn_8.setEnabled(true);
            Btn_8.setText("");

            Btn_9.setEnabled(true);
            Btn_9.setText("");
        }

        if(v.getId()== R.id.Btn_Salir){
            finishAffinity () ;
        }

        if(v.getId()==R.id.Btn_1){
            Btn_1.setTextColor(Color.parseColor(TxtColor));
            Btn_1.setText(letra+"");
            Btn_1.setEnabled(false);
        }//Cierro el IF
        else if(v.getId()==R.id.Btn_2){
            Btn_2.setTextColor(Color.parseColor(TxtColor));
            Btn_2.setText(letra+"");
            Btn_2.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_3){
            Btn_3.setTextColor(Color.parseColor(TxtColor));
            Btn_3.setText(letra+"");
            Btn_3.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_4){
            Btn_4.setTextColor(Color.parseColor(TxtColor));
            Btn_4.setText(letra+"");
            Btn_4.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_5){
            Btn_5.setTextColor(Color.parseColor(TxtColor));
            Btn_5.setText(letra+"");
            Btn_5.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_6){
            Btn_6.setTextColor(Color.parseColor(TxtColor));
            Btn_6.setText(letra+"");
            Btn_6.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_7){
            Btn_7.setTextColor(Color.parseColor(TxtColor));
            Btn_7.setText(letra+"");
            Btn_7.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_8){
            Btn_8.setTextColor(Color.parseColor(TxtColor));
            Btn_8.setText(letra+"");
            Btn_8.setEnabled(false);
        }
        else if(v.getId()==R.id.Btn_9){
            Btn_9.setTextColor(Color.parseColor(TxtColor));
            Btn_9.setText(letra+"");
            Btn_9.setEnabled(false);
        }

        Ganador(letra);
    }//Fin del Metodo imprimirXO

    public void Ganador(char letra){
        String ganador="El ganador es: ";
        if(Btn_1.getText().toString().equals(letra+"") && (Btn_2.getText().toString().equals(letra+"") && (Btn_3.getText().toString().equals(letra+"")))){
            if(letra=='X'){
                //Et_Ganador.setText("El Ganador es: "+nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString()); //variable nombre
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_4.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);

            }else{
                //Et_Ganador.setText("El Ganador es: "+nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_4.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }

        }else if(Btn_4.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"") && (Btn_6.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                //miBundle.putString("nombre",Et_Ganador.getText().toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }else{
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                //miBundle.putString("nombre",Et_Ganador.getText().toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }
        }else if(Btn_7.getText().toString().equals(letra+"") && (Btn_8.getText().toString().equals(letra+"") && (Btn_9.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_6.setEnabled(false);
            }else {
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_6.setEnabled(false);
            }
        }else if(Btn_1.getText().toString().equals(letra+"") && (Btn_4.getText().toString().equals(letra+"") && (Btn_7.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }else {
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }
        }else if(Btn_2.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"") && (Btn_8.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_9.setEnabled(false);
            }else {
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_9.setEnabled(false);
            }
        } else if(Btn_3.getText().toString().equals(letra+"") && (Btn_6.getText().toString().equals(letra+"") && (Btn_9.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
            }else {
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_5.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
            }
        } else if(Btn_1.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"") && (Btn_9.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
            }else{
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_2.setEnabled(false);
                Btn_3.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_7.setEnabled(false);
                Btn_8.setEnabled(false);
            }
        }else if(Btn_3.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"") && (Btn_7.getText().toString().equals(letra+"")))){
            if(letra=='X') {
                //Et_Ganador.setText("El Ganador es: " + nombre);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }else{
                //Et_Ganador.setText("El Ganador es: " + nombre3);
                //Et_Ganador.setEnabled(false);
                Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
                Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
                miBundle.putString("ganador",ganador.toString());
                miBundle.putString("nombre",nombre3.toString()); //variable nombre
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

                Btn_1.setEnabled(false);
                Btn_2.setEnabled(false);
                Btn_4.setEnabled(false);
                Btn_6.setEnabled(false);
                Btn_8.setEnabled(false);
                Btn_9.setEnabled(false);
            }
        }else if(conta<9){
            conta++;
        }else{
            String ganador1=" ";
            //Et_Ganador.setText("Empate");
            //Et_Ganador.setEnabled(false);
            Intent miIntent= new Intent(Juego_Gato.this,Ganador.class);
            Bundle miBundle=new Bundle(); //exporta los datos de activy a otra actividad
            miBundle.putString("ganador",ganador1.toString()); //variable nombre
            miBundle.putString("nombre",empate.toString()); //variable nombre
            //miBundle.putString("nombre",Et_Ganador.getText().toString()); //variable nombre
            miIntent.putExtras(miBundle);
            startActivity(miIntent);
        }
    }//Fin del Metodo Ganador
}