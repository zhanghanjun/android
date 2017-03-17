package com.boke.imiloan.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.boke.imiloan.R;
import com.boke.imiloan.config.SharedPreferencesConfig;
import com.boke.imiloan.moduls.launch.ILaunch;
import com.boke.imiloan.moduls.launch.LaunchContext;
import com.boke.imiloan.moduls.launch.impl.LaunchRxJava;
import com.boke.imiloan.base.ActivityCollector;

/**
 * 作者: Dream on 16/9/22 21:21
 * QQ:510278658
 * E-mail:510278658@qq.com
 */
public class LaunchActivity extends Activity {
    private int i = -1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        ActivityCollector.add(this);
        startMain();
    }

    //需求: 启动一个过度动画(演示加载数据过程,下载过程)
    //动画时长:1-3秒钟左右
    //需求增强:我希望过度采用策略?
    //load数据、检查更新、下载更新启动页
    //策略模式
    //角色:策略接口、上下文、具体的策略
    private void startMain(){
        View target = findViewById(R.id.iv_launch);
        LaunchContext launchContext = new LaunchContext(new LaunchRxJava(),target);
        launchContext.launch(new ILaunch.Callback() {
            @Override
            public void call() {
                if (SharedPreferencesConfig.isShowGuide(LaunchActivity.this)){
                    startActivity(new Intent(LaunchActivity.this,GuideActivity.class));
                }else{
                    startActivity(new Intent(LaunchActivity.this,MainActivity.class));
                }
            }
        });

    }

}
