package com.cookandroid.avoid_allergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Order extends AppCompatActivity {
    EditText order_count;
    Button  order_menu, order_delivery;
    TextView order_total;
    String num1;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        order_count = (EditText) findViewById(R.id.order_count);

        order_menu = (Button) findViewById(R.id.order_menu);
        order_delivery = (Button) findViewById(R.id.order_delivery);

        order_total = (TextView) findViewById(R.id.order_total);

        order_total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = order_count.getText().toString();
                result = Integer.parseInt(num1) * 6500;
                order_total.setText("Total  " + result.toString());
            }
        });

        order_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        order_delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}