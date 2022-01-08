package com.kushal.dankmemes;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class about extends AppCompatActivity {
private CardView instagram,facebook,whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ConstraintLayout cl=findViewById(R.id.background);
        AnimationDrawable ad=(AnimationDrawable) cl.getBackground();
        ad.setEnterFadeDuration(300);
        ad.setExitFadeDuration(300);
        ad.start();
        instagram=(CardView) findViewById(R.id.instagram);
        facebook=(CardView) findViewById(R.id.facebook);
        whatsapp=(CardView) findViewById(R.id.whatsapp);
whatsapp.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    click("https://wa.link/ql84d6");
                                }
                            });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.facebook.com/kushal.khandelwal.391/");
            }
        });
instagram.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        click("https://www.instagram.com/k.kushal_/");
    }
});
    }
    public void click(String url)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}