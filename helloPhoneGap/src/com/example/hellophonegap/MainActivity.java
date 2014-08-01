package com.example.hellophonegap;

import android.support.v7.app.ActionBarActivity;
import org.apache.cordova.DroidGap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
