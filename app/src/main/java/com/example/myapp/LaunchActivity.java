
//引导页面

package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {
    //声明引导页图片数组
    private int[] launchImageArray={
            R.drawable.guide_bg1,R.drawable.guide_bg2,R.drawable.guide_bg3,R.drawable.guide_bg4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        //从布局视图中获取vp_launch的翻页视图
        ViewPager vp_launch=findViewById(R.id.vp_launch);
        //构建一个引导页面的翻页适配器
        LaunchAdapter adapter=new LaunchAdapter(this, launchImageArray);
        //给vp_launch设置引导页面适配器
        vp_launch.setAdapter(adapter);
        //设置vp_launch默认显示第一个页面
        vp_launch.setCurrentItem(0);
    }
}
