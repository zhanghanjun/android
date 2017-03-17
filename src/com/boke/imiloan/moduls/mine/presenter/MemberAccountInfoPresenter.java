package com.boke.imiloan.moduls.mine.presenter;

import android.content.Context;

import com.boke.imiloan.bean.MemberAccountInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.mine.model.MemberModel;
import com.boke.imiloan.moduls.mine.view.activity.MemberAccountInfoActivity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MemberAccountInfoPresenter extends BasePresenter<MvpLceView<MemberAccountInfoBean>> implements MvpPresenter<MvpLceView<MemberAccountInfoBean>> {
    private MemberModel memberModel;
    public MemberAccountInfoPresenter(Context context) {
        super(context);
        this.memberModel = new MemberModel(context);
    }



    public void getMemberAccountInfo(Map<String, String> map, final CallbackContext callbackContext, final MemberAccountInfoActivity activity){
        this.memberModel.getMemberAccountInfo(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackMemberAccountInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    MemberAccountInfoBean memberAccountInfoBean = (MemberAccountInfoBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(memberAccountInfoBean)));
                    }
                    activity.callBackMemberAccountInfo(memberAccountInfoBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
