package com.example.olive.broadcastdemo.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by olive on 16/7/8.
 */
public class BroadCastTextThree extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("=====","第三种");

    }
}
