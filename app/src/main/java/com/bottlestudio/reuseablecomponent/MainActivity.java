package com.bottlestudio.reuseablecomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bottlestudio.mylibrary.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyToast.showToast(this, "Message");
    }
}