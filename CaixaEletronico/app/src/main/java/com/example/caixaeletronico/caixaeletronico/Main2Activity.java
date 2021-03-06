package com.example.caixaeletronico.caixaeletronico;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity {
    ArrayList<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lista = geraLista();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

    public ArrayList<String> geraLista(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("20/04/2016 - R$70,00");
        lista.add("28/04/2016 - R$10,00");
        lista.add("30/04/2016 - R$25,00");
        lista.add("20/05/2016 - R$70,00");
        lista.add("28/05/2016 - R$10,00");
        lista.add("30/05/2016 - R$25,00");
        lista.add("20/06/2016 - R$70,00");
        lista.add("28/06/2016 - R$10,00");
        lista.add("30/06/2016 - R$25,00");
        return lista;
    }
}
