package com.dce.puja.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startBlinkingAnimation(View view) {
        Button button = (Button) findViewById(R.id.blinking_animation);
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
        button.startAnimation(startAnimation);
    }
}


