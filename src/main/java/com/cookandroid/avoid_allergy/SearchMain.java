package com.cookandroid.avoid_allergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchMain extends AppCompatActivity {
    Button  search_main_loginBtn, search_main_menuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);

        search_main_loginBtn = (Button) findViewById(R.id.search_main_loginBtn);
        search_main_menuBtn = (Button) findViewById(R.id.search_main_menuBtn);

        search_main_loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        search_main_menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}