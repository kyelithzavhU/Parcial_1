package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText Numero1;
    EditText Numero2;
    TextView resul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero1 = findViewById(R.id.NumberA);
        Numero2 = findViewById(R.id.NumberB);
        resul = findViewById(R.id.Resultado);


        int num =Integer.parseInt(Numero1.getText().toString());
        int exp =Integer.parseInt(Numero2.getText().toString());
        double resultado = Potencia(num,exp);
        resul.setText(resultado+"");
    }

    static double Potencia(int num, int exp) {
        return Math.pow(num,exp);
    }


    public static long fibonacci(long posicion) {
        if (posicion < 2)
            return posicion;
        return fibonacci( - 1) + fibonacci(posicion - 2);
    }

    public void Multiplicacion(View view){
        int operacionmulti = Integer.parseInt(Numero1.getText().toString()) * Integer.parseInt(Numero2.getText().toString());
        resul.setText(operacionmulti+"");
    }

    public void ncalculo(View view){
        Numero1.setText("");
        Numero2.setText("");
    }


}