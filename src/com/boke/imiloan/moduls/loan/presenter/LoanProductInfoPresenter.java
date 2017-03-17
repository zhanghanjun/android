package com.boke.imiloan.moduls.loan.presenter;

import android.content.Context;

import com.boke.imiloan.bean.LoanProductInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.loan.model.LoanModel;
import com.boke.imiloan.moduls.loan.view.activity.LoanProductInfoActivity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class LoanProductInfoPresenter extends BasePresenter<MvpLceView<LoanProductInfoBean>> implements MvpPresenter<MvpLceView<LoanProductInfoBean>> {
    private LoanModel loanModel;
    public LoanProductInfoPresenter(Context context) {
        super(context);
        this.loanModel = new LoanModel(context);
    }


    public void getLoanDataInfo(Map<String, String> map, final CallbackContext callbackContext, final LoanProductInfoActivity activity){
        this.loanModel.getLoanDataInfo(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackLoanProductInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    LoanProductInfoBean loanBean = (LoanProductInfoBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(loanBean)));
                    }
                    activity.callBackLoanProductInfo(loanBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
