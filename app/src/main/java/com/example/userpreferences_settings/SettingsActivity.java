package com.example.userpreferences_settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {


    // same as defined in preference.xml file.
    public static final String KEY = "default_preference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         *  The code above uses the typical pattern for adding a fragment to an activity
         *  so that the fragment appears as the main content of the activity.
         */

        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
