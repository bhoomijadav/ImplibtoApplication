package com.milople.Toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.milople.mylibrary.Simpletoast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Demo.toasty(this,"HELLO");
        Simpletoast.toasty(this,"hiii");
    }
}