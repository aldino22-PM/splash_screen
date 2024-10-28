package com.example.splashscreen;

import android.os.Bundle;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


 public class SplashActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Start home activity
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        // close splash activity
        finish();


    }
}
