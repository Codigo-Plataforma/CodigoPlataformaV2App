package com.example.codigoplataformav2.startups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codigoplataformav2.R;


public class LoginPage extends AppCompatActivity {
    ImageButton back;
    TextView register;
    Button login;
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
        register = findViewById(R.id.RegisterButton);
        login = findViewById(R.id.loginButton);

        register.setOnClickListener(v -> {
            Intent i = new Intent(LoginPage.this,Sign_Up.class);
            i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(i);
            finish();
        });

        back.setOnClickListener(v -> {
            Intent i = new Intent(LoginPage.this,Getting_started_or_Login.class);
            i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(i);
            finish();
        });
    }
    public void ShowHidePass(View view){

        if(view.getId()==R.id.show_pass_btn){

            if(password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.open_eye);

                //Show Password
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                password.setSelection(password.getText().length());
            }
            else{
                ((ImageView)(view)).setImageResource(R.drawable.closed_eye);

                //Hide Password
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                password.setSelection(password.getText().length());
            }
        }
    }
}