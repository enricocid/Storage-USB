package com.enrico.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends Activity {

    public final static String STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";

    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        intent.setAction(STORAGE_SETTINGS);

        if (Build.VERSION.SDK_INT >= 5) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        }

        startActivity(intent);
        finish();
        super.onCreate(savedInstanceState);
    }

}
