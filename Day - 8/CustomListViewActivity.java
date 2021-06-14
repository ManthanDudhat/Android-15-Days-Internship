package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {

    ListView lv1;
    int image[] = {R.mipmap.ic_launcher, android.R.drawable.sym_action_email,android.R.drawable.arrow_up_float, android.R.drawable.sym_action_chat, android.R.mipmap.sym_def_app_icon, android.R.drawable.stat_sys_warning};
    String name[] = {"This is image 1","This is image 2","This is image 3","This is image 4","This is image 5","This is image 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        lv1 = findViewById(R.id.lv1);

        MyAdapter myAdapter = new MyAdapter(CustomListViewActivity.this,image,name);
        lv1.setAdapter(myAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CustomListViewActivity.this,ListViewDetailActivity.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}