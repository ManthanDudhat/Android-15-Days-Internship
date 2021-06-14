package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SpalshActivity extends AppCompatActivity {
MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spalsh);
        player = MediaPlayer.create(SpalshActivity.this,R.raw.back_sound);
        player.start();
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(SpalshActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };
        thread.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        player.release();
        finish();
    }
}
