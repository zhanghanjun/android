package com.boke.imiloan.moduls.mine.presenter;

import android.content.Context;

import com.boke.imiloan.bean.SaveApplyInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.mine.model.MemberModel;
import com.boke.imiloan.moduls.mine.view.activity.MemberApplyInfoActivity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class SaveMemberApplyInfoPresenter extends BasePresenter<MvpLceView<SaveApplyInfoBean>> implements MvpPresenter<MvpLceView<SaveApplyInfoBean>> {
    private MemberModel memberModel;
    public SaveMemberApplyInfoPresenter(Context context) {
        super(context);
        this.memberModel = new MemberModel(context);
    }



    public void setApplyInfo(Map<String, String> map, final CallbackContext callbackContext, final MemberApplyInfoActivity activity){
        this.memberModel.setApplyInfo(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackSaveMemberApplyInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    SaveApplyInfoBean saveApplyInfoBean = (SaveApplyInfoBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(saveApplyInfoBean)));
                    }
                    activity.callBackSaveMemberApplyInfo(saveApplyInfoBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
