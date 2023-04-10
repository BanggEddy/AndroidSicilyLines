package com.example.davidsicilylines2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModifInfos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_infos);

        Button btnConfirm = (Button)findViewById(R.id.buttonConfirm);
        Button btnRetour = (Button)findViewById(R.id.buttonRetour);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ModifInfos.this, ConfirmModifs.class));
            }

        });
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(ModifInfos.this, PageChoix.class));
            }
        });
    }
}