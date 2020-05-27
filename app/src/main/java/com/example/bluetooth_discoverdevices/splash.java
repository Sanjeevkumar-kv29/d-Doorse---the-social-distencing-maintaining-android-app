package com.example.bluetooth_discoverdevices;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override

            //runmethod thill specific time
            public void run() {
                startActivity(new Intent(splash.this,MainActivity.class));
                finish();
            }
        },4000);
    }
}
