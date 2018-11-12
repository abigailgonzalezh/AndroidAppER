package com.example.aloramirez.tourister_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BoletosInfoUno extends AppCompatActivity {

    CardView btnSig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boletos_info_uno);

        Spinner dropdown = findViewById(R.id.tour);
        String[] items = new String[]{"Puebla Fascinante", "Cholula Milenaria"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);

        btnSig = findViewById(R.id.next_button1);
        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BoletosInfoUno.this, BoletosInfoDos.class);
                startActivity(intent);
            }
        });
    }
}
