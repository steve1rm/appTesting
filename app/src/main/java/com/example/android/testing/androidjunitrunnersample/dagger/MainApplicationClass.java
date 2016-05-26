package com.example.android.testing.androidjunitrunnersample.dagger;

import android.app.Application;
import android.util.Log;

/**
 * Created by steve on 5/26/16.
 */
public class MainApplicationClass extends Application {

    private static final String TAG = MainApplicationClass.class.getSimpleName();

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate()");

        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(MainApplicationClass.this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
