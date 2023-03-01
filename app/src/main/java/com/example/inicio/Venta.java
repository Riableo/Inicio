package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Venta extends AppCompatActivity {
    EditText art,prc,uni,pg;
    TextView ch,nom,cnt,py;
    Button button1;
    int n1, n2, n3,n4,n5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoda);

        art=(EditText)findViewById(R.id.arti);
        prc=(EditText)findViewById(R.id.precio);
        uni=(EditText)findViewById(R.id.unidad);
        pg=(EditText)findViewById(R.id.pay);

        ch=(TextView) findViewById(R.id.chang);
        nom=(TextView)findViewById(R.id.name);
        cnt=(TextView)findViewById(R.id.cant);
        py=(TextView)findViewById(R.id.prec);

        button1=(Button)findViewById(R.id.button);
        Toast.makeText(getApplicationContext(),"Procesando...",Toast.LENGTH_SHORT).show();
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {Calcular();}
        });
    }

    private void Calcular() {
        String n=art.getText().toString();
        String pr=prc.getText().toString();
        String un=uni.getText().toString();
        String pp=pg.getText().toString();
        n1=Integer.parseInt((String) pr);
        n2=Integer.parseInt((String) un);
        n4=Integer.parseInt((String) pp);

        n3=n1*n2;
        n5=n4-n3;

        String aux=Integer.toString(n3);
        String ce=Integer.toString(n5);

        ch.setText(ce);
        nom.setText(n);
        cnt.setText(un);
        py.setText(aux);
    }
}
