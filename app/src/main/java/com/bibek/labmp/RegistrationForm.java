package com.bibek.labmp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegistrationForm extends AppCompatActivity {

    EditText etFullname, etMobileNumber;
    RadioGroup rgGender;
    Spinner spCountry;
    CheckBox cbPlaying, cbReading, cbTravelling;
    Button btnSubmit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        etFullname = findViewById(R.id.etFullname);
        etMobileNumber = findViewById(R.id.etMobilenumber);
        rgGender = findViewById(R.id.rgGender);
        spCountry= findViewById(R.id.spCountry);
        cbPlaying = findViewById(R.id.cbPlaying);
        cbReading = findViewById(R.id.cbReading);
        cbTravelling = findViewById(R.id.cbTravelling);
        btnSubmit = findViewById(R.id.btnSubmit);
    }

    @Override
    protected void onStart() {
        super.onStart();

        String [] countriesList = {"Nepal", "China", "Us", "Uk", "Canada", "India", "Germany"};
        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, countriesList);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullNameValue = etFullname.getText().toString();
                double mobileNumberValue = Integer.parseInt(etMobileNumber.getText().toString());

                int selectedRgId = rgGender.getCheckedRadioButtonId();
                String gender = "";

                if(selectedRgId != -1) {
                    RadioButton selectedGender = findViewById(selectedRgId);
                    gender = selectedGender.getText().toString();
                }

                String country = spCountry.getSelectedItem().toString();
                ArrayList<String> hobbiesList  = new ArrayList<>();

                if(cbReading.isChecked()) {
                    hobbiesList.add("Reading");
                }

                if(cbPlaying.isChecked()) {
                    hobbiesList.add("Playing");
                }
                if(cbTravelling.isChecked()){
                    hobbiesList.add("Travelling");
                }

                Intent intent = new Intent(getApplicationContext(), UserDetailsActivity.class);

                intent.putExtra("full_name", fullNameValue);
                intent.putExtra("mobile_number", mobileNumberValue);
                intent.putExtra("gender", gender);

                startActivity(intent);

                Toast.makeText(getApplicationContext(),fullNameValue,Toast.LENGTH_LONG).show();
            }
        });

    }
}