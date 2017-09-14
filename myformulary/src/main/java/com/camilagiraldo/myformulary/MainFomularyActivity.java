package com.camilagiraldo.myformulary;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainFomularyActivity extends AppCompatActivity implements View.OnClickListener {
    private String loggin, password, mail, Rpassword, sexo, hobbies = "",ciudad,fecha;
    private EditText eLoggin, ePassword, eMail, eRepite_Password;
    private RadioButton rMasculino, rFemenino;
    private CheckBox cCine, cDormir, cComer, cCorrer;
    private Spinner sCiudades;
    private ImageButton Dfecha;
    private TextView tInfo,Fecha, Llenar, Igual;
    private int dia, mes, año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fomulary);

        eLoggin = (EditText) findViewById(R.id.eNombre);
        ePassword = (EditText) findViewById(R.id.Password);
        tInfo = (TextView) findViewById(R.id.tInfo);
        eMail = (EditText) findViewById(R.id.eMail);
        eRepite_Password = (EditText) findViewById(R.id.Repite_Password);
        rMasculino = (RadioButton) findViewById(R.id.rMasculino);
        rFemenino = (RadioButton) findViewById(R.id.rFemenino);
        cCine = (CheckBox) findViewById(R.id.cCine);
        cDormir = (CheckBox) findViewById(R.id.cDormir);
        cComer = (CheckBox) findViewById(R.id.cComer);
        cCorrer = (CheckBox) findViewById(R.id.cCorrer);
        sCiudades = (Spinner) findViewById(R.id.sCiudades);
        Dfecha = (ImageButton) findViewById(R.id.FechaNacimiento);
        Fecha = (TextView) findViewById(R.id.fecha);
        Llenar = (TextView) findViewById(R.id.LLenar);
        Igual = (TextView) findViewById(R.id.Igual);

        Dfecha.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudad, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sCiudades.setAdapter(adapter);

        sCiudades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ciudad = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Aceptar(View view) {
        hobbies = "";
        sexo = "";
        loggin = eLoggin.getText().toString();
        password = ePassword.getText().toString();
        mail = eMail.getText().toString();
        Rpassword = eRepite_Password.getText().toString();

        if (cCine.isChecked()) {
            hobbies += "cine ";
        }
        if (cDormir.isChecked()) {
            hobbies += "dormir ";
        }
        if (cComer.isChecked()) {
            hobbies += "comer ";
        }
        if (cCorrer.isChecked()) {
            hobbies += "correr ";
        }

        if (rMasculino.isChecked()) {
            sexo = "Masculino";
        } else {
            sexo = "Femenino";
        }

        if(eLoggin.getText().toString().matches("")){
                eLoggin.setError(" no data found ");
                eLoggin.setHintTextColor(Color.RED);
                eLoggin.setHint(" no data found ");
        }else{
            eLoggin.setHintTextColor(getColor(R.color.greenyellow));
            eLoggin.setHint("User ");
        }
        if(ePassword.getText().toString().matches("")){
                ePassword.setError(" no data found ");
                ePassword.setHintTextColor(Color.RED);
                ePassword.setHint(" no data found ");
        }else {
            ePassword.setHintTextColor(getColor(R.color.greenyellow));
            ePassword.setHint("Password");

        }
        if(eRepite_Password.getText().toString().matches("")){
                eRepite_Password.setError(" no data found ");
                eRepite_Password.setHintTextColor(Color.RED);
                eRepite_Password.setHint(" no data found ");
        }else{
            eRepite_Password.setHintTextColor(getColor(R.color.greenyellow));
            eRepite_Password.setHint("Repite_Password");
        }
        if(eMail.getText().toString().matches("")){
                eMail.setError(" no data found ");
                eMail.setHintTextColor(Color.RED);
                eMail.setHint(" no data found ");
        }else{
            eMail.setHintTextColor(getColor(R.color.greenyellow));
            eMail.setHint("Email ");
        }
        if(Fecha.getText().toString().matches("")){
                Fecha.setError(" no data found ");
                Fecha.setHintTextColor(Color.RED);
                Fecha.setHint(" no data found ");
        }else{
            Fecha.setVisibility(View.GONE);
        }
        if(cCorrer.isChecked()==false && cComer.isChecked()==false && cCine.isChecked()==false && cDormir.isChecked()==false){
                Llenar.setError(" no data found ");
                Llenar.setHintTextColor(Color.RED);
                Llenar.setHint(" no data found ");
        }else{
            Llenar.setVisibility(View.GONE);
        }

        if(ePassword.getText().toString().matches(eRepite_Password.getText().toString()) && !(ePassword.getText().toString().matches(""))&& !(eRepite_Password.getText().toString().matches(""))) {

                    tInfo.setText("Loggin: " + loggin + " \nPassword: " + password + " \nCorreo: " + mail +
                    " \nSexo: " + sexo + " \nFecha de Nacimiento: " + dia + "/" + mes + "/" + año + " \nhobbies: " + hobbies + " \nciudad: " + ciudad);
            loggin="";
            password="";
            mail="";
            sexo="";
            hobbies="";
            ciudad="";
        }else if(ePassword.getText().toString().matches("")||eRepite_Password.getText().toString().matches("")){


                }else{
                    eRepite_Password.setError("the password do not match");
                    Igual.setVisibility(View.VISIBLE);
                    Igual.setHintTextColor(Color.RED);
                    Igual.setHint("the password do not match");

        }


    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        if(view==Dfecha){
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            año = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    Fecha.setText(i2+"/"+(i1+1)+"/"+i);
                    dia = i2;
                    mes = (i1+1);
                    año = i;
                }
            },dia,mes,año);

            datePickerDialog.show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Click(View view) {
        if(eLoggin.isClickable()){
            eLoggin.setTextColor(getColor(R.color.colorAccent));
            eLoggin.setText("");
        }

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Click1(View view) {
        if(eLoggin.isClickable()){
            ePassword.setTextColor(getColor(R.color.colorAccent));
            ePassword.setText("");

        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Click2(View view) {
        if(eRepite_Password.isClickable()){
            eRepite_Password.setTextColor(getColor(R.color.colorAccent));
            eRepite_Password.setText("");
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Click3(View view) {
        if(eMail.isClickable()){
            eMail.setTextColor(getColor(R.color.colorAccent));
            eMail.setText("");
        }
    }
}
