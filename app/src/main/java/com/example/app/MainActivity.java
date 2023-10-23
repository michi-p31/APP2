package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_add;
    Button btn_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add = findViewById(R.id.button1);
        btn_more = findViewById(R.id.button2);
        btn_add.setOnClickListener(w -> {
            User user = new User("Salomon Ruiz Navarrete");
            Bundle extras = new Bundle();

            extras.putString("usuario", user.getName());
            Intent intent = new Intent(this, addFriend.class);
            intent.putExtras(extras);
            startActivity(intent);
        });
        btn_more.setOnClickListener(w -> {
            Intent intent = new Intent(this, description.class);
            startActivity(intent);
        });
    }
}