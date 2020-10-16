package com.github.ashwindmk.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.ashwindmk.AndroidLib;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        AndroidLib.log("Hello AndroidLib");
    }
}
