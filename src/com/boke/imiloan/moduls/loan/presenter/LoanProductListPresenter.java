package com.boke.imiloan.moduls.loan.presenter;

import android.content.Context;

import com.boke.imiloan.activity.MainActivity;
import com.boke.imiloan.bean.LoanProductListBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.loan.model.LoanModel;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class LoanProductListPresenter extends BasePresenter<MvpLceView<LoanProductListBean>> implements MvpPresenter<MvpLceView<LoanProductListBean>> {
    private LoanModel loanModel;
    public LoanProductListPresenter(Context context) {
        super(context);
        this.loanModel = new LoanModel(context);
    }

    public void getLoanDataList(Map<String, String> map, final CallbackContext callbackContext, final MainActivity activity){
        this.loanModel.getLoanDataList(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackLoanProductList(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    LoanProductListBean loanBean = (LoanProductListBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(loanBean)));
                    }
                    activity.callBackLoanProductList(loanBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
