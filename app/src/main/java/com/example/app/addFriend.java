package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class addFriend extends AppCompatActivity {
    TextView txt;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_friend);
        txt = findViewById(R.id.txtvw_name);
        btn_back = findViewById(R.id.btn_back);
        String valor = getIntent().getStringExtra("usuario");
        txt.setText("Has agregado exitosamente a " + valor + " a tu lista de amigos");

        btn_back.setOnClickListener(w -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}