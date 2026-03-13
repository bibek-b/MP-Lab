package com.bibek.labmp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Lab11 extends AppCompatActivity {

    EditText num1, num2, result;
    Button actionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab11);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        actionBtn = findViewById(R.id.btnAction);

        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), actionBtn);
                popupMenu.getMenuInflater().inflate(R.menu.lab11_popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        double n1 = Double.parseDouble(num1.getText().toString());
                        double n2 = Double.parseDouble(num2.getText().toString());
                        double res = 0;

                        int id = item.getItemId();

                        if (id == R.id.menu_add) {
                            res = n1 + n2;
                        }
                        else if (id == R.id.menu_subtract) {
                            res = n1 - n2;
                        }
                        else if (id == R.id.menu_divide) {
                            res = n1 / n2;
                        }
                        else if (id == R.id.menu_multiply) {
                            res = n1 * n2;
                        }
                        else if (id == R.id.menu_modulus) {
                            res = n1 % n2;
                        }

                        result.setText(String.valueOf(res));
                        return true;
                    }
                });

                popupMenu.show();
            }
        });
    }
}