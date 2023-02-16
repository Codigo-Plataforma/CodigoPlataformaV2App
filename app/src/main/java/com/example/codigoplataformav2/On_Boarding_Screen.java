package com.example.codigoplataformav2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class On_Boarding_Screen extends AppCompatActivity {

    ViewPager slideViewPager;
    LinearLayout dotLayout;

    Button backbtn, nextbtn;

    TextView[] dots;

    OnboardingViewPagerAdapter onboardingViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);

        backbtn = findViewById(R.id.btn_previous);
        nextbtn = findViewById(R.id.btn_next_signup);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(getitem(0) > 0) {
                    slideViewPager.setCurrentItem(getitem(-1), true);
                }
                else if(getitem(0) == 0){
                    Intent i = new Intent(On_Boarding_Screen.this, Getting_started_or_Login.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getitem(0) < 2){
                    slideViewPager.setCurrentItem(getitem(+1), true);
                }
                else if (getitem(0) == 2){
                    Intent i = new Intent(On_Boarding_Screen.this, Sign_Up.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        slideViewPager = (ViewPager) findViewById(R.id.slide_view_pager);
        dotLayout = (LinearLayout) findViewById(R.id.dot_indicator);


        onboardingViewPagerAdapter = new OnboardingViewPagerAdapter(this);

        slideViewPager.setAdapter(onboardingViewPagerAdapter);

        setUpIndicator(0);
        slideViewPager.addOnPageChangeListener(viewlistner);

    }

    public void setUpIndicator (int position){

        dots = new TextView[3];
        dotLayout.removeAllViews();

        //3dots for indication all set to inactive color
        for(int i=0 ; i<dots.length ; i++){

            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                dots[i].setTextColor(getResources().getColor(R.color.grey,getApplicationContext().getTheme()));
            }
            dotLayout.addView(dots[i]);
        }
        //set to active color for the position of page
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            dots[position].setTextColor(getResources().getColor(R.color.orange,getApplicationContext().getTheme()));
        }
    }


    //when user scrolls
    ViewPager.OnPageChangeListener viewlistner = new ViewPager.SimpleOnPageChangeListener(){
        @Override
        public void onPageScrolled(int position, float positionoffset, int positionoffsetpixels){
        }

        @Override
        public void onPageSelected(int position) {
            setUpIndicator(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            super.onPageScrollStateChanged(state);
        }
    };

    private int getitem (int i){
        return slideViewPager.getCurrentItem() + i;
    }
}