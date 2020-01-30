package com.codingwithtushar.dagger.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {

    }

    public void enableRemote() {
        Log.d(TAG, "Remote is working for car");
    }
}
