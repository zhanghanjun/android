package com.boke.imiloan.moduls.card.presenter;

import android.content.Context;

import com.boke.imiloan.bean.CreditProductInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.card.model.CardModel;
import com.boke.imiloan.moduls.card.view.activity.CreditProductInfoActivity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class CardProductInfoPresenter extends BasePresenter<MvpLceView<CreditProductInfoBean>> implements MvpPresenter<MvpLceView<CreditProductInfoBean>> {
    private CardModel cardModel;
    public CardProductInfoPresenter(Context context) {
        super(context);
        this.cardModel = new CardModel(context);
    }



    public void getCreditDataInfo(Map<String, String> map, final CallbackContext callbackContext, final CreditProductInfoActivity activity){
        this.cardModel.getCreditDataInfo(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackCreditProductInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    CreditProductInfoBean creditProductInfoBean = (CreditProductInfoBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(creditProductInfoBean)));
                    }
                    activity.callBackCreditProductInfo(creditProductInfoBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
