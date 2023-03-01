package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class log extends AppCompatActivity {
    EditText code,name,last;
    TextView Recod, Renom, Reape;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi);

        code=(EditText)findViewById(R.id.cod);
        name=(EditText)findViewById(R.id.nom);
        last=(EditText)findViewById(R.id.ape);

        Recod=(TextView)findViewById(R.id.Rcod);
        Renom=(TextView)findViewById(R.id.Rnom);
        Reape=(TextView)findViewById(R.id.Rape);

        button1=(Button)findViewById(R.id.button);
        Toast.makeText(getApplicationContext(),"Registro",Toast.LENGTH_SHORT).show();

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {registrar();}
        });

    }

    private void registrar() {
        String cc=code.getText().toString();
        String no=name.getText().toString();
        String ap=last.getText().toString();

        Recod.setText(cc);
        Renom.setText(no);
        Reape.setText(ap);
    }
}