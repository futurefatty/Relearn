package com.example.relearn.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.relearn.R;

/**
 * 线性布局介绍
 */
public class LinearActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_study);
    }

    //divider属性展示页面
    public void dividerShow(View view) {
        startActivity(new Intent(LinearActivity.this, LinearDividerActivity.class));
    }

}
