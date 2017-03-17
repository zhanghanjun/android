package com.boke.imiloan.moduls.mine.presenter;

import android.content.Context;

import com.boke.imiloan.bean.MemberApplyTransListBean;
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

public class MemberApplyTransactionPresenter extends BasePresenter<MvpLceView<MemberApplyTransListBean>> implements MvpPresenter<MvpLceView<MemberApplyTransListBean>> {
    private MemberModel memberModel;
    public MemberApplyTransactionPresenter(Context context) {
        super(context);
        this.memberModel = new MemberModel(context);
    }



    public void getApplyTransaction(Map<String, String> map, final CallbackContext callbackContext, final MemberApplyTransactionListActivity activity){
        this.memberModel.getApplyTransaction(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackMemberTransListInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    MemberApplyTransListBean memberApplyTransListBean = (MemberApplyTransListBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(memberApplyTransListBean)));
                    }
                    activity.callBackMemberTransListInfo(memberApplyTransListBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
