package com.example.codigoplataformav2.startups;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.codigoplataformav2.R;


public class Sign_Up extends AppCompatActivity {
    ImageButton back;
    TextView login;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
            getWindow().setStatusBarColor(getResources().getColor(R.color.orange));
        }


        setContentView(R.layout.activity_sign_up);

        back = findViewById(R.id.backButton);

        back.setOnClickListener(v -> {
            Intent i = new Intent(Sign_Up.this, Getting_started_or_Login.class);
            i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(i);

            finish();
        });

        login = findViewById(R.id.btn_Login_in_sign_up);

        login.setOnClickListener(v -> {
            Intent i = new Intent(Sign_Up.this,LoginPage.class);
            i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(i);

            finish();
        });
    }
}