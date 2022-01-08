package com.kushal.dankmemes;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView reddit,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout cl=findViewById(R.id.background);
        AnimationDrawable ad=(AnimationDrawable) cl.getBackground();
        ad.setEnterFadeDuration(500);
        ad.setExitFadeDuration(500);
        ad.start();
        reddit= (CardView) findViewById(R.id.reddit);
        about= (CardView) findViewById(R.id.about);
        reddit.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.reddit:i=new Intent(this,reddit.class);startActivity(i);break;
            case R.id.about:i=new Intent(this,about.class);startActivity(i);break;
            default:break;
        }
    }
}