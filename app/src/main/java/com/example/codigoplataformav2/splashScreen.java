package com.example.codigoplataformav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashScreen extends AppCompatActivity {
    Animation ellipse1,ellipse2,logo;
    ImageView Iellipse1,Iellipse2,Ilogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        ellipse1 = AnimationUtils.loadAnimation(this,R.anim.ellipse1);
        ellipse2 = AnimationUtils.loadAnimation(this,R.anim.ellipse2);
        logo = AnimationUtils.loadAnimation(this,R.anim.logo);


        Iellipse1 = findViewById(R.id.ellipse_1);
        Iellipse2 = findViewById(R.id.ellipse_2);
        Ilogo = findViewById(R.id.logo);

        Iellipse1.setAnimation(ellipse1);
        Iellipse2.setAnimation(ellipse2);
        Ilogo.setAnimation(logo);
    }
}