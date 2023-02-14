package com.example.codigoplataformav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    ImageButton back;
    Button register;
    Button Login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        back = findViewById(R.id.backButton);
        register = findViewById(R.id.RegisterButton);

        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
    }
}