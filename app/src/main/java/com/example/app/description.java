package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class description extends AppCompatActivity {
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        btn_back = findViewById(R.id.btn_back);
        String valor = getIntent().getStringExtra("usuario");

        btn_back.setOnClickListener(w -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}