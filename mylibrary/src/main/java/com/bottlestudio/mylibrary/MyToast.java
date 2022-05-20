package com.bottlestudio.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyToast {
    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
