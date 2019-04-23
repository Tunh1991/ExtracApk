package com.example.extractapk.settings;


import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.extractapk.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    private String TAG = "SettingsFragment";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);

    }


    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        Log.i(TAG, "onCreatePreferences()");
        addPreferencesFromResource(R.xml.settings_preference);
    }
}
