package com.example.aloramirez.tourister_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BoletosInfoTres extends AppCompatActivity {

    CardView btnSig, btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boletos_info_tres);

        btnSig = findViewById(R.id.next_button3);
        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoletosInfoTres.this, BoletosInfoCuatro.class);
                startActivity(intent);
            }
        });

        btnReg = findViewById(R.id.back_button2);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoletosInfoTres.this, BoletosInfoUno.class);
                startActivity(intent);
            }
        });
    }
}
