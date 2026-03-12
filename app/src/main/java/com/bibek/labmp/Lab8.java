package com.bibek.labmp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Lab8 extends AppCompatActivity {

    HomeFragment homeFragment =new HomeFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    Button btnHome, btnProfile, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8);

        btnHome = findViewById(R.id.btn_home);
        btnProfile = findViewById(R.id.btn_profile);
        btnSettings = findViewById(R.id.btn_settings);

    }

    @Override
    protected void onStart() {
        super.onStart();

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loadFragment(homeFragment);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(profileFragment);
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(settingsFragment);
            }
        });
    }

private void loadFragment(Fragment fragment) {
    FragmentManager fragmentManager =getSupportFragmentManager();
    FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragment_frame_layout, fragment);
    fragmentTransaction.commit();
}
}