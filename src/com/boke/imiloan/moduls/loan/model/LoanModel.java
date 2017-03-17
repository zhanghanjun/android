package com.boke.imiloan.moduls.loan.model;

import android.content.Context;
import android.util.Log;

import com.boke.imiloan.bean.LoanProductInfoBean;
import com.boke.imiloan.bean.LoanProductListBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.model.BaseModel;

import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/7.
 */

public class LoanModel extends BaseModel{
    public LoanModel(Context context) {
        super(context);
    }


    //获取首页数据
    public void getLoanDataList(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(ILoanService.class)
                .getLoanProductList(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<LoanProductListBean>() {
                    @Override
                    public void call(LoanProductListBean loanBean) {
                        Log.e("loandata==",loanBean.toString());
                        onLceHttpResultListener.onResult(loanBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



    //获取首页数据
    public void getLoanDataInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(ILoanService.class)
                .getLoanProductInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<LoanProductInfoBean>() {
                    @Override
                    public void call(LoanProductInfoBean loanBean) {
                        Log.e("loandata==",loanBean.toString());
                        onLceHttpResultListener.onResult(loanBean);
                    }
                  }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
            }

}
