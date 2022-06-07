package com.cookandroid.avoid_allergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText login_id, login_pw;
    Button  login_loginBtn, login_signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        login_id = (EditText) findViewById(R.id.login_id);
        login_pw = (EditText) findViewById(R.id.login_pw);

        login_loginBtn = (Button) findViewById(R.id.login_loginBtn);
        login_signupBtn = (Button) findViewById(R.id.login_signupBtn);

        login_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login_pw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login_loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login_signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}