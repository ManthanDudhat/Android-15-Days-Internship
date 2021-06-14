package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView1 = findViewById(R.id.videoView1);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.movie);
        videoView1.setMediaController(mediaController);
        videoView1.setVideoURI(uri);
        videoView1.requestFocus();
        videoView1.start();
        videoView1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoActivity.this,"Thank you...",Toast.LENGTH_LONG).show();
                moveTaskToBack(true);
            }
        });

        videoView1.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(VideoActivity.this,"Something Went to Wrong",Toast.LENGTH_LONG).show();

                return false;
            }
        });
    }
}