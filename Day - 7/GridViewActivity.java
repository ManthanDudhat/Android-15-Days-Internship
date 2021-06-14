package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {
    String [] months = {"Jan","Feb","March","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
    GridView gv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gv1 = findViewById(R.id.gv1);

        ArrayAdapter<?> adapter = new ArrayAdapter<>(GridViewActivity.this, android.R.layout.simple_list_item_1,months);
        gv1.setAdapter(adapter);

        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"Clicked Month is: "+months[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}