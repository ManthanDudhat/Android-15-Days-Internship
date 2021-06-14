package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView gName,gEmail,gContact;
Button btnLogout;

    public static final String main_key = "mypref";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String contact_key = "contactKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gName = findViewById(R.id.gName);
        gEmail = findViewById(R.id.gEmail);
        gContact = findViewById(R.id.gContact);
        btnLogout = findViewById(R.id.btnLogout);

        SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
        String email = preferences.getString(email_key,"");
        String name = preferences.getString(name_key,"");
        String contact = preferences.getString(contact_key,"");

        gName.setText    ("Name:     "+name);
        gEmail.setText   ("Email:      "+email);
        gContact.setText ("Contact:  "+contact);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.commit();
                finish();
                moveTaskToBack(true);
            }
        });
    }
}