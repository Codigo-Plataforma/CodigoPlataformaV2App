package com.example.codigoplataformav2.startups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.codigoplataformav2.R;

import com.example.codigoplataformav2.R;

public class Sign_Up extends AppCompatActivity {
    Button back;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        back = findViewById(R.id.btn_backbtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign_Up.this, Getting_started_or_Login.class);
                startActivity(i);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                finish();
            }
        });

        login = findViewById(R.id.btn_Login_in_sign_up);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign_Up.this,LoginPage.class);
                startActivity(i);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                finish();
            }
        });
    }
}