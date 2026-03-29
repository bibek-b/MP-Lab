package com.bibek.labmp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UserDetailsActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        result = findViewById(R.id.tv_result);

        String data =
                "Name: " + getIntent().getStringExtra("name") + "\n" +
                        "Email: " + getIntent().getStringExtra("email") + "\n" +
                        "Mobile: " + getIntent().getStringExtra("mobile") + "\n" +
                        "Password: " + getIntent().getStringExtra("password") + "\n" +
                        "Gender: " + getIntent().getStringExtra("gender") + "\n" +
                        "Country: " + getIntent().getStringExtra("country");

        result.setText(data);
    }
}