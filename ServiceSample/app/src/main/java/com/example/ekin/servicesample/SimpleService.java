package com.example.ekin.servicesample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SimpleService extends Service {
    private final String TAG = "SimpleSerivce";

    public SimpleService() {

    }

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate service");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand service");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy service");
        super.onDestroy();
    }


    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "OnBind service");
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }
}
