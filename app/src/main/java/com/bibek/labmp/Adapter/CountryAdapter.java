package com.bibek.labmp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bibek.labmp.R;

public class CountryAdapter extends BaseAdapter {

    Context context;
    String[] countryNames;
    int[] flags;
    LayoutInflater inflater;

    public CountryAdapter(Context context, String[] countryNames, int[] flags) {
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return countryNames[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.lab13_grid_item, null);

        ImageView flag = view.findViewById(R.id.flag);
        TextView name = view.findViewById(R.id.country);

        flag.setImageResource(flags[i]);
        name.setText(countryNames[i]);

        return view;
    }
}