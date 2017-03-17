package com.boke.imiloan.moduls.home.presenter;

import android.content.Context;

import com.boke.imiloan.activity.MainActivity;
import com.boke.imiloan.bean.FineProductListBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.home.model.FineProductModel;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class FineProductListPresenter extends BasePresenter<MvpLceView<FineProductListBean>> implements MvpPresenter<MvpLceView<FineProductListBean>> {
    private FineProductModel fineModel;
    public FineProductListPresenter(Context context) {
        super(context);
        this.fineModel = new FineProductModel(context);
    }

    public void getFineProductDataList(Map<String, String> map, final CallbackContext callbackContext, final MainActivity activity){
        this.fineModel.getFineProductDataList(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackFineProductList(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    FineProductListBean fineProductListBean = (FineProductListBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(fineProductListBean)));
                    }
                    activity.callBackFineProductList(fineProductListBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }



}
