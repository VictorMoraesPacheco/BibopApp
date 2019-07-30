package com.example.bibopapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class TerceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String marca = bundle.getString("Marca escolhida");
        TextView marcaTextView = (TextView) findViewById(R.id.textView3);
        marcaTextView.setText("a marca escolhida foi " + marca + "!");

        Toast.makeText(
                getApplicationContext(),
                "a melhor marca é brastemp",
                Toast.LENGTH_SHORT


        ).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aleatório");
        builder.setMessage("Quer biscoito?");
        DialogInterface.OnClickListener opcao = new DialogInterface.OnClickListener(){
            @Override
            public void onClick (DialogInterface dialog, int which){
                Toast.makeText(
                        getApplicationContext(),
                        "Em breve",
                        Toast.LENGTH_SHORT
                ).show();
            }
        };
        builder.setPositiveButton("Ok", opcao);
        builder.create().show();
    }

}
