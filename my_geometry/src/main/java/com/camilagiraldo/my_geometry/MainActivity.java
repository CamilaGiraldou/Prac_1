package com.camilagiraldo.my_geometry;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView rPerimetro, rArea, rVolumen,LLado1,LLado2,LLado3,LRadio;
    private RadioButton rCubo, rTriangulo, rCuadro, rCirculo;
    private EditText rLado1, rLado2, rLado3, rRadio;
    private Double num1, num2, num3, num4;
    private ImageView LCubo, LTriangulo, LCuadro, LCirculo;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCubo = (RadioButton) findViewById(R.id.Cubo);
        rCuadro = (RadioButton) findViewById(R.id.Cuadro);
        rTriangulo = (RadioButton) findViewById(R.id.Triangulo);
        rCirculo = (RadioButton) findViewById(R.id.Circulo);
        LLado1 =  (TextView) findViewById(R.id.Lado1Tex);
        LLado2 =  (TextView) findViewById(R.id.Lado2Tex);
        LLado3 =  (TextView) findViewById(R.id.Lado3Tex);
        LRadio =  (TextView) findViewById(R.id.RadioInTex);
        rPerimetro =  (TextView) findViewById(R.id.Perimetro_R);
        rArea =  (TextView) findViewById(R.id.Area_R);
        rVolumen =  (TextView) findViewById(R.id.Volumen_R);
        rLado1 =  (EditText) findViewById(R.id.Lado1);
        rLado2 =  (EditText) findViewById(R.id.Lado2);
        rLado3=  (EditText) findViewById(R.id.Lado3);
        rRadio =  (EditText) findViewById(R.id.RadioIn);
        LCubo = (ImageView) findViewById(R.id.Imagen1);
        LCuadro = (ImageView) findViewById(R.id.Imagen2);
        LTriangulo = (ImageView) findViewById(R.id.Imagen4);
        LCirculo = (ImageView) findViewById(R.id.Imagen3);
        click = (Button) findViewById(R.id.calcular1);


    }

    public void inic(View view) {

        if (rCubo.isChecked()) {
            LCubo.setBackgroundColor(Color.WHITE);
            LCuadro.setBackgroundColor(Color.GRAY);
            LTriangulo.setBackgroundColor(Color.GRAY);
            LCirculo.setBackgroundColor(Color.GRAY);
            LLado1.setVisibility(view.VISIBLE);
            LLado2.setVisibility(View.GONE);
            LLado3.setVisibility(view.GONE);
            LRadio.setVisibility(view.GONE);
            rLado1.setVisibility(view.VISIBLE);
            rLado2.setVisibility(view.GONE);
            rLado3.setVisibility(view.GONE);
            rRadio.setVisibility(view.GONE);
            rLado1.setText("");
            rLado1.setHint("");
            rVolumen.setText("");
            rPerimetro.setText("");
            rArea.setText("");
        }
        if (rCuadro.isChecked()) {
            LCubo.setBackgroundColor(Color.GRAY);
            LTriangulo.setBackgroundColor(Color.GRAY);
            LCirculo.setBackgroundColor(Color.GRAY);
            //a = getColor(R.color.beige);
            LCuadro.setBackgroundColor(Color.WHITE);
            LLado1.setVisibility(view.VISIBLE);
            LLado2.setVisibility(View.GONE);
            LLado3.setVisibility(view.GONE);
            LRadio.setVisibility(view.GONE);
            rLado1.setVisibility(view.VISIBLE);
            rLado2.setVisibility(view.GONE);
            rLado3.setVisibility(view.GONE);
            rRadio.setVisibility(view.GONE);
            rLado1.setText("");
            rLado1.setHint("");
            rVolumen.setText("");
            rPerimetro.setText("");
            rArea.setText("");
        }
        if (rTriangulo.isChecked()) {
            LCuadro.setBackgroundColor(Color.GRAY);
            LCubo.setBackgroundColor(Color.GRAY);
            LCirculo.setBackgroundColor(Color.GRAY);
            LTriangulo.setBackgroundColor(Color.WHITE);
            LLado1.setVisibility(view.VISIBLE);
            LLado2.setVisibility(View.VISIBLE);
            LLado3.setVisibility(view.VISIBLE);
            LRadio.setVisibility(view.GONE);
            rLado1.setVisibility(view.VISIBLE);
            rLado2.setVisibility(view.VISIBLE);
            rLado3.setVisibility(view.VISIBLE);
            rRadio.setVisibility(view.GONE);
            rLado1.setText("");
            rLado2.setText("");
            rLado3.setText("");
            rLado1.setHint("");
            rLado2.setHint("");
            rLado3.setHint("");
            rVolumen.setText("");
            rPerimetro.setText("");
            rArea.setText("");
        }
        if (rCirculo.isChecked()) {
            LCuadro.setBackgroundColor(Color.GRAY);
            LTriangulo.setBackgroundColor(Color.GRAY);
            LCubo.setBackgroundColor(Color.GRAY);
            LCirculo.setBackgroundColor(Color.WHITE);
            LLado1.setVisibility(view.GONE);
            LLado2.setVisibility(View.GONE);
            LLado3.setVisibility(view.GONE);
            LRadio.setVisibility(view.VISIBLE);
            rLado1.setVisibility(view.GONE);
            rLado2.setVisibility(view.GONE);
            rLado3.setVisibility(view.GONE);
            rRadio.setVisibility(view.VISIBLE);
            rRadio.setText("");
            rRadio.setHint("");
            rVolumen.setText("");
            rPerimetro.setText("");
            rArea.setText("");
        }


    }


    public void Calcular(View view) {

        if (rCubo.isChecked()) {

            if (rLado1.getText().toString().matches("")||rLado1.getText().toString().matches(" Introduzca el dato ")){
                rLado1.setHintTextColor(Color.RED);
                rLado1.setHint(" Introduzca el dato ");

            }
            else {
                num1 = Double.parseDouble(rLado1.getText().toString());
                rPerimetro.setText("No Perimetro");
                num2 = 6 * num1 * num1;
                rArea.setText(String.valueOf(num2));
                num3 = 6 * num1 * num1 * num1;
                rVolumen.setText(String.valueOf(num3));
            }
        }
        if (rCuadro.isChecked()) {

            if (rLado1.getText().toString().matches("")||rLado1.getText().toString().matches(" Introduzca el dato ")){
                rLado1.setHintTextColor(Color.RED);
                rLado1.setHint(" Introduzca el dato ");

            }
            else {

                num1 = Double.parseDouble(rLado1.getText().toString());
                num2 = 4*num1;
                rPerimetro.setText(String.valueOf(num2));
                num2 = num1*num1;
                rArea.setText(String.valueOf(num2));
                rVolumen.setText(" Sin Volumen");
            }
        }
        if (rTriangulo.isChecked()) {


            if (rLado1.getText().toString().matches("")||rLado2.getText().toString().matches("")||rLado3.getText().toString().matches("")||rLado1.getText().toString().matches(" Introduzca el dato ")||rLado2.getText().toString().matches(" Introduzca el dato ")||rLado3.getText().toString().matches(" Introduzca el dato ")){
                if(rLado1.getText().toString().matches("")||rLado1.getText().toString().matches(" Introduzca el dato ")){
                    rLado1.setHintTextColor(Color.RED);
                    rLado1.setHint(" Introduzca el dato ");


                }
                if(rLado2.getText().toString().matches("")||rLado2.getText().toString().matches(" Introduzca el dato ")){
                    rLado2.setHintTextColor(Color.RED);
                    rLado2.setHint(" Introduzca el dato ");


                }
                if(rLado3.getText().toString().matches("")||rLado3.getText().toString().matches(" Introduzca el dato ")){
                    rLado3.setHintTextColor(Color.RED);
                    rLado3.setHint(" Introduzca el dato ");


                }

            }
            else {

                num1 = Double.parseDouble(rLado1.getText().toString());
                num2 = 4*num1;
                rPerimetro.setText(String.valueOf(num2));
                num2 = num1*num1;
                rArea.setText(String.valueOf(num2));
                rVolumen.setText(" Sin Volumen");
                num1 = Double.parseDouble(rLado1.getText().toString());
                num3 = Double.parseDouble(rLado2.getText().toString());
                num4 = Double.parseDouble(rLado3.getText().toString());
                num2 = num1+num3+num4;
                rPerimetro.setText(String.valueOf(num2));
                num2 = Math.sqrt((num1*num1)+(num1*num1));
                rArea.setText(String.valueOf(num2));
            }
        }
        if (rCirculo.isChecked()) {

            if (rRadio.getText().toString().matches("")||rRadio.getText().toString().matches(" Introduzca el dato ")){

                rRadio.setHintTextColor(Color.RED);
                rRadio.setHint(" Introduzca el dato ");

            }
            else {

                num1= Double.parseDouble(rRadio.getText().toString());
                num2 = 2*Math.PI*num1;
                rPerimetro.setText(String.valueOf(num2));
                num3 = 2*Math.sqrt((num1*num1)+(num1*num1));
                rArea.setText(String.valueOf(num2));
                rVolumen.setText(" Sin Volumen");
            }

        }

    }
}
