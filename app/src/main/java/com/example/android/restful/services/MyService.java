package com.example.android.restful.services;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;


public class MyService extends IntentService {
    public MyService() {
        super("My Service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Uri uri = intent.getData();
        Log.i("TEST", "onHandleIntent: " +uri.toString());

        try {
            Thread.sleep(1000); // this is only for testing purpose
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("TEST", "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("TEST", "onDestroy");
    }
}
