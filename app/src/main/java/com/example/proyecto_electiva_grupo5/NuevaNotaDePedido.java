package com.example.proyecto_electiva_grupo5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NuevaNotaDePedido extends AppCompatActivity {
    TextView textoFecha;
    private ListView listaProductos;
    private ArrayList<String> nombresProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_nota_de_pedido);
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        textoFecha = findViewById(R.id.txtFecha);
        textoFecha.setText(formato.format(fechaActual));
        listaProductos = (ListView) findViewById(R.id.listaProductos);
        this.nombresProductos = new ArrayList<>();
        this.nombresProductos.add("Zapatos de Hombre");
        this.nombresProductos.add("Zapatos de Mujer");
        this.nombresProductos.add("Blusa azul talla M");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresProductos);
        listaProductos.setAdapter(adapter);
    }


}