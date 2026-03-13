package com.bibek.labmp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Lab7 extends AppCompatActivity {

    Button btnShowAns;
    RadioGroup rg1,rg2,rg3,rg4, rg6;
    EditText etQ5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab7);

        btnShowAns = findViewById(R.id.btn_showAns);
        rg1 = findViewById(R.id.rg_q1Options);
        rg2 = findViewById(R.id.rg_q2Options);
        rg3 = findViewById(R.id.rg_q3Options);
        rg4 = findViewById(R.id.rg_q4Options);
        rg6 = findViewById(R.id.rg_q6Options);

        etQ5 = findViewById(R.id.et_q5);

        btnShowAns.setOnClickListener(v->{
            String q1 = getRadioValue(rg1);
            String q2 = getRadioValue(rg2);
            String q3 = getRadioValue(rg3);
            String q4 = getRadioValue(rg4);
            String q6 = getRadioValue(rg6);
            String q5 = etQ5.getText().toString();

            Intent intent = new Intent(this, Show7Ans.class);

            intent.putExtra("q1", q1);
            intent.putExtra("q2", q2);
            intent.putExtra("q3", q3);
            intent.putExtra("q4", q4);
            intent.putExtra("q5", q5);
            intent.putExtra("q6", q6);

            startActivity(intent);
        });
    }
    private String getRadioValue(RadioGroup rg){
        int id = rg.getCheckedRadioButtonId();
        if(id == -1) return  "Not answered";

        RadioButton rb = findViewById(id);
        return  rb.getText().toString();

    }
}