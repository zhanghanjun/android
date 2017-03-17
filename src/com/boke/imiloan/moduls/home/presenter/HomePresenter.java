package com.boke.imiloan.moduls.home.presenter;

import android.content.Context;

import com.boke.imiloan.activity.MainActivity;
import com.boke.imiloan.bean.HomeBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.home.model.HomeModel;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/3/7.
 */

public class HomePresenter extends BasePresenter<MvpLceView<HomeBean>> implements MvpPresenter<MvpLceView<HomeBean>> {
    private HomeModel homeModel;
    public HomePresenter(Context context) {
        super(context);
        this.homeModel = new HomeModel(context);
    }

    public void getHomeDataList(final CallbackContext callbackContext, final MainActivity activity){
        this.homeModel.getHomeDataList(new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackHomeInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    HomeBean homeBean = (HomeBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(homeBean)));
                    }
                    activity.callBackHomeInfo(homeBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
