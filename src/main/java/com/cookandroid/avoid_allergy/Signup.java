package com.cookandroid.avoid_allergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
    EditText signup_id, signup_password, signup_name, signup_address;
    TextView signup_allergy;
    Button  signup_signupBtn;
    CheckBox allergy_shrimp, allergy_nut, allergy_fork, allergy_milk, allergy_clam, allergy_fish, allergy_egg, allergy_peach, allergy_meat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        signup_id = (EditText) findViewById(R.id.signup_id);
        signup_password = (EditText) findViewById(R.id.signup_password);
        signup_name = (EditText) findViewById(R.id.signup_name);
        signup_address = (EditText) findViewById(R.id.signup_address);

        signup_allergy = (TextView) findViewById(R.id.signup_allergy);

        allergy_shrimp = (CheckBox) findViewById(R.id.allergy_shrimp);
        allergy_nut = (CheckBox) findViewById(R.id.allergy_nut);
        allergy_fork = (CheckBox) findViewById(R.id.allergy_fork);
        allergy_milk = (CheckBox) findViewById(R.id.allergy_milk);
        allergy_clam = (CheckBox) findViewById(R.id.allergy_clam);
        allergy_fish = (CheckBox) findViewById(R.id.allergy_fish);
        allergy_egg = (CheckBox) findViewById(R.id.allergy_egg);
        allergy_peach = (CheckBox) findViewById(R.id.allergy_peach);
        allergy_meat = (CheckBox) findViewById(R.id.allergy_meat);

        signup_signupBtn = (Button) findViewById(R.id.signup_signupBtn);

        signup_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        signup_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        signup_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        signup_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        allergy_shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_nut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_fork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_clam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        allergy_meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        signup_signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}