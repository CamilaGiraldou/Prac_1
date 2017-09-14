package com.camilagiraldo.my_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivityCalculator extends AppCompatActivity implements OnClickListener {

    private Button suma, resta, mul, div, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, deci,resul,ac;
    private TextView Ver;
    private int b;
    private Double res;
    private String n,j;
    private Double numero[] = new Double[20];
    private boolean s= false,r= false,m= false,d= false,dc= false,igl= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        suma = (Button) findViewById(R.id.Suma);

        resta = (Button) findViewById(R.id.Resta);

        mul = (Button) findViewById(R.id.Mul);

        div = (Button) findViewById(R.id.Div);

        n0 = (Button) findViewById(R.id.Cero);

        n1 = (Button) findViewById(R.id.Uno);

        n2 = (Button) findViewById(R.id.Dos);

        n3 = (Button) findViewById(R.id.Tres);

        n4 = (Button) findViewById(R.id.Cuatro);

        n5 = (Button) findViewById(R.id.Cinco);

        n6 = (Button) findViewById(R.id.Seis);

        n7 = (Button) findViewById(R.id.Siete);

        n8 = (Button) findViewById(R.id.Ocho);

        n9 = (Button) findViewById(R.id.Nueve);

        deci = (Button) findViewById(R.id.Deci);

        resul = (Button) findViewById(R.id.Igual);

        Ver = (TextView) findViewById(R.id.ver);
    }

    public void opera(View view) {

        b = view.getId();
        n = Ver.getText().toString();
        try{
        switch (b) {

            case R.id.Cero:
                if(igl == true){

                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"0");
                break;
            case R.id.Uno:
                if(igl == true){

                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"1");

                break;
            case R.id.Dos:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"2");

                break;
            case R.id.Tres:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"3");

                break;
            case R.id.Cuatro:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"4");

                break;
            case R.id.Cinco:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"5");

                break;
            case R.id.Seis:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"6");

                break;
            case R.id.Siete:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"7");

                break;
            case R.id.Ocho:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"8");

                break;
            case R.id.Nueve:
                if(igl == true){
                    Ver.setText("");
                }
                igl=false;
                Ver.setText(n+"9");

                break;
            case R.id.Suma:
                s = true;
                numero[0]= Double.parseDouble(n);
                Ver.setText("");
                dc= false;
                break;
            case R.id.Resta:
                Ver.setText("-");
                r= true;
                numero[0]= Double.parseDouble(n);
                Ver.setText("");
                dc= false;
                break;
            case R.id.Mul:
                m= true;
                numero[0]= Double.parseDouble(n);
                Ver.setText("");
                dc= false;
                break;
            case R.id.Div:
                d= true;
                numero[0]= Double.parseDouble(n);
                Ver.setText("");
                dc= false;
                break;
            case R.id.Deci:
                if(dc == false){
                    Ver.setText(n+".");
                }else{
                    return;
                }
                dc= true;
                break;
            case R.id.Igual:
                numero[1]= Double.parseDouble(n);
                if(s==true){
                    res = numero[0]+numero[1];
                    Ver.setText(String.valueOf(res));
                    igl=true;
                }else if(r==true){
                    res = numero[0]-numero[1];
                    Ver.setText(String.valueOf(res));
                    igl=true;
                }else if(m==true){
                    res = numero[0]*numero[1];
                    Ver.setText(String.valueOf(res));
                    igl=true;
                } else if(d==true){
                    res = numero[0]/numero[1];
                    igl=true;
                    Ver.setText(String.valueOf(res));
                }
                dc= false;
                s= false;
                r= false;
                m= false;
                d= false;
                break;

        }}catch (Exception e){
            Ver.setText("Error");
        }
    }


    @Override
    public void onClick(View view) {

    }
}
