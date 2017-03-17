package com.boke.imiloan.moduls.mine.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

import com.boke.imiloan.R;
import com.boke.imiloan.base.MyApplication;
import com.boke.imiloan.moduls.base.view.BaseFragment;
import com.boke.imiloan.moduls.user.view.activity.LoginActivity;
import com.boke.imiloan.views.LoadingDialog;

import org.apache.cordova.ConfigXmlParser;
import org.apache.cordova.CordovaInterfaceImpl;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewClient;
import org.apache.cordova.engine.SystemWebViewEngine;

/**
 * Created by Administrator on 2017/3/6.
 */

public class MineFragment extends BaseFragment{

    private SystemWebView systemWebView;

    @Override
    public int getContentView() {
        return R.layout.fragment_mine;
    }


    @Override
    public void initContentView(View contentView) {
        if(MyApplication.getInstance().getUser().getData()==null){
            startActivity(new Intent(getActivity(), LoginActivity.class));
            return;
        }
        initView(contentView);
    }



    @Override
    public void initData() {
        super.initData();
    }

    private void initView(View contentView) {
        systemWebView  = (SystemWebView)contentView.findViewById(R.id.mine_webview);
        systemWebView.getSettings().setJavaScriptEnabled(true);
        ConfigXmlParser parser = new ConfigXmlParser();
        parser.parse(getActivity());//这里会解析res/xml/config.xml配置文件
        CordovaWebView cordovaWebView = new CordovaWebViewImpl(new SystemWebViewEngine(systemWebView));//创建一个cordovawebview
        cordovaWebView.init(new MyCordovaInterfaceImpl(getActivity()), parser.getPluginEntries(), parser.getPreferences());//初始化//
        cordovaWebView.loadUrl("file:///android_asset/www/99998/www/index.html#/personnalcenter");
        systemWebView.setWebViewClient(new SystemWebViewClient((SystemWebViewEngine) cordovaWebView.getEngine()){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view,url);
            }

            //页面加载初始化时显示对话框
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                LoadingDialog.getInstance().showDialog(getActivity(),getActivity().getResources().getString(R.string.common_loading_msg));
            }

            //页面加载结束时取消对话框
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                LoadingDialog.getInstance().closeDialog();
            }
        });
    }


    private static class MyCordovaInterfaceImpl extends CordovaInterfaceImpl {
        private Activity mActivity;
        public MyCordovaInterfaceImpl(Activity activity) {
            super(activity);
            mActivity=activity;
        }

        @Override
        public Activity getActivity() {
            return mActivity; //注意这里要返回activity
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if(systemWebView.getCordovaWebView()!=null){
            systemWebView.getCordovaWebView().handleDestroy();
        }
    }





}
