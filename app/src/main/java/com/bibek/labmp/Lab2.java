package com.bibek.labmp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Lab2 extends AppCompatActivity {

    EditText name, email, mobile, password;
    RadioGroup genderGroup;
    Spinner countrySpinner;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);

        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_email);
        mobile = findViewById(R.id.et_mobile);
        password = findViewById(R.id.et_password);
        genderGroup = findViewById(R.id.rg_gender);
        countrySpinner = findViewById(R.id.sp_country);
        submit = findViewById(R.id.btn_submit);

        // Spinner data
        String[] countries = {"Nepal", "India", "USA", "UK"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, countries);
        countrySpinner.setAdapter(adapter);

        submit.setOnClickListener(v -> {

            String n = name.getText().toString();
            String e = email.getText().toString();
            String m = mobile.getText().toString();
            String p = password.getText().toString();

            int selectedId = genderGroup.getCheckedRadioButtonId();
            RadioButton rb = findViewById(selectedId);
            String g = rb.getText().toString();

            String c = countrySpinner.getSelectedItem().toString();

            Intent intent = new Intent(this, UserDetailsActivity.class);
            intent.putExtra("name", n);
            intent.putExtra("email", e);
            intent.putExtra("mobile", m);
            intent.putExtra("password", p);
            intent.putExtra("gender", g);
            intent.putExtra("country", c);

            startActivity(intent);
        });
    }
}