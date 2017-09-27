package com.example.day02;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by Administrator on 2017/9/27.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
                .build();

        ImageLoader.getInstance().init(configuration);
    }
}
