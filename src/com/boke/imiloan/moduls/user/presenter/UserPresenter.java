package com.boke.imiloan.moduls.user.presenter;

import android.content.Context;

import com.boke.imiloan.bean.UserBean;
import com.boke.imiloan.bean.UserFindPwdBean;
import com.boke.imiloan.bean.UserFindPwdSubmitBean;
import com.boke.imiloan.bean.UserRegisterBean;
import com.boke.imiloan.bean.UserRegisterSubmitBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.presenter.BasePresenter;
import com.boke.imiloan.moduls.user.model.UserModel;
import com.boke.imiloan.moduls.user.view.activity.FindPwdActivity;
import com.boke.imiloan.moduls.user.view.activity.LoginActivity;
import com.boke.imiloan.moduls.user.view.activity.RegisterActivity;
import com.boke.imiloan.views.LoadingDialog;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.support.lce.MvpLceView;
import com.google.gson.Gson;

import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/7.
 */

public class UserPresenter extends BasePresenter<MvpLceView<UserBean>> implements MvpPresenter<MvpLceView<UserBean>> {
    private UserModel userModel;
    private Context context;
    public UserPresenter(Context context) {
        super(context);
        this.context = context;
        this.userModel = new UserModel(context);
    }

    public void memLogin(Map<String, String> params, final CallbackContext callbackContext,final LoginActivity activity){
        this.userModel.memLogin(params,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                LoadingDialog.getInstance().closeDialog();
                activity.callBackMemLogin(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    LoadingDialog.getInstance().closeDialog();
                    Gson gson = new Gson();
                    UserBean userBean = (UserBean)result;
                    callbackContext.success(new JSONObject(gson.toJson(userBean)));
                    activity.callBackMemLogin(userBean);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }


    public void memRregister(Map<String, String> params, final CallbackContext callbackContext,final RegisterActivity activity){
        this.userModel.memRregister(params,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                LoadingDialog.getInstance().closeDialog();
                activity.callBackMemRregister(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    LoadingDialog.getInstance().closeDialog();
                    Gson gson = new Gson();
                    UserRegisterBean userRegisterBean = (UserRegisterBean)result;
                    callbackContext.success(new JSONObject(gson.toJson(userRegisterBean)));
                    activity.callBackMemRregister(userRegisterBean);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }

    public void memRegisterSubmit(Map<String, String> params, final CallbackContext callbackContext,final RegisterActivity activity){
        this.userModel.memRegisterSubmit(params,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                LoadingDialog.getInstance().closeDialog();
                activity.callBackMemRegisterSubmit(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    LoadingDialog.getInstance().closeDialog();
                    Gson gson = new Gson();
                    UserRegisterSubmitBean userRegisterSubmitBean = (UserRegisterSubmitBean)result;
                    callbackContext.success(new JSONObject(gson.toJson(userRegisterSubmitBean)));
                    activity.callBackMemRegisterSubmit(userRegisterSubmitBean);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }

    public void memFindPassword(Map<String, String> params, final CallbackContext callbackContext,final FindPwdActivity activity){
        this.userModel.memFindPassword(params,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                LoadingDialog.getInstance().closeDialog();
                activity.callBackMemFindPassword(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    LoadingDialog.getInstance().closeDialog();
                    Gson gson = new Gson();
                    UserFindPwdBean userFindPwdBean = (UserFindPwdBean)result;
                    callbackContext.success(new JSONObject(gson.toJson(userFindPwdBean)));
                    activity.callBackMemFindPassword(userFindPwdBean);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }

    public void memFindPasswordSubmit(Map<String, String> params, final CallbackContext callbackContext,final FindPwdActivity activity){
        this.userModel.memFindPasswordSubmit(params,new HttpUtils.OnLceHttpResultListener() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                LoadingDialog.getInstance().closeDialog();
                activity.callBackMemFindPasswordSubmit(null);
            }

            @Override
            public void onResult(Object result) {
                try {
                    LoadingDialog.getInstance().closeDialog();
                    Gson gson = new Gson();
                    UserFindPwdSubmitBean userFindPwdSubmitBean = (UserFindPwdSubmitBean)result;
                    callbackContext.success(new JSONObject(gson.toJson(userFindPwdSubmitBean)));
                    activity.callBackMemFindPasswordSubmit(userFindPwdSubmitBean);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }






}
