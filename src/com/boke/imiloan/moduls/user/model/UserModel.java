package com.boke.imiloan.moduls.user.model;

import android.content.Context;
import android.util.Log;

import com.boke.imiloan.bean.UserBean;
import com.boke.imiloan.bean.UserFindPwdBean;
import com.boke.imiloan.bean.UserFindPwdSubmitBean;
import com.boke.imiloan.bean.UserRegisterBean;
import com.boke.imiloan.bean.UserRegisterSubmitBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.model.BaseModel;

import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/7.
 */

public class UserModel extends BaseModel{
    public UserModel(Context context) {
        super(context);
    }


    //用户登录
    public void memLogin(Map<String, String> params,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IUserService.class)
                .memLogin(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UserBean>() {
                    @Override
                    public void call(UserBean userBean) {
                        Log.e("userLogin==",userBean.toString());
                        onLceHttpResultListener.onResult(userBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }


    //用户注册获取验证码
    public void memRregister(Map<String, String> params,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IUserService.class)
                .memRregister(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UserRegisterBean>() {
                    @Override
                    public void call(UserRegisterBean userBean) {
                        Log.e("memRregister==",userBean.toString());
                        onLceHttpResultListener.onResult(userBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }


    //用户注册验证
    public void memRegisterSubmit(Map<String, String> params,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IUserService.class)
                .memRegisterSubmit(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UserRegisterSubmitBean>() {
                    @Override
                    public void call(UserRegisterSubmitBean userBean) {
                        Log.e("memRegisterSubmit==",userBean.toString());
                        onLceHttpResultListener.onResult(userBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }


    //用户忘记密码获取验证码
    public void memFindPassword(Map<String, String> params,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IUserService.class)
                .memFindPassword(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UserFindPwdBean>() {
                    @Override
                    public void call(UserFindPwdBean userBean) {
                        Log.e("memFindPassword==",userBean.toString());
                        onLceHttpResultListener.onResult(userBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }


    //用户忘记密码验证码验证
    public void memFindPasswordSubmit(Map<String, String> params,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IUserService.class)
                .memFindPasswordSubmit(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<UserFindPwdSubmitBean>() {
                    @Override
                    public void call(UserFindPwdSubmitBean userBean) {
                        Log.e("memFindPasswordSubmit==",userBean.toString());
                        onLceHttpResultListener.onResult(userBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



}
