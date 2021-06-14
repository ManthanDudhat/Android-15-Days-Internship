package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonStart,buttonPause,buttonStop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        buttonStart = findViewById(R.id.buttonStart);
        buttonPause = findViewById(R.id.buttonPause);
        buttonStop = findViewById(R.id.buttonStop);

        mediaPlayer = MediaPlayer.create(AudioActivity.this,R.raw.mysong);

        buttonStart.setOnClickListener(this);
        buttonPause.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonStart:
                mediaPlayer.start();
                break;

            case R.id.buttonPause:
                mediaPlayer.pause();
                break;

            case R.id.buttonStop:
                mediaPlayer.stop();
                break;
        }
    }
}