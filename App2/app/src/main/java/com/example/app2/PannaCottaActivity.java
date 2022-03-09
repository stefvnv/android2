package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PannaCottaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pannacotta);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
    }
}