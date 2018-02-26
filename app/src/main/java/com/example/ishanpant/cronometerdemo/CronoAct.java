package com.example.ishanpant.cronometerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class CronoAct extends AppCompatActivity {
    private Chronometer chronometer;
    private Button startChronometer,stopChronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crono);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        startChronometer = (Button) findViewById(R.id.startChronometer);
        stopChronometer = (Button) findViewById(R.id.stopChronometer);
        startChronometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.start();
            }
        });
        stopChronometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();
            }
        });
    }
}
