package com.example.davidsicilylines2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageChoix extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_choix);

        Button btnModifInfos = (Button)findViewById(R.id.buttonModifInfos);
        Button btnDeco = (Button)findViewById(R.id.buttonDeco);
        Button btnListRes = (Button)findViewById(R.id.buttonListRes);
        btnDeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageChoix.this, AccueilSicilylines.class));
            }

        });
        btnModifInfos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(PageChoix.this, ModifInfos.class));
            }
        });
        btnListRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(PageChoix.this, ListRes.class));
            }
        });
    }
}