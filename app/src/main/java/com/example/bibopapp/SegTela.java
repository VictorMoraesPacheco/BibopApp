package com.example.bibopapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SegTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_tela_portas_logi);

        Intent intentProced = getIntent();
        Bundle pacote = intentProced.getExtras();
        String nomeUsuario = pacote.getString("namefield");
        TextView nameField = (TextView) findViewById(R.id.textViewNome);
        nameField.setText(nomeUsuario);

        ArrayList<String> marcas = new ArrayList<String>();
        marcas.add("Brastemp");
        marcas.add("Consul");
        marcas.add("Electrolux");

        ListView listViewMarcas = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, marcas);
        listViewMarcas.setAdapter(adapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                String escolhaMarca = "";
                if (position == 0){
                    escolhaMarca = "Brastemp";
                };
                if (position == 1){
                    escolhaMarca = "Consul";
                };
                if (position == 2){
                    escolhaMarca = "Electrolux";
                }
                Bundle bundle = new Bundle();
                bundle.putString("Marca escolhida" ,escolhaMarca);
                Intent intent = new Intent(getBaseContext(), TerceiraTela.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        };
        listViewMarcas.setOnItemClickListener(itemClickListener);
    }

}
