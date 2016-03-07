package com.jlubecki.twist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jacob on 3/6/16.
 *
 * Provides app-wide activity-related utilities and makes it easy to make each activity in the app
 * utilize the latest compatibility activity.
 */
public class BaseActivity extends AppCompatActivity {

    // Put activity code here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
