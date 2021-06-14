package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {
    EditText etMobile,etMsg;
    Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsactivity);

        etMobile = findViewById(R.id.etMobile);
        etMsg = findViewById(R.id.etMsg);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no,msg;
                no = etMobile.getText().toString();
                msg = etMsg.getText().toString();

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(SMSActivity.this,"Message Sent successfully",Toast.LENGTH_LONG).show();

            }
        });
    }
}