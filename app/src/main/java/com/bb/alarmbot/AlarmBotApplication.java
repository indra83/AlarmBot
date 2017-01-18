package com.bb.alarmbot;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by indra83 on 1/18/17.
 */

public class AlarmBotApplication extends Application {

    private static final String TAG = AlarmBotApplication.class.getSimpleName();

    private static final String PROFILE_PREF = "ProfilePrefs";
    private static final String PREF_USERNAME = "username";

    SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
        sharedPreferences = getSharedPreferences(PROFILE_PREF, 0);
    }

    public void setUsername(String username) {
        sharedPreferences.edit().putString(PREF_USERNAME, username).commit();
    }

    public String getUsername() {
        return sharedPreferences.getString(PREF_USERNAME, null);
    }
}
