package com.codingwithtushar.dagger.car;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "Engine";

    @Inject
    public Engine () {
    }

     public void drive() {
        Log.d(TAG, "Driving car");
    }
}
