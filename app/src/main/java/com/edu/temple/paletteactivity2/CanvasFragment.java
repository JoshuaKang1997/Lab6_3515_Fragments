package com.edu.temple.paletteactivity2;


import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CanvasFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_canvas, container, false);

        Bundle bundle = getArguments();
        if(bundle != null) {
            String colorget = bundle.getString("color");
            Toast.makeText(getContext(), colorget, Toast.LENGTH_SHORT).show();
        }
        return v;
    }

    public static CanvasFragment newInstance() {
        CanvasFragment canvasFragment = new CanvasFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString("key", color);
//        canvasFragment.setArguments(bundle);
        return canvasFragment;
    }
}
