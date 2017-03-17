package com.boke.imiloan.moduls.card.model;

import android.content.Context;
import android.util.Log;

import com.boke.imiloan.bean.CreditProductInfoBean;
import com.boke.imiloan.bean.CreditProductListBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.model.BaseModel;

import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/7.
 */

public class CardModel extends BaseModel{
    public CardModel(Context context) {
        super(context);
    }


    //获取首页数据
    public void getCreditDataList(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(ICardService.class)
                .getCreditProductList(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CreditProductListBean>() {
                    @Override
                    public void call(CreditProductListBean creditProductListBean) {
                        Log.e("creditProductListBean==",creditProductListBean.toString());
                        onLceHttpResultListener.onResult(creditProductListBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



    //获取首页数据
    public void getCreditDataInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(ICardService.class)
                .getCreditProductInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CreditProductInfoBean>() {
                    @Override
                    public void call( CreditProductInfoBean creditProductInfoBean) {
                        Log.e("creditProductInfoBean==",creditProductInfoBean.toString());
                        onLceHttpResultListener.onResult(creditProductInfoBean);
                    }
                  }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
            }

}
