package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        Intent i=null;

        switch(v.getId()){
            case R.id.but:
                i=new Intent(MainActivity.this, log.class);
                break;
            case R.id.but2:
                i=new Intent(MainActivity.this, Venta.class);
                break;
        }
        startActivity(i);
    }
}