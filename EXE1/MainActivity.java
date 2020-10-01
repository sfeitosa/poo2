package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
    }

    public void onEntrarClick(View v) {
        String nome = edtNome.getText().toString();

        // Mostrar a mensagem
        AlertDialog.Builder msg = new AlertDialog.Builder(this);

        msg.setTitle("Saudação");
        msg.setMessage("Seja bem vindo: " + nome);
        msg.setNeutralButton("OK", null);
        msg.show();
    }
}