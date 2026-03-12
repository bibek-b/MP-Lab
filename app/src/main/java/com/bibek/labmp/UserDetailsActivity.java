package com.bibek.labmp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserDetailsActivity extends AppCompatActivity {

    TextView tvFullName, tvMobileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        tvFullName = findViewById(R.id.full_name_value);
        tvMobileNumber = findViewById(R.id.mobile_number_value);
        String defaultValue = "--";
        if(getIntent() != null) {
            String fullNameValue = getIntent().getStringExtra("full_name");
            double mobileNumberValue = getIntent().getDoubleExtra("mobile_number", 0);
            tvFullName.setText(fullNameValue);
            tvMobileNumber.setText(String.valueOf(mobileNumberValue));
        } else {
            tvFullName.setText(defaultValue);
            tvMobileNumber.setText(defaultValue);
        }

    }
}