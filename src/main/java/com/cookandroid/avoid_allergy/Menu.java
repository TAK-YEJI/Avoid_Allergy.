package com.cookandroid.avoid_allergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    Button  menu_mainpageBtn, menu_signupBtn;
    CheckBox menu1, menu2, menu3, menu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        menu_mainpageBtn = (Button) findViewById(R.id.menu_mainpageBtn);
        menu_signupBtn = (Button) findViewById(R.id.menu_signupBtn);

        menu1 = (CheckBox) findViewById(R.id.menu1);
        menu2 = (CheckBox) findViewById(R.id.menu2);
        menu3 = (CheckBox) findViewById(R.id.menu3);
        menu4 = (CheckBox) findViewById(R.id.menu4);

        menu_mainpageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        menu_signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}