package com.bibek.labmp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ArithmeticOperation extends AppCompatActivity {
    EditText etFirstNum, etSecondNum;
    TextView tvResultValue;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_arithmetic_operation);

        etFirstNum = findViewById(R.id.etFirstNum);
        etSecondNum = findViewById(R.id.etSecondNum);
        tvResultValue = findViewById(R.id.tvResultValue);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);



    }

    @Override
    protected void onStart() {
        super.onStart();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumValue = Integer.parseInt(etFirstNum.getText().toString());
                int secondNumValue = Integer.parseInt(etSecondNum.getText().toString());

                if(firstNumValue <= 0 || secondNumValue <= 0) {
                    return;
                }
                tvResultValue.setText(firstNumValue + secondNumValue);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumValue = Integer.parseInt(etFirstNum.getText().toString());
                int secondNumValue = Integer.parseInt(etSecondNum.getText().toString());

                if(firstNumValue <= 0 || secondNumValue <= 0) {
                    return;
                }
                tvResultValue.setText(firstNumValue - secondNumValue);

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumValue = Integer.parseInt(etFirstNum.getText().toString());
                int secondNumValue = Integer.parseInt(etSecondNum.getText().toString());

                if(firstNumValue <= 0 || secondNumValue <= 0) {
                    return;
                }
                tvResultValue.setText(firstNumValue * secondNumValue);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumValue = Integer.parseInt(etFirstNum.getText().toString());
                int secondNumValue = Integer.parseInt(etSecondNum.getText().toString());

                if(firstNumValue <= 0 || secondNumValue <= 0) {
                    return;
                }
                tvResultValue.setText(firstNumValue - secondNumValue);

            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumValue = Integer.parseInt(etFirstNum.getText().toString());
                int secondNumValue = Integer.parseInt(etSecondNum.getText().toString());

                if(firstNumValue <= 0 || secondNumValue <= 0) {
                    return;
                }
                tvResultValue.setText(firstNumValue % secondNumValue);

            }
        });

    }
}