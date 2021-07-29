package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class afterSplash extends AppCompatActivity
{
    Button b1;
    int SPLASH_TIMEOUT=300;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_splash);
        b1=findViewById(R.id.btnTrack);
        scrollView=findViewById(R.id.scroll);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        Intent homeIntent=new Intent(afterSplash.this, MainActivity.class);
                        startActivity(homeIntent);
                        overridePendingTransition(R.anim.fadein,R.anim.fade_out);
                        finish();
                    }
                },SPLASH_TIMEOUT);

            }
        });
    }
}