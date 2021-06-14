package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
EditText etName,etEmail,etPassword,etNumber;
Button btnsignup;
String name,email,password,contact;

    public static final String main_key = "mypref";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String password_key = "passwordKey";
    public static final String contact_key = "contactKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etNumber = findViewById(R.id.etNumber);
        btnsignup = findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = etName.getText().toString();
                email = etEmail.getText().toString();
                password = etPassword.getText().toString();
                contact = etNumber.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(name_key,name);
                editor.putString(email_key,email);
                editor.putString(password_key,password);
                editor.putString(contact_key,contact);
                editor.commit();

                Intent i = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}