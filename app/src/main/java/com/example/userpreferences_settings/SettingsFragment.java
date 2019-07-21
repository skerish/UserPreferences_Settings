package com.example.userpreferences_settings;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragmentCompat {

    /**
     *  The reason why you are essentially replacing onCreateView() with onCreatePreferences()
     *  is because you will be adding this SettingsFragment to the existing SettingsActivity to
     *  display preferences, rather than showing a separate Fragment screen. Adding it to the
     *  existing Activity makes it easy to add or remove a Fragment while the Activity is running.
     *  The preference Fragment is rooted at the PreferenceScreen using rootKey.
     */

    @Override
    public void onCreatePreferences(Bundle bundle, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }

}
