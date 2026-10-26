package com.example.checkboxapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox java = findViewById(R.id.checkJava);
        CheckBox kotlin = findViewById(R.id.checkJKotlin);
        CheckBox flutter = findViewById(R.id.checkFlutter);
        CheckBox python = findViewById(R.id.checkPython);

        Button botaoVerificar = findViewById(R.id.btnVerificar);
        TextView resultado = findViewById(R.id.txtResultado);

        botaoVerificar.setOnClickListener(v -> {

            StringBuilder selecionadas = new StringBuilder();

            if (java.isChecked()) {
                selecionadas.append("Java\n");
            }

            if (kotlin.isChecked()) {
                selecionadas.append("Kotlin\n");
            }

            if (flutter.isChecked()) {
                selecionadas.append("Flutter\n");
            }

            if (python.isChecked()) {
                selecionadas.append("Python\n");
            }

            if (selecionadas.length() == 0) {
                resultado.setText("Selecione pelo menos uma tecnologia.");
            } else {
                resultado.setText(
                        "Tecnologias selecionadas:\n" + selecionadas
                );
            }
        });
    }
}