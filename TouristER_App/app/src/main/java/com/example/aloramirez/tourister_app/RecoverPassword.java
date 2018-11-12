package com.example.aloramirez.tourister_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class RecoverPassword extends AppCompatActivity {

    CardView btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_password);
        btnEnviar = findViewById(R.id.enviar_button);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecoverPassword.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
