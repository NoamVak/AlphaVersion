package com.example.alphaversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.MapView;

public class MapAct extends AppCompatActivity {
    MapView mpV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        mpV=(MapView) findViewById(R.id.mpV);

    }

    public void location(View view) {


    }
}