package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegistrationActivity extends AppCompatActivity {
Button submit;
EditText et1,et2,et3,et4;
RadioGroup rg;
RadioButton rb1,rb2;
CheckBox cb1,cb2,cb3,cb4;
String s1,s2,s3,s4,s5,s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        submit = findViewById(R.id.submit);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = et1.getText().toString();
                s2 = et2.getText().toString();
                s3 = et3.getText().toString();
                s4 = et4.getText().toString();

                if (rb1.isChecked())
                    s5 = rb1.getText().toString();
                else if (rb2.isChecked())
                    s5 = "Female";
               else
                    s5 = "None";

               if (cb1.isChecked())
               {
                   s6 = cb1.getText().toString()+",";
               }

               if (cb2.isChecked())
               {
                   s6 += cb2.getText().toString()+",";
               }

               if (cb3.isChecked())
               {
                   s6 += cb3.getText().toString()+",";
               }

               if (cb4.isChecked())
               {
                   s6 += cb4.getText().toString()+",";
               }

                Intent intent = new Intent(RegistrationActivity.this,DataActivity.class);
                intent.putExtra("Name",s1);
                intent.putExtra("Email",s2);
                intent.putExtra("Phone",s3);
                intent.putExtra("Password",s4);
                intent.putExtra("Gender",s5);
                intent.putExtra("Hobbies",s6);

                startActivity(intent);

            }
        });
    }
}