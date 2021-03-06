/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.boke.imiloan.moduls.mine.view.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;

import com.boke.imiloan.R;
import com.boke.imiloan.bean.MemberApplyInfoBean;
import com.boke.imiloan.bean.SaveApplyInfoBean;
import com.boke.imiloan.utils.LogUtil;
import com.boke.imiloan.utils.ToastUtil;
import com.boke.imiloan.views.LoadingDialog;
import com.google.gson.Gson;

import org.apache.cordova.ConfigXmlParser;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewClient;
import org.apache.cordova.engine.SystemWebViewEngine;

/**
 * 我的-申请信息页面
 */
public class MemberApplyInfoActivity extends CordovaActivity
{
    private static final String TAG = MemberApplyInfoActivity.class.getSimpleName();
    private SystemWebView systemWebView;
    private CordovaWebView cordovaWebView;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_apply);
        loadData(false);
    }



    //初始化控件
    private void initView() {
        systemWebView  = (SystemWebView)findViewById(R.id.user_memberapply_webview);
        ConfigXmlParser parser = new ConfigXmlParser();
        parser.parse(this);//这里会解析res/xml/config.xml配置文件
        cordovaWebView = new CordovaWebViewImpl(new SystemWebViewEngine(systemWebView));//创建一个cordovawebview
        cordovaWebView.init(cordovaInterface, parser.getPluginEntries(), parser.getPreferences());//初始化//
        String url = "file:///android_asset/www/99998/www/index.html#/apply";
        cordovaWebView.loadUrl(url);
        systemWebView.setWebViewClient(new SystemWebViewClient((SystemWebViewEngine) cordovaWebView.getEngine()){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view,url);
            }

            //页面加载初始化时显示对话框
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                LoadingDialog.getInstance().showDialog(MemberApplyInfoActivity.this,getResources().getString(R.string.common_loading_msg));
            }

            //页面加载结束时取消对话框
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                LoadingDialog.getInstance().closeDialog();
            }
        });
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        cordovaWebView.handleDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        cordovaInterface.onActivityResult(requestCode, resultCode, intent);
    }



    public void loadData(boolean pullToRefresh) {
        //初始化控件
        initView();
    }

    public void callBackMemberApplyInfo(MemberApplyInfoBean result){
        LogUtil.e("MemberApplyInfoBean==",new Gson().toJson(result));
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }

    public void callBackSaveMemberApplyInfo(SaveApplyInfoBean result){
        LogUtil.e("SaveApplyInfoBean==",new Gson().toJson(result));
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {//点击的是返回键
            if (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0) {//按键的按下事件
                finish();
                return true;
            }
        }
        return false;
    }


}
