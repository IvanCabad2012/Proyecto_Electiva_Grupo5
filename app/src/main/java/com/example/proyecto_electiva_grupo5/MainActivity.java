package com.example.proyecto_electiva_grupo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent nueva_nota = new Intent(this, NuevaNotaDePedido.class);
        startActivity(nueva_nota);
    }
}