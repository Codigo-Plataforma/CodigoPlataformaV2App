package com.example.codigoplataformav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_Up extends AppCompatActivity {

    //change all of this and start anew


    Button backbtn,loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        backbtn = findViewById(R.id.btn_backbtn);
        loginbtn = findViewById(R.id.btn_login_from_signup);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign_Up.this, Getting_started_or_Login.class);
                startActivity(i);
                finish();
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign_Up.this, Getting_started_or_Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}