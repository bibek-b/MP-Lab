package com.bibek.labmp;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;


public class nl3 extends AppCompatActivity {

    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nl3);

        btnLogout = findViewById(R.id.btn_logout);

        btnLogout.setOnClickListener(v-> {
            MyDialog dialog = new MyDialog();
            dialog.show(getSupportFragmentManager(), "dialog");
        });

    }

    public static class MyDialog extends DialogFragment{
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState){

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

            builder.setTitle("Logout").setMessage("Are you sure?").setPositiveButton("Yes", null).setNegativeButton("Cancel", null);

            return  builder.create();
        }
    }
}