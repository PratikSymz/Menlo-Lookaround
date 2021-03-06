package com.symzdev.android.atmenlo.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.symzdev.android.atmenlo.activities.MainActivity;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread splashThread = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        splashThread.start();
    }
}
