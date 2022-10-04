package com.example.holamundo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 1;
        Log.d("a: ", String.valueOf(a));
        int b = 2;
        Log.d("b: ", String.valueOf(b));
        int c = a + b;
        Log.d("c: ", String.valueOf(c));
    }
}