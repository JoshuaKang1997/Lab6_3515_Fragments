package com.edu.temple.paletteactivity2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.content.res.Resources;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class PaletteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_palette, container, false);
        Spinner spinner = v.findViewById(R.id.spinner);

        String[] colors = getResources().getStringArray(R.array.color);
        ColorAdapter adapter = new ColorAdapter(this.getActivity(), colors);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                //window.setBackgroundColor(Color.parseColor(adapterView.getItemAtPosition(position).toString()));
                view.setBackgroundColor(Color.parseColor("White"));
                String[] newcolorValue = {"White", "Blue","Green", "Magenta","Cyan","Black",
                        "Lime", "Yellow","Purple","Red"};
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        return v;
    }
}