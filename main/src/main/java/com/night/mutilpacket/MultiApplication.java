package com.night.mutilpacket;

import android.app.Application;

/**
 * Created by Night on 7/4/16.
 * Description:
 */
public class MultiApplication extends Application {
    private static MultiApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static MultiApplication getInstance() {
        return instance;
    }
}
