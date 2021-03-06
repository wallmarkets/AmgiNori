package com.matthias.android.amginori.persistence;

import android.content.Context;
import android.content.SharedPreferences;

public final class SharedPreferencesHelper {

    private static final String PREFS_NAME = "AmgiNoriPrefs";

    private static SharedPreferencesHelper sSharedPreferencesHelper;

    private Context mContext;

    private SharedPreferencesHelper(Context context) {
        mContext = context.getApplicationContext();
    }

    public static SharedPreferencesHelper get(Context context) {
        if (sSharedPreferencesHelper == null) {
            sSharedPreferencesHelper = new SharedPreferencesHelper(context);
        }
        return sSharedPreferencesHelper;
    }

    public boolean getBoolean(String key, boolean defValue) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return settings.getBoolean(key, defValue);
    }

    public void putBoolean(String key, boolean value) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public int getInt(String key, int defValue) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return settings.getInt(key, defValue);
    }

    public void putInt(String key, int value) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public String getString(String key, String defValue) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return settings.getString(key, defValue);
    }

    public void putString(String key, String value) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public void remove(String key) {
        SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove(key);
        editor.apply();
    }
}
