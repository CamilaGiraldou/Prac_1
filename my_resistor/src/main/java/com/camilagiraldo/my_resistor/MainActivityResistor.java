package com.camilagiraldo.my_resistor;


import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivityResistor extends AppCompatActivity {

    private Spinner svalor, svalor1, Mult, Tol;
    private String valor, valor1,prueba, prueba1, T ;
    private TextView V1, V2, V3, V4, Resul;
    private int ivalor1, ivalor2, ivalor3, ivalor4, iaux, f, z;
    private float f1;
    private Button Cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resistor);

        svalor = (Spinner) findViewById(R.id.Spinner1);
        svalor1 = (Spinner) findViewById(R.id.Spinner2);
        Mult = (Spinner) findViewById(R.id.Spinner3);
        Tol = (Spinner) findViewById(R.id.Spinner4);
        V1 = (TextView) findViewById(R.id.imag1);
        V2 = (TextView) findViewById(R.id.imag2);
        V3 = (TextView) findViewById(R.id.imag3);
        V4 = (TextView) findViewById(R.id.imag4);
        Resul = (TextView) findViewById(R.id.Result);
        Cal = (Button) findViewById(R.id.ResultC);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valor, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        svalor.setAdapter(adapter);
        svalor1.setAdapter(adapter);

        svalor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                valor = adapterView.getItemAtPosition(i).toString();
                ivalor1 = adapterView.getSelectedItemPosition();

                if (valor.matches("Negro")){

                    V1.setBackgroundColor(getColor(R.color.black));


                }
                if (valor.matches("Cafe")){

                    V1.setBackgroundColor(getColor(R.color.brown));


                }
                if (valor.matches("Rojo")){

                    V1.setBackgroundColor(getColor(R.color.red));

                }
                if (valor.matches("Naranja")){

                    V1.setBackgroundColor(getColor(R.color.orange));

                }
                if (valor.matches("Amarillo")){

                    V1.setBackgroundColor(getColor(R.color.yellow));

                }
                if (valor.matches("Verde")){

                    V1.setBackgroundColor(getColor(R.color.green));

                }
                if (valor.matches("Azul")){

                    V1.setBackgroundColor(getColor(R.color.blue));


                }
                if (valor.matches("Violeta")){

                    V1.setBackgroundColor(getColor(R.color.violet));


                }
                if (valor.matches("Gris")){

                    V1.setBackgroundColor(getColor(R.color.gray));


                }
                if (valor.matches("Blanco")){

                    V1.setBackgroundColor(getColor(R.color.white));


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        svalor1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                valor1 = adapterView.getItemAtPosition(i).toString();
                ivalor2 = adapterView.getSelectedItemPosition();

                if (valor1.matches("Negro")){

                    V2.setBackgroundColor(getColor(R.color.black));

                }
                if (valor1.matches("Cafe")){

                    V2.setBackgroundColor(getColor(R.color.brown));


                }
                if (valor1.matches("Rojo")){

                    V2.setBackgroundColor(getColor(R.color.red));

                }
                if (valor1.matches("Naranja")){

                    V2.setBackgroundColor(getColor(R.color.orange));

                }
                if (valor1.matches("Amarillo")){

                    V2.setBackgroundColor(getColor(R.color.yellow));

                }
                if (valor1.matches("Verde")){

                    V2.setBackgroundColor(getColor(R.color.green));

                }
                if (valor1.matches("Azul")){

                    V2.setBackgroundColor(getColor(R.color.blue));


                }
                if (valor1.matches("Violeta")){

                    V2.setBackgroundColor(getColor(R.color.violet));


                }
                if (valor1.matches("Gris")){

                    V2.setBackgroundColor(getColor(R.color.gray));


                }
                if (valor1.matches("Blanco")){

                    V2.setBackgroundColor(getColor(R.color.white));


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Multipliador, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Mult.setAdapter(adapter2);

        Mult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ivalor3 = adapterView.getSelectedItemPosition();
                prueba = adapterView.getItemAtPosition(i).toString();

                if (prueba.matches("Negro")){

                    V3.setBackgroundColor(getColor(R.color.black));

                }
                if (prueba.matches("Cafe")){

                    V3.setBackgroundColor(getColor(R.color.brown));


                }
                if (prueba.matches("Rojo")){

                    V3.setBackgroundColor(getColor(R.color.red));

                }
                if (prueba.matches("Naranja")){

                    V3.setBackgroundColor(getColor(R.color.orange));

                }
                if (prueba.matches("Amarillo")){

                    V3.setBackgroundColor(getColor(R.color.yellow));

                }
                if (prueba.matches("Verde")){

                    V3.setBackgroundColor(getColor(R.color.green));

                }
                if (prueba.matches("Azul")){

                    V3.setBackgroundColor(getColor(R.color.blue));

                }
                if (prueba.matches("Violeta")){

                    V3.setBackgroundColor(getColor(R.color.violet));

                }
                if (prueba.matches("Gris")){

                    V3.setBackgroundColor(getColor(R.color.gray));

                }
                if (prueba.matches("Blanco")){

                    V3.setBackgroundColor(getColor(R.color.white));

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Tolerancia, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Tol.setAdapter(adapter3);

        Tol.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ivalor4 = adapterView.getSelectedItemPosition();
                prueba1 = adapterView.getItemAtPosition(i).toString();



                if (prueba1.matches("Cafe")){

                    V4.setBackgroundColor(getColor(R.color.brown));
                }
                if (prueba1.matches("Rojo")){

                    V4.setBackgroundColor(getColor(R.color.red));

                }
                if (prueba1.matches("Dorado")){

                    V4.setBackgroundColor(getColor(R.color.gold));

                }
                if (prueba1.matches("Plata")){

                    V4.setBackgroundColor(getColor(R.color.lightslategray));

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void Calcular(View view) {
        f1 = 0;
        float f2 = 0;
        iaux = (ivalor2)+(10*(ivalor1));
        f2 =iaux;
        switch (ivalor3)
        {
            case (0):
                f1 = iaux*1;
                break;
            case (1):
                f1 = iaux*10;
                break;
            case (2):
                f1 = iaux*100;
                break;
            case (3):
                f1 = iaux*1000;
                break;
            case (4):
                f1 = iaux*10000;
                break;
            case (5):
                f1 = iaux*100000;
                break;
            case (6):
                f1 = iaux*1000000;
                break;
            case (7):
                f1 = f2/10;
                break;
            case (8):
                f1 = f2/100;
                break;
        }
        switch (ivalor4){
            case (0):
                T ="± 1%";
                break;
            case (1):
                T ="± 2%";
                break;
            case(2):
                T ="± 5%";
                break;
            case(3):
                T ="± 10%";
                break;
            case (4):
                T="Error";
                break;
        }

        if(f1<1000){

            Resul.setText(String.valueOf(f1)+   T);

        }

        if((f1>=1000)&&(f1<1000000)){

            f1 = f1/1000;
            Resul.setText(String.valueOf(f1)+"K"+   T);

        }
        if(f1>=1000000){

            f1 = f1/1000000;
            Resul.setText(String.valueOf(f1)+"M"+   T);
        }

    }
}
