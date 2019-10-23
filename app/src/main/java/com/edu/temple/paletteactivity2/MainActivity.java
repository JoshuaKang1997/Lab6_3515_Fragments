package com.edu.temple.paletteactivity2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Resources;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = getResources().getStringArray(R.array.ecolor);

        Fragment cfr = CanvasFragment.newInstance();
        Fragment fr = PaletteFragment.newInstance(colors);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.fragment, fr); transaction.replace(R.id.fragment3, cfr);
        transaction.commit();

//        findViewById(R.id.fragment3).setBackgroundColor(Color.parseColor("Blue"));
    }

//    public void selectFrag(View view) {
//
//        Fragment fr;
//
//        fr = new PaletteFragment();
//
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.fragment, fr);
//        transaction.addToBackStack(null);
//        transaction.commit();
//
//    }
}
