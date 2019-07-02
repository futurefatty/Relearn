package com.example.relearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.relearn.layout.LinearActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("标题");
    }

    //布局学习
    public void layoutDtudy(View view) {
        startActivity(new Intent(MainActivity.this, LinearActivity.class));
    }


//    //地图
//    public void baiduMap(View view) {
//        startActivity(new Intent(MainActivity.this, BaiduMapActivity.class));
//    }
}
