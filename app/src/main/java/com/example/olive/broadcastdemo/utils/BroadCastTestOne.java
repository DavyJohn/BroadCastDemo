package com.example.olive.broadcastdemo.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by olive on 16/7/8.
 */
public class BroadCastTestOne extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String s = intent.getStringExtra("msg");
        Log.e("==================1","这是一条有序的广播："+s);

        Bundle bundle = new Bundle();
        bundle.putString("data","广播接受的数据"+s);
        setResultExtras(bundle);
    }
}
