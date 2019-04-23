package com.example.extractapk.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.extractapk.R;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        SettingsFragment settingsFragment = new SettingsFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.setting_fragment, settingsFragment).commit();
    }
}
