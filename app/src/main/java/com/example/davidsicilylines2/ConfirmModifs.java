package com.example.davidsicilylines2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmModifs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_modifs);
        Button btnRetour = (Button)findViewById(R.id.buttonRetour);
        Button btnDeco = (Button)findViewById(R.id.buttonDeco);
        btnDeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfirmModifs.this, AccueilSicilylines.class));
            }
        });
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ConfirmModifs.this, PageChoix.class));
            }
        });
    }
}