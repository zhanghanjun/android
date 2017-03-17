package com.boke.imiloan.moduls.mine.presenter;

import android.content.Context;

import com.boke.imiloan.activity.MainActivity;
import com.boke.imiloan.bean.MemberInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.mine.model.MemberModel;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;
import org.apache.cordova.CallbackContext;
import org.json.JSONObject;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MemberInfoPresenter extends BasePresenter<MvpLceView<MemberInfoBean>> implements MvpPresenter<MvpLceView<MemberInfoBean>> {
    private MemberModel memberModel;
    public MemberInfoPresenter(Context context) {
        super(context);
        this.memberModel = new MemberModel(context);
    }



    public void getMemberInfo(Map<String, String> map, final CallbackContext callbackContext, final MainActivity activity){
        this.memberModel.getMemberInfo(map,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                activity.callBackMemberInfo(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    Gson gson = new Gson();
                    MemberInfoBean memberInfoBean = (MemberInfoBean) result;
                    if(callbackContext!=null){
                        callbackContext.success(new JSONObject(gson.toJson(memberInfoBean)));
                    }
                    activity.callBackMemberInfo(memberInfoBean);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }


}
