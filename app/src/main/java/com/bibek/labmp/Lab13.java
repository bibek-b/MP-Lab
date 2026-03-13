package com.bibek.labmp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.bibek.labmp.Adapter.CountryAdapter;

public class Lab13 extends AppCompatActivity {

    GridView gridView;

    String[] countries = {
            "Nepal","India","USA","UK","China",
            "Japan","Germany","France","Brazil","Canada",
            "Australia","Italy","Russia","Spain","Mexico",
            "Argentina","South Korea","Indonesia","Thailand","Bangladesh"
    };

    int[] flags = {
            R.drawable.np,
            R.drawable.in,
            R.drawable.us,
            R.drawable.gb,
            R.drawable.cn,
            R.drawable.jp,
            R.drawable.de,
            R.drawable.fr,
            R.drawable.br,
            R.drawable.ca,
            R.drawable.au,
            R.drawable.it,
            R.drawable.ru,
            R.drawable.es,
            R.drawable.mx,
            R.drawable.ar,
            R.drawable.kr,
            R.drawable.id,
            R.drawable.th,
            R.drawable.bd
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab13);

        gridView = findViewById(R.id.gridView);

        CountryAdapter adapter = new CountryAdapter(this, countries, flags);

        gridView.setAdapter(adapter);
    }
}