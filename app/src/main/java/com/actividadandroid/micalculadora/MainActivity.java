package com.actividadandroid.micalculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView resultadoText;
    float numero1=0.0f;
    float numero2=0.0f;
    String operacion="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoText=findViewById(R.id.resultadoText);
    }

    public void EscribirCero(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("0");
        }else{
            resultadoText.setText(resultadoText.getText()+"0");
        }
    }

    public void EscribirPunto(View view) {
        if( !String.valueOf(resultadoText.getText()).contains(".") ){
            resultadoText.setText(resultadoText.getText() + ".");
        }
    }

    public void EscribirUno(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("1");
        }else{
            resultadoText.setText(resultadoText.getText()+"1");
        }
    }

    public void EscribirDos(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("2");
        }else{
            resultadoText.setText(resultadoText.getText()+"2");
        }
    }

    public void EscribirTres(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("3");
        }else{
            resultadoText.setText(resultadoText.getText()+"3");
        }
    }

    public void EscribirCuatro(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("4");
        }else{
            resultadoText.setText(resultadoText.getText()+"4");
        }
    }

    public void EscribirCinco(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("5");
        }else{
            resultadoText.setText(resultadoText.getText()+"5");
        }
    }

    public void EscribirSeis(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("6");
        }else{
            resultadoText.setText(resultadoText.getText()+"6");
        }
    }
    public void EscribirSiete(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("7");
        }else{
            resultadoText.setText(resultadoText.getText()+"7");
        }
    }

    public void EscribirOcho(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("8");
        }else{
            resultadoText.setText(resultadoText.getText()+"8");
        }
    }

    public void EscribirNueve(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        if(numero1== 0.0f){
            resultadoText.setText("9");
        }else{
            resultadoText.setText(resultadoText.getText()+"9");
        }
    }
    public void LimpiarResultado(View view) {
        resultadoText.setText("0");
        numero1=0.0f;
        numero2=0.0f;
        operacion="";
    }

    public void OperacionDividir(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        operacion="/";
        resultadoText.setText("0");
    }

    public void OperacionMultiplicar(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        operacion="*";
        resultadoText.setText("0");
    }

    public void OperacionResta(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        operacion="-";
        resultadoText.setText("0");
    }

    public void OperacionSuma(View view) {
        numero1= Float.parseFloat(resultadoText.getText().toString());
        operacion="+";
        resultadoText.setText("0");
    }

    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(String.valueOf(resultadoText.getText()));
        float result = 0.0f;

       if(operacion.equals("/")){
            if(numero2 != 0.0f){
                result = numero1 / numero2;
            }else{
                result = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            result = numero1 * numero2;
        }else if(operacion.equals("-")){
            result = numero1 - numero2;
        }else if(operacion.equals("+")){
            result = numero1 + numero2;
        }

        resultadoText.setText(result + "");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }
}