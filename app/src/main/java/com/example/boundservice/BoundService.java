package com.example.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class BoundService extends Service {

    private static final String TAG = "BoundServiceTAG_";
    private final IBinder mBinder = new LocalBinder();

    public BoundService() {
    }

    public class LocalBinder extends Binder {
        BoundService getService() {
            return BoundService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public void doMagic(){
        Log.d(TAG, "doMagic: ");
    }
}
