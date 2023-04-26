package com.example.sesion3_4fernndez_lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {//Inicia clase

    public TextView tvSalidaPrecio;
    public ListView lvProductos;

    private String[] productos = {"TV","CELL","RADIO","TABLET","IPAD"};
    private String[] precios = {"$5000","$10000","$500","$1000","$12000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {//Inicia metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Integracion de xml con java
        tvSalidaPrecio = findViewById(R.id.tvSalidaPrecio);
        lvProductos =(ListView) findViewById(R.id.lvProductos);

        //adaptacion de arreglos de precios y arreglo de productos mediante un adapter
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productos);
            lvProductos.setAdapter(adapter);//integra los datos de  producto en la lista
        //Programacion del evento click se determina el precio de un producto
            lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    tvSalidaPrecio.setText("Precio venta: "+ precios[position]);
                }
            });

    }//Termina metodo onCreate
}//Termina clase