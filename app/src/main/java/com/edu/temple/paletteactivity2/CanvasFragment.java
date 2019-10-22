package com.edu.temple.paletteactivity2;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class CanvasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_canvas, container, false);
        Bundle bundle = getArguments();
        String colorget = bundle.getString("color");
        Fragment fragment = (Fragment) getFragmentManager().findFragmentById(R.id.fragment);

        Toast.makeText(getContext(), colorget, Toast.LENGTH_SHORT).show();

        //fragment.getView().setBackgroundColor(Color.parseColor(colorget));
        return v;
    }

}
