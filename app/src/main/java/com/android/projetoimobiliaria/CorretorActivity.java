package com.android.projetoimobiliaria;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CorretorActivity extends AppCompatActivity {

    private EditText etCodigo, etNome, etTelefone, etCreci;
    private Button btEndereco, btSalvar, btCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corretor);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loadComponents();


    }

    private void loadComponents(){
        etCodigo = findViewById(R.id.etCodigo);
        etNome = findViewById(R.id.etNome);
        etTelefone = findViewById(R.id.etTelefone);
        etCreci = findViewById(R.id.etCreci);
        btEndereco = findViewById(R.id.btEndereco);
        btSalvar = findViewById(R.id.btCancelar);
        btCancelar = findViewById(R.id.btCancelar);

    }

}
