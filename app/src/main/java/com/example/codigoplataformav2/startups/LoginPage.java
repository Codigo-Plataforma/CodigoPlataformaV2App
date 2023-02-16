package com.example.codigoplataformav2.startups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.codigoplataformav2.R;

public class LoginPage extends AppCompatActivity {
    ImageButton back;
    Button register;
    Button Login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //to change to color of nav bar and status bar
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
            getWindow().setStatusBarColor(getResources().getColor(R.color.orange));
        }

        setContentView(R.layout.activity_login_page);

        back = findViewById(R.id.backButton);

        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
    }
}