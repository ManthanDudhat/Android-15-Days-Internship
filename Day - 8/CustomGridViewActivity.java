package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class CustomGridViewActivity extends AppCompatActivity {

    GridView gv1;
    int [] image = {android.R.drawable.sym_action_email,android.R.drawable.sym_action_chat,android.R.drawable.sym_action_call,android.R.drawable.sym_call_incoming,android.R.drawable.sym_call_missed,android.R.drawable.sym_call_outgoing};
    String [] name = {"This is Phone Image 1","This is Phone Image 2","This is Phone Image 3","This is Phone Image 4","This is Phone Image 5","This is Phone Image 6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        gv1 = findViewById(R.id.gv1);

        GridAdapter gridAdapter = new GridAdapter(this,image,name);
        gv1.setAdapter(gridAdapter);

        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CustomGridViewActivity.this,ListViewDetailActivity.class);

                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);

            }
        });
    }
}