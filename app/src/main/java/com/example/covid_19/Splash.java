package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity
{
    int SPLASH_TIMEOUT=1500;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent homeIntent=new Intent(Splash.this, afterSplash.class);
                startActivity(homeIntent);
                overridePendingTransition(R.anim.fadein,R.anim.fade_out);
                finish();
            }
        },SPLASH_TIMEOUT);
    }
}
