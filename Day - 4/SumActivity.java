package com.akashtechnolabs.manthan.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {
EditText etNum1,etNum2;
TextView tvRes;
Button btnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        etNum1 = findViewById(R.id.etnum1);
        etNum2 = findViewById(R.id.etnum2);
        tvRes = findViewById(R.id.tvRes);
        btnRes = findViewById(R.id.btnRes);

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1 = etNum1.getText().toString();
                num2 = etNum2.getText().toString();
                int n1,n2;
                n1 = Integer.parseInt(num1);
                n2 = Integer.parseInt(num2);
                int sum = n1 + n2;
                tvRes.setText("Sum is: "+sum);
                Toast.makeText(SumActivity.this,"Sum is: "+String.valueOf(sum),Toast.LENGTH_LONG).show();
            }
        });
    }
}