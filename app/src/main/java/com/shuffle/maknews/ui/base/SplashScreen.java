package com.shuffle.maknews.ui.base;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shuffle.maknews.R;

public class SplashScreen extends AppCompatActivity {

    private int time = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(SplashScreen.this, BaseActivity.class);
                startActivity(home);
                finish();
            }
        },time);
    }
}
