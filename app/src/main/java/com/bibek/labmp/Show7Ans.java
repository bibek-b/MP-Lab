package com.bibek.labmp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class Show7Ans extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show7_ans);

        tv1 = findViewById(R.id.ans1);
        tv2 = findViewById(R.id.ans2);
        tv3 = findViewById(R.id.ans3);
        tv4 = findViewById(R.id.ans4);
        tv5 = findViewById(R.id.ans5);
        tv6 = findViewById(R.id.ans6);

        tv1.setText(getIntent().getStringExtra("q1"));
        tv2.setText(getIntent().getStringExtra("q2"));
        tv3.setText(getIntent().getStringExtra("q3"));
        tv4.setText(getIntent().getStringExtra("q4"));
        tv5.setText(getIntent().getStringExtra("q5"));
        tv6.setText(getIntent().getStringExtra("q6"));

    }
}