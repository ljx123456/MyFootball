package com.example.alu.myfootball;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by alu on 2017/3/6.
 */

public class MyApp extends Application {
    {
        PlatformConfig.setQQZone("1105949799", "PFvrIV31qZOREOMD");
        //PlatformConfig.setQQZone("1106025062", "hkhd81VhNTESAYLC");
    }
    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

    }
}
