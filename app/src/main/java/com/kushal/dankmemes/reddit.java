package com.kushal.dankmemes;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class reddit extends AppCompatActivity {
private CardView memes,memes2,memes3,memes4,memes5,memes6,memes7,memes8,memes9,memes10,memes11,memes12,memes13,memes14,memes15,memes16,memes17,memes18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit);
        ConstraintLayout cl=findViewById(R.id.background);
        AnimationDrawable ad=(AnimationDrawable) cl.getBackground();
        ad.setEnterFadeDuration(300);
        ad.setExitFadeDuration(300);
        ad.start();
        memes = (CardView) findViewById(R.id.memes);
        memes2 = (CardView) findViewById(R.id.dankmemes);
        memes3 = (CardView) findViewById(R.id.funny);
        memes4 = (CardView) findViewById(R.id.gifs);
        memes5= (CardView) findViewById(R.id.dieinside);
        memes6= (CardView) findViewById(R.id.meirl);
        memes7= (CardView) findViewById(R.id.thankseurope);
        memes8= (CardView) findViewById(R.id.deepfried);
        memes9= (CardView) findViewById(R.id.blursed);
        memes10= (CardView) findViewById(R.id.diwhy);
        memes11= (CardView) findViewById(R.id.shower);
        memes12= (CardView) findViewById(R.id.expecvsreal);
        memes13= (CardView) findViewById(R.id.history);
        memes14= (CardView) findViewById(R.id.onion);
        memes15= (CardView) findViewById(R.id.pics);
        memes16= (CardView) findViewById(R.id.tinder);
        memes17= (CardView) findViewById(R.id.whole1);
        memes18= (CardView) findViewById(R.id.whole2);
        memes18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/wholesomememes/");
            }
        });
        memes17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/UnexpectedlyWholesome/");
            }
        });
        memes16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/Tinder/");
            }
        });
        memes15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/pics/");
            }
        });
        memes14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/nottheonion/");
            }
        });
        memes13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/HistoryMemes/");
            }
        });
        memes12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/ExpectationVsReality/");
            }
        });
        memes11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/Showerthoughts/");
            }
        });
        memes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/DiWHY/");
            }
        });
        memes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/blursedimages/");
            }
        });
        memes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/DeepFriedMemes/");
            }
        });
        memes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/bootleg_memes/");
            }
        });
        memes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/me_irl/");
            }
        });
        memes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/WatchPeopleDieInside/");
            }
        });
        memes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/gifs/");
            }
        });
        memes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/funny/");
            }
        });
        memes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/dankmemes/");
            }
        });
        memes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click("https://www.reddit.com/r/memes/");
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