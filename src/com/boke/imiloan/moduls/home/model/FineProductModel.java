package com.boke.imiloan.moduls.home.model;

import android.content.Context;
import android.util.Log;

import com.boke.imiloan.bean.FineProductListBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.model.BaseModel;

import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/7.
 */

public class FineProductModel extends BaseModel{
    public FineProductModel(Context context) {
        super(context);
    }


    //获取精品推荐列表
    public void getFineProductDataList(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IFineProductService.class)
                .getFineProductList(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<FineProductListBean>() {
                    @Override
                    public void call(FineProductListBean fineProductListBean) {
                        Log.e("fineProductListBean==",fineProductListBean.toString());
                        onLceHttpResultListener.onResult(fineProductListBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



}
