package com.bb.alarmbot;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends Activity {
    private static final String TAG = HomeActivity.class.getSimpleName();

    TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_home);
        helloText = (TextView) findViewById(R.id.hello);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        String loggedInUser = ((AlarmBotApplication) getApplication()).getUsername();
        helloText.setText("Hello " + loggedInUser+" , ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }
}
