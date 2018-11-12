package com.example.aloramirez.tourister_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CompraDos extends AppCompatActivity {

    CardView btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra_dos);
        btnEnd = findViewById(R.id.end_button);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompraDos.this, Tickets.class);
                startActivity(intent);
            }
        });
    }
}
