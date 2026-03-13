package com.bibek.labmp;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Lab15 extends AppCompatActivity {

    private ImageView imageView;
    private Button selectImageButton;

    // Launcher for picking an image
    private final ActivityResultLauncher<String> pickImageLauncher =
            registerForActivityResult(new ActivityResultContracts.GetContent(), uri -> {
                if (uri != null) {
                    imageView.setImageURI(uri);
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab15);

        imageView = findViewById(R.id.image_view);
        selectImageButton = findViewById(R.id.button_select_image);

        selectImageButton.setOnClickListener(v -> {
            // Open gallery to pick an image
            pickImageLauncher.launch("image/*");
        });
    }
}