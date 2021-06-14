package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText etEmail,etPassword;
Button btnSignup,btnSignin;

    public static final String main_key = "mypref";
    public static final String email_key = "emailKey";
    public static final String password_key = "passwordKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);
        btnSignin = findViewById(R.id.btnSignin);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail,userPassword;
                userEmail = etEmail.getText().toString();
                userPassword = etPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                String email = preferences.getString(email_key,"");
                String password =  preferences.getString(password_key,"");

                if ((userEmail.equals(email)) && (userPassword.equals(password))){
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Invaild Login Details...",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
