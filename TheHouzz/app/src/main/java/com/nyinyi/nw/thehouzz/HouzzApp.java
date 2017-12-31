package com.nyinyi.nw.thehouzz;

import android.app.Application;
import android.content.Context;

/**
 * Created by User on 12/12/2017.
 */

public class HouzzApp extends Application {

    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }
    public static Context getContext(){
        return context;
    }

}
