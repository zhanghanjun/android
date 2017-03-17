package com.boke.imiloan.moduls.home.model;

import android.content.Context;
import android.util.Log;

import com.boke.imiloan.bean.HomeBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.model.BaseModel;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/7.
 */

public class HomeModel  extends BaseModel{
    public HomeModel(Context context) {
        super(context);
    }


    //获取首页数据
    public void getHomeDataList(final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IHomeService.class)
                .getHomeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<HomeBean>() {
                    @Override
                    public void call(HomeBean homeBean) {
                        Log.e("homedata==",homeBean.toString());
                        onLceHttpResultListener.onResult(homeBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }

}
