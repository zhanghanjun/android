package com.boke.imiloan.moduls.mine.presenter;

import android.content.Context;

import com.boke.imiloan.bean.DeleteApplyTransactionBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.mine.model.MemberModel;
import com.boke.imiloan.moduls.mine.view.activity.list.MemberApplyTransactionListActivity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MemberDeleteApplyTransactionPresenter extends BasePresenter<MvpLceView<DeleteApplyTransactionBean>> implements MvpPresenter<MvpLceView<DeleteApplyTransactionBean>> {
    private MemberModel memberModel;
    public MemberDeleteApplyTransactionPresenter(Context context) {
        super(context);
        this.memberModel = new MemberModel(context);
    }



    public void deleteApplyTransaction(Map<String, String> map, final CallbackContext callbackContext, final MemberApplyTransactionListActivity activity){
        this.memberModel.deleteApplyTransaction(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackDeleteMemberTransListInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    DeleteApplyTransactionBean deleteApplyTransactionBean = (DeleteApplyTransactionBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(deleteApplyTransactionBean)));
                    }
                    activity.callBackDeleteMemberTransListInfo(deleteApplyTransactionBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
