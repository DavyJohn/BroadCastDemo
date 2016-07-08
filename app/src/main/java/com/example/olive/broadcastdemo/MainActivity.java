package com.example.olive.broadcastdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.olive.broadcastdemo.utils.BroadCastTestOne;
import com.example.olive.broadcastdemo.utils.BroadCastTextThree;

public class MainActivity extends AppCompatActivity {

    private BroadCastTestOne text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter iF = new IntentFilter("one");
        text = new BroadCastTestOne();
        registerReceiver(text,iF);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.send1:
                Intent intent = new Intent();
                intent.putExtra("msg","贾老师的加拉圣诞节拉斯");
                intent.setAction("one");
                sendBroadcast(intent,null);//普通广播
                break;
            case R.id.send2:
                Intent intent2 = new Intent();
                intent2.putExtra("msg","贾老师的加拉圣诞节拉斯");
                intent2.setAction("one");
                sendOrderedBroadcast(intent2,null);//有序广播
                break;
            case R.id.send3://不常用
                //先传值在创建
                Intent in = new Intent();
                Bundle bu = new Bundle();
                bu.putString("bundle","撒娇的拉升等级拉萨路口");
                in.putExtra("bundleData",bu);
                in.setAction("three");
                sendStickyBroadcast(in);
                IntentFilter intentFilter = new IntentFilter("three");
                BroadCastTextThree three = new BroadCastTextThree();
                registerReceiver(three,intentFilter);

                break;
        }
    }

    @Override
    protected void onDestroy() {
            super.onDestroy();
        unregisterReceiver(text);

    }
}
