package com.example.codigoplataformav2.startups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codigoplataformav2.R;

import com.example.codigoplataformav2.R;

public class Getting_started_or_Login extends AppCompatActivity {
    Button login;
    Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.orange));
            getWindow().setStatusBarColor(getResources().getColor(R.color.orange));
        }

        setContentView(R.layout.activity_getting_started_or_login);

        login = findViewById(R.id.btn_login);
        getStarted = findViewById(R.id.btn_getstarted);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Getting_started_or_Login.this,LoginPage.class);
                startActivity(i);

            }
        });

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Getting_started_or_Login.this,Sign_Up.class);
                startActivity(i);
            }
        });
    }
}