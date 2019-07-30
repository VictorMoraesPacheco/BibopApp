package com.example.bibopapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bibopapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInformation(View view) {
        TextView nomeUsuario = (TextView) findViewById(R.id.editTextNome);
        TextView emailUsuario = (TextView) findViewById(R.id.editTextEmail);
        Intent intentProced = new Intent(this, SegTela.class);
        Bundle pacote = new Bundle();
        pacote.putString("namefield", nomeUsuario.getText().toString());
        pacote.putString("editTextEmail", emailUsuario.getText().toString());
        intentProced.putExtras(pacote);
        startActivity(intentProced);
    }
}