package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {
    EditText editText1_email1,editText_subject,editText_message;
    Button btnSend;
    String to,subject,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        editText1_email1 = findViewById(R.id.editText1_email1);
        editText_subject = findViewById(R.id.editText2_subject);
        editText_message = findViewById(R.id.editText3_message);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               to = editText1_email1.getText().toString();
               subject = editText_subject.getText().toString();
               message = editText_message.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,message);

                intent.setType("message/rfc822");

                startActivity(Intent.createChooser(intent,"Send email: "));

            }
        });
    }
}