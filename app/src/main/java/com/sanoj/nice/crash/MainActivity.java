package com.sanoj.nice.crash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sanoj.nice.nicecrashreport.config.NiceCrash;

public class MainActivity extends AppCompatActivity {

    private Button crash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add nice Crash Report
        NiceCrash.Builder.create().apply();

        crash = findViewById(R.id.crashmemamam);

        crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                throw new RuntimeException("Badumathama!");
            }
        });


    }
}