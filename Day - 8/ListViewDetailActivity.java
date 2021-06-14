package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewDetailActivity extends AppCompatActivity {
ImageView ivimage;
TextView tvnamedetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_detail);

        ivimage = findViewById(R.id.ivimage);
        tvnamedetail = findViewById(R.id.tvnamedetail);

        Intent intent = getIntent();

        int img =intent.getIntExtra("image",R.mipmap.ic_launcher);
        String nm = intent.getStringExtra("name");

       ivimage.setImageResource(img);
       tvnamedetail.setText(nm);

    }
}