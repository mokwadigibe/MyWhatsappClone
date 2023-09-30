package com.amg.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        handler = (Handler) new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent x = new Intent(SplashScreen.this, LoginActivity.class);
                Toast.makeText(SplashScreen.this, "Welcome to The Login Section", Toast.LENGTH_SHORT).show();
                startActivity(x);
            }
        }, 4000);
    }
}