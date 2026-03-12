package com.bibek.labmp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogFragmentFile extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(R.layout.fragment_dialog_file, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());

        builder.setView(view).setTitle("Logout").setPositiveButton("Yes", null).setNegativeButton("Cancel", null);
        return builder.create();
    }
}