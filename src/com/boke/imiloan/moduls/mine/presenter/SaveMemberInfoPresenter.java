package com.boke.imiloan.moduls.mine.presenter;

import android.content.Context;

import com.boke.imiloan.bean.SaveMemberInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.mine.model.MemberModel;
import com.boke.imiloan.moduls.mine.view.activity.MemberPersonalInfoActivity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class SaveMemberInfoPresenter extends BasePresenter<MvpLceView<SaveMemberInfoBean>> implements MvpPresenter<MvpLceView<SaveMemberInfoBean>> {
    private MemberModel memberModel;
    public SaveMemberInfoPresenter(Context context) {
        super(context);
        this.memberModel = new MemberModel(context);
    }



    public void setMemberInfo(Map<String, String> map, final CallbackContext callbackContext, final MemberPersonalInfoActivity activity){
        this.memberModel.setMemberInfo(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackSaveMemberPersonalInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    SaveMemberInfoBean saveMemberInfoBean = (SaveMemberInfoBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(saveMemberInfoBean)));
                    }
                    activity.callBackSaveMemberPersonalInfo(saveMemberInfoBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
