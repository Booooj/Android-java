package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStart( View view ){
        ((Chronometer)findViewById(R.id.timer)).setBase(SystemClock.elapsedRealtime());
        ((Chronometer)findViewById(R.id.timer)).start();
    }
    public void onStop( View view ){
        ((Chronometer)findViewById(R.id.timer)).stop();
    }

}
