package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            //using new url based off coments
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json" );
        } catch (MalformedURLException ignored) {
            Log.d(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
