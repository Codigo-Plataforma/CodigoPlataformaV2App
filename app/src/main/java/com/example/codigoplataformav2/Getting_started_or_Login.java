package com.example.codigoplataformav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Getting_started_or_Login extends AppCompatActivity {

    //change all this and start anew
    Button getstartedbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started_or_login);

        getstartedbtn = findViewById(R.id.btn_getstarted);

        getstartedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Getting_started_or_Login.this, On_Boarding_Screen.class);
                startActivity(i);
                finish();
            }
        });
    }
}