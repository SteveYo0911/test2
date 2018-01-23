package com.example.steve_yo.gittest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "steve";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: master");
        Log.d(TAG, "onCreate: issure1");
        Log.d(TAG, "onCreate: issure2");

    }
}
