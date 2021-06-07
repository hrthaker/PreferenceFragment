package com.example.preferencefragment;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat
{

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.prefs_demo, rootKey);
    }
}