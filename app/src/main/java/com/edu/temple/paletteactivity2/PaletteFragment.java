package com.edu.temple.paletteactivity2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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
        spinner.setSelection(0, false);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                view.setBackgroundColor(Color.parseColor("White"));
                String[] newcolorValue = getArguments().getStringArray("key");

                Bundle bundle = new Bundle();
                bundle.putString("color", newcolorValue[position]);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment cfr = CanvasFragment.newInstance();
                cfr.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment3, cfr);
                fragmentTransaction.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        return v;
    }

    public static PaletteFragment newInstance(String[] colorArray) {
        PaletteFragment paletteFragment = new PaletteFragment();
        Bundle colorBundle = new Bundle();
        colorBundle.putStringArray("key", colorArray);
        paletteFragment.setArguments(colorBundle);
        return paletteFragment;
    }
}