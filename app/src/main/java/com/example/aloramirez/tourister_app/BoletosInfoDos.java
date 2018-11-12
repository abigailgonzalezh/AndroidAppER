package com.example.aloramirez.tourister_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BoletosInfoDos extends AppCompatActivity {

    CardView btnSig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boletos_info_dos);
        btnSig = findViewById(R.id.next_button2);
        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoletosInfoDos.this, BoletosInfoTres.class);
                startActivity(intent);
            }
        });
    }
}
