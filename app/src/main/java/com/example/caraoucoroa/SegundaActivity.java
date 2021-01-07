package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SegundaActivity extends AppCompatActivity {

    private ImageView imageResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imageResultado = findViewById(R.id.imageResultado);

        Bundle dados = getIntent().getExtras();

        int numeroSorteado = dados.getInt("numero");
        if(numeroSorteado == 0){
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else{
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void botaoVoltar(View view){

        finish();
    }
}